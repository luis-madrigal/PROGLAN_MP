package com.interpreter.AST;

import com.interpreter.Scope;
import com.interpreter.contexts.SymbolContext;
import com.interpreter.modules.Reader;
import com.interpreter.modules.Writer;
import com.parser.ManuScriptBaseVisitor;
import com.parser.ManuScriptParser;
import com.utils.KeyTokens;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.HashMap;

public class ASTBuildVisitor extends ManuScriptBaseVisitor<AbstractSyntaxTree> {

    private Scope curScope;

    private ArrayList<Integer> levelIndexTracker;
    private int lvlDepth;
    private int lvlIndex;
    private int nExitBlock;


    private HashMap<String, ProcedureNode> methodASTTable;


    public ASTBuildVisitor(Scope symbolTable){
        methodASTTable = new HashMap<String, ProcedureNode>();
        this.curScope = symbolTable;
        this.levelIndexTracker = new ArrayList<>();
        this.levelIndexTracker.add(0);
        this.lvlIndex = 0;
        this.lvlDepth = 0;
        this.nExitBlock = 0;
    }

    public HashMap<String, ProcedureNode> getMethodASTTable(){
        return methodASTTable;
    }


    @Override public AbstractSyntaxTree visitCompilationUnit(ManuScriptParser.CompilationUnitContext ctx) {
		System.out.println("start AST generation");
		return visitChildren(ctx); 
	}

    @Override
    protected AbstractSyntaxTree aggregateResult(AbstractSyntaxTree aggregate, AbstractSyntaxTree nextResult) {

        if(nextResult != null)
            return nextResult;
        else
            return aggregate;
    }

    /**
     * acts as the exitBlockListener
     * @param node
     * @return
     */
    public AbstractSyntaxTree visitBlockChildren(RuleNode node) {
        AbstractSyntaxTree result = this.defaultResult();
        int n = node.getChildCount();

        for(int i = 0; i < n && this.shouldVisitNextChild(node, result); ++i) {
            ParseTree c = node.getChild(i);
            AbstractSyntaxTree childResult = c.accept(this);
            result = this.aggregateResult(result, childResult);
        }

        curScope = curScope.getParent();    //go deeper
        //this.levelIndexTracker.set(lvlDepth,++lvlIndex);    //sets next expected index
        lvlDepth--;
        nExitBlock++;
        if(nExitBlock >= 2){
            nExitBlock = 0;
            levelIndexTracker.set(lvlDepth + 1, 0);
        }
        return result;
    }

    @Override
    public AbstractSyntaxTree visitBlock(ManuScriptParser.BlockContext ctx) {
        lvlIndex = this.levelIndexTracker.get(lvlDepth);
        curScope = curScope.getChildren().get(lvlIndex);    //go deeper
        this.levelIndexTracker.set(lvlDepth,++lvlIndex);    //sets next expected index
        lvlDepth++;
        if(lvlDepth >= this.levelIndexTracker.size())
            this.levelIndexTracker.add(0);

        return visitBlockChildren(ctx);
    }

    /*@Override
    protected boolean shouldVisitNextChild(RuleNode node, AbstractSyntaxTree currentResult) {
        if(currentResult.)
        return true;
    }*/

    @Override
    public AbstractSyntaxTree visitMethodDeclaration(ManuScriptParser.MethodDeclarationContext ctx) {
        ProcedureNode pNode = new ProcedureNode(null,ctx.Identifier().getText());
        System.out.println("visited method declaration: "+ctx.Identifier().getText());
        pNode.setNodeType(NodeType.PROCEDURE);
        for(ManuScriptParser.BlockStatementContext bc : ctx.methodBody().block().blockStatement()) {
            AbstractSyntaxTree body = visitBlockStatement(bc);
            if (body != null) {
                body.setParent(pNode);
                pNode.addChild(body);
            }
        }
        System.out.println(ctx.Identifier().getText());
        methodASTTable.put(ctx.Identifier().getText(), pNode);


        return pNode;
    }

    @Override
    public AbstractSyntaxTree visitMethodBody(ManuScriptParser.MethodBodyContext ctx) {
        return super.visitMethodBody(ctx);
    }

    @Override
    public AbstractSyntaxTree visitReturnStmt(ManuScriptParser.ReturnStmtContext ctx) {
        System.out.println("Visited Return stmt");
        AbstractSyntaxTree node = new AbstractSyntaxTree(null);
        node.setNodeType(NodeType.RETURN);
        System.out.println("preVisit return");
        AbstractSyntaxTree child = visitChildren(ctx.expression());
        if(child!=null) {
            child.setParent(node);
            node.addChild(child);
        }
        System.out.println(node.getNodeType());
        return node;
    }


    @Override
    public AbstractSyntaxTree visitWhileStmt(ManuScriptParser.WhileStmtContext ctx) {
        AbstractSyntaxTree node = new AbstractSyntaxTree(null);
        node.setNodeType(NodeType.WHILE);
        AbstractSyntaxTree condition = visit(ctx.parExpression().expression());
        if(condition!=null) {
            condition.setParent(node);
            node.addChild(condition);
        }
        AbstractSyntaxTree block = visitChildren(ctx.statement());
        if(block!=null) {
            block.setParent(node);
            node.addChild(block);
        }
        return node;
    }

    @Override
    public AbstractSyntaxTree visitDoWhileStmt(ManuScriptParser.DoWhileStmtContext ctx) {
        AbstractSyntaxTree node = new AbstractSyntaxTree(null);
        node.setNodeType(NodeType.DO_WHILE);

        AbstractSyntaxTree block = visitChildren(ctx.statement());
        if(block!=null) {
            block.setParent(node);
            node.addChild(block);
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

        AbstractSyntaxTree node = new AbstractSyntaxTree(null);
        node.setNodeType(NodeType.FOR);

        AbstractSyntaxTree forInit = visitChildren(ctx.forControl().forInit());
        if( forInit != null ) {
            forInit.setParent(node);
            node.addChild(forInit);
        }
        AbstractSyntaxTree condition = visit(ctx.forControl().expression());
        if( condition != null ) {
            condition.setParent(node);
            node.addChild(condition);
        }
        AbstractSyntaxTree forUpdate = visitChildren(ctx.forControl().forUpdate());
        if( forUpdate != null ) {
            forUpdate.setParent(node);
            node.addChild(forUpdate);
        }
        AbstractSyntaxTree statement = visitChildren(ctx.statement());
        if(statement!=null) {
            statement.setParent(node);
            node.addChild(statement);
        }
        return node;
    }

    @Override
    public AbstractSyntaxTree visitIfElseStmt(ManuScriptParser.IfElseStmtContext ctx) {
        AbstractSyntaxTree node = new AbstractSyntaxTree(null);
        node.setNodeType(NodeType.BRANCH);
        //todo: must have a way to determine if else block exists
        AbstractSyntaxTree condition = visitChildren(ctx.parExpression());
        if(condition!=null) {
            condition.setParent(node);
            node.addChild(condition);
        }
        AbstractSyntaxTree statementIf = visitChildren(ctx.statement(0));
        if(statementIf!=null) {
            statementIf.setParent(node);
            node.addChild(statementIf);
        }
        AbstractSyntaxTree statementElse = visitChildren(ctx.statement(1));
        if(statementElse!=null) {
            statementElse.setParent(node);
            node.addChild(statementElse);
        }
        return node;
    }



    @Override
    public AbstractSyntaxTree visitOutputStatement(ManuScriptParser.OutputStatementContext ctx) {
        AbstractSyntaxTree node = new AbstractSyntaxTree(null);
        node.setNodeType(NodeType.PRINT);

        AbstractSyntaxTree output = visitChildren(ctx.expression());
        if(output!=null){   //todo: to remove; create better implementation on astanalyzer
            output.setParent(node);
            node.addChild(output);
            Writer.printText((String)output.getValue());
        }


        return node;
    }

    @Override
    public AbstractSyntaxTree visitInputStatement(ManuScriptParser.InputStatementContext ctx) {

        String a = Reader.readInput();

        Writer.printText(a);

        return super.visitInputStatement(ctx);
    }

    @Override
    public AbstractSyntaxTree visitArrayExpr(ManuScriptParser.ArrayExprContext ctx) {
        AbstractSyntaxTree node = new AbstractSyntaxTree(null);
        node.setNodeType(NodeType.ARRAY_ACCESS);

        AbstractSyntaxTree var = visitChildren(ctx.variableExpr());
        if(var!=null) {
            var.setParent(node);
            node.addChild(var);
        }

        AbstractSyntaxTree expression = visitChildren(ctx.expression());
        if(expression!=null) {
            expression.setParent(node);
            node.addChild(expression);
        }

        return node;
    }

    @Override
    public AbstractSyntaxTree visitFunctionExpr(ManuScriptParser.FunctionExprContext ctx) {
        ProcedureNode node = new ProcedureNode(null, ctx.variableExpr().getText());
        node.setNodeType(NodeType.PROCEDURE_CALL);
        for(ManuScriptParser.ExpressionContext c : ctx.expressionList().expression()){
            AbstractSyntaxTree param = visit(c);
            if(param != null) {
                param.setParent(node);
                node.addChild(param);
            }
        }

        return node;
    }

    @Override
    public AbstractSyntaxTree visitPostIncDecExpr(ManuScriptParser.PostIncDecExprContext ctx) {
        AbstractSyntaxTree node = new AbstractSyntaxTree(null);
        node.setNodeType(NodeType.UNIPOST_ARITHMETIC);
        System.out.println(ctx.getChild(1).getText());
        node.setValue(ctx.getChild(1).getText());

        AbstractSyntaxTree left = visitChildren(ctx.variableExpr());
        if(left!=null) {
            left.setParent(node);
            node.addChild(left);
        }

        return node;
    }

    @Override
    public AbstractSyntaxTree visitPreIncDecSignExpr(ManuScriptParser.PreIncDecSignExprContext ctx) {
        //also includes sign operator
        AbstractSyntaxTree node = new AbstractSyntaxTree(null);
        node.setNodeType(NodeType.UNIPRE_ARITHMETIC);
        System.out.println(ctx.getChild(0).getText());
        node.setValue(ctx.getChild(0).getText());

        AbstractSyntaxTree right = visitChildren(ctx.variableExpr());
        if(right!=null) {
            right.setParent(node);
            node.addChild(right);
        }

        return node;
    }

    @Override
    public AbstractSyntaxTree visitNegationExpr(ManuScriptParser.NegationExprContext ctx) {
        AbstractSyntaxTree node = new AbstractSyntaxTree(null);
        node.setNodeType(NodeType.UNI_LOGIC);
        System.out.println(ctx.getChild(0).getText());
        node.setValue(ctx.getChild(0).getText());

        AbstractSyntaxTree right = visitChildren(ctx.expression());
        if(right!=null) {
            right.setParent(node);
            node.addChild(right);
        }

        return node;
    }

    @Override
    public AbstractSyntaxTree visitMultDivModExpr(ManuScriptParser.MultDivModExprContext ctx) {
        AbstractSyntaxTree node = new AbstractSyntaxTree(null);
        node.setNodeType(NodeType.BIN_ARITHMETIC);
        System.out.println(ctx.getChild(1).getText());
        node.setValue(ctx.getChild(1).getText());

        AbstractSyntaxTree left = visitChildren(ctx.expression(0));
        if(left!=null) {
            left.setParent(node);
            node.addChild(left);
        }

        AbstractSyntaxTree right = visitChildren(ctx.expression(1));
        if(right!=null) {
            right.setParent(node);
            node.addChild(right);
        }

        return node;
    }

    @Override
    public AbstractSyntaxTree visitAddSubExpr(ManuScriptParser.AddSubExprContext ctx) {
        AbstractSyntaxTree node = new AbstractSyntaxTree(null);
        node.setNodeType(NodeType.BIN_ARITHMETIC);
        System.out.println(ctx.getChild(1).getText());
        node.setValue(ctx.getChild(1).getText());

        AbstractSyntaxTree left = visitChildren(ctx.expression(0));
        if(left!=null) {
            left.setParent(node);
            node.addChild(left);
        }

        AbstractSyntaxTree right = visitChildren(ctx.expression(1));
        if(right!=null) {
            right.setParent(node);
            node.addChild(right);
        }


        return node;
    }

    @Override
    public AbstractSyntaxTree visitComparisonExpr(ManuScriptParser.ComparisonExprContext ctx) {
        AbstractSyntaxTree node = new AbstractSyntaxTree(null);
        node.setNodeType(NodeType.BIN_LOGIC);
        System.out.println(ctx.getChild(1).getText());
        node.setValue(ctx.getChild(1).getText());

        AbstractSyntaxTree left = visitChildren(ctx.expression(0));
        if(left!=null) {
            left.setParent(node);
            node.addChild(left);
        }

        AbstractSyntaxTree right = visitChildren(ctx.expression(1));
        if(right!=null) {
            right.setParent(node);
            node.addChild(right);
        }

        return node;
    }

    @Override
    public AbstractSyntaxTree visitEqualityExpr(ManuScriptParser.EqualityExprContext ctx) {
        AbstractSyntaxTree node = new AbstractSyntaxTree(null);
        node.setNodeType(NodeType.BIN_LOGIC);
        System.out.println(ctx.getChild(1).getText());
        node.setValue(ctx.getChild(1).getText());

        AbstractSyntaxTree left = visitChildren(ctx.expression(0));
        if(left!=null) {
            left.setParent(node);
            node.addChild(left);
        }

        AbstractSyntaxTree right = visitChildren(ctx.expression(1));
        if(right!=null) {
            right.setParent(node);
            node.addChild(right);
        }

        return node;
    }

    @Override
    public AbstractSyntaxTree visitAndExpr(ManuScriptParser.AndExprContext ctx) {
        AbstractSyntaxTree node = new AbstractSyntaxTree(null);
        node.setNodeType(NodeType.BIN_LOGIC);
        System.out.println(ctx.getChild(1).getText());
        node.setValue(ctx.getChild(1).getText());

        AbstractSyntaxTree left = visitChildren(ctx.expression(0));
        if(left!=null) {
            left.setParent(node);
            node.addChild(left);
        }

        AbstractSyntaxTree right = visitChildren(ctx.expression(1));
        if(right!=null) {
            right.setParent(node);
            node.addChild(right);
        }

        return node;
    }

    @Override
    public AbstractSyntaxTree visitOrExpr(ManuScriptParser.OrExprContext ctx) {
        AbstractSyntaxTree node = new AbstractSyntaxTree(null);
        node.setNodeType(NodeType.BIN_LOGIC);
        System.out.println(ctx.getChild(1).getText());
        node.setValue(ctx.getChild(1).getText());

        AbstractSyntaxTree left = visitChildren(ctx.expression(0));
        if(left!=null) {
            left.setParent(node);
            node.addChild(left);
        }

        AbstractSyntaxTree right = visitChildren(ctx.expression(1));
        if(right!=null) {
            right.setParent(node);
            node.addChild(right);
        }

        return node;
    }

    @Override
    public AbstractSyntaxTree visitOneLineIfExpr(ManuScriptParser.OneLineIfExprContext ctx) {
        AbstractSyntaxTree node = new AbstractSyntaxTree(null);
        node.setNodeType(NodeType.TER_OP);

        AbstractSyntaxTree condition = visitChildren(ctx.expression(0));
        if(condition!=null) {
            condition.setParent(node);
            node.addChild(condition);
        }

        AbstractSyntaxTree ifTrue = visitChildren(ctx.expression(1));
        if(ifTrue!=null) {
            ifTrue.setParent(node);
            node.addChild(ifTrue);
        }

        AbstractSyntaxTree ifFalse = visitChildren(ctx.expression(2));
        if(ifFalse!=null) {
            ifFalse.setParent(node);
            node.addChild(ifFalse);
        }

        return node;
    }

    @Override
    public AbstractSyntaxTree visitAssignExpr(ManuScriptParser.AssignExprContext ctx) {
        AbstractSyntaxTree node = new AbstractSyntaxTree(null);
        node.setNodeType(NodeType.ASSIGN);
        System.out.println(ctx.getChild(1));
        node.setValue(ctx.getChild(1));

        AbstractSyntaxTree target = visitChildren(ctx.equationExpr());
        if(target!=null) {
            target.setParent(node);
            node.addChild(target);
        }
        AbstractSyntaxTree value = visitChildren(ctx.expression());
        if(value!=null) {
            value.setParent(node);
            node.addChild(value);
        }
        return node;

    }




    /*
    @Override
    public AbstractSyntaxTree visitPrimary(ManuScriptParser.PrimaryContext ctx) {

        if(ctx.Identifier() != null){

            LeafNode variable = new LeafNode(null);
            variable.setNodeType(NodeType.VARIABLE);
            SymbolContext symContext = null;


            symContext = curScope.getIfInScope(ctx.Identifier().getText());
            String type = symContext.getSymbolType(); //todo: convert to enum?

            if(symContext != null){
                variable.setValue(symContext.getIdentifier());
                //todo: add type?
                //todo:check if pointerID?
                return variable;
            }
            else
                return super.visitPrimary(ctx); //should only enter here if variable not found [semantic error]

            //todo: check value from symbol table;
            //todo: how to check for pointer id?
        }

        return super.visitPrimary(ctx);
    }
    */

    @Override
    public AbstractSyntaxTree visitVariableExpr(ManuScriptParser.VariableExprContext ctx) {
        LeafNode variable = new LeafNode(null);
        variable.setNodeType(NodeType.VARIABLE);
        SymbolContext symContext = null;

        symContext = curScope.getIfInScope(ctx.Identifier().getText());
        String type = symContext.getSymbolType(); //todo: convert to enum?

        if(symContext != null) {
            variable.setValue(symContext.getIdentifier());
            //todo: add type?

            return variable;
        }
        else
            return null;
    }

    @Override
    public AbstractSyntaxTree visitLiteral(ManuScriptParser.LiteralContext ctx) {
        TerminalNode tn = null;
        KeyTokens.LITERAL_TYPE type = null;
        if(ctx.StringLiteral() != null) {
            tn = ctx.StringLiteral();
            type = KeyTokens.LITERAL_TYPE.STRING;
        }
        else if(ctx.BooleanLiteral() != null) {
            tn = ctx.BooleanLiteral();
            type = KeyTokens.LITERAL_TYPE.BOOL;
        }
        else if(ctx.IntegerLiteral() != null) {
            tn = ctx.IntegerLiteral();
            type = KeyTokens.LITERAL_TYPE.INT;
        }
        else if(ctx.CharacterLiteral() != null) {
            tn = ctx.CharacterLiteral();
            type = KeyTokens.LITERAL_TYPE.CHAR;
        }
        else if(ctx.FloatingPointLiteral() != null) {
            tn = ctx.FloatingPointLiteral();
            type = KeyTokens.LITERAL_TYPE.FLOAT;
        }

        if(type != null) {
            LeafNode literal = new LeafNode(null);
            literal.setNodeType(NodeType.LITERAL);

            System.out.println(type);
            System.out.println("literal: " + tn);
            literal.setValue(tn.getSymbol().getText());

            return literal;
        }
        else
            return null;

    }
}

