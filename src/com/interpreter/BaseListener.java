package com.interpreter;

import java.util.HashMap;
import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import com.interpreter.contexts.MethodContext;
import com.interpreter.contexts.SymbolContext;
import com.interpreter.matchers.LiteralMatcher;
import com.parser.ManuScriptBaseListener;
import com.parser.ManuScriptParser;
import com.parser.ManuScriptParser.ExpressionContext;
import com.parser.ManuScriptParser.FormalParameterContext;
import com.parser.ManuScriptParser.LiteralContext;
import com.parser.ManuScriptParser.PrimaryContext;
import com.parser.ManuScriptParser.PrimaryExprContext;
import com.parser.ManuScriptParser.VariableDeclaratorContext;
import com.utils.Console;
import com.utils.Literals;

public class BaseListener extends ManuScriptBaseListener{
	private Stack<Scope> scopes;
	private HashMap<String, MethodContext> methodTable;
	
	public BaseListener() {
		scopes = new Stack<Scope>();
		scopes.push(new Scope(null));
		methodTable = new HashMap<String, MethodContext>();
	}

	@Override public void enterMethodDeclaration(ManuScriptParser.MethodDeclarationContext ctx) {

		//TODO: methodTable = HashMap <String, List<MethodContext>>
		/*

				if(methodTable.get(methodName) == null){
					methodTable.put(methodName, new List<MethodContext>(new MethodContext(......)));
				}
				else{
					methodTable.get(methodName).add(new MethodContext(.............));
				}
		 */
		String methodName = ctx.Identifier().getText();
		methodTable.put(methodName, new MethodContext(ctx, scopes.peek(), methodName));

		Scope parent = scopes.peek();
		Scope scope = new Scope(parent);
		parent.addChild(scope);
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
        Scope scope = scopes.peek();
        boolean isConstant = false;

        if(ctx.FINAL() != null)
        	isConstant = true;
        
		for (VariableDeclaratorContext vdctx : ctx.variableDeclarators().variableDeclarator()) {
			String varName = vdctx.variableDeclaratorId().getText();
			
			if(getCurrentSymTable().containsKey(varName)) {
				SemanticErrors.throwError(SemanticErrors.DUPLICATE_VAR, vdctx.getStart().getLine(), vdctx.getStart().getCharPositionInLine(), varName);
			} else {
				if(vdctx.variableInitializer() != null) {
					this.expressionChecker(vdctx.variableInitializer(), varType);
				}
				System.out.println("added "+varName+" to symbol table");
				scope.add(varName);
				getCurrentSymTable().put(varName, new SymbolContext(ctx.typeType().getText(), scope, varName, isConstant));
			}
		}
	}
	
	@Override public void exitFieldDeclaration(ManuScriptParser.FieldDeclarationContext ctx) { }
	
	@Override public void enterLocalVariableDeclaration(ManuScriptParser.LocalVariableDeclarationContext ctx) { 
		String varType = ctx.typeType().getText();
        Scope scope = scopes.peek();
        
		for (VariableDeclaratorContext vdctx : ctx.variableDeclarators().variableDeclarator()) {
			String varName = vdctx.variableDeclaratorId().getText();
			
			if(getCurrentSymTable().containsKey(varName)) {
				SemanticErrors.throwError(SemanticErrors.DUPLICATE_VAR, vdctx.getStart().getLine(), vdctx.getStart().getCharPositionInLine(), varName);
			} else {
				if(vdctx.variableInitializer() != null) {
					this.expressionChecker(vdctx.variableInitializer(), varType);
				}
				System.out.println("added "+varName+" to symbol table");
				scope.add(varName);
				getCurrentSymTable().put(varName, new SymbolContext(ctx.typeType().getText(), scope, varName));
			}
		}

	}

	@Override public void exitLocalVariableDeclaration(ManuScriptParser.LocalVariableDeclarationContext ctx) { }
		
	@Override public void enterVariableDeclarator(ManuScriptParser.VariableDeclaratorContext ctx) { }
	
	@Override public void exitVariableDeclarator(ManuScriptParser.VariableDeclaratorContext ctx) { }
	
	@Override 
	public void enterAssignExpr(ManuScriptParser.AssignExprContext ctx) { 
		String varName = ctx.variableExpr().getText();
		SymbolContext sctx;
		
		int lineNumStart = ctx.getStart().getLine();
		int charNumStart = ctx.getStart().getCharPositionInLine();
		
		if((sctx = scopes.peek().checkTables(varName)) != null){
			if(sctx.isConstant())
				SemanticErrors.throwError(SemanticErrors.CONSTANT_MOD, lineNumStart, charNumStart, varName);
			else {
				this.expressionChecker(ctx.expression(), sctx.getSymbolType());
			}
		} else {
			SemanticErrors.throwError(SemanticErrors.UNDECLARED_VAR, ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), varName);
		}
	}
	
	
	@Override public void enterFunctionExpr(ManuScriptParser.FunctionExprContext ctx) { 
		String methodName = ctx.variableExpr().getText();
		int lineNum = ctx.getStart().getLine();
		int charPosInLine = ctx.getStart().getCharPositionInLine();
		
		if(!methodTable.containsKey(methodName)) {
			Console.instance().err(String.format(SemanticErrors.UNDEFINED_METHOD, lineNum, charPosInLine, methodName));
			return;
		}
		MethodContext mcx = methodTable.get(methodName);
		
		if(mcx.getArgTypes().size() > ctx.expressionList().expression().size()) {
			SemanticErrors.throwError(SemanticErrors.PARAM_COUNT_MISMATCH_L, lineNum, charPosInLine, methodName, mcx.getArgTypes().size());
			return;
		} else if(mcx.getArgTypes().size() < ctx.expressionList().expression().size()) {
			SemanticErrors.throwError(SemanticErrors.PARAM_COUNT_MISMATCH_L, lineNum, charPosInLine, methodName, mcx.getArgTypes().size());
			return;
		}
				
		int i = 0;
		for (ExpressionContext ectx : ctx.expressionList().expression()) {
			String arg = ectx.getText(); //evaluate expr
			int ectxLineNum = ectx.getStart().getLine();
			int ectxCharPosAtLine = ectx.getStart().getCharPositionInLine();
			
			if(scopes.peek().inScope(arg)) {
				//Existing variable. now check for type mismatch
				if(!getCurrentSymTable().get(arg).getSymbolType().equals(mcx.getArgTypes().get(i)))
					SemanticErrors.throwError(SemanticErrors.TYPE_MISMATCH, ectxLineNum, ectxCharPosAtLine, mcx.getArgTypes().get(i));
			} else if(ectx instanceof PrimaryExprContext && ((PrimaryExprContext) ectx).primary().Identifier() != null) {
				//variable but not in scope or not declared.
				SemanticErrors.throwError(SemanticErrors.UNDECLARED_VAR, ectxLineNum, ectxCharPosAtLine, arg);
			} else {
				//literal or expression
				this.expressionChecker(ectx, mcx.getArgTypes().get(i));
			}
			i++;
		}
	}
	
	private boolean expressionChecker(ParseTree tree, String expectedType) {
		if (tree.getChildCount() == 0) {
			//check if either literal or variable then check type. return false if mismatch
			if(tree.getParent() instanceof LiteralContext) {
				System.out.println("literal detected");
				LiteralContext lctx = (LiteralContext) tree.getParent();
				if(!tree.getParent().getText().equals("null")) {
					if((expectedType.equals(Literals.STRING) && lctx.StringLiteral() == null)
							|| (expectedType.equals(Literals.CHARACTER) && lctx.CharacterLiteral() == null)
							|| (expectedType.equals(Literals.INTEGER) && lctx.IntegerLiteral() == null)
							|| (expectedType.equals(Literals.BOOLEAN) && lctx.BooleanLiteral() == null)
							|| (expectedType.equals(Literals.FLOAT) && lctx.FloatingPointLiteral() == null))
						SemanticErrors.throwError(SemanticErrors.TYPE_MISMATCH, lctx.getStart().getLine(), lctx.getStart().getCharPositionInLine(), expectedType);
				}
			} else if(tree.getParent() instanceof PrimaryContext && ((PrimaryContext) tree.getParent()).Identifier() != null) {
				PrimaryContext pctx = (PrimaryContext) tree.getParent();
				String varName = tree.getParent().getText();
				SymbolContext sctx;
				if((sctx = scopes.peek().checkTables(varName)) != null) {
					//Existing variable. now check for type mismatch
					if(!sctx.getSymbolType().equals(expectedType))
						SemanticErrors.throwError(SemanticErrors.TYPE_MISMATCH, pctx.getStart().getLine(), pctx.getStart().getCharPositionInLine(), expectedType);
				} else {
					SemanticErrors.throwError(SemanticErrors.UNDECLARED_VAR, pctx.getStart().getLine(), pctx.getStart().getCharPositionInLine(), expectedType);
				}
				System.out.println("variable detected");
			}
			System.out.println(tree.getText());
	    } else {
	    	int i = 0;
	        while(tree.getChild(i) != null) {
	        	expressionChecker(tree.getChild(i), expectedType);
	        	i++;
	        }
	    }
	    return true;
	}
	
	private HashMap<String, SymbolContext> getCurrentSymTable() {
		return scopes.peek().getSymTable();
	}
	
}
