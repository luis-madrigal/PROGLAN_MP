package com.interpreter;

import java.util.HashMap;
import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;

import com.interpreter.contexts.MethodContext;
import com.interpreter.contexts.SymbolContext;
import com.interpreter.matchers.LiteralMatcher;
import com.parser.ManuScriptBaseListener;
import com.parser.ManuScriptParser;
import com.parser.ManuScriptParser.ExpressionContext;
import com.parser.ManuScriptParser.FormalParameterContext;
import com.parser.ManuScriptParser.VariableDeclaratorContext;
import com.utils.Console;

public class BaseListener extends ManuScriptBaseListener{
	private Stack<Scope> scopes;
//	private HashMap<String, SymbolContext> symTable;
	private HashMap<String, MethodContext> methodTable;
	
	public BaseListener() {
		scopes = new Stack<Scope>();
		scopes.push(new Scope(null));
//		symTable = new HashMap<String, SymbolContext>();
		methodTable = new HashMap<String, MethodContext>();
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
		String methodName = ctx.Identifier().getText();
		methodTable.put(methodName, new MethodContext(ctx, scopes.peek(), methodName));
		
		Scope scope = new Scope(scopes.peek());
		scopes.push(scope);
		
		if(ctx.formalParameters().formalParameterList() != null) {
			for (FormalParameterContext fpctx : ctx.formalParameters().formalParameterList().formalParameter()) {
				String varName = fpctx.variableDeclaratorId().getText();
				
				System.out.println("added "+varName+" from method " +methodName+ " to symbol table");
				scope.add(varName);
				getCurrentSymTable().put(varName, new SymbolContext(fpctx.typeType().getText(), scope, varName));
			}
		}
	
	}

	@Override public void exitMethodDeclaration(ManuScriptParser.MethodDeclarationContext ctx) { 
		scopes.pop();
	}
	
	@Override public void enterFieldDeclaration(ManuScriptParser.FieldDeclarationContext ctx) {
		String varType = ctx.typeType().getText();
//		HashMap<String, String> variables = new HashMap<String, String>();
        Scope scope = scopes.peek();
        boolean isConstant = false;
        if(ctx.fieldModifier().size() > 1)
        	isConstant = true;
        System.out.println(isConstant);
		for (VariableDeclaratorContext vdctx : ctx.variableDeclarators().variableDeclarator()) {
			//TODO: value only works for literal. not yet evaluating expressions
			String value = (vdctx.variableInitializer() == null)? null : vdctx.variableInitializer().getText();
			value = (value != null && value.equals("null"))? null : value;
			String varName = vdctx.variableDeclaratorId().getText();
			
			if(getCurrentSymTable().containsKey(varName)) {
				Console.instance().err(String.format(SemanticErrors.DUPLICATE_VAR, vdctx.getStart().getLine(), vdctx.getStart().getCharPositionInLine(), varName));
			} else if(value == null || !checkIfTypeMismatch(ctx, varType, value)) {
//				if(vdctx)
				System.out.println("added "+varName+" to symbol table");
//				variables.put(varName, value);
				scope.add(varName);
				getCurrentSymTable().put(varName, new SymbolContext(ctx.typeType().getText(), scope, varName, isConstant));
			}
		}
	}
	
	@Override public void exitFieldDeclaration(ManuScriptParser.FieldDeclarationContext ctx) { }
	
	@Override public void enterLocalVariableDeclaration(ManuScriptParser.LocalVariableDeclarationContext ctx) { 
		String varType = ctx.typeType().getText();
//		HashMap<String, String> variables = new HashMap<String, String>();
        Scope scope = scopes.peek();
        
		for (VariableDeclaratorContext vdctx : ctx.variableDeclarators().variableDeclarator()) {
			//TODO: value only works for literal. not yet evaluating expressions
			String value = (vdctx.variableInitializer() == null)? null : vdctx.variableInitializer().getText();
			value = (value.equals("null"))? null : value;
			String varName = vdctx.variableDeclaratorId().getText();
			
			if(getCurrentSymTable().containsKey(varName)) {
				Console.instance().err(String.format(SemanticErrors.DUPLICATE_VAR, vdctx.getStart().getLine(), vdctx.getStart().getCharPositionInLine(), varName));
			} else if(value == null || !checkIfTypeMismatch(ctx, varType, value)) {
				System.out.println("added "+varName+" to symbol table");
//				variables.put(varName, value);
				scope.add(varName);
				getCurrentSymTable().put(varName, new SymbolContext(ctx.typeType().getText(), scope, varName));
			}
		}

	}

	@Override public void exitLocalVariableDeclaration(ManuScriptParser.LocalVariableDeclarationContext ctx) { }
		
	@Override public void enterVariableDeclarator(ManuScriptParser.VariableDeclaratorContext ctx) { 
		
        //TODO: push to symbol table
//        System.out.println(varName +" declared");
	}
	
	@Override public void exitVariableDeclarator(ManuScriptParser.VariableDeclaratorContext ctx) { }
	
//	@Override public void enterExpression(ManuScriptParser.ExpressionContext ctx) { 
////		ctx.
////		System.out.println(ctx.getStart().getLine() +":" +ctx.getChildCount());
//		if(ctx.primary() != null && ctx.primary().Identifier() != null) {
//			String varName = ctx.primary().Identifier().getText();
//			checkIfInScope(ctx, varName);
//		}
////		ctx.
//	}
//	
//	@Override public void exitExpression(ManuScriptParser.ExpressionContext ctx) {
//		System.out.println(ctx.getStart().getLine() +":" +ctx.getChildCount());
//	}
	
	@Override public void enterFunctionExpr(ManuScriptParser.FunctionExprContext ctx) { 
		String methodName = ctx.expression().getText();
		int lineNum = ctx.getStart().getLine();
		int charPosInLine = ctx.getStart().getCharPositionInLine();
		
		if(!methodTable.containsKey(methodName)) {
			Console.instance().err(String.format(SemanticErrors.UNDEFINED_METHOD, lineNum, charPosInLine, methodName));
			return;
		}
		MethodContext mcx = methodTable.get(methodName);
		
		if(mcx.getArgTypes().size() > ctx.expressionList().expression().size()) {
			Console.instance().err(String.format(SemanticErrors.PARAM_COUNT_MISMATCH_L, lineNum, charPosInLine, methodName, mcx.getArgTypes().size()));
			return;
		} else if(mcx.getArgTypes().size() < ctx.expressionList().expression().size()) {
			Console.instance().err(String.format(SemanticErrors.PARAM_COUNT_MISMATCH_G, lineNum, charPosInLine, methodName, mcx.getArgTypes().size()));
			return;
		}
		
		System.out.println(methodName+" with args: ");
		
		int i = 0;
		for (ExpressionContext ectx : ctx.expressionList().expression()) {
			Scope scope;
			String type;
			String arg = ectx.getText();
			int ectxLineNum = ectx.getStart().getLine();
			int ectxCharPosAtLine = ectx.getStart().getCharPositionInLine();
			if(scopes.peek().inScope(arg)) {
				//Existing variable. now check for type mismatch
				if(!getCurrentSymTable().get(arg).getSymbolType().equals(mcx.getArgTypes().get(i)))
					Console.instance().err(String.format(SemanticErrors.TYPE_MISMATCH, ectxLineNum, ectxCharPosAtLine, mcx.getArgTypes().get(i)));
			} else if((type = LiteralMatcher.instance().getLiteralType(arg)) != null) {
				//check if type corresponds with mcx
				System.out.println(mcx.getArgTypes().get(i));
				if(!type.equals(mcx.getArgTypes().get(i)))
					Console.instance().err(String.format(SemanticErrors.TYPE_MISMATCH, ectxLineNum, ectxCharPosAtLine, mcx.getArgTypes().get(i)));
			} else {
				//undeclared variable
	        	Console.instance().err(String.format(SemanticErrors.UNDECLARED_VAR, ectxLineNum, ectxCharPosAtLine, arg));
			}
			i++;
		}
	}
	
	@Override public void exitFunctionExpr(ManuScriptParser.FunctionExprContext ctx) { 
		
	}
	
	
	@Override public void enterOutputStatement(ManuScriptParser.OutputStatementContext ctx) { 
//		for (OutputValueContext ovctx : ctx.outputValue()) {
//			if(ovctx.StringLiteral() != null)
//				Console.instance().log(Utils.removeFirstandLastChar(ovctx.getText()));
//		}
	}

	@Override public void exitOutputStatement(ManuScriptParser.OutputStatementContext ctx) { 
		
	}
	
	private boolean checkIfTypeMismatch(ParserRuleContext ctx, String varType, String value) {
		if(!LiteralMatcher.instance().isOfType(varType, value)) {
			Console.instance().err(String.format(SemanticErrors.TYPE_MISMATCH, ctx.getStart().getLine(), ctx.getStop().getCharPositionInLine(), varType));
			return true;
		}
//		if(varType.equals("int")) {
//			try {
//				Integer.parseInt(value);
//			}catch(NumberFormatException e) {
//	        	Console.instance().err(String.format(SemanticErrors.INT_MISMATCH, ctx.getStart().getLine(), ctx.getStop().getCharPositionInLine()));
//	        	return true;
//			}
//		} else if(varType.equals("float")) {
//			try {
//				Float.parseFloat(value);
//			}catch(NumberFormatException e) {
//	        	Console.instance().err(String.format(SemanticErrors.FLOAT_MISMATCH, ctx.getStart().getLine(), ctx.getStop().getCharPositionInLine()));
//	        	return true;
//			}
//		} else if(varType.equals("string")) {
//			if(!value.substring(value.length()-1).equals("\"") || !value.substring(0, 1).equals("\"")) {
//	        	Console.instance().err(String.format(SemanticErrors.STRING_MISMATCH, ctx.getStart().getLine(), ctx.getStop().getCharPositionInLine()));
//	        	return true;
//			}
//		} else if(varType.equals("char")) {
//			if(!value.substring(value.length()-1).equals("'") || !value.substring(0, 1).equals("'")) {
//	        	Console.instance().err(String.format(SemanticErrors.CHAR_MISMATCH, ctx.getStart().getLine(), ctx.getStop().getCharPositionInLine()));
//	        	return true;
//			}
//			if(value.length() > 3) {
//	        	Console.instance().err(String.format(SemanticErrors.ONLY_ONE_CHAR, ctx.getStart().getLine(), ctx.getStop().getCharPositionInLine()));
//	        	return true;
//			}
//		}
//		
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
	
	private HashMap<String, SymbolContext> getCurrentSymTable() {
		return scopes.peek().getSymTable();
	}
	
}
