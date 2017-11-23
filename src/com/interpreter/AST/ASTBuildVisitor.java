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
import java.util.List;

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
        System.out.println("init size: "+levelIndexTracker.size());
        this.lvlIndex = 0;
        this.lvlDepth = 0;
        this.nExitBlock = 0;
    }

    public HashMap<String, ProcedureNode> getMethodASTTable() {
        return methodASTTable;
    }

    public void printAST(String rootName){
        methodASTTable.get(rootName).print();
    }

    @Override public AbstractSyntaxTree visitCompilationUnit(ManuScriptParser.CompilationUnitContext ctx) {

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

        exitBlock();

        return result;
    }

    private void exitBlock(){
        curScope = curScope.getParent();    //go deeper
        //this.levelIndexTracker.set(lvlDepth,++lvlIndex);    //sets next expected index
        lvlDepth--;
        nExitBlock++;
        if(nExitBlock >= 2){
            nExitBlock = 0;
            levelIndexTracker.set(lvlDepth + 1, 0);
        }
    }

    private void enterBlock(){
        lvlIndex = this.levelIndexTracker.get(lvlDepth);
        curScope = curScope.getChildren().get(lvlIndex);    //go deeper
        System.out.println("scope: "+lvlIndex);
        this.levelIndexTracker.set(lvlDepth,++lvlIndex);    //sets next expected index
        lvlDepth++;
        if(lvlDepth >= this.levelIndexTracker.size())
            this.levelIndexTracker.add(0);
    }

    @Override
    public AbstractSyntaxTree visitBlock(ManuScriptParser.BlockContext ctx) {
        enterBlock();

        AbstractSyntaxTree blockNode = new AbstractSyntaxTree(null);
        blockNode.setNodeType(NodeType.BLOCK);
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
        ProcedureNode pNode = new ProcedureNode(null,ctx.Identifier().getText());
        System.out.println("visited method declaration: "+ctx.Identifier().getText());
        pNode.setNodeType(NodeType.FUNCTION_DECLARATION);

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
        AbstractSyntaxTree node = new AbstractSyntaxTree(null);
        node.setNodeType(NodeType.RETURN);

        AbstractSyntaxTree child = visit(ctx.expression());

        if(child!=null) {
            child.setParent(node);
            node.addChild(child);
    }

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

        AbstractSyntaxTree stmt = visit(ctx.statement());
        if(stmt!=null) {
            stmt.setParent(node);
            node.addChild(stmt);
        }
        return node;
    }

    @Override
    public AbstractSyntaxTree visitDoWhileStmt(ManuScriptParser.DoWhileStmtContext ctx) {
        AbstractSyntaxTree node = new AbstractSyntaxTree(null);
        node.setNodeType(NodeType.DO_WHILE);

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

        AbstractSyntaxTree node = new AbstractSyntaxTree(null);
        node.setNodeType(NodeType.FOR);

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
        AbstractSyntaxTree node = new AbstractSyntaxTree(null);
        node.setNodeType(NodeType.BRANCH);

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
        AbstractSyntaxTree node = new AbstractSyntaxTree(null);
        node.setNodeType(NodeType.PRINT);

        AbstractSyntaxTree output = visit(ctx.expression());
        if(output!=null){
            output.setParent(node);
            node.addChild(output);
        }


        return node;
    }

    @Override
    public AbstractSyntaxTree visitInputStatement(ManuScriptParser.InputStatementContext ctx) {
        AbstractSyntaxTree node = new AbstractSyntaxTree(null);
        node.setNodeType(NodeType.SCAN);

        AbstractSyntaxTree scanTo = visit(ctx.variableDeclaratorId());
        if(scanTo != null){
            scanTo.setParent(node);
            node.addChild(scanTo);
        }

        if(ctx.typeType() != null) {
            System.out.println("Scan type: "+ ctx.typeType().getText());
            node.setValue(ctx.typeType().getText());
        }
        return node;
    }



    @Override
    public AbstractSyntaxTree visitArrayExpr(ManuScriptParser.ArrayExprContext ctx) {
        AbstractSyntaxTree node = new AbstractSyntaxTree(null);
        node.setNodeType(NodeType.ARRAY_ACCESS);

        AbstractSyntaxTree var = visit(ctx.variableExpr());
        if(var!=null) {
            var.setParent(node);
            node.addChild(var);
        }

        AbstractSyntaxTree expression = visit(ctx.expression());
        if(expression!=null) {
            expression.setParent(node);
            node.addChild(expression);
        }

        return node;
    }

    @Override
    public AbstractSyntaxTree visitFunctionExpr(ManuScriptParser.FunctionExprContext ctx) {
        ProcedureNode node = new ProcedureNode(null, ctx.variableExpr().getText());
        node.setNodeType(NodeType.FUNCTION_INVOKE);
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
        node.setValue(ctx.getChild(1).getText());

        AbstractSyntaxTree left = visit(ctx.variableExpr());
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
        node.setValue(ctx.getChild(0).getText());

        AbstractSyntaxTree right = visit(ctx.variableExpr());
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
        node.setValue(ctx.getChild(0).getText());

        AbstractSyntaxTree right = visit(ctx.expression());
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
        node.setValue(ctx.getChild(1).getText());

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
        AbstractSyntaxTree node = new AbstractSyntaxTree(null);
        node.setNodeType(NodeType.BIN_ARITHMETIC);
        node.setValue(ctx.getChild(1).getText());

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
        AbstractSyntaxTree node = new AbstractSyntaxTree(null);
        node.setNodeType(NodeType.BIN_LOGIC);
        node.setValue(ctx.getChild(1).getText());

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
        AbstractSyntaxTree node = new AbstractSyntaxTree(null);
        node.setNodeType(NodeType.BIN_LOGIC);
        node.setValue(ctx.getChild(1).getText());

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
        AbstractSyntaxTree node = new AbstractSyntaxTree(null);
        node.setNodeType(NodeType.BIN_LOGIC);
        node.setValue(ctx.getChild(1).getText());

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
        AbstractSyntaxTree node = new AbstractSyntaxTree(null);
        node.setNodeType(NodeType.BIN_LOGIC);
        node.setValue(ctx.getChild(1).getText());

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
        AbstractSyntaxTree node = new AbstractSyntaxTree(null);
        node.setNodeType(NodeType.TER_OP);

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
    public AbstractSyntaxTree visitVariableDeclarator(ManuScriptParser.VariableDeclaratorContext ctx) {
        AbstractSyntaxTree node = new AbstractSyntaxTree(null);
        node.setNodeType(NodeType.VAR_DECLARE);   //TODO: add nodetype if not assign
        node.setValue(ctx.getChild(1));

        AbstractSyntaxTree var = visit(ctx.variableDeclaratorId());
        if(var!=null) {
            var.setParent(node);
            node.addChild(var);
        }

        if(ctx.variableInitializer() != null) {
            node.setNodeType(NodeType.ASSIGN);
            AbstractSyntaxTree value = visit(ctx.variableInitializer());
            if (value != null) {
                value.setParent(node);
                node.addChild(value);
            }
        }


        return node;
    }

    @Override
    public AbstractSyntaxTree visitAssignExpr(ManuScriptParser.AssignExprContext ctx) {
        AbstractSyntaxTree node = new AbstractSyntaxTree(null);
        node.setNodeType(NodeType.ASSIGN);
        node.setValue(ctx.getChild(1));

        AbstractSyntaxTree target = visit(ctx.equationExpr());
        if(target!=null) {
            target.setParent(node);
            node.addChild(target);
        }

        AbstractSyntaxTree value = visit(ctx.expression());
        if(value!=null) {
            value.setParent(node);
            node.addChild(value);
        }
        return node;

    }

    @Override
    public AbstractSyntaxTree visitEquationExpr(ManuScriptParser.EquationExprContext ctx) {
        LeafNode variable = new LeafNode(null);
        variable.setNodeType(NodeType.VARIABLE);
        SymbolContext symContext = null;

        symContext = curScope.checkTables(ctx.Identifier().getText());
        String type = symContext.getSymbolType(); //todo: convert to enum?

        if(symContext != null) {
            variable.setValue(symContext.getIdentifier());
            variable.setLiteralType(symContext.getSymbolType());
            return variable;
        }
        else
            return null;
    }

    @Override
    public AbstractSyntaxTree visitPrimary(ManuScriptParser.PrimaryContext ctx) {

        if(ctx.Identifier() != null){
            System.out.println("variable found");
            LeafNode variable = new LeafNode(null);
            variable.setNodeType(NodeType.VARIABLE);
            SymbolContext symContext = null;


            symContext = curScope.checkTables(ctx.Identifier().getText());

            if(symContext != null){
                System.out.println("symcontext found");
                variable.setValue(symContext.getIdentifier());
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
        LeafNode variable = new LeafNode(null);
        variable.setNodeType(NodeType.VARIABLE);
        SymbolContext symContext = null;

        symContext = curScope.checkTables(ctx.Identifier().getText());
        String type = symContext.getSymbolType(); //todo: convert to enum?

        if(symContext != null) {
            variable.setValue(symContext.getIdentifier());
            variable.setLiteralType(symContext.getSymbolType());
            return variable;
        }
        else
            return null;
    }

    @Override
    public AbstractSyntaxTree visitVariableDeclaratorId(ManuScriptParser.VariableDeclaratorIdContext ctx) {
        LeafNode variable = new LeafNode(null);
        variable.setNodeType(NodeType.VARIABLE);
        SymbolContext symContext = null;

        symContext = curScope.checkTables(ctx.Identifier().getText());
        System.out.println("var "+ctx.Identifier().getText() + " in table? "+curScope.inScope(ctx.Identifier().getText()));
        System.out.println(symContext.getSymbolType());

        if(symContext != null) {
            variable.setValue(symContext.getIdentifier());
            variable.setLiteralType(symContext.getSymbolType());
            return variable;
        }
        else
            return null;
    }

    @Override
    public AbstractSyntaxTree visitLiteral(ManuScriptParser.LiteralContext ctx) {
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
            literal.setLiteralType(type);
            literal.setValue(tn.getSymbol().getText());

            return literal;
        }
        else
            return null;

    }
}

