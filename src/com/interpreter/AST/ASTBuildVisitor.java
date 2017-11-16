package com.interpreter.AST;

import com.parser.ManuScriptBaseVisitor;
import com.parser.ManuScriptParser;
import org.antlr.v4.runtime.tree.RuleNode;

import java.util.ArrayList;
import java.util.HashMap;

public class ASTBuildVisitor extends ManuScriptBaseVisitor<AbstractSyntaxTree> {

    private HashMap<String, ProcedureNode> methodASTTable;

    public HashMap<String, ProcedureNode> getMethodASTTable(){
        return methodASTTable;
    }

    public ASTBuildVisitor(){
        methodASTTable = new HashMap<String, ProcedureNode>();
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
    public AbstractSyntaxTree visitAssignExpr(ManuScriptParser.AssignExprContext ctx) {
        AbstractSyntaxTree node = new AbstractSyntaxTree(null);
        node.setNodeType(NodeType.ASSIGN);

        AbstractSyntaxTree target = visit(ctx.getParent().getChild(0));
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

    @Override
    public AbstractSyntaxTree visitOutputStatement(ManuScriptParser.OutputStatementContext ctx) {
        AbstractSyntaxTree node = new AbstractSyntaxTree(null);
        node.setNodeType(NodeType.PRINT);

        //TODO: expressions
        AbstractSyntaxTree output = visitChildren(ctx.expression());
        if(output!=null){
            output.setParent(node);
            node.addChild(output);
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
}

