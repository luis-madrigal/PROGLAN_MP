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
import com.parser.ManuScriptParser.AndExprContext;
import com.parser.ManuScriptParser.ComparisonExprContext;
import com.parser.ManuScriptParser.EqualityExprContext;
import com.parser.ManuScriptParser.ExpressionContext;
import com.parser.ManuScriptParser.FormalParameterContext;
import com.parser.ManuScriptParser.LiteralContext;
import com.parser.ManuScriptParser.MethodBodyContext;
import com.parser.ManuScriptParser.OrExprContext;
import com.parser.ManuScriptParser.PrimaryContext;
import com.parser.ManuScriptParser.PrimaryExprContext;
import com.parser.ManuScriptParser.VariableDeclaratorContext;
import com.utils.Console;
import com.utils.Literals;
import com.utils.Utils;

public class BaseListener extends ManuScriptBaseListener{
	private Stack<Scope> scopes;
	private HashMap<String, MethodContext> methodTable;
	
	public BaseListener() {
		scopes = new Stack<Scope>();
		scopes.push(new Scope(null));
		methodTable = new HashMap<String, MethodContext>();
	}
	
	@Override public void exitCompilationUnit(ManuScriptParser.CompilationUnitContext ctx) {
		
	}
	
	@Override public void enterBlock(ManuScriptParser.BlockContext ctx) { 
		if(!(ctx.parent instanceof MethodBodyContext)) {
			Scope scope = new Scope(scopes.peek());
			scopes.push(scope);
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBlock(ManuScriptParser.BlockContext ctx) { 
		scopes.pop();
	}

	@Override public void enterMethodDeclaration(ManuScriptParser.MethodDeclarationContext ctx) {
		String methodName = ctx.Identifier().getText();
		methodTable.put(methodName, new MethodContext(ctx, scopes.peek(), methodName));
		System.out.println("new method");
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
	
	private String expressionChecker(ParseTree node, String expectedType) {
		String finalType = Literals.NULL;
    	int i = 0;
        while(node.getChild(i) != null) {
        	if(node instanceof ComparisonExprContext 
    	    		|| node instanceof EqualityExprContext
    	    		|| node instanceof AndExprContext
    	    		|| node instanceof OrExprContext) {
        		System.out.println("bool expression detected");
        	} else {
        		finalType = expressionChecker(node.getChild(i), expectedType);
        	}
        	i++;
        }
        
		if (node.getChildCount() == 0) {
			//check if either literal or variable then check type. return false if mismatch
			String actualType = Literals.NULL;
			
			if(node.getParent() instanceof LiteralContext) {
				LiteralContext lctx = (LiteralContext) node.getParent();
				actualType = LiteralMatcher.instance().getLiteralType(lctx);
				
				if(!lctx.getText().equals("null")) {
					if(!expectedType.equals(actualType))
						SemanticErrors.throwError(SemanticErrors.TYPE_MISMATCH, lctx.getStart().getLine(), lctx.getStart().getCharPositionInLine(), expectedType);
				}
			} else if(node.getParent() instanceof PrimaryContext && ((PrimaryContext) node.getParent()).Identifier() != null) {
				PrimaryContext pctx = (PrimaryContext) node.getParent();
				String varName = node.getParent().getText();
				SymbolContext sctx;
				if((sctx = scopes.peek().checkTables(varName)) != null) {
					//Existing variable. now check for type mismatch
					actualType = sctx.getSymbolType();
					if(!sctx.getSymbolType().equals(expectedType))
						SemanticErrors.throwError(SemanticErrors.TYPE_MISMATCH, pctx.getStart().getLine(), pctx.getStart().getCharPositionInLine(), expectedType);
				} else {
					SemanticErrors.throwError(SemanticErrors.UNDECLARED_VAR, pctx.getStart().getLine(), pctx.getStart().getCharPositionInLine(), varName);
				}
			}
//			System.out.println(node.getText());
			return actualType;
	    } else if(node instanceof ComparisonExprContext 
	    		|| node instanceof EqualityExprContext
	    		|| node instanceof AndExprContext
	    		|| node instanceof OrExprContext){
//	    	ParserRuleContext prctx = (ParserRuleContext) node;
//	    	if(!expectedType.equals(Literals.BOOLEAN)) {
//	    		SemanticErrors.throwError(SemanticErrors.TYPE_MISMATCH, prctx.getStart().getLine(), prctx.getStart().getCharPositionInLine(), expectedType);
//	    	} else
//	    		this.boolExpressionCheck(node, expectedType);
//    		return false;
	    	this.boolExpressionCheck(node, expectedType);
	    	return Literals.BOOLEAN;
	    } 
		
		return finalType;
	    
	}
	
//	private boolean expressionTypeCheck(ParseTree node, String expectedType) {
//		if (node.getChildCount() == 0) {
//			//check if either literal or variable then check type. return false if mismatch
//			if(node.getParent() instanceof LiteralContext) {
//				LiteralContext lctx = (LiteralContext) node.getParent();
//				if(!node.getParent().getText().equals("null")) {
//					if((expectedType.equals(Literals.STRING) && lctx.StringLiteral() == null)
//							|| (expectedType.equals(Literals.CHARACTER) && lctx.CharacterLiteral() == null)
//							|| (expectedType.equals(Literals.INTEGER) && lctx.IntegerLiteral() == null)
//							|| (expectedType.equals(Literals.BOOLEAN) && lctx.BooleanLiteral() == null)
//							|| (expectedType.equals(Literals.FLOAT) && lctx.FloatingPointLiteral() == null))
//						SemanticErrors.throwError(SemanticErrors.TYPE_MISMATCH, lctx.getStart().getLine(), lctx.getStart().getCharPositionInLine(), expectedType);
//				}
//			} else if(node.getParent() instanceof PrimaryContext && ((PrimaryContext) node.getParent()).Identifier() != null) {
//				PrimaryContext pctx = (PrimaryContext) node.getParent();
//				String varName = node.getParent().getText();
//				SymbolContext sctx;
//				if((sctx = scopes.peek().checkTables(varName)) != null) {
//					//Existing variable. now check for type mismatch
//					if(!sctx.getSymbolType().equals(expectedType))
//						SemanticErrors.throwError(SemanticErrors.TYPE_MISMATCH, pctx.getStart().getLine(), pctx.getStart().getCharPositionInLine(), expectedType);
//				} else {
//					SemanticErrors.throwError(SemanticErrors.UNDECLARED_VAR, pctx.getStart().getLine(), pctx.getStart().getCharPositionInLine(), expectedType);
//				}
//			}
//			System.out.println(node.getText());
//			return true;
//	    } else if(node instanceof ComparisonExprContext 
//	    		|| node instanceof EqualityExprContext
//	    		|| node instanceof AndExprContext
//	    		|| node instanceof OrExprContext){
//	    	System.out.println("comparison check");
//	    	ParserRuleContext prctx = (ParserRuleContext) node;
//	    	if(!expectedType.equals(Literals.BOOLEAN)) {
//	    		SemanticErrors.throwError(SemanticErrors.TYPE_MISMATCH, prctx.getStart().getLine(), prctx.getStart().getCharPositionInLine(), expectedType);
//	    	} else
////	    		this.boolExpressionCheck(node, expectedType);
//    		return false;
//	    }
//		else {
//	    	int i = 0;
//	        while(node.getChild(i) != null) {
//	        	expressionTypeCheck(node.getChild(i), expectedType);
//	        	i++;
//	        }
//	    }
//	    return true;
//	}
	
	//still not working
	private boolean boolExpressionCheck(ParseTree node, String expectedType) {
		//expression check left and right side
		ParseTree leftNode = node.getChild(0);
		ParseTree rightNode = node.getChild(2);
		
		if(Utils.getNthChild(leftNode, 2) instanceof LiteralContext && Utils.getNthChild(rightNode, 2) instanceof LiteralContext) {
//			System.out.println("end of comparison expression check");
			LiteralContext leftCtx = (LiteralContext) Utils.getNthChild(leftNode, 2);
			LiteralContext rightCtx = (LiteralContext) Utils.getNthChild(rightNode, 2);
			
			String leftType = LiteralMatcher.instance().getLiteralType(leftCtx);
			String rightType = LiteralMatcher.instance().getLiteralType(rightCtx);
			
			boolean hasError = false;
			
			if(leftType == null || rightType == null) {
				hasError = true;
				//error. null cannot be compared
			}
			else if(leftType.equals(Literals.STRING) || rightType.equals(Literals.STRING)) {
				hasError = true;
				//error. string cannot be compared
			}
			else if((leftType.equals(Literals.BOOLEAN) && !rightType.equals(Literals.BOOLEAN))
					|| (!leftType.equals(Literals.BOOLEAN) && rightType.equals(Literals.BOOLEAN))) {
				hasError = true;
				//error. boolean cannot be compared to non boolean
			}
			
			if(hasError) {
				SemanticErrors.throwError(SemanticErrors.COMPARISON_ERR, leftCtx.getStart().getLine(), leftCtx.getStart().getCharPositionInLine(), node.getChild(1).getText(), leftType, rightType);
				return false;
			}
			
		} 

//		if(!(leftNode instanceof LiteralContext)) {
//			this.expressionChecker(leftNode, expectedType);
//		} 
//		if(!(rightNode instanceof LiteralContext)) {
//			this.expressionChecker(rightNode, expectedType);
//		}
		return true;
	}
	
	private HashMap<String, SymbolContext> getCurrentSymTable() {
		return scopes.peek().getSymTable();
	}
	
}
