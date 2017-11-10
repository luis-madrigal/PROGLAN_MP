package com.interpreter;

import java.util.HashMap;
import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;

import com.parser.ManuScriptBaseListener;
import com.parser.ManuScriptParser;
import com.parser.ManuScriptParser.ExpressionContext;
import com.parser.ManuScriptParser.LocalVariableDeclarationContext;
import com.parser.ManuScriptParser.OutputValueContext;
import com.parser.ManuScriptParser.VariableDeclaratorContext;
import com.utils.Console;
import com.utils.Utils;

public class BaseListener extends ManuScriptBaseListener{
	private Stack<Scope> scopes;
	private HashMap<String, SymbolContext> symTable;
	
	public BaseListener() {
		scopes = new Stack<Scope>();
		scopes.push(new Scope(null));
		symTable = new HashMap<String, SymbolContext>();
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
	
	@Override public void enterLocalVariableDeclaration(ManuScriptParser.LocalVariableDeclarationContext ctx) { 
		String varType = ctx.typeType().getText();
		HashMap<String, String> variables = new HashMap<String, String>();
        Scope scope = scopes.peek();
        
		for (VariableDeclaratorContext vdctx : ctx.variableDeclarators().variableDeclarator()) {
			String value = (vdctx.variableInitializer() == null)? null : vdctx.variableInitializer().getText();
			String varName = vdctx.variableDeclaratorId().getText();
			if(!checkIfTypeMismatch(ctx, varType, value)) {
				System.out.println("added "+varName+" to symbol table");
				variables.put(varName, value);
				scope.add(varName);
				symTable.put(varName, new SymbolContext(ctx, scope));
			}
		}

	}

	@Override public void exitLocalVariableDeclaration(ManuScriptParser.LocalVariableDeclarationContext ctx) { }
		
	@Override public void enterVariableDeclarator(ManuScriptParser.VariableDeclaratorContext ctx) { 
		
        //TODO: push to symbol table
//        System.out.println(varName +" declared");
	}
	
	@Override public void exitVariableDeclarator(ManuScriptParser.VariableDeclaratorContext ctx) { }
	
	@Override public void enterExpression(ManuScriptParser.ExpressionContext ctx) { 
		if(ctx.primary() != null && ctx.primary().Identifier() != null) {
			String varName = ctx.primary().Identifier().getText();
			checkIfInScope(ctx, varName);
		}
//		ctx.
	}
	
	@Override public void exitExpression(ManuScriptParser.ExpressionContext ctx) { }
	
	@Override public void enterOutputStatement(ManuScriptParser.OutputStatementContext ctx) { 
//		for (OutputValueContext ovctx : ctx.outputValue()) {
//			if(ovctx.StringLiteral() != null)
//				Console.instance().log(Utils.removeFirstandLastChar(ovctx.getText()));
//		}
	}

	@Override public void exitOutputStatement(ManuScriptParser.OutputStatementContext ctx) { 
		
	}
	
	
	private boolean checkIfTypeMismatch(LocalVariableDeclarationContext ctx, String varType, String value) {
		if(varType.equals("int")) {
			try {
				Integer.parseInt(value);
			}catch(NumberFormatException e) {
	        	Console.instance().err(String.format(SemanticErrors.INT_MISMATCH, ctx.getStart().getLine(), ctx.getStop().getCharPositionInLine()));
	        	return true;
			}
		} else if(varType.equals("float")) {
			try {
				Float.parseFloat(value);
			}catch(NumberFormatException e) {
	        	Console.instance().err(String.format(SemanticErrors.FLOAT_MISMATCH, ctx.getStart().getLine(), ctx.getStop().getCharPositionInLine()));
	        	return true;
			}
		} else if(varType.equals("string")) {
			if(!value.substring(value.length()-1).equals("\"") || !value.substring(0, 1).equals("\"")) {
	        	Console.instance().err(String.format(SemanticErrors.STRING_MISMATCH, ctx.getStart().getLine(), ctx.getStop().getCharPositionInLine()));
	        	return true;
			}
		} else if(varType.equals("char")) {
			if(!value.substring(value.length()-1).equals("'") || !value.substring(0, 1).equals("'")) {
	        	Console.instance().err(String.format(SemanticErrors.CHAR_MISMATCH, ctx.getStart().getLine(), ctx.getStop().getCharPositionInLine()));
	        	return true;
			}
			if(value.length() > 3) {
	        	Console.instance().err(String.format(SemanticErrors.ONLY_ONE_CHAR, ctx.getStart().getLine(), ctx.getStop().getCharPositionInLine()));
	        	return true;
			}
		}
		
		return false;
	}
	
	private void checkIfInScope(ParserRuleContext ctx, String varName) {
		Scope scope = scopes.peek();
        if(scope.inScope(varName)) {
//            System.out.println("OK   : " + varName);
        }
        else {
        	Console.instance().err(String.format(SemanticErrors.UNDECLARED_VAR, ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), varName));
        }
	}
	
}
