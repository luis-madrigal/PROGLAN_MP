package com.interpreter.AST;

import com.parser.ManuScriptBaseListener;
import com.parser.ManuScriptParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;

public class ASTBuildListener extends ManuScriptBaseListener{

    private HashMap<String, ProcedureNode> methodASTTable;

    public ASTBuildListener(){
        methodASTTable = new HashMap<String, ProcedureNode>();
    }


    @Override public void enterMethodDeclaration(ManuScriptParser.MethodDeclarationContext ctx) {
        ProcedureNode pNode = new ProcedureNode(null, ctx.Identifier().getText());
        methodASTTable.put(ctx.Identifier().getText(),pNode);
        //for(ManuScriptParser.BlockStatementContext bctx : ctx.methodBody().block().blockStatement()){

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitMethodDeclaration(ManuScriptParser.MethodDeclarationContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */

}
