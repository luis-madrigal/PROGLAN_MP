package com.interpreter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

import com.interpreter.contexts.ArrayInfo;
import com.interpreter.contexts.StructInfo;

import org.antlr.v4.runtime.atn.SemanticContext.Operator;
import org.antlr.v4.runtime.tree.ParseTree;

import com.interpreter.contexts.MethodContext;
import com.interpreter.contexts.SymbolContext;
import com.interpreter.matchers.LiteralMatcher;
import com.parser.ManuScriptBaseListener;
import com.parser.ManuScriptParser;
import com.parser.ManuScriptParser.AddSubExprContext;
import com.parser.ManuScriptParser.AndExprContext;
import com.parser.ManuScriptParser.ArrayCreatorRestContext;
import com.parser.ManuScriptParser.ArrayInitExprContext;
import com.parser.ManuScriptParser.AssignExprContext;
import com.parser.ManuScriptParser.ComparisonExprContext;
import com.parser.ManuScriptParser.EqualityExprContext;
import com.parser.ManuScriptParser.EquationExprContext;
import com.parser.ManuScriptParser.ExpressionContext;
import com.parser.ManuScriptParser.ExpressionListContext;
import com.parser.ManuScriptParser.ForInitContext;
import com.parser.ManuScriptParser.ForUpdateContext;
import com.parser.ManuScriptParser.FormalParameterContext;
import com.parser.ManuScriptParser.FunctionExprContext;
import com.parser.ManuScriptParser.LiteralContext;
import com.parser.ManuScriptParser.MethodBodyContext;
import com.parser.ManuScriptParser.MultDivModExprContext;
import com.parser.ManuScriptParser.NegationExprContext;
import com.parser.ManuScriptParser.OrExprContext;
import com.parser.ManuScriptParser.ParExpressionContext;
import com.parser.ManuScriptParser.PostIncDecExprContext;
import com.parser.ManuScriptParser.PreIncDecSignExprContext;
import com.parser.ManuScriptParser.PrimaryContext;
import com.parser.ManuScriptParser.PrimaryExprContext;
import com.parser.ManuScriptParser.StructExprContext;
import com.parser.ManuScriptParser.VariableDeclaratorContext;
import com.parser.ManuScriptParser.VariableExprContext;
import com.utils.Console;
import com.utils.KeyTokens.OPERATOR;
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
			ManuScriptParser.VariableInitializerContext vdi = vdctx.variableInitializer();
			if (vdi.expression() instanceof ArrayInitExprContext) {
				ManuScriptParser.CreatorContext crCtx = ((ArrayInitExprContext) vdi.expression()).creator();
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
						if (height != dimCount)
							SemanticErrors.throwError(SemanticErrors.ILLEGAL_INIT, line, charPosition, varType);

					} else {
						//when init is 'new type[size]...[size];'
						if (crCtx.arrayCreatorRest().expression().size() != dimCount)
							SemanticErrors.throwError(SemanticErrors.INVALID_DIMS, line, charPosition, crCtx.arrayCreatorRest().expression().size(), dimCount);
						for (ExpressionContext expr : crCtx.arrayCreatorRest().expression()) {
							String types = this.expressionCheck(expr);
							if(!arInf.getArrType().matches(types)) {
								SemanticErrors.throwError(SemanticErrors.ARR_TYPE_MISMATCH, expr.getStart().getLine(), expr.getStart().getCharPositionInLine(), arInf.getArrType());
							}
						}
					}

				}
			} else {
				if(vdi.arrayInitializer() != null){
					//checking if array init is of type = {1,2,32,4,21};
					int height = getBlockHeight(vdi.arrayInitializer().getText());
					if(dimCount != height)
						SemanticErrors.throwError(SemanticErrors.ILLEGAL_INIT, line, charPosition, varType);
					else{
						for(ManuScriptParser.VariableInitializerContext varInit : vdi.arrayInitializer().variableInitializer()){
							String types = this.expressionCheck(varInit);
							if(!arInf.getArrType().matches(types)) {
								SemanticErrors.throwError(SemanticErrors.ARR_TYPE_MISMATCH, varInit.getStart().getLine(), varInit.getStart().getCharPositionInLine(), arInf.getArrType());
							}
						}
					}

				}
				else if(vdi.expression() instanceof PrimaryExprContext){
					PrimaryContext primary = ((PrimaryExprContext) vdi.expression()).primary();
					if(primary.equationExpr().Identifier() != null){
						if(!getCurrentSymTable().containsKey(primary.equationExpr().Identifier().getText())){
							SemanticErrors.throwError(SemanticErrors.UNDECLARED_VAR, line, charPosition, primary.equationExpr().Identifier().getText());
						}else if(!getCurrentSymTable().get(primary.equationExpr().Identifier().getText()).getSymbolType().equals(varType)){
							SemanticErrors.throwError(SemanticErrors.TYPE_MISMATCH, line, charPosition, varType);
						}
					}
				}
				else
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
		if(ctx.FINAL() != null)
			isConstant = true;

		int dimCount = (ctx.typeType().getChildCount() - 1) / 2;

        
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
						String types = this.expressionCheck(vdctx.variableInitializer().expression());
						if(!varType.matches(types)) {
							SemanticErrors.throwError(SemanticErrors.VAR_ASSIGN_MISMATCH, vdctx.getStart().getLine(), vdctx.getStart().getCharPositionInLine(), varName, types);
						}
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
		int dimCount = (ctx.typeType().getChildCount() - 1) / 2;
		boolean isConstant = false;

		for (VariableDeclaratorContext vdctx : ctx.variableDeclarators().variableDeclarator()) {
			String varName = vdctx.variableDeclaratorId().getText();

			if(getCurrentSymTable().containsKey(varName)) {
				SemanticErrors.throwError(SemanticErrors.DUPLICATE_VAR, vdctx.getStart().getLine(), vdctx.getStart().getCharPositionInLine(), varName);
			} else {
				SymbolContext symCtx = new SymbolContext(varType, scope, varName, isConstant);

				if(dimCount>0) {    //ARRAY INIT
					ArrayInfo arInf = new ArrayInfo(dimCount,varType);
					checkArraySemantics(arInf, dimCount, varType, vdctx, ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
					symCtx.setOther(arInf);
				}else {
					//do this if variable has initializer
					if (vdctx.variableInitializer() != null) {
						String types = this.expressionCheck(vdctx.variableInitializer().expression());
						System.out.println(types);
						if(!varType.matches(types)) {
							SemanticErrors.throwError(SemanticErrors.VAR_ASSIGN_MISMATCH, vdctx.getStart().getLine(), vdctx.getStart().getCharPositionInLine(), varName, types);
						}
					}
				}
				System.out.println("added "+varName+" to symbol table");
				scope.add(varName);
				getCurrentSymTable().put(varName, symCtx);
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
				String types = this.expressionCheck(ctx.expression());
				if(!sctx.getSymbolType().matches(types)) {
					SemanticErrors.throwError(SemanticErrors.VAR_ASSIGN_MISMATCH, lineNumStart, charNumStart, varName, types);
				}
			}
		} else {
			SemanticErrors.throwError(SemanticErrors.UNDECLARED_VAR, ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), varName);
		}
	}
	
	@Override
	public void enterStatementExpression(ManuScriptParser.StatementExpressionContext ctx) {
		this.expressionCheck(ctx.expression());
	}
	
	@Override public void enterReturnStmt(ManuScriptParser.ReturnStmtContext ctx) {
		MethodContext mctx = methodTable.get(currentMethod);
		if(mctx.getReturnType().equals(Types.NULL)) {
			mctx.setReturnType(this.expressionCheck(ctx.expression()));
		} else {
			if(!mctx.getReturnType().equals(this.expressionCheck(ctx.expression()))) {
				SemanticErrors.throwError(SemanticErrors.INVALID_RETURN_TYPE, ctx.expression().getStart().getLine(), ctx.expression().getStop().getCharPositionInLine(), currentMethod, mctx.getReturnType());
			}
		}
		;
	}
	
	//not overriden
	public String enterFunctionExpression(ManuScriptParser.FunctionExprContext ctx) { 
		String methodName = ctx.Identifier().getText();
		int lineNum = ctx.getStart().getLine();
		int charPosInLine = ctx.getStart().getCharPositionInLine();

		if(!methodTable.containsKey(methodName)) {
			Console.instance().err(String.format(SemanticErrors.UNDEFINED_METHOD, lineNum, charPosInLine, methodName));
			return "null";
		}
		MethodContext mcx = methodTable.get(methodName);
		if(ctx.expressionList() != null) {
			if(mcx.getArgTypes().size() > ctx.expressionList().expression().size()) {
				SemanticErrors.throwError(SemanticErrors.PARAM_COUNT_MISMATCH_L, lineNum, charPosInLine, methodName, mcx.getArgTypes().size());
				return "null";
			} else if(mcx.getArgTypes().size() < ctx.expressionList().expression().size()) {
				SemanticErrors.throwError(SemanticErrors.PARAM_COUNT_MISMATCH_G, lineNum, charPosInLine, methodName, mcx.getArgTypes().size());
				return "null";
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
				} else if(ectx instanceof PrimaryExprContext
						&& ((PrimaryExprContext) ectx).primary().equationExpr() != null
						&& ((PrimaryExprContext) ectx).primary().equationExpr().Identifier() != null) {
					//variable but not in scope or not declared.
					SemanticErrors.throwError(SemanticErrors.UNDECLARED_VAR, ectxLineNum, ectxCharPosAtLine, arg);
				} else {
					//literal or expression
					this.expressionCheck(ectx);
				}
				i++;
			}
		} else {
			SemanticErrors.throwError(SemanticErrors.PARAM_COUNT_MISMATCH_L, lineNum, charPosInLine, methodName, mcx.getArgTypes().size());
		}
		return mcx.getReturnType();
	}
	
	@Override
	public void enterOutputStatement(ManuScriptParser.OutputStatementContext ctx) {
		this.expressionCheck(ctx.expression());
	}
	
	@Override
	public void enterPostIncDecExpr(ManuScriptParser.PostIncDecExprContext ctx) {
		String varName = ctx.equationExpr().getText();
		SymbolContext sctx;
		
		if((sctx = scopes.peek().checkTables(varName)) != null){
			if(sctx.isConstant())
				SemanticErrors.throwError(SemanticErrors.CONSTANT_MOD, ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), varName);
			else {
				String type = this.expressionCheck(ctx);
				if(!sctx.getSymbolType().matches(type)) {
					//TODO: semantic error
//					SemanticErrors.throwError(SemanticErrors., args);
				}
//				this.expressionChecker(ctx, sctx.getSymbolType());
			}
		} else {
			SemanticErrors.throwError(SemanticErrors.UNDECLARED_VAR, ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), varName);
		}
	}
	
	@Override
	public void enterPreIncDecSignExpr(ManuScriptParser.PreIncDecSignExprContext ctx) {
		String varName = ctx.equationExpr().getText();
		SymbolContext sctx;
		
		if((sctx = scopes.peek().checkTables(varName)) != null){
			if(sctx.isConstant())
				SemanticErrors.throwError(SemanticErrors.CONSTANT_MOD, ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), varName);
			else {
				String type = this.expressionCheck(ctx);
				if(!sctx.getSymbolType().matches(type)) {
					//TODO: semantic error
				}
//				this.expressionChecker(ctx, sctx.getSymbolType());
			}
		} else {
			SemanticErrors.throwError(SemanticErrors.UNDECLARED_VAR, ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), varName);
		}
	}
	
	@Override
	public void enterIfElseStmt(ManuScriptParser.IfElseStmtContext ctx) {//TODO: += cannot be seen in if conditions
		if(!"boolean".matches(this.expressionCheck(ctx.parExpression()))) {
			SemanticErrors.throwError(SemanticErrors.IF_CONDITION_MISMATCH, ctx.getStart().getLine(), ctx.getStop().getCharPositionInLine());
		}
	}
	
//	@Override
//	public void enterForControl(ManuScriptParser.ForControlContext ctx) {
//		if(!"boolean".matches(this.expressionCheck(ctx.expression()))) {
//			SemanticErrors.throwError(SemanticErrors.FOR_CONDITION_MISMATCH, ctx.getStart().getLine(), ctx.getStop().getCharPositionInLine());
//		}
//	}
	
	@Override
	public void enterExpressionList(ManuScriptParser.ExpressionListContext ctx) {
		if(ctx.getParent() instanceof ForInitContext
				|| ctx.getParent() instanceof ForUpdateContext) {
			for (ExpressionContext ectx : ctx.expression()) {
				this.expressionCheck(ectx);
			}
		}
	}
	
	@Override
	public void enterWhileStmt(ManuScriptParser.WhileStmtContext ctx) {
		if(!"boolean".matches(this.expressionCheck(ctx.parExpression()))) {
			SemanticErrors.throwError(SemanticErrors.WHILE_CONDITION_MISMATCH, ctx.getStart().getLine(), ctx.getStop().getCharPositionInLine());
		}
	}
	
	@Override
	public void enterDoWhileStmt(ManuScriptParser.DoWhileStmtContext ctx) {
		if(!"boolean".matches(this.expressionCheck(ctx.parExpression()))) {
			SemanticErrors.throwError(SemanticErrors.DOWHILE_CONDITION_MISMATCH, ctx.getStart().getLine(), ctx.getStop().getCharPositionInLine());
		}
	}
	
	@Override
	public void enterForInit(ManuScriptParser.ForInitContext ctx) {
		if(ctx.expressionList() != null)
			for (ExpressionContext ectx : ctx.expressionList().expression()) {
				this.expressionCheck(ectx);
			}
	}
	
	@Override
	public void enterForUpdate(ManuScriptParser.ForUpdateContext ctx) {
		if(ctx.expressionList() != null)
			for (ExpressionContext ectx : ctx.expressionList().expression()) {
				this.expressionCheck(ectx);
			}
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
	
	private String expressionCheck(ParseTree node) {
		if(node.getChildCount() == 1) {
			return this.getTypeOf(node.getChild(0));
		} else if(node instanceof ParExpressionContext) {
			return this.getTypeOf(node.getChild(1));
		} else if(node instanceof FunctionExprContext) {
			System.out.println("ENTER FUNCTION CALL");
			return this.enterFunctionExpression((FunctionExprContext) node);
		} else if(node instanceof PostIncDecExprContext) {
			return this.getExprReturnedType(((PostIncDecExprContext) node).getStart().getLine(), ((PostIncDecExprContext) node).getStart().getCharPositionInLine(), OPERATOR.getEnum(node.getChild(1)), this.getTypeOf(node.getChild(0)));
		} else if(node instanceof PreIncDecSignExprContext) {
			return this.getExprReturnedType(((PreIncDecSignExprContext) node).getStart().getLine(), ((PreIncDecSignExprContext) node).getStart().getCharPositionInLine(), OPERATOR.getEnum(node.getChild(0)), this.getTypeOf(node.getChild(1)));
		} else {
			int lineNum = 0;
			int charPos = 0;
			
			if(node instanceof MultDivModExprContext) {
				lineNum = ((MultDivModExprContext) node).getStart().getLine();
				charPos = ((MultDivModExprContext) node).getStart().getCharPositionInLine();
			} else if(node instanceof AddSubExprContext) {
				lineNum = ((AddSubExprContext) node).getStart().getLine();
				charPos = ((AddSubExprContext) node).getStart().getCharPositionInLine();
			} else if(node instanceof ComparisonExprContext) {
				lineNum = ((ComparisonExprContext) node).getStart().getLine();
				charPos = ((ComparisonExprContext) node).getStart().getCharPositionInLine();
			} else if(node instanceof EqualityExprContext) {
				lineNum = ((EqualityExprContext) node).getStart().getLine();
				charPos = ((EqualityExprContext) node).getStart().getCharPositionInLine();
			} else if(node instanceof AndExprContext) {
				lineNum = ((AndExprContext) node).getStart().getLine();
				charPos = ((AndExprContext) node).getStart().getCharPositionInLine();
			} else if(node instanceof OrExprContext) {
				lineNum = ((OrExprContext) node).getStart().getLine();
				charPos = ((OrExprContext) node).getStart().getCharPositionInLine();
			} else if(node instanceof AssignExprContext) {
				lineNum = ((AssignExprContext) node).getStart().getLine();
				charPos = ((AssignExprContext) node).getStart().getCharPositionInLine();
			}
			System.out.println(lineNum + " " + charPos + " " +node.getChild(1).getText());
			return this.getExprReturnedType(lineNum, charPos, OPERATOR.getEnum(node.getChild(1)), this.getTypeOf(node.getChild(0)), this.getTypeOf(node.getChild(2)));
		}
	}
	
	private String getTypeOf(ParseTree node) {
		if(node instanceof VariableExprContext
				|| node instanceof StructExprContext
				|| node instanceof EquationExprContext) {
			SymbolContext ctx = scopes.peek().checkTables(node.getText());
			return ctx.getSymbolType();
		} else if (node instanceof PrimaryContext && node.getChildCount() == 1 && !(node.getChild(0) instanceof ParExpressionContext)){
			String text = node.getText();
			System.out.println(text+"-------------------------");
			PrimaryContext pCtx = (PrimaryContext) node;
			if(pCtx.literal() != null) {
				//node is a literal
				return LiteralMatcher.instance().getPossibleLiteralTypes(pCtx.literal());
			} else if(methodTable.containsKey(text)) {
				return methodTable.get(text).getReturnType();
			} else if(scopes.peek().inScope(text)) {
				//node is a variable
				//TODO: check if var is constant based on operator
				return scopes.peek().checkTables(text).getSymbolType();
			} else {
				SemanticErrors.throwError(SemanticErrors.UNDECLARED_VAR, pCtx.getStart().getLine(), pCtx.getStop().getCharPositionInLine(), text);
				return "null";
			}
		} else {
			return this.expressionCheck(node);
		}
		
	}

	//expression checking for unary operations
	private String getExprReturnedType(int lineNum, int charPos, OPERATOR operator, String type) {
		switch (operator) {
		case ADD:
		case SUB: 
			if(this.canBeOfType(type, "int", "float"))
				return type;
			break;
		case INC:
		case DEC:
			if(this.canBeOfType(type, "int", "float", "char"))
				return type;
			break;
		case NOT:
			if(this.canBeOfType(type, "boolean"))
				return type;
			break;
		default:
			break;
		}
		SemanticErrors.throwError(SemanticErrors.UN_OP_TYPE_MISMATCH, lineNum, charPos, operator.toString(), type);
		return "null";
	}
	
	//expression checking for binary operations
	private String getExprReturnedType(int lineNum, int charPos, OPERATOR operator, String type1, String type2) {
		switch(operator) {
		case ADD:
			if(this.canBeOfType(type1, "string") && this.canBeOfType(type2, "string", "int", "char", "float"))
				return type1;
			if(this.canBeOfType(type1, "string", "int", "char", "float") && this.canBeOfType(type2, "string"))
				return type2;
		case SUB:
		case MULT:
		case DIV:
		case MOD:
		case ASSIGN:
		case PLUSASSIGN:
			if(this.canBeOfType(type1, "string") && this.canBeOfType(type2, "string"))
				return type1;
		case SUBASSIGN:
		case MULTASSIGN:
		case DIVASSIGN:
		case MODASSIGN:
			if(this.canBeOfType(type1, "int") && this.canBeOfType(type2, "int"))
				return "int|char|float";
			if(this.canBeOfType(type1, "int") && this.canBeOfType(type2, "float"))
				return "float";
			if(this.canBeOfType(type1, "float") && this.canBeOfType(type2, "int"))
				return "float";
			if(this.canBeOfType(type1, "float") && this.canBeOfType(type2, "float"))
				return "float";
			if(this.canBeOfType(type1, "char") && this.canBeOfType(type2, "char"))
				return "int|char|float";
			if(this.canBeOfType(type1, "char") && this.canBeOfType(type2, "int"))
				return "int|char|float";
			if(this.canBeOfType(type1, "int") && this.canBeOfType(type2, "char"))
				return "int|char|float";
			if(this.canBeOfType(type1, "float") && this.canBeOfType(type2, "char"))
				return "float";
			if(this.canBeOfType(type1, "char") && this.canBeOfType(type2, "float"))
				return "float";
			break;
		case EQUAL:
		case NEQUAL:
			if(this.canBeOfType(type1, "string") && this.canBeOfType(type2, "string"))
				return "boolean";
			if(this.canBeOfType(type1, "boolean") && this.canBeOfType(type2, "boolean"))
				return "boolean";
		case LESS:
		case LEQ:
		case GREATER:
		case GEQ:
			if(this.canBeOfType(type1, "int", "float", "char") && this.canBeOfType(type2, "int", "float", "char"))
				return "boolean";
			if(this.canBeOfType(type1, "boolean") && this.canBeOfType(type2, "boolean"))
				return "boolean";
			break;
		case AND:
		case OR:
			if(this.canBeOfType(type1, "boolean") && this.canBeOfType(type2, "boolean"))
				return "boolean";
		default:
			break;
		}
		SemanticErrors.throwError(SemanticErrors.BIN_OP_TYPE_MISMATCH, lineNum, charPos, operator.toString(), type1, type2);
		return "null";
	}
	
	private boolean canBeOfType(String type, String ...args) {
		for(int i = 0; i < args.length; i++) {
			if(args[i].matches(type))
				return true;
		}
		
		return false;
	}
}
