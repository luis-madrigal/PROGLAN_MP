package com.interpreter.AST;

import com.interpreter.Scope;
import com.interpreter.contexts.ArrayInfo;
import com.interpreter.contexts.ContextType;
import com.interpreter.contexts.StructInfo;
import com.interpreter.contexts.SymbolContext;
import com.parser.ManuScriptBaseVisitor;
import com.parser.ManuScriptParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class ASTBuildVisitor extends ManuScriptBaseVisitor<AbstractSyntaxTree> {

    private Scope curScope;

    private ArrayList<Integer> levelIndexTracker;
    private ProcedureNode fieldDecNode;
    private int lvlDepth;
    private int lvlIndex;
    private int nExitBlock;
    private Stack<Integer> listBreakpoints;
    private boolean isBreakpoint;
    private int triggeringLineNumber;

    private HashMap<String, ProcedureNode> methodASTTable;


    public ASTBuildVisitor(Scope symbolTable, Stack<Integer> listBreakpoints){
        methodASTTable = new HashMap<String, ProcedureNode>();
        this.curScope = symbolTable;
        this.levelIndexTracker = new ArrayList<>();
        this.levelIndexTracker.add(0);
//        System.out.println("init size: "+levelIndexTracker.size());
        this.lvlIndex = 0;
        this.lvlDepth = 0;
        this.nExitBlock = 0;
        this.listBreakpoints = listBreakpoints;
        this.isBreakpoint = false;
        this.triggeringLineNumber = 0;

        this.fieldDecNode = new ProcedureNode(null,"%FIELD");
        this.fieldDecNode.setNodeType(NodeType.FIELD_DEC);
        methodASTTable.put(this.fieldDecNode.procedureName,fieldDecNode);
    }

    public HashMap<String, ProcedureNode> getMethodASTTable() {
        return methodASTTable;
    }

    public void printAST(String rootName){
        methodASTTable.get(rootName).print();
    }

    @Override
    protected AbstractSyntaxTree aggregateResult(AbstractSyntaxTree aggregate, AbstractSyntaxTree nextResult) {
    	if(nextResult != null) {
    		return nextResult;
    	}
        else {
            return aggregate;
        }
    }


//    /**
//     * acts as the exitBlockListener
//     * @param node
//     * @return
//     */
//    public AbstractSyntaxTree visitBlockChildren(RuleNode node) {
//        AbstractSyntaxTree result = this.defaultResult();
//        int n = node.getChildCount();
//
//        for(int i = 0; i < n && this.shouldVisitNextChild(node, result); ++i) {
//            ParseTree c = node.getChild(i);
//            AbstractSyntaxTree childResult = c.accept(this);
//            result = this.aggregateResult(result, childResult);
//        }
//        exitBlock();
//
//        return result;
//    }

    private void exitBlock(){
        curScope = curScope.getParent();    //go out
        //this.levelIndexTracker.set(lvlDepth,++lvlIndex);    //sets next expected index
        nExitBlock++;
        if(nExitBlock >= 2){
            nExitBlock = 0;
            levelIndexTracker.set(lvlDepth , 0);
        }
        lvlDepth--;
        System.out.println("newnextIndex#: "+ Arrays.deepToString(levelIndexTracker.toArray()));

    }

    private void enterBlock(){
        nExitBlock = 0;
        lvlIndex = this.levelIndexTracker.get(lvlDepth);
        System.out.println("nextIndex#: "+ Arrays.deepToString(levelIndexTracker.toArray()));
        System.out.println("Depth: "+lvlDepth+" ;block#: "+lvlIndex);
        curScope = curScope.getChildren().get(lvlIndex);    //go deeper

        this.levelIndexTracker.set(lvlDepth,++lvlIndex);    //sets next expected index
        lvlDepth++;
        if(lvlDepth >= this.levelIndexTracker.size())
            this.levelIndexTracker.add(0);

    }

    @Override
    public AbstractSyntaxTree visitFieldDeclaration(ManuScriptParser.FieldDeclarationContext ctx) {
        for(ManuScriptParser.VariableDeclaratorContext vCtx : ctx.variableDeclarators().variableDeclarator()){
                AbstractSyntaxTree fieldDec = visit(vCtx);
                if(fieldDec != null){
                    fieldDec.setParent(fieldDecNode);
                    fieldDecNode.addChild(fieldDec);
            }
        }

        return super.visitFieldDeclaration(ctx);
    }

    private void configureIsBreakpoint(int lineNumber) {
    	if(!listBreakpoints.isEmpty() &&
    			lineNumber != this.triggeringLineNumber &&
    			lineNumber >= listBreakpoints.peek()) {
    		listBreakpoints.pop();
    		isBreakpoint = true;
    		this.triggeringLineNumber = lineNumber;
    		System.out.println("BREAK "+lineNumber);
    		if(!listBreakpoints.isEmpty())
    			System.out.println("STACK TOP: "+listBreakpoints.peek());
    	}
    	else {
    		isBreakpoint = false;
    	}
    }
    
    @Override
    public AbstractSyntaxTree visitBlock(ManuScriptParser.BlockContext ctx) {
   
        System.out.println("visitingBL "+ctx.getStart().getLine()+"    "+ctx.getText());
        configureIsBreakpoint(ctx.getStart().getLine());
        
        enterBlock();
        AbstractSyntaxTree blockNode = new AbstractSyntaxTree(null);
        blockNode.setNodeType(NodeType.BLOCK);
        
        blockNode.setBreakpoint(this.isBreakpoint);
        if(isBreakpoint)
        	System.out.println("BP: "+blockNode.getNodeType());
        
        for(ManuScriptParser.BlockStatementContext stmt : ctx.blockStatement()){
            if(stmt.localVariableDeclarationStatement() != null){
                List<ManuScriptParser.VariableDeclaratorContext> varDecs = stmt.localVariableDeclarationStatement().localVariableDeclaration().variableDeclarators().variableDeclarator();
                for(ManuScriptParser.VariableDeclaratorContext varCtx : varDecs){
                    AbstractSyntaxTree varDec = visit(varCtx);
                    if (varDec != null) {
                        varDec.setParent(blockNode);
                        blockNode.addChild(varDec);
                    }
                }
            }
            else {
                AbstractSyntaxTree body = visitBlockStatement(stmt);
                if (body != null) {
                    body.setParent(blockNode);
                    blockNode.addChild(body);
                }
            }
        }

        exitBlock();
        return blockNode;
    }

    @Override
    public AbstractSyntaxTree visitMethodDeclaration(ManuScriptParser.MethodDeclarationContext ctx) {


        System.out.println("visitingME "+ctx.getStart().getLine()+"    "+ctx.getText());
        configureIsBreakpoint(ctx.getStart().getLine());
        ProcedureNode pNode = new ProcedureNode(null,ctx.Identifier().getText());
//        System.out.println("visited method declaration: "+ctx.Identifier().getText());
        pNode.setNodeType(NodeType.FUNCTION_DECLARATION);

        pNode.setBreakpoint(this.isBreakpoint);
        if(isBreakpoint)
        	System.out.println("BP: "+pNode.getNodeType());
        
        AbstractSyntaxTree block = visit(ctx.methodBody().block());
        if (block != null) {
            block.setParent(pNode);
            pNode.addChild(block);
        }

        /*
        for(ManuScriptParser.BlockStatementContext bc : ctx.methodBody().block().blockStatement()) {
            AbstractSyntaxTree body = visitBlockStatement(bc);
            if (body != null) {
                body.setParent(pNode);
                pNode.addChild(body);
            }
        }
        System.out.println(ctx.Identifier().getText());
        */
        methodASTTable.put(ctx.Identifier().getText(), pNode);


        return pNode;
    }

    @Override
    public AbstractSyntaxTree visitReturnStmt(ManuScriptParser.ReturnStmtContext ctx) {


        System.out.println("visitingRET "+ctx.getStart().getLine()+"    "+ctx.getText());
        configureIsBreakpoint(ctx.getStart().getLine());
        AbstractSyntaxTree node = new AbstractSyntaxTree(null);
        node.setNodeType(NodeType.RETURN);
        node.setBreakpoint(this.isBreakpoint);
        if(isBreakpoint)
        	System.out.println("BP: "+node.getNodeType());
        
        if(ctx.expression() != null) {
        	AbstractSyntaxTree child = visit(ctx.expression());

            if(child!=null) {
                child.setParent(node);
                node.addChild(child);
            }
        }
        

        return node;
    }


    @Override
    public AbstractSyntaxTree visitWhileStmt(ManuScriptParser.WhileStmtContext ctx) {


        System.out.println("visitingWHIL "+ctx.getStart().getLine()+"    "+ctx.getText());
        configureIsBreakpoint(ctx.getStart().getLine());
        AbstractSyntaxTree node = new AbstractSyntaxTree(null);
        node.setNodeType(NodeType.WHILE);
        node.setBreakpoint(this.isBreakpoint);
        if(isBreakpoint)
        	System.out.println("BP: "+node.getNodeType());
        AbstractSyntaxTree condition = visit(ctx.parExpression().expression());
        if(condition!=null) {
            condition.setParent(node);
            node.addChild(condition);
        }

        AbstractSyntaxTree stmt = visit(ctx.statement());
        if(stmt!=null) {
            stmt.setParent(node);
            node.addChild(stmt);
        }
        return node;
    }

    @Override
    public AbstractSyntaxTree visitDoWhileStmt(ManuScriptParser.DoWhileStmtContext ctx) {


        System.out.println("visitingDW "+ctx.getStart().getLine()+"    "+ctx.getText());
        configureIsBreakpoint(ctx.getStart().getLine());
        AbstractSyntaxTree node = new AbstractSyntaxTree(null);
        node.setNodeType(NodeType.DO_WHILE);

        node.setBreakpoint(this.isBreakpoint);
        if(isBreakpoint)
        	System.out.println("BP: "+node.getNodeType());
        
        AbstractSyntaxTree stmt = visit(ctx.statement());
        if(stmt!=null) {
            stmt.setParent(node);
            node.addChild(stmt);
        }
        AbstractSyntaxTree condition = visit(ctx.parExpression().expression());
        if(condition!=null) {
            condition.setParent(node);
            node.addChild(condition);
        }
        return node;
    }

    @Override
    public AbstractSyntaxTree visitForStmt(ManuScriptParser.ForStmtContext ctx) {
        //TODO: add nodetype to conditions


        System.out.println("visitingFor "+ctx.getStart().getLine()+"    "+ctx.getText());
        configureIsBreakpoint(ctx.getStart().getLine());
        AbstractSyntaxTree node = new AbstractSyntaxTree(null);
        node.setNodeType(NodeType.FOR);
        node.setBreakpoint(this.isBreakpoint);
        if(isBreakpoint)
        	System.out.println("BP: "+node.getNodeType());
        
        AbstractSyntaxTree forInit = visit(ctx.forControl().forInit());
        if( forInit != null ) {
            forInit.setParent(node);
            node.addChild(forInit);
        }
        AbstractSyntaxTree condition = visit(ctx.forControl().expression());
        if( condition != null ) {
            condition.setParent(node);
            node.addChild(condition);
        }
        AbstractSyntaxTree forUpdate = visit(ctx.forControl().forUpdate());
        if( forUpdate != null ) {
            forUpdate.setParent(node);
            node.addChild(forUpdate);
        }
        AbstractSyntaxTree statement = visit(ctx.statement());
        if(statement!=null) {
            statement.setParent(node);
            node.addChild(statement);
        }
        return node;
    }

    @Override
    public AbstractSyntaxTree visitIfElseStmt(ManuScriptParser.IfElseStmtContext ctx) {


        System.out.println("visitingIFEL "+ctx.getStart().getLine()+"    "+ctx.getText());
        configureIsBreakpoint(ctx.getStart().getLine());
        AbstractSyntaxTree node = new AbstractSyntaxTree(null);
        node.setNodeType(NodeType.BRANCH);
        node.setBreakpoint(this.isBreakpoint);
        if(isBreakpoint)
        	System.out.println("BP: "+node.getNodeType());
        
        AbstractSyntaxTree condition = visit(ctx.parExpression().expression());
        if(condition!=null) {
            condition.setParent(node);
            node.addChild(condition);
        }
        AbstractSyntaxTree statementIf = visit(ctx.statement(0));
        if(statementIf!=null) {
            statementIf.setParent(node);
            node.addChild(statementIf);
        }
        if(ctx.statement(1) != null) {
            AbstractSyntaxTree statementElse = visit(ctx.statement(1));
            if (statementElse != null) {
                statementElse.setParent(node);
                node.addChild(statementElse);
            }
        }
        return node;
    }



    @Override
    public AbstractSyntaxTree visitOutputStatement(ManuScriptParser.OutputStatementContext ctx) {
        System.out.println("visitingOUT "+ctx.getStart().getLine()+"    "+ctx.getText());
        configureIsBreakpoint(ctx.getStart().getLine());
        AbstractSyntaxTree node = new AbstractSyntaxTree(null);
        node.setNodeType(NodeType.PRINT);
        node.setBreakpoint(this.isBreakpoint);
        if(isBreakpoint)
        	System.out.println("BP: "+node.getNodeType());
        
        AbstractSyntaxTree output = visit(ctx.expression());
        if(output!=null){
            output.setParent(node);
            node.addChild(output);
        }


        return node;
    }

    @Override
    public AbstractSyntaxTree visitInputStatement(ManuScriptParser.InputStatementContext ctx) {


        System.out.println("visitingINP "+ctx.getStart().getLine()+"    "+ctx.getText());
        configureIsBreakpoint(ctx.getStart().getLine());
        AbstractSyntaxTree node = new AbstractSyntaxTree(null);
        node.setNodeType(NodeType.SCAN);
        node.setBreakpoint(this.isBreakpoint);
        if(isBreakpoint)
        	System.out.println("BP: "+node.getNodeType());
        
        AbstractSyntaxTree scanTo = visit(ctx.variableDeclaratorId());
        if(scanTo != null){
            scanTo.setParent(node);
            node.addChild(scanTo);
        }

        return node;
    }



//    @Override
//    public AbstractSyntaxTree visitArrayExpr(ManuScriptParser.ArrayExprContext ctx) {
//
//
//        System.out.println("visitingARREXP "+ctx.getStart().getLine()+"    "+ctx.getText());
//        configureIsBreakpoint(ctx.getStart().getLine());
//        AbstractSyntaxTree node = new AbstractSyntaxTree(null);
//        node.setNodeType(NodeType.ARRAY_ACCESS);
//        node.setBreakpoint(this.isBreakpoint);
//        if(isBreakpoint)
//        	System.out.println("BP: "+node.getNodeType());
//        
//        AbstractSyntaxTree var = visit(ctx.variableExpr());
//        if(var!=null) {
//            var.setParent(node);
//            node.addChild(var);
//        }
//
//        for(ManuScriptParser.ExpressionContext expr : ctx.expression()) {
//            AbstractSyntaxTree expression = visit(expr);
//            if (expression != null) {
//                expression.setParent(node);
//                node.addChild(expression);
//            }
//        }
//        return node;
//    }

    @Override
    public AbstractSyntaxTree visitFunctionExpr(ManuScriptParser.FunctionExprContext ctx) {


        System.out.println("visitingFUNCEXP "+ctx.getStart().getLine()+"    "+ctx.getText());
        configureIsBreakpoint(ctx.getStart().getLine());
        ProcedureNode node = new ProcedureNode(null, ctx.Identifier().getText());
        node.setNodeType(NodeType.FUNCTION_INVOKE);
        node.setBreakpoint(this.isBreakpoint);
        if(isBreakpoint)
        	System.out.println("BP: "+node.getNodeType());
        
        if(ctx.expressionList() != null) {
	        for(ManuScriptParser.ExpressionContext c : ctx.expressionList().expression()){
	            AbstractSyntaxTree param = visit(c);
	            if(param != null) {
	                param.setParent(node);
	                node.addChild(param);
	            }
	        }
        }

        return node;
    }

    @Override
    public AbstractSyntaxTree visitPostIncDecExpr(ManuScriptParser.PostIncDecExprContext ctx) {


        System.out.println("visitingPOSTINCDEC "+ctx.getStart().getLine()+"    "+ctx.getText());
        configureIsBreakpoint(ctx.getStart().getLine());
        AbstractSyntaxTree node = new AbstractSyntaxTree(null);
        node.setNodeType(NodeType.UNIPOST_ARITHMETIC);
        node.setBreakpoint(this.isBreakpoint);
        if(isBreakpoint)
        	System.out.println("BP: "+node.getNodeType());
        
        node.setValue(ctx.getChild(1).getText());

        AbstractSyntaxTree left = visit(ctx.equationExpr());
        if(left!=null) {
            left.setParent(node);
            node.addChild(left);
        }

        return node;
    }

    @Override
    public AbstractSyntaxTree visitPreIncDecSignExpr(ManuScriptParser.PreIncDecSignExprContext ctx) {
        //also includes sign operator


        System.out.println("visitingPREINCDEC "+ctx.getStart().getLine()+"    "+ctx.getText());
        configureIsBreakpoint(ctx.getStart().getLine());
        AbstractSyntaxTree node = new AbstractSyntaxTree(null);
        node.setNodeType(NodeType.UNIPRE_ARITHMETIC);
        node.setValue(ctx.getChild(0).getText());
        node.setBreakpoint(this.isBreakpoint);
        if(isBreakpoint)
        	System.out.println("BP: "+node.getNodeType());
        
        AbstractSyntaxTree right = visit(ctx.equationExpr());
        if(right!=null) {
            right.setParent(node);
            node.addChild(right);
        }

        return node;
    }

    @Override
    public AbstractSyntaxTree visitNegationExpr(ManuScriptParser.NegationExprContext ctx) {


        System.out.println("visitingNEGEXP "+ctx.getStart().getLine()+"    "+ctx.getText());
        configureIsBreakpoint(ctx.getStart().getLine());
        AbstractSyntaxTree node = new AbstractSyntaxTree(null);
        node.setNodeType(NodeType.UNI_LOGIC);
        node.setValue(ctx.getChild(0).getText());
        node.setBreakpoint(this.isBreakpoint);
        if(isBreakpoint)
        	System.out.println("BP: "+node.getNodeType());
        
        AbstractSyntaxTree right = visit(ctx.expression());
        if(right!=null) {
            right.setParent(node);
            node.addChild(right);
        }

        return node;
    }

    @Override
    public AbstractSyntaxTree visitMultDivModExpr(ManuScriptParser.MultDivModExprContext ctx) {


        System.out.println("visitingMULTDIVMODEXP "+ctx.getStart().getLine()+"    "+ctx.getText());
        configureIsBreakpoint(ctx.getStart().getLine());
        AbstractSyntaxTree node = new AbstractSyntaxTree(null);
        node.setNodeType(NodeType.BIN_ARITHMETIC);
        node.setValue(ctx.getChild(1).getText());
        node.setBreakpoint(this.isBreakpoint);
        if(isBreakpoint)
        	System.out.println("BP: "+node.getNodeType());
        
        AbstractSyntaxTree left = visit(ctx.expression(0));
        if(left!=null) {
            left.setParent(node);
            node.addChild(left);
        }

        AbstractSyntaxTree right = visit(ctx.expression(1));
        if(right!=null) {
            right.setParent(node);
            node.addChild(right);
        }

        return node;
    }

    @Override
    public AbstractSyntaxTree visitAddSubExpr(ManuScriptParser.AddSubExprContext ctx) {


        System.out.println("visitingADDSUBEXP "+ctx.getStart().getLine()+"    "+ctx.getText());
        configureIsBreakpoint(ctx.getStart().getLine());
        AbstractSyntaxTree node = new AbstractSyntaxTree(null);
        node.setNodeType(NodeType.BIN_ARITHMETIC);
        node.setValue(ctx.getChild(1).getText());
        node.setBreakpoint(this.isBreakpoint);
        if(isBreakpoint)
        	System.out.println("BP: "+node.getNodeType());
        
        AbstractSyntaxTree left = visit(ctx.expression(0));
        if(left!=null) {
            left.setParent(node);
            node.addChild(left);
        }

        AbstractSyntaxTree right = visit(ctx.expression(1));
        if(right!=null) {
            right.setParent(node);
            node.addChild(right);
        }


        return node;
    }

    @Override
    public AbstractSyntaxTree visitComparisonExpr(ManuScriptParser.ComparisonExprContext ctx) {


        System.out.println("visitingCOMPREXPR "+ctx.getStart().getLine()+"    "+ctx.getText());
        configureIsBreakpoint(ctx.getStart().getLine());
        AbstractSyntaxTree node = new AbstractSyntaxTree(null);
        node.setNodeType(NodeType.BIN_LOGIC);
        node.setValue(ctx.getChild(1).getText());
        node.setBreakpoint(this.isBreakpoint);
        if(isBreakpoint)
        	System.out.println("BP: "+node.getNodeType());
        
        AbstractSyntaxTree left = visit(ctx.expression(0));
        if(left!=null) {
            left.setParent(node);
            node.addChild(left);
        }

        AbstractSyntaxTree right = visit(ctx.expression(1));
        if(right!=null) {
            right.setParent(node);
            node.addChild(right);
        }

        return node;
    }

    @Override
    public AbstractSyntaxTree visitEqualityExpr(ManuScriptParser.EqualityExprContext ctx) {


        System.out.println("visitingEQUALITYEXP "+ctx.getStart().getLine()+"    "+ctx.getText());
        configureIsBreakpoint(ctx.getStart().getLine());
        AbstractSyntaxTree node = new AbstractSyntaxTree(null);
        node.setNodeType(NodeType.BIN_LOGIC);
        node.setValue(ctx.getChild(1).getText());
        node.setBreakpoint(this.isBreakpoint);
        if(isBreakpoint)
        	System.out.println("BP: "+node.getNodeType());
        
        AbstractSyntaxTree left = visit(ctx.expression(0));
        if(left!=null) {
            left.setParent(node);
            node.addChild(left);
        }

        AbstractSyntaxTree right = visit(ctx.expression(1));
        if(right!=null) {
            right.setParent(node);
            node.addChild(right);
        }

        return node;
    }

    @Override
    public AbstractSyntaxTree visitAndExpr(ManuScriptParser.AndExprContext ctx) {


        System.out.println("visitingANDEXPR "+ctx.getStart().getLine()+"    "+ctx.getText());
        configureIsBreakpoint(ctx.getStart().getLine());
        AbstractSyntaxTree node = new AbstractSyntaxTree(null);
        node.setNodeType(NodeType.BIN_LOGIC);
        node.setValue(ctx.getChild(1).getText());
        node.setBreakpoint(this.isBreakpoint);
        if(isBreakpoint)
        	System.out.println("BP: "+node.getNodeType());
        
        AbstractSyntaxTree left = visit(ctx.expression(0));
        if(left!=null) {
            left.setParent(node);
            node.addChild(left);
        }

        AbstractSyntaxTree right = visit(ctx.expression(1));
        if(right!=null) {
            right.setParent(node);
            node.addChild(right);
        }

        return node;
    }

    @Override
    public AbstractSyntaxTree visitOrExpr(ManuScriptParser.OrExprContext ctx) {


        System.out.println("visitingOREXPR "+ctx.getStart().getLine()+"    "+ctx.getText());
        configureIsBreakpoint(ctx.getStart().getLine());
        AbstractSyntaxTree node = new AbstractSyntaxTree(null);
        node.setNodeType(NodeType.BIN_LOGIC);
        node.setValue(ctx.getChild(1).getText());
        node.setBreakpoint(this.isBreakpoint);
        if(isBreakpoint)
        	System.out.println("BP: "+node.getNodeType());
        
        AbstractSyntaxTree left = visit(ctx.expression(0));
        if(left!=null) {
            left.setParent(node);
            node.addChild(left);
        }

        AbstractSyntaxTree right = visit(ctx.expression(1));
        if(right!=null) {
            right.setParent(node);
            node.addChild(right);
        }

        return node;
    }

    @Override
    public AbstractSyntaxTree visitOneLineIfExpr(ManuScriptParser.OneLineIfExprContext ctx) {


        System.out.println("visitingONELINEIFEXPR "+ctx.getStart().getLine()+"    "+ctx.getText());
        configureIsBreakpoint(ctx.getStart().getLine());
        AbstractSyntaxTree node = new AbstractSyntaxTree(null);
        node.setNodeType(NodeType.TER_OP);
        node.setBreakpoint(this.isBreakpoint);
        if(isBreakpoint)
        	System.out.println("BP: "+node.getNodeType());
        
        AbstractSyntaxTree condition = visit(ctx.expression(0));
        if(condition!=null) {
            condition.setParent(node);
            node.addChild(condition);
        }

        AbstractSyntaxTree ifTrue = visit(ctx.expression(1));
        if(ifTrue!=null) {
            ifTrue.setParent(node);
            node.addChild(ifTrue);
        }

        AbstractSyntaxTree ifFalse = visit(ctx.expression(2));
        if(ifFalse!=null) {
            ifFalse.setParent(node);
            node.addChild(ifFalse);
        }

        return node;
    }

    @Override
    public AbstractSyntaxTree visitArrayInitExpr(ManuScriptParser.ArrayInitExprContext ctx) {
        System.out.println("visitingARRINITEXPR "+ctx.getStart().getLine()+"    "+ctx.getText());
        configureIsBreakpoint(ctx.getStart().getLine());

        AbstractSyntaxTree aiExpr = new AbstractSyntaxTree(null);
        aiExpr.setNodeType(NodeType.ARRAY_INIT);
        aiExpr.setBreakpoint(this.isBreakpoint);
        if(isBreakpoint)
            System.out.println("BP: "+aiExpr.getNodeType());

        ManuScriptParser.ArrayCreatorRestContext arRest = ctx.creator().arrayCreatorRest();
        if(arRest.arrayInitializer() != null) {
            //for '= int[]{a,b,c};'
            aiExpr.setValue("val");
            AbstractSyntaxTree ai = visit(arRest.arrayInitializer());
            if(ai != null){
                ai.setParent(aiExpr);
                aiExpr.addChild(ai);
            }
        }
        else {
            //for '= int[x];'
            aiExpr.setValue("dim");
            for(ManuScriptParser.ExpressionContext expr : arRest.expression()){
                AbstractSyntaxTree exprNode = visit(expr);
                if(exprNode != null){
                    exprNode.setParent(aiExpr);
                    aiExpr.addChild(exprNode);
                }
            }
        }

        return aiExpr;
    }

    @Override
    public AbstractSyntaxTree visitArrayInitializer(ManuScriptParser.ArrayInitializerContext ctx) {
        System.out.println("visitingARRINITIALIZER "+ctx.getStart().getLine()+"    "+ctx.getText());
        configureIsBreakpoint(ctx.getStart().getLine());
        AbstractSyntaxTree node = new AbstractSyntaxTree(null);
        node.setNodeType(NodeType.ARRAY_BLOCK);
        node.setBreakpoint(this.isBreakpoint);
        if(isBreakpoint)
            System.out.println("BP: "+node.getNodeType());

        for(ManuScriptParser.VariableInitializerContext viCtx : ctx.variableInitializer()){
            AbstractSyntaxTree vi = visit(viCtx);
            if(vi != null){
                vi.setParent(node);
                node.addChild(vi);
            }
        }

        return node;
    }

    @Override
    public AbstractSyntaxTree visitVariableDeclarator(ManuScriptParser.VariableDeclaratorContext ctx) {
        System.out.println("visitingVARDEC "+ctx.getStart().getLine()+"    "+ctx.getText());
        configureIsBreakpoint(ctx.getStart().getLine());
        AbstractSyntaxTree node = new AbstractSyntaxTree(null);

        node.setNodeType(NodeType.VAR_DECLARE);   //TODO: add nodetype if not assign
        node.setValue(ctx.getChild(1));
        node.setBreakpoint(this.isBreakpoint);
        if(isBreakpoint)
        	System.out.println("BP: "+node.getNodeType());
        
        AbstractSyntaxTree var = visit(ctx.variableDeclaratorId());
        if(var!=null) {
            var.setParent(node);
            node.addChild(var);
        }

        if(ctx.variableInitializer() != null) {
            ManuScriptParser.VariableInitializerContext varInit = ctx.variableInitializer();
            //check if variable is of type array
            if(((SymbolContext)var.getValue()).getCtxType().equals(ContextType.ARRAY)){
                //array start
                node.setNodeType(NodeType.ARRAY_ASSIGN);
                if(varInit.expression() instanceof ManuScriptParser.ArrayInitExprContext){
                    //for '= int[x];' && '= int[]{a,b,c};'
                    AbstractSyntaxTree value = visitArrayInitExpr((ManuScriptParser.ArrayInitExprContext)varInit.expression());
                    if (value != null) {
                        value.setParent(node);
                        node.addChild(value);
                    }
                } else if(varInit.arrayInitializer() !=  null){
                    //for '= {a,b,c,d}'
                    AbstractSyntaxTree init = new AbstractSyntaxTree(node);
                    init.setNodeType(NodeType.ARRAY_INIT);
                    init.setValue("val");

                    AbstractSyntaxTree value = visitArrayInitializer(varInit.arrayInitializer());
                    if (value != null) {
                        value.setParent(init);
                        init.addChild(value);
                    }

                    node.addChild(init);
                } else{
                    //if arNew = arOld;
                    AbstractSyntaxTree varRight = visit(varInit);
                    if (varRight != null) {
                        if(varRight.getChildren().size() == 0) {
                            SymbolContext symCtxL = (SymbolContext)var.getValue();
                            SymbolContext symCtxR = (SymbolContext)varRight.getValue();

                            symCtxL.setOther(symCtxR.getOther());

                            System.out.println("LEFT: "+symCtxL.getOther());
                            System.out.println("RIGHT: "+symCtxR.getOther());

                            varRight.setParent(node);
                            node.addChild(varRight);
                        }
                    }
                }
            } //array end
            else {  //if variable is normal type
                AbstractSyntaxTree value = visit(varInit);
                if (value != null) {
                    value.setParent(node);
                    node.addChild(value);
                }
            }
        }

        return node;
    }

    @Override
    public AbstractSyntaxTree visitAssignExpr(ManuScriptParser.AssignExprContext ctx) {
        System.out.println("visitingASSIGNEXPR "+ctx.getStart().getLine()+"    "+ctx.getText());
        configureIsBreakpoint(ctx.getStart().getLine());

        AbstractSyntaxTree node = new AbstractSyntaxTree(null);
        node.setNodeType(NodeType.ASSIGN);
        node.setValue(ctx.getChild(1));
        node.setBreakpoint(this.isBreakpoint);
        if(isBreakpoint)
        	System.out.println("BP: "+node.getNodeType());
        
        AbstractSyntaxTree target = visit(ctx.equationExpr());
        if(target!=null) {
            target.setParent(node);
            node.addChild(target);
        }

        if(!target.nodeType.equals(NodeType.ARRAY_ACCESS) && ((SymbolContext)target.getValue()).getCtxType().equals(ContextType.ARRAY)){
            //array start
            if(ctx.expression() instanceof ManuScriptParser.ArrayInitExprContext){
                //for '= int[x];' && '= int[]{a,b,c};'
                AbstractSyntaxTree value = visitArrayInitExpr((ManuScriptParser.ArrayInitExprContext)ctx.expression());
                if (value != null) {
                    value.setParent(node);
                    node.addChild(value);
                }
            } else{
                //if arNew = arOld;
                AbstractSyntaxTree varRight = visit(ctx.expression());
                if (varRight != null) {
                    if(varRight.getChildren().size() == 0) {
                        SymbolContext symCtxL = (SymbolContext)target.getValue();
                        SymbolContext symCtxR = (SymbolContext)varRight.getValue();

                        symCtxL.setOther(symCtxR.getOther());

                        System.out.println("LEFT: "+symCtxL.getOther());
                        System.out.println("RIGHT: "+symCtxR.getOther());

                        varRight.setParent(node);
                        node.addChild(varRight);
                    }
                }
            }
        } //array end
        else {
            AbstractSyntaxTree value = visit(ctx.expression());
            if (value != null) {
                value.setParent(node);
                node.addChild(value);
            }
        }

        return node;
    }

    @Override
    public AbstractSyntaxTree visitEquationExpr(ManuScriptParser.EquationExprContext ctx) {
        System.out.println("visitingEQEXPR "+ctx.getStart().getLine()+"    "+ctx.getText());
        configureIsBreakpoint(ctx.getStart().getLine());

        LeafNode variable = new LeafNode(null);
        variable.setNodeType(NodeType.VARIABLE);
        variable.setBreakpoint(this.isBreakpoint);
        if(isBreakpoint)
        	System.out.println("BP: "+variable.getNodeType());

        if(ctx.variableExpr() != null){
            //array variable
            SymbolContext symCtx;
            if(ctx.variableExpr().structExpr() != null){
                //struct array todo: struct access -- might have something wrong w/ grammar
            }else{
                //id array
                System.out.println("entered array access");
                variable.setNodeType(NodeType.ARRAY_ACCESS);
                symCtx = curScope.getSymTable().get(ctx.variableExpr().Identifier().getText());
                System.out.println("arr access: "+symCtx);
                if(symCtx != null){
                    variable.setValue(symCtx);
                    variable.setLiteralType(((ArrayInfo)symCtx.getOther()).getArrType());   //todo: is dis wat is wanted?
                    for(ManuScriptParser.ExpressionContext expr : ctx.expression()){
                        AbstractSyntaxTree index = visit(expr);
                        if(index != null){
                            index.setParent(variable);
                            variable.addChild(index);
                        }
                    }
                    return variable;
                }
            }
        }
        else if(ctx.structExpr() != null){
            //struct variable
            variable.setNodeType(NodeType.STRUCT_ACCESS);
            String structName = ctx.structExpr().structName().getText();
            SymbolContext symContext = curScope.getSymTable().get(structName);
            variable.setValue(symContext);
            StructInfo stInf = (StructInfo) symContext.getOther();
            System.out.println("initial str: "+stInf.getStructName());
            ManuScriptParser.StructMemberContext smctx = ctx.structExpr().structMember();
            AbstractSyntaxTree parent = variable , child = new AbstractSyntaxTree(parent);
            while(smctx != null){

                symContext = stInf.getMember(smctx.Identifier().getText());


                if(symContext == null)  //if member of current struct doesnt exist
                    break; //todo better implementation
                else
                    stInf = (StructInfo) symContext.getOther();


                smctx = smctx.structMember();
                if(smctx == null)
                    child = new LeafNode(parent);
                else
                    child = new AbstractSyntaxTree(parent);
                child.setNodeType(NodeType.VARIABLE);
                child.setValue(symContext);
                parent.addChild(child);


                parent = child;
            }

            if(symContext != null){
//                System.out.println("deepest struct: "+stInf.getStructName());

                ((LeafNode)child).setLiteralType(symContext.getSymbolType());
                return variable;
            }
            else{
                System.out.println("eqEXP ERROR");
                return null;
            }
        }
        else {
            //normal variable
            SymbolContext symContext = curScope.checkTables(ctx.Identifier().getText());

            if (symContext != null) {
                variable.setValue(symContext);
                variable.setLiteralType(symContext.getSymbolType());
                return variable;
            } else
                return null;
        }
        return null;
    }

    @Override
    public AbstractSyntaxTree visitPrimary(ManuScriptParser.PrimaryContext ctx) {


        System.out.println("visitingPRIMEXPR "+ctx.getStart().getLine()+"    "+ctx.getText());
        configureIsBreakpoint(ctx.getStart().getLine());
        if(ctx.equationExpr() != null && ctx.equationExpr().Identifier() != null){
//            System.out.println("variable found");
            LeafNode variable = new LeafNode(null);
            variable.setNodeType(NodeType.VARIABLE);
            SymbolContext symContext = null;
            variable.setBreakpoint(this.isBreakpoint);
            if(isBreakpoint)
            	System.out.println("BP: "+variable.getNodeType());
            

            symContext = curScope.checkTables(ctx.equationExpr().Identifier().getText());

            if(symContext != null){
                variable.setValue(symContext);
                variable.setLiteralType(symContext.getSymbolType());
                return variable;
            }
            else
                return super.visitPrimary(ctx); //should only enter here if variable not found [semantic error]

        }

        return super.visitPrimary(ctx);
    }


    @Override
    public AbstractSyntaxTree visitVariableExpr(ManuScriptParser.VariableExprContext ctx) {


        System.out.println("visitingVAREXPR "+ctx.getStart().getLine()+"    "+ctx.getText());
        configureIsBreakpoint(ctx.getStart().getLine());
        LeafNode variable = new LeafNode(null);
        variable.setNodeType(NodeType.VARIABLE);
        SymbolContext symContext = null;
        variable.setBreakpoint(this.isBreakpoint);
        if(isBreakpoint)
        	System.out.println("BP: "+variable.getNodeType());
        
        symContext = curScope.checkTables(ctx.Identifier().getText());

        if(symContext != null) {
            variable.setValue(symContext);
            variable.setLiteralType(symContext.getSymbolType());
            return variable;
        }
        else
            return null;
    }

    @Override
    public AbstractSyntaxTree visitVariableDeclaratorId(ManuScriptParser.VariableDeclaratorIdContext ctx) {


        System.out.println("visitingVARDECLID "+ctx.getStart().getLine()+"    "+ctx.getText());
        configureIsBreakpoint(ctx.getStart().getLine());
        LeafNode variable = new LeafNode(null);
        variable.setNodeType(NodeType.VARIABLE);
        SymbolContext symContext = null;
        variable.setBreakpoint(this.isBreakpoint);
        if(isBreakpoint)
        	System.out.println("BP: "+variable.getNodeType());
        
        symContext = curScope.checkTables(ctx.Identifier().getText());

        if(symContext != null) {
            variable.setValue(symContext);
            variable.setLiteralType(symContext.getSymbolType());
            return variable;
        }
        else
            return null;
    }

    @Override
    public AbstractSyntaxTree visitLiteral(ManuScriptParser.LiteralContext ctx) {


        System.out.println("visitingLIT "+ctx.getStart().getLine()+"    "+ctx.getText());
        configureIsBreakpoint(ctx.getStart().getLine());
        TerminalNode tn = null;
        String type = null;
        if(ctx.StringLiteral() != null) {
            tn = ctx.StringLiteral();
            type = "string";
        }
        else if(ctx.BooleanLiteral() != null) {
            tn = ctx.BooleanLiteral();
            type = "boolean";
        }
        else if(ctx.IntegerLiteral() != null) {
            tn = ctx.IntegerLiteral();
            type = "int";
        }
        else if(ctx.CharacterLiteral() != null) {
            tn = ctx.CharacterLiteral();
            type = "char";
        }
        else if(ctx.FloatingPointLiteral() != null) {
            tn = ctx.FloatingPointLiteral();
            type = "float";
        }

        if(type != null) {
            LeafNode literal = new LeafNode(null);
            literal.setNodeType(NodeType.LITERAL);
            literal.setBreakpoint(this.isBreakpoint);
            if(isBreakpoint)
            	System.out.println("BP: "+literal.getNodeType());
            
            
            literal.setLiteralType(type);
            literal.setValue(tn.getSymbol().getText());

            return literal;
        }
        else
            return null;

    }
}

