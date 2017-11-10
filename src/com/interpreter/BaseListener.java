package com.interpreter;

import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;

import com.parser.ManuScriptBaseListener;
import com.parser.ManuScriptParser;
import com.parser.ManuScriptParser.ExpressionContext;
import com.utils.Console;

public class BaseListener extends ManuScriptBaseListener{
	private Stack<Scope> scopes;
	
	public BaseListener() {
		scopes = new Stack<Scope>();
		scopes.push(new Scope(null));
	}
	
	@Override public void enterVariableModifier(ManuScriptParser.VariableModifierContext ctx) { }
	
	@Override public void exitVariableModifier(ManuScriptParser.VariableModifierContext ctx) { }
	
	@Override public void enterClassDeclaration(ManuScriptParser.ClassDeclarationContext ctx) {
		scopes.push(new Scope(scopes.peek()));
	}
	
	@Override public void exitClassDeclaration(ManuScriptParser.ClassDeclarationContext ctx) {
		scopes.pop();
	} 
	
	@Override public void enterMethodDeclaration(ManuScriptParser.MethodDeclarationContext ctx) {
		scopes.push(new Scope(scopes.peek()));
	}

	@Override public void exitMethodDeclaration(ManuScriptParser.MethodDeclarationContext ctx) { 
		scopes.pop();
	}
	
	@Override public void enterFieldDeclaration(ManuScriptParser.FieldDeclarationContext ctx) { }
	
	@Override public void exitFieldDeclaration(ManuScriptParser.FieldDeclarationContext ctx) { }
	
	@Override public void enterVariableDeclarator(ManuScriptParser.VariableDeclaratorContext ctx) { 
		String varName = ctx.variableDeclaratorId().getText();
        Scope scope = scopes.peek();
        scope.add(varName);
//        System.out.println(varName +" declared");
	}
	
	@Override public void exitVariableDeclarator(ManuScriptParser.VariableDeclaratorContext ctx) { }
	
	@Override public void enterExpression(ManuScriptParser.ExpressionContext ctx) { 
		if(ctx.primary() != null && ctx.primary().Identifier() != null) {
			String varName = ctx.primary().Identifier().getText();
			checkIfInScope(ctx, varName);
		}
	}
	
	@Override public void exitExpression(ManuScriptParser.ExpressionContext ctx) { }
	
	private void checkIfInScope(ParserRuleContext ctx, String varName) {
		Scope scope = scopes.peek();
        if(scope.inScope(varName)) {
        	//TODO: push to symbol table
//            System.out.println("OK   : " + varName);
        }
        else {
        	//TODO: undeclared variable error
        	Console.instance().err("line "+ctx.getStart().getLine()+":"+ctx.getStart().getCharPositionInLine()+" undeclared variable "+varName);
        }
	}
	
}
