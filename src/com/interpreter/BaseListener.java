package com.interpreter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

import com.interpreter.contexts.ArrayInfo;
import com.interpreter.contexts.StructInfo;
import org.antlr.v4.runtime.tree.ParseTree;

import com.interpreter.contexts.MethodContext;
import com.interpreter.contexts.SymbolContext;
import com.interpreter.matchers.LiteralMatcher;
import com.parser.ManuScriptBaseListener;
import com.parser.ManuScriptParser;
import com.parser.ManuScriptParser.AndExprContext;
import com.parser.ManuScriptParser.ArrayCreatorRestContext;
import com.parser.ManuScriptParser.ArrayInitExprContext;
import com.parser.ManuScriptParser.ComparisonExprContext;
import com.parser.ManuScriptParser.EqualityExprContext;
import com.parser.ManuScriptParser.ExpressionContext;
import com.parser.ManuScriptParser.ExpressionListContext;
import com.parser.ManuScriptParser.FormalParameterContext;
import com.parser.ManuScriptParser.LiteralContext;
import com.parser.ManuScriptParser.MethodBodyContext;
import com.parser.ManuScriptParser.OrExprContext;
import com.parser.ManuScriptParser.PrimaryContext;
import com.parser.ManuScriptParser.PrimaryExprContext;
import com.parser.ManuScriptParser.VariableDeclaratorContext;
import com.parser.ManuScriptParser.VariableExprContext;
import com.utils.Console;
import com.utils.Types;
import com.utils.Utils;

public class BaseListener extends ManuScriptBaseListener{
	private Stack<Scope> scopes;
	private HashMap<String, MethodContext> methodTable;
	private String currentMethod;
	private HashMap<String, StructInfo> structDefTable;
	
	public BaseListener(Scope parentScope, HashMap<String, MethodContext> methodTable) {
		this.scopes = new Stack<Scope>();;
		this.scopes.push(parentScope);
		this.methodTable = methodTable;
		this.structDefTable = new HashMap<>();
	}
	
	public BaseListener() {
		scopes = new Stack<Scope>();
		scopes.push(new Scope(null));
		methodTable = new HashMap<String, MethodContext>();
	}

	@Override public void enterBlock(ManuScriptParser.BlockContext ctx) {
		if(!(ctx.parent instanceof MethodBodyContext)) {
			Scope scope = new Scope(scopes.peek());
			scopes.peek().addChild(scope);
			scopes.push(scope);
		}
	}

	@Override public void exitBlock(ManuScriptParser.BlockContext ctx) {
		scopes.pop();
	}

	private void checkArraySemantics(ArrayInfo arInf, int dimCount, String varType, VariableDeclaratorContext vdctx, int line, int charPosition){

		if(vdctx.variableInitializer() != null) {
			if (vdctx.variableInitializer().expression() instanceof ArrayInitExprContext) {
				ManuScriptParser.CreatorContext crCtx = ((ArrayInitExprContext) vdctx.variableInitializer().expression()).creator();
				System.out.println("created text: " + crCtx.createdName().getText());
				if (!crCtx.createdName().getText().equals(arInf.getArrType()))
					SemanticErrors.throwError(SemanticErrors.ARR_TYPE_MISMATCH, line, charPosition, arInf.getArrType());
				else {
					if (crCtx.arrayCreatorRest().arrayInitializer() != null) {
						//when init is 'new type[]...[]{....};'
						if ((crCtx.arrayCreatorRest().children.size() - 1) / 2 != dimCount)
							SemanticErrors.throwError(SemanticErrors.INVALID_DIMS, line, charPosition, (crCtx.arrayCreatorRest().children.size() - 1) / 2, dimCount);
						ManuScriptParser.ArrayInitializerContext arInit = crCtx.arrayCreatorRest().arrayInitializer();
						int height = getBlockHeight(arInit.getText());
						System.out.println("height: " + height);
						if (height != dimCount)
							SemanticErrors.throwError(SemanticErrors.ILLEGAL_INIT, line, charPosition, varType);

					} else {
						//when init is 'new type[size]...[size];'
						if (crCtx.arrayCreatorRest().expression().size() != dimCount)
							SemanticErrors.throwError(SemanticErrors.INVALID_DIMS, line, charPosition, crCtx.arrayCreatorRest().expression().size(), dimCount);
						for (ExpressionContext expr : crCtx.arrayCreatorRest().expression()) {
							this.expressionChecker(expr, "int");
						}
					}

				}
			} else {
				//checking if array init is of type = {1,2,32,4,21};
				//or int[] a = b;
				SemanticErrors.throwError(SemanticErrors.INVALID_INIT, line, charPosition);
			}
		}
	}
	

	@Override
	public void enterStructDefinition(ManuScriptParser.StructDefinitionContext ctx) {
		String name = ctx.getChild(1).getText();

		if(getCurrentSymTable().containsKey(name)){
			SemanticErrors.throwError(SemanticErrors.DUPLICATE_STRUCT, ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), name);
		}
		else {
			
			ArrayList<SymbolContext> members = new ArrayList<>();
			for (ManuScriptParser.StructDeclarationContext strCtx : ctx.structDeclarationList().structDeclaration()) {
				if (strCtx.typeType().structType() != null) {
					if (!getCurrentSymTable().containsKey(strCtx.typeType().structType().Identifier().getText())) {
						SemanticErrors.throwError(SemanticErrors.UNDEFINED_STRUCT, ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), name);
					}

				} else if (strCtx.typeType().pointerType() != null) {

				}
			}

			StructInfo strInfo = new StructInfo(name, null);
			structDefTable.put(strInfo.getStructName(), strInfo);
		}
	}

	@Override public void enterMethodDeclaration(ManuScriptParser.MethodDeclarationContext ctx) {

		//TODO: methodTable = HashMap <String, List<MethodContext>> for overloading
		/*

				if(methodTable.get(methodName) == null){
					methodTable.put(methodName, new List<MethodContext>(new MethodContext(......)));
				}
				else{
					methodTable.get(methodName).add(new MethodContext(.............));
				}
		 */
		String methodName = ctx.Identifier().getText();
//		if(methodTable.containsKey(methodName) && methodTable.get(methodName).matchesArgs(ctx)) {
		if(methodTable.containsKey(methodName)) {
			SemanticErrors.throwError(SemanticErrors.DUPLICATE_METHOD, ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), methodName);
		}
		methodTable.put(methodName, new MethodContext(ctx, scopes.peek(), methodName));
		currentMethod = methodName;

		Scope parent = scopes.peek();
		Scope scope = new Scope(parent);
		parent.addChild(scope);

		System.out.println("new method");

		scopes.push(scope);
		
		if(ctx.formalParameters().formalParameterList() != null) {
			for (FormalParameterContext fpctx : ctx.formalParameters().formalParameterList().formalParameter()) {
				String varName = fpctx.variableDeclaratorId().getText();

				System.out.println("added "+varName+" from method " +methodName+ " to symbol table");
				scope.add(varName);
				if(getCurrentSymTable().containsKey(varName)){
					SemanticErrors.throwError(SemanticErrors.DUPLICATE_VAR, ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), varName);
				}
				getCurrentSymTable().put(varName, new SymbolContext(fpctx.typeType().getText(), scope, varName));
			}
		}
	}
	
	@Override public void exitMethodDeclaration(ManuScriptParser.MethodDeclarationContext ctx) {
		MethodContext mctx = methodTable.get(currentMethod);
		if(mctx.getReturnType().equals(Types.NULL)) {
			mctx.setReturnType("void");
		}
	}

	@Override public void enterFieldDeclaration(ManuScriptParser.FieldDeclarationContext ctx) {
		String varType = ctx.typeType().getText();
        Scope scope = scopes.peek();
        boolean isConstant = false;
		int dimCount = (ctx.typeType().getChildCount() - 1) / 2;
        if(ctx.FINAL() != null)
        	isConstant = true;
        
		for (VariableDeclaratorContext vdctx : ctx.variableDeclarators().variableDeclarator()) {
			String varName = vdctx.variableDeclaratorId().getText();
			
			if(getCurrentSymTable().containsKey(varName)) {
				SemanticErrors.throwError(SemanticErrors.DUPLICATE_VAR, ctx.getStart().getLine(),ctx.getStart().getCharPositionInLine(), varName);
			} else {
				SymbolContext symCtx = new SymbolContext(varType, scope, varName, isConstant);

				if(dimCount>0) {    //ARRAY INIT
					ArrayInfo arInf = new ArrayInfo(dimCount,varType);
					checkArraySemantics(arInf, dimCount, varType, vdctx, ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
					symCtx.setOther(arInf);
				}else {
					//do this if variable has initializer
					if (vdctx.variableInitializer() != null) {
						this.expressionChecker(vdctx.variableInitializer(), varType);
					}
				}
				System.out.println("added "+varName+" to symbol table"+" is constant:"+isConstant);
				scope.add(varName);
				getCurrentSymTable().put(varName, symCtx);
			}
		}
	}

	@Override public void enterLocalVariableDeclaration(ManuScriptParser.LocalVariableDeclarationContext ctx) { 
		String varType = ctx.typeType().getText();
        Scope scope = scopes.peek();
        
		for (VariableDeclaratorContext vdctx : ctx.variableDeclarators().variableDeclarator()) {
			String varName = vdctx.variableDeclaratorId().getText();
			
			if(getCurrentSymTable().containsKey(varName)) {
				SemanticErrors.throwError(SemanticErrors.DUPLICATE_VAR, vdctx.getStart().getLine(), vdctx.getStart().getCharPositionInLine(), varName);
			} else {
				if(vdctx.variableInitializer() != null) {
					if(vdctx.variableInitializer().expression() instanceof ArrayInitExprContext) {
						ArrayInitExprContext aictx = (ArrayInitExprContext) vdctx.variableInitializer().expression();
						ArrayCreatorRestContext acrctx = aictx.creator().arrayCreatorRest();
						
						if(acrctx.arrayInitializer() != null) {
							//array is being initialized
							this.expressionChecker(acrctx.arrayInitializer(), aictx.creator().createdName().getText());
						} else if(acrctx.expression() != null) {
							//array is being declared TODO: expression(0) can be wrong
							this.expressionChecker(acrctx.expression(0), aictx.creator().createdName().getText());
						}
					} else {
						this.expressionChecker(vdctx.variableInitializer(), varType);
					}
				}
				System.out.println("added "+varName+" to symbol table");
				scope.add(varName);

				getCurrentSymTable().put(varName, new SymbolContext(ctx.typeType().getText(), scope, varName));
			}
		}

	}

	@Override 
	public void enterAssignExpr(ManuScriptParser.AssignExprContext ctx) { 
		String varName = ctx.equationExpr().getText();
		varName = varName.split("\\[")[0];//TODO: bad implementation
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
	
	@Override public void enterReturnStmt(ManuScriptParser.ReturnStmtContext ctx) {
		MethodContext mctx = methodTable.get(currentMethod);
		if(mctx.getReturnType().equals(Types.NULL)) {//TODO: bad implementation
			mctx.setReturnType(this.getExpressionType(ctx.expression()));
		} else {
			if(!mctx.getReturnType().equals(this.getExpressionType(ctx.expression()))) {
				SemanticErrors.throwError(SemanticErrors.INVALID_RETURN_TYPE, ctx.expression().getStart().getLine(), ctx.expression().getStop().getCharPositionInLine(), currentMethod, mctx.getReturnType());
			}
		}
		;
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
		if(ctx.expressionList() != null) {
			if(mcx.getArgTypes().size() > ctx.expressionList().expression().size()) {
				SemanticErrors.throwError(SemanticErrors.PARAM_COUNT_MISMATCH_L, lineNum, charPosInLine, methodName, mcx.getArgTypes().size());
				return;
			} else if(mcx.getArgTypes().size() < ctx.expressionList().expression().size()) {
				SemanticErrors.throwError(SemanticErrors.PARAM_COUNT_MISMATCH_G, lineNum, charPosInLine, methodName, mcx.getArgTypes().size());
				return;
			}
			int i = 0;
			for (ExpressionContext ectx : ctx.expressionList().expression()) {
				String arg = ectx.getText(); //evaluate expr
				int ectxLineNum = ectx.getStart().getLine();
				int ectxCharPosAtLine = ectx.getStart().getCharPositionInLine();
				
				if(scopes.peek().inScope(arg)) {
					//Existing variable. now check for type mismatch
					if(!scopes.peek().checkTables(arg).getSymbolType().equals(mcx.getArgTypes().get(i)))
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
		} else {
			SemanticErrors.throwError(SemanticErrors.PARAM_COUNT_MISMATCH_L, lineNum, charPosInLine, methodName, mcx.getArgTypes().size());
		}
	}
	
	@Override
	public void enterOutputStatement(ManuScriptParser.OutputStatementContext ctx) {
		this.expressionChecker(ctx.expression());
	}
	
	@Override
	public void enterPostIncDecExpr(ManuScriptParser.PostIncDecExprContext ctx) {
		String varName = ctx.variableExpr().getText();
		SymbolContext sctx;
		
		if((sctx = scopes.peek().checkTables(varName)) != null){
			if(sctx.isConstant())
				SemanticErrors.throwError(SemanticErrors.CONSTANT_MOD, ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), varName);
			else {
				this.expressionChecker(ctx, sctx.getSymbolType());
			}
		} else {
			SemanticErrors.throwError(SemanticErrors.UNDECLARED_VAR, ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), varName);
		}
	}
	
	@Override
	public void enterPreIncDecSignExpr(ManuScriptParser.PreIncDecSignExprContext ctx) {
		String varName = ctx.variableExpr().getText();
		SymbolContext sctx;
		
		if((sctx = scopes.peek().checkTables(varName)) != null){
			if(sctx.isConstant())
				SemanticErrors.throwError(SemanticErrors.CONSTANT_MOD, ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), varName);
			else {
				this.expressionChecker(ctx, sctx.getSymbolType());
			}
		} else {
			SemanticErrors.throwError(SemanticErrors.UNDECLARED_VAR, ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), varName);
		}
	}
	
	private String getExpressionType(ParseTree node) {
		int i = 0;//TODO: bad implementation
		while(node.getChild(i) != null) {
			String type;
        	if(!(type = getExpressionType(node.getChild(i))).equals(Types.NULL)) {
        		return type;
        	}
        	i++;
        }
		
		String actualType = "null";
		
		if(node.getParent() instanceof LiteralContext) {
			LiteralContext lctx = (LiteralContext) node.getParent();
			actualType = LiteralMatcher.instance().getLiteralType(lctx);
			
			return actualType;
		} else if(node.getParent() instanceof PrimaryContext && ((PrimaryContext) node.getParent()).Identifier() != null) {
			PrimaryContext pctx = (PrimaryContext) node.getParent();
			String varName = node.getParent().getText();
			SymbolContext sctx;
			if((sctx = scopes.peek().checkTables(varName)) != null) {
				//Existing variable. now check for type mismatch
				actualType = sctx.getSymbolType();
			} else {
				SemanticErrors.throwError(SemanticErrors.UNDECLARED_VAR, pctx.getStart().getLine(), pctx.getStart().getCharPositionInLine(), varName);
			}
			return actualType;
		}
		
		return "null";
	}
	
	private String expressionChecker(ParseTree node, String expectedType) {
		String finalType = "null";
    	int i = 0;
        while(node.getChild(i) != null) {
        	if(node instanceof ComparisonExprContext 
    	    		|| node instanceof EqualityExprContext
    	    		|| node instanceof AndExprContext
    	    		|| node instanceof OrExprContext) {
        		System.out.println("bool expression detected");
        	} else if(!(node instanceof ExpressionListContext)){//TODO: bad implementation
        		finalType = expressionChecker(node.getChild(i), expectedType);
        	}
        	i++;
        }
        
		if (node.getChildCount() == 0) {
			//check if either literal or variable then check type. return false if mismatch
			String actualType = "null";
			
			if(node.getParent() instanceof LiteralContext) {
				LiteralContext lctx = (LiteralContext) node.getParent();
				actualType = LiteralMatcher.instance().getLiteralType(lctx);
				
				if(!lctx.getText().equals("null")) {
					if(!expectedType.equals(actualType))
						SemanticErrors.throwError(SemanticErrors.TYPE_MISMATCH, lctx.getStart().getLine(), lctx.getStart().getCharPositionInLine(), expectedType);
				}
			} else if(node.getParent() instanceof PrimaryContext && ((PrimaryContext) node.getParent()).Identifier() != null) {
				PrimaryContext pctx = (PrimaryContext) node.getParent();
				SymbolContext sctx;				
				String varName = node.getParent().getText();

				if((sctx = scopes.peek().checkTables(varName)) != null) {
					//Existing variable. now check for type mismatch
					actualType = sctx.getSymbolType();
					if(!sctx.getSymbolType().equals(expectedType))
						SemanticErrors.throwError(SemanticErrors.TYPE_MISMATCH, pctx.getStart().getLine(), pctx.getStart().getCharPositionInLine(), expectedType);
				} else {
					SemanticErrors.throwError(SemanticErrors.UNDECLARED_VAR, pctx.getStart().getLine(), pctx.getStart().getCharPositionInLine(), varName);
				}
			} else if(node.getParent() instanceof VariableExprContext) {
				VariableExprContext vectx = (VariableExprContext) node.getParent();
				MethodContext mctx;
				String varName = node.getParent().getText();

				if((mctx = methodTable.get(varName)) != null) {
					//Existing method. now check for return type
					actualType = mctx.getReturnType();
					if(!actualType.equals(expectedType)) {
						SemanticErrors.throwError(SemanticErrors.TYPE_MISMATCH, vectx.getStart().getLine(), vectx.getStart().getCharPositionInLine(), expectedType);
					}
				}
			}
			System.out.println(node.getText());
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
	    	return "boolean";
	    } 
		
		return finalType;
	    
	}
	
	private String expressionChecker(ParseTree node) {
		String finalType = Types.NULL;
    	int i = 0;
        while(node.getChild(i) != null) {
        	if(node instanceof ComparisonExprContext 
    	    		|| node instanceof EqualityExprContext
    	    		|| node instanceof AndExprContext
    	    		|| node instanceof OrExprContext) {
        		System.out.println("bool expression detected");
        	} else {
        		finalType = expressionChecker(node.getChild(i));
        	}
        	i++;
        }
        
        if(node.getParent() instanceof PrimaryContext && ((PrimaryContext) node.getParent()).Identifier() != null) {
			PrimaryContext pctx = (PrimaryContext) node.getParent();
			String varName = node.getParent().getText();
			if(scopes.peek().checkTables(varName) == null) {
				SemanticErrors.throwError(SemanticErrors.UNDECLARED_VAR, pctx.getStart().getLine(), pctx.getStart().getCharPositionInLine(), varName);
			}
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
	
	//TODO: still not working
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
			else if(leftType.equals(Types.STRING) || rightType.equals(Types.STRING)) {
				hasError = true;
				//error. string cannot be compared
			}
			else if((leftType.equals(Types.BOOLEAN) && !rightType.equals(Types.BOOLEAN))
					|| (!leftType.equals(Types.BOOLEAN) && rightType.equals(Types.BOOLEAN))) {
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

	private int getBlockHeight(String input){
		char[] braces = input.toCharArray();
		int maxDepth = 0, depth = 0;
		Stack<Character> charStack = new Stack<>();
		for(char c : braces){
			if(c == '{') {
				charStack.push(c);
				if(maxDepth < ++depth)
					maxDepth = depth;
			}
			else if(c == '}'){
				if(charStack.peek()=='{') {
					charStack.pop();
					depth--;
				}
			}
		}

		return maxDepth;
	}

}
