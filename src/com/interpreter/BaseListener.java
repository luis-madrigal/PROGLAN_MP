package com.interpreter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

import com.interpreter.contexts.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import com.interpreter.matchers.LiteralMatcher;
import com.parser.ManuScriptBaseListener;
import com.parser.ManuScriptParser;
import com.parser.ManuScriptParser.AddSubExprContext;
import com.parser.ManuScriptParser.AndExprContext;
import com.parser.ManuScriptParser.ArrayInitExprContext;
import com.parser.ManuScriptParser.ArrayInitializerContext;
import com.parser.ManuScriptParser.AssignExprContext;
import com.parser.ManuScriptParser.ComparisonExprContext;
import com.parser.ManuScriptParser.CreatorContext;
import com.parser.ManuScriptParser.EqualityExprContext;
import com.parser.ManuScriptParser.EquationExprContext;
import com.parser.ManuScriptParser.ExpressionContext;
import com.parser.ManuScriptParser.ForInitContext;
import com.parser.ManuScriptParser.ForUpdateContext;
import com.parser.ManuScriptParser.FormalParameterContext;
import com.parser.ManuScriptParser.FunctionExprContext;
import com.parser.ManuScriptParser.MethodBodyContext;
import com.parser.ManuScriptParser.MultDivModExprContext;
import com.parser.ManuScriptParser.OrExprContext;
import com.parser.ManuScriptParser.OutputStatementContext;
import com.parser.ManuScriptParser.ParExpressionContext;
import com.parser.ManuScriptParser.PostIncDecExprContext;
import com.parser.ManuScriptParser.PreIncDecSignExprContext;
import com.parser.ManuScriptParser.PrimaryContext;
import com.parser.ManuScriptParser.PrimaryExprContext;
import com.parser.ManuScriptParser.StructExprContext;
import com.parser.ManuScriptParser.StructMemberContext;
import com.parser.ManuScriptParser.VariableDeclaratorContext;
import com.parser.ManuScriptParser.VariableExprContext;
import com.parser.ManuScriptParser.VariableInitializerContext;
import com.utils.KeyTokens.OPERATOR;
import com.utils.Types;

public class BaseListener extends ManuScriptBaseListener{
	private Stack<Scope> scopes;
	private HashMap<String, MethodContext> methodTable;
	private String currentMethod;
	private HashMap<String, StructInfo> structDefTable;
	
	public BaseListener(Scope parentScope, HashMap<String, MethodContext> methodTable) {
		this.scopes = new Stack<Scope>();
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

	private ArrayInfo checkArraySemantics(ArrayInfo arInf, int dimCount, String varType, VariableDeclaratorContext vdctx, int line, int charPosition){
		if(vdctx.variableInitializer() != null) {
			arInf.setInitialized(true);
			ManuScriptParser.VariableInitializerContext vdi = vdctx.variableInitializer();
			if (vdi.expression() instanceof ArrayInitExprContext) {
				ManuScriptParser.CreatorContext crCtx = ((ArrayInitExprContext) vdi.expression()).creator();
				System.out.println("created text: " + crCtx.createdName().getText());
				System.out.println("arType: "+arInf.getArrType());
				if (!crCtx.createdName().getText().equals(arInf.getArrType())) {
					System.out.println("ERROR 82");
					SemanticErrors.throwError(SemanticErrors.ARR_TYPE_MISMATCH,
							crCtx.createdName().getStart().getLine(),
							crCtx.createdName().getStart().getCharPositionInLine(),
							arInf.getArrType());
				}
				else {
					if (crCtx.arrayCreatorRest().arrayInitializer() != null) {
						//when init is 'new type[]...[]{....};'
						System.out.println("START BUILDING ARRAY");
						if ((crCtx.arrayCreatorRest().children.size() - 1) / 2 != dimCount)
							SemanticErrors.throwError(SemanticErrors.INVALID_DIMS,
									crCtx.arrayCreatorRest().arrayInitializer().getStart().getLine(),
									crCtx.arrayCreatorRest().arrayInitializer().getStart().getCharPositionInLine(),
									(crCtx.arrayCreatorRest().children.size() - 1) / 2,
									dimCount);

						ManuScriptParser.ArrayInitializerContext arInit = crCtx.arrayCreatorRest().arrayInitializer();
						int height = getBlockHeight(arInit.getText());
						if (height != dimCount)
							SemanticErrors.throwError(SemanticErrors.ILLEGAL_INIT,
									crCtx.arrayCreatorRest().arrayInitializer().getStart().getLine(),
									crCtx.arrayCreatorRest().arrayInitializer().getStart().getCharPositionInLine(),
									varType);
						this.arrUniformityChecker(arInit, dimCount);
						this.arrayInitCheck(arInit, arInf.getArrType());
					} else {
						//when init is 'new type[size]...[size];'
						if (crCtx.arrayCreatorRest().expression().size() != dimCount)
							SemanticErrors.throwError(SemanticErrors.INVALID_DIMS,
									crCtx.arrayCreatorRest().getStart().getLine(),
									crCtx.arrayCreatorRest().getStart().getCharPositionInLine(),
									crCtx.arrayCreatorRest().expression().size(),
									dimCount);

						for (ExpressionContext expr : crCtx.arrayCreatorRest().expression()) {
							String types = this.expressionCheck(expr);
							if(types.equals("int")) {
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
						SemanticErrors.throwError(SemanticErrors.ILLEGAL_INIT,
								vdi.arrayInitializer().getStart().getLine(),
								vdi.arrayInitializer().getStart().getCharPositionInLine(),
								varType);
//					else{
//						for(ManuScriptParser.VariableInitializerContext varInit : vdi.arrayInitializer().variableInitializer()){
//								String types = this.expressionCheck(varInit);
//								if (!arInf.getArrType().matches(types)) {
//									SemanticErrors.throwError(SemanticErrors.ARR_TYPE_MISMATCH, varInit.getStart().getLine(), varInit.getStart().getCharPositionInLine(), arInf.getArrType());
//							}
//						}
//					}
					this.arrayInitCheck(vdi.arrayInitializer(), arInf.getArrType());

				}
				else if(vdi.expression() instanceof PrimaryExprContext){
					//for derefencing other array variables
					PrimaryContext primary = ((PrimaryExprContext) vdi.expression()).primary();
					if(primary.equationExpr() != null) {
						if (primary.equationExpr().Identifier() != null) {
							SymbolContext symRight = scopes.peek().checkTables(primary.equationExpr().Identifier().getText());
							if (symRight == null) {
								SemanticErrors.throwError(SemanticErrors.UNDECLARED_VAR,primary.equationExpr().getStart().getLine(), primary.equationExpr().getStart().getCharPositionInLine(), primary.equationExpr().Identifier().getText());
							} else {
								if (!symRight.getSymbolType().equals(varType)) {
									SemanticErrors.throwError(SemanticErrors.TYPE_MISMATCH, primary.equationExpr().getStart().getLine(), primary.equationExpr().getStart().getCharPositionInLine(), varType);
								}else if(symRight.getOther() instanceof ArrayInfo)
									return (ArrayInfo)symRight.getOther();
							}
						}
						else
							SemanticErrors.throwError(SemanticErrors.INVALID_INIT,primary.equationExpr().getStart().getLine(), primary.equationExpr().getStart().getCharPositionInLine());
					}
					else
						SemanticErrors.throwError(SemanticErrors.INVALID_INIT, primary.getStart().getLine(), primary.getStart().getCharPositionInLine());
				}
				else
					SemanticErrors.throwError(SemanticErrors.INVALID_INIT, vdi.getStart().getLine(), vdi.getStart().getCharPositionInLine());
			}
		}

		return arInf;
	}
	

	@Override
	public void enterStructDefinition(ManuScriptParser.StructDefinitionContext ctx) {
		String name = ctx.getChild(1).getText();

		if(getCurrentSymTable().containsKey(name)){
			SemanticErrors.throwError(SemanticErrors.DUPLICATE_STRUCT, ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), name);
		}
		else {
			
			ArrayList<SymbolContext> members = new ArrayList<SymbolContext>();
			for (ManuScriptParser.StructDeclarationContext strCtx : ctx.structDeclarationList().structDeclaration()) {
				//declares new type
				int dimCount = (strCtx.typeType().getChildCount() - 1) / 2;
				String varType = strCtx.typeType().getText();
				System.out.println(varType+"=====================");


				if(strCtx.typeType().structType() != null) {
					if (!structDefTable.containsKey(strCtx.typeType().structType().Identifier().getText())) {
						SemanticErrors.throwError(SemanticErrors.UNDEFINED_STRUCT, strCtx.getStart().getLine(), strCtx.getStart().getCharPositionInLine(), strCtx.typeType().structType().Identifier());
					}
				}

				for(ManuScriptParser.StructDeclaratorContext sdc : strCtx.structDeclaratorList().structDeclarator()) {
					//same type declaration

					for(SymbolContext member : members){	//check if identifier has been used within the structure
						if(member.getIdentifier().equals(sdc.structDeclaratorId().Identifier().getText()))
							SemanticErrors.throwError(SemanticErrors.DUPLICATE_VAR,
									sdc.getStart().getLine(),
									sdc.getStart().getCharPositionInLine(),
									sdc.structDeclaratorId().Identifier().getText());
					}

					SymbolContext symCtx = new SymbolContext(varType,null, sdc.structDeclaratorId().getText());
					if (dimCount > 0) {    //declaration is of type array
						ArrayInfo arInf = new ArrayInfo(dimCount, varType);
						symCtx.setOther(arInf);
					} else if (strCtx.typeType().pointerType() != null) {	//declaration is pointer
						PointerInfo ptrInf = new PointerInfo(varType);
						symCtx.setOther(ptrInf);
					} else if (strCtx.typeType().structType() != null) {	//declaration is of type struct
						if (structDefTable.containsKey(strCtx.typeType().structType().Identifier().getText())) {
							StructInfo strInf = structDefTable.get(strCtx.typeType().structType().Identifier().getText()).clone();
							symCtx.setOther(strInf);
						}
					} else{	//declaration is any other primitive

					}
					members.add(symCtx);
				}
			}

			SymbolContext[] memArr = members.toArray(new SymbolContext[members.size()]);
			StructInfo strInfo = new StructInfo(name, memArr);
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
			//parameter semantic checking
			for (FormalParameterContext fpctx : ctx.formalParameters().formalParameterList().formalParameter()) {
				String varName = fpctx.variableDeclaratorId().getText();
				System.out.println("type: "+fpctx.typeType().getText()+"|| name: "+varName);
				SymbolContext symCtx = new SymbolContext(fpctx.typeType().getText(), scope, varName);

				if(getCurrentSymTable().containsKey(varName)){
					SemanticErrors.throwError(SemanticErrors.DUPLICATE_VAR, ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), varName);
				}
				if(symCtx.getCtxType().equals(ContextType.ARRAY)){
					System.out.println("TYPE ARR: "+varName);
					int dimCount = (fpctx.typeType().getChildCount() - 1) / 2;
					ArrayInfo arInf = new ArrayInfo(dimCount,fpctx.typeType().getText());
					symCtx.setOther(arInf);
					if(arInf.getArrayCtxType().equals(ContextType.STRUCT)){
						if (!structDefTable.containsKey(fpctx.typeType().structType().Identifier().getText()))
							SemanticErrors.throwError(SemanticErrors.UNDEFINED_STRUCT,
									fpctx.typeType().getStart().getLine(),
									fpctx.typeType().getStart().getCharPositionInLine(),
									arInf.getArrType().replace("composition",""));

					}
					arInf.setInitialized(true);
				}
				else if(symCtx.getCtxType().equals(ContextType.POINTER)){
					System.out.println("TYPE PTR: "+varName);
					PointerInfo ptrInf = new PointerInfo(fpctx.typeType().getText());
					symCtx.setOther(ptrInf);
				}
				else if(symCtx.getCtxType().equals(ContextType.STRUCT)){
					System.out.println("TYPE STRUCT: "+varName);
					if (structDefTable.containsKey(fpctx.typeType().structType().Identifier().getText())) {
						StructInfo strInf = structDefTable.get(fpctx.typeType().structType().Identifier().getText()).clone();
						symCtx.setOther(strInf);
						System.out.println("STRUCTNAME  :"+strInf.getStructName());
					}
					else
						SemanticErrors.throwError(SemanticErrors.UNDEFINED_STRUCT,
								fpctx.typeType().getStart().getLine(),
								fpctx.typeType().getStart().getCharPositionInLine(),
								fpctx.typeType().getText());
				}

				System.out.println("Placed "+varName+" of type "+symCtx.getSymbolType());
				getCurrentSymTable().put(varName,symCtx);

//
//				System.out.println("added "+varName+" from method " +methodName+ " to symbol table");
//				scope.add(varName);
//				if(getCurrentSymTable().containsKey(varName)){
//					SemanticErrors.throwError(SemanticErrors.DUPLICATE_VAR, ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), varName);
//				}
//				getCurrentSymTable().put(varName, new SymbolContext(fpctx.typeType().getText(), scope, varName));
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



		if(ctx.typeType().structType() != null){
			if(!structDefTable.containsKey(ctx.typeType().structType().Identifier().getText()))
				SemanticErrors.throwError(SemanticErrors.UNDEFINED_STRUCT,
						ctx.typeType().structType().getStart().getLine(),
						ctx.typeType().structType().getStart().getCharPositionInLine(),
						ctx.typeType().structType().Identifier());
		}

		for (VariableDeclaratorContext vdctx : ctx.variableDeclarators().variableDeclarator()) {
			//iterates through varname list (int a,b,...,z)
			String varName = vdctx.variableDeclaratorId().getText();
			
			if (getCurrentSymTable().containsKey(varName)) {//CHECK FOR DUPLICATE VARNAME
				SemanticErrors.throwError(SemanticErrors.DUPLICATE_VAR, ctx.getStart().getLine(),ctx.getStart().getCharPositionInLine(), varName);
			}
			else {
				SymbolContext symCtx = new SymbolContext(varType, scope, varName, isConstant);

				if(dimCount>0) {    //declaration is of type array
					ArrayInfo arInf = new ArrayInfo(dimCount,varType);
					arInf = checkArraySemantics(arInf, dimCount, varType, vdctx, ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
					symCtx.setOther(arInf);
				}
				else if (ctx.typeType().pointerType() != null) {	//declaration is pointer
					PointerInfo ptrInf = new PointerInfo(varType);
					symCtx.setOther(ptrInf);
				}
				else if (ctx.typeType().structType() != null) {	//declaration is of type struct
					if (structDefTable.containsKey(ctx.typeType().structType().Identifier().getText())) {
						StructInfo strInf = structDefTable.get(ctx.typeType().structType().Identifier().getText()).clone();
						symCtx.setOther(strInf);
					}
				}
				else {	//declaration is of any other type
					//do this if variable has initializer
					if (vdctx.variableInitializer() != null) {
						String types = this.expressionCheck(vdctx.variableInitializer().expression());
						if(!this.regexComparison(varType, types)) {
							if(!this.regexComparison(varType.replace("*", ""), types))
								SemanticErrors.throwError(SemanticErrors.VAR_ASSIGN_MISMATCH, vdctx.getStart().getLine(), vdctx.getStart().getCharPositionInLine(), varName, types);
						}
//						if(!varType.replace("*", "~").matches(types.replace("*", "~"))) {
//							if(!varType.replace("*", "").equals(types))
//								SemanticErrors.throwError(SemanticErrors.VAR_ASSIGN_MISMATCH, vdctx.getStart().getLine(), vdctx.getStart().getCharPositionInLine(), varName, types);
//						}
					} else if(isConstant) {
						SemanticErrors.throwError(SemanticErrors.CONSTANT_INIT, vdctx.getStart().getLine(), vdctx.getStart().getCharPositionInLine(), varName);
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

		if(ctx.typeType().structType() != null){
			if(!structDefTable.containsKey(ctx.typeType().structType().Identifier().getText()))
				SemanticErrors.throwError(SemanticErrors.UNDEFINED_STRUCT,
						ctx.typeType().structType().getStart().getLine(),
						ctx.typeType().structType().getStart().getCharPositionInLine(),
						ctx.typeType().structType().Identifier());
		}

		for (VariableDeclaratorContext vdctx : ctx.variableDeclarators().variableDeclarator()) {
			//iterates through varname list (int a,b,...,z)
			String varName = vdctx.variableDeclaratorId().getText();

			if(getCurrentSymTable().containsKey(varName)) {//CHECK FOR DUPLICATE VARNAME
				SemanticErrors.throwError(SemanticErrors.DUPLICATE_VAR, vdctx.getStart().getLine(), vdctx.getStart().getCharPositionInLine(), varName);
			}
			else {
				SymbolContext symCtx = new SymbolContext(varType, scope, varName, isConstant);

				if(dimCount>0) {	//if type array
					ArrayInfo arInf = new ArrayInfo(dimCount,varType);
					//array initialization checking
					checkArraySemantics(arInf, dimCount, varType, vdctx, ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
					symCtx.setOther(arInf);
				}
				else if (ctx.typeType().pointerType() != null) {	//declaration is pointer
					PointerInfo ptrInf = new PointerInfo(varType);
					symCtx.setOther(ptrInf);
				}
				else if (ctx.typeType().structType() != null) {	//declaration is of type struct
					if (structDefTable.containsKey(ctx.typeType().structType().Identifier().getText())) {
						StructInfo strInf = structDefTable.get(ctx.typeType().structType().Identifier().getText()).clone();
						symCtx.setOther(strInf);
					}
				}
				else {	//declaration is of any other type
					//do this if variable has initializer
					if (vdctx.variableInitializer() != null) {
						String types = this.expressionCheck(vdctx.variableInitializer().expression());
						if(!this.regexComparison(varType, types)) {
							System.out.println("fault "+types);
							if(!this.regexComparison(varType.replace("*", ""), types))
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

	@Override//TODO: possibly executing twice
	public void enterAssignExpr(ManuScriptParser.AssignExprContext ctx) { 
		String varName = ctx.equationExpr().getText();
		varName = varName.split("\\[")[0];//TODO: bad implementation
		SymbolContext sctx;
		System.out.println("assign expr");
		
		int lineNumStart = ctx.getStart().getLine();
		int charNumStart = ctx.getStart().getCharPositionInLine();
		
		if((sctx = scopes.peek().checkTables(varName)) != null){
//			String varType = sctx.getSymbolType();
			if(sctx.isConstant())
				SemanticErrors.throwError(SemanticErrors.CONSTANT_MOD, lineNumStart, charNumStart, varName);
//			else {
//				String types = this.expressionCheck(ctx.expression());
//				if(!varType.replace("*", "~").matches(types.replace("*", "~"))) {
//					if(!varType.replace("*", "").equals(types))
//						SemanticErrors.throwError(SemanticErrors.VAR_ASSIGN_MISMATCH, lineNumStart, charNumStart, varName, types);
//				}
			}
		} 
//	else {
//			SemanticErrors.throwError(SemanticErrors.UNDECLARED_VAR, ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), varName);
//		}
//	}
	
	@Override
	public void enterStatementExpression(ManuScriptParser.StatementExpressionContext ctx) {
		this.expressionCheck(ctx.expression());
	}
	
	@Override public void enterReturnStmt(ManuScriptParser.ReturnStmtContext ctx) {
		MethodContext mctx = methodTable.get(currentMethod);
		if(mctx.getReturnType().equals(Types.NULL)) {
			if(ctx.expression() == null) {
				mctx.setReturnType("void");
			} else
				mctx.setReturnType(this.expressionCheck(ctx.expression()));
		} else {
			if(mctx.getReturnType().equals("void") && ctx.expression() != null) {
				SemanticErrors.throwError(SemanticErrors.INVALID_RETURN_TYPE, ctx.getStart().getLine(), ctx.getStop().getCharPositionInLine(), currentMethod, mctx.getReturnType());
			} else if(!mctx.getReturnType().equals(this.expressionCheck(ctx.expression()))) {
				SemanticErrors.throwError(SemanticErrors.INVALID_RETURN_TYPE, ctx.expression().getStart().getLine(), ctx.expression().getStop().getCharPositionInLine(), currentMethod, mctx.getReturnType());
			}
		}

	}

	//not overriden
	public String enterFunctionExpression(ManuScriptParser.FunctionExprContext ctx) { 
		String methodName = ctx.Identifier().getText();
		int lineNum = ctx.getStart().getLine();
		int charPosInLine = ctx.getStart().getCharPositionInLine();

		if(!methodTable.containsKey(methodName)) {
			SemanticErrors.throwError(SemanticErrors.UNDEFINED_METHOD, lineNum, charPosInLine, methodName);
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
					SymbolContext varArg = scopes.peek().checkTables(arg);
					//Existing variable. now check for type mismatch
					if(!scopes.peek().checkTables(arg).getSymbolType().equals(mcx.getArgTypes().get(i)))
						SemanticErrors.throwError(SemanticErrors.TYPE_MISMATCH, ectxLineNum, ectxCharPosAtLine, mcx.getArgTypes().get(i));
				} else if(ectx instanceof PrimaryExprContext
						&& ((PrimaryExprContext) ectx).primary().equationExpr() != null
						&& ((PrimaryExprContext) ectx).primary().equationExpr().Identifier() != null) {
					//variable but not in scope or not declared.
					if(scopes.peek().checkTables(arg) == null)
						SemanticErrors.throwError(SemanticErrors.UNDECLARED_VAR, ectxLineNum, ectxCharPosAtLine, arg);
				} else {
					//literal or expression
					String type = this.expressionCheck(ectx);
					System.out.println("check:"+type);
					if(!this.regexComparison(mcx.getArgTypes().get(i).replace("*", ""),type))
						SemanticErrors.throwError(SemanticErrors.TYPE_MISMATCH, ectxLineNum, ectxCharPosAtLine, mcx.getArgTypes().get(i));
				}
				i++;
			}
		} else {
			if(mcx.getArgs().size() > 0)
				SemanticErrors.throwError(SemanticErrors.PARAM_COUNT_MISMATCH_L, lineNum, charPosInLine, methodName, mcx.getArgTypes().size());
		}
		return mcx.getReturnType();
	}
	
	@Override
	public void enterOutputStatement(ManuScriptParser.OutputStatementContext ctx) {
		this.expressionCheck(ctx.expression());
	}
	
	//not overriden. primary function is to assure no constant modification
	public boolean enterPostIncDecExpression(ManuScriptParser.PostIncDecExprContext ctx) {
		String varName = ctx.equationExpr().getText();
		SymbolContext sctx;
		
		if((sctx = scopes.peek().checkTables(varName)) != null){
			if(sctx.isConstant()) {
				SemanticErrors.throwError(SemanticErrors.CONSTANT_MOD, ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), varName);
				return false;
			}
		}
		return true;
	}
	
	//not overriden. primary function is to assure no constant modification
	public boolean enterPreIncDecSignExpression(ManuScriptParser.PreIncDecSignExprContext ctx) {
		String varName = ctx.equationExpr().getText();
		SymbolContext sctx;
		
		if((sctx = scopes.peek().checkTables(varName)) != null){
			if(sctx.isConstant()) {
				SemanticErrors.throwError(SemanticErrors.CONSTANT_MOD, ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), varName);
				return false;
			}
		}
		return true;	
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
	
	private String enterArrayInitExpression(ManuScriptParser.AssignExprContext ctx) {
		ArrayInfo arInf = null;
		SymbolContext sctx = null;
		if(ctx.equationExpr().variableExpr() != null){
			//if array[] = #NOT ALLOWED
			SemanticErrors.throwError(SemanticErrors.INVALID_INIT,
					ctx.equationExpr().variableExpr().getStart().getLine(),
					ctx.equationExpr().variableExpr().getStart().getCharPositionInLine());
		}
		else if(ctx.equationExpr().structExpr()!= null){
			//if struct
			String structName = ctx.equationExpr().structExpr().structName().getText();
			sctx = getCurrentSymTable().get(structName);
			StructInfo stInf;
			ManuScriptParser.StructMemberContext smctx = ctx.equationExpr().structExpr().structMember();
			while(smctx != null){
				System.out.println("loop");
				stInf = (StructInfo) sctx.getOther();
				sctx = stInf.getMember(smctx.Identifier().getText());
				if(sctx == null)
					break; //todo better implementation

				smctx = smctx.structMember();
			}

			System.out.println("KEK "+sctx.getSymbolType());
			arInf = (ArrayInfo)sctx.getOther();
		}
		else {
			String arrName = ctx.equationExpr().getText();
			sctx = getCurrentSymTable().get(arrName);
			arInf = (ArrayInfo) sctx.getOther();
			arInf.setInitialized(true);
		}

		if(arInf != null && sctx != null) {
			int dimCount = arInf.getDims();
			String varType = sctx.getSymbolType();


			ManuScriptParser.CreatorContext crCtx = ((ArrayInitExprContext) ctx.expression()).creator();
			System.out.println("created text: " + crCtx.createdName().getText());
			if (!crCtx.createdName().getText().equals(arInf.getArrType())) {
				System.out.println("this error");
				SemanticErrors.throwError(SemanticErrors.ARR_TYPE_MISMATCH,
						crCtx.createdName().getStart().getLine(),
						crCtx.createdName().getStart().getCharPositionInLine(),
						arInf.getArrType());
			} else {
				if (crCtx.arrayCreatorRest().arrayInitializer() != null) {
					//when init is 'new type[]...[]{....};'
					System.out.println("START BUILDING ARRAY FROM ");
					if ((crCtx.arrayCreatorRest().children.size() - 1) / 2 != dimCount)
						SemanticErrors.throwError(SemanticErrors.INVALID_DIMS,
								crCtx.arrayCreatorRest().arrayInitializer().getStart().getLine(),
								crCtx.arrayCreatorRest().arrayInitializer().getStart().getCharPositionInLine(),
								(crCtx.arrayCreatorRest().children.size() - 1) / 2,
								dimCount);

					ManuScriptParser.ArrayInitializerContext arInit = crCtx.arrayCreatorRest().arrayInitializer();
					int height = getBlockHeight(arInit.getText());
					if (height != dimCount)
						SemanticErrors.throwError(SemanticErrors.ILLEGAL_INIT,
								crCtx.arrayCreatorRest().arrayInitializer().getStart().getLine(),
								crCtx.arrayCreatorRest().arrayInitializer().getStart().getCharPositionInLine(),
								varType);
					this.arrUniformityChecker(arInit, dimCount);
					this.arrayInitCheck(arInit, arInf.getArrType());
				} else {
					//when init is 'new type[size]...[size];'
					if (crCtx.arrayCreatorRest().expression().size() != dimCount)
						SemanticErrors.throwError(SemanticErrors.INVALID_DIMS,
								crCtx.arrayCreatorRest().getStart().getLine(),
								crCtx.arrayCreatorRest().getStart().getCharPositionInLine(),
								crCtx.arrayCreatorRest().expression().size(),
								dimCount);

					for (ExpressionContext expr : crCtx.arrayCreatorRest().expression()) {
						String types = this.expressionCheck(expr);
						if (!this.regexComparison("int",types)) {
							System.out.println("(arInf) "+arInf.getArrType()+"?=(types) "+types);
							System.out.println("this error2");
							SemanticErrors.throwError(SemanticErrors.ARR_TYPE_MISMATCH, expr.getStart().getLine(), expr.getStart().getCharPositionInLine(), arInf.getArrType());
						}
					}
				}

			}
			System.out.println("exit correct");
			return sctx.getSymbolType();
		}
		return "null";
	}
	
	private void arrayInitCheck(ParseTree node, String aType) {
		if(node instanceof ExpressionContext) {
			String type = this.expressionCheck(node);
			if(!this.regexComparison(aType, type)) {
				ParserRuleContext pCtx = (ParserRuleContext) node;
				SemanticErrors.throwError(SemanticErrors.ARR_INIT_ELEMENT_MISMATCH, pCtx.getStart().getLine(), pCtx.getStop().getCharPositionInLine(), aType);
			}
		} else {
			for(int i = 0; i < node.getChildCount(); i++) {
				if(node.getChild(i) instanceof VariableInitializerContext
					|| node.getChild(i) instanceof ExpressionContext
					|| node.getChild(i) instanceof ArrayInitializerContext) {
					this.arrayInitCheck(node.getChild(i), aType);
				}
			}
		}
	}
	
	private int arrUniformityChecker(ParseTree node, int dims) {
		if(dims == 1) {
			return this.getArrayElemCount(node);
		}
		if(node instanceof ArrayInitializerContext) {
			ArrayInitializerContext aCtx = (ArrayInitializerContext) node;
			int count = -1;
			int prevCount = -1;
			for (VariableInitializerContext vctx : aCtx.variableInitializer()) {
				count = this.arrUniformityChecker(vctx.arrayInitializer(), dims-1);
				if(prevCount != -1 && count != prevCount) {
					SemanticErrors.throwError(SemanticErrors.ARR_INIT_DIFF_COUNT, vctx.getStart().getLine(), vctx.getStop().getCharPositionInLine());
				} else
					prevCount = count;
			}
		}
		
		return 0;
	}
	
	private int getArrayElemCount(ParseTree node) {
		int count = 0;
		for(int i = 0; i < node.getChildCount(); i++) {
			if(node.getChild(i) instanceof VariableInitializerContext)
				count++;
		}
		return count;
	}
	
	private String structMemberEval(StructMemberContext ctx, SymbolContext sctx) {
		if(ctx.structMember() != null) {
			StructInfo sInfo = (StructInfo) sctx.getOther();
			SymbolContext memCtx = null;
			if((memCtx = sInfo.getMember(ctx.Identifier().getText())) == null) {
				SemanticErrors.throwError(SemanticErrors.INVALID_MEMBER, 
						ctx.structMember().getStart().getLine(),
						ctx.structMember().getStart().getCharPositionInLine());
				return "null";
			} else {
				System.out.println(memCtx.getIdentifier());
				return this.structMemberEval(ctx.structMember(), memCtx);
			}
		} else {
			StructInfo sInfo = (StructInfo) sctx.getOther();
			SymbolContext memCtx = null;
			if((memCtx = sInfo.getMember(ctx.Identifier().getText())) == null) {
				SemanticErrors.throwError(SemanticErrors.INVALID_MEMBER, 
						ctx.getStart().getLine(),
						ctx.getStart().getCharPositionInLine(),
						ctx.Identifier().getText(),
						sInfo.getStructName());
				return "null";
			}
			return memCtx.getSymbolType();
		}
	}
	
	private String enterStructExpression(StructExprContext ctx) {
		System.out.println("struct expr detected");
		String structName = ctx.structName().getText();
		
		int lineNum = ctx.getStart().getLine();
		int charPos = ctx.getStop().getCharPositionInLine();
		

		SymbolContext sctx = scopes.peek().checkTables(structName);

		if(sctx == null) {
			SemanticErrors.throwError(SemanticErrors.UNDECLARED_VAR, lineNum, charPos, structName);
			return "null";
		}
		
		return this.structMemberEval(ctx.structMember(), sctx);
	}
	
	private String enterArrayExpression(EquationExprContext ctx) {
		String arrName = ctx.variableExpr().getText();
		SymbolContext sctx = scopes.peek().checkTables(arrName);
		int lineNum = ctx.getStart().getLine();
		int charPos = ctx.getStop().getCharPositionInLine();


		if(sctx == null){
			SemanticErrors.throwError(SemanticErrors.UNDECLARED_VAR, lineNum, charPos, arrName);
			return "null";
		}

		ArrayInfo aInfo = (ArrayInfo) sctx.getOther();

		if(!aInfo.isInitialized())
			SemanticErrors.throwError(SemanticErrors.INVALID_ACCESS, lineNum, charPos, arrName);
		
		if(aInfo.getDims() != ctx.expression().size()) {
			SemanticErrors.throwError(SemanticErrors.INVALID_DIM_ACCESS, lineNum, charPos, aInfo.getDims());
		}


		for (ExpressionContext ectx : ctx.expression()) {
			System.out.println("ex "+ectx.getText());
			String type = this.expressionCheck(ectx);
			System.out.println("index :"+type+"?= arrType: "+aInfo.getArrType());
			if(!this.regexComparison("int", type)) {
				SemanticErrors.throwError(SemanticErrors.INVALID_INDEX, lineNum, charPos);
			}
		}
		
		return aInfo.getArrType();
	}
	
	private String expressionCheck(ParseTree node) {
		if(node.getChildCount() == 1) {
			return this.getTypeOf(node.getChild(0));
			
		} else if(node instanceof  OutputStatementContext) {
			ParserRuleContext pCtx = (ParserRuleContext) ((OutputStatementContext) node).expression();
			return this.getExprReturnedType(pCtx.getStart().getLine(), pCtx.getStart().getCharPositionInLine(), OPERATOR.getEnum(node.getChild(1)), "string", this.getTypeOf(pCtx));
		}else if(node instanceof ParExpressionContext) {
			return this.getTypeOf(node.getChild(1));
		} else if(node instanceof FunctionExprContext) {
			System.out.println("ENTER FUNCTION CALL");
			return this.enterFunctionExpression((FunctionExprContext) node);
			
		} else if(node instanceof PostIncDecExprContext) {
			this.enterPostIncDecExpression(((PostIncDecExprContext) node));
			return this.getExprReturnedType(((PostIncDecExprContext) node).getStart().getLine(), ((PostIncDecExprContext) node).getStart().getCharPositionInLine(), OPERATOR.getEnum(node.getChild(1)), this.getTypeOf(node.getChild(0)));
		
		} else if(node instanceof PreIncDecSignExprContext) {
			this.enterPreIncDecSignExpr(((PreIncDecSignExprContext) node));
			return this.getExprReturnedType(((PreIncDecSignExprContext) node).getStart().getLine(), ((PreIncDecSignExprContext) node).getStart().getCharPositionInLine(), OPERATOR.getEnum(node.getChild(0)), this.getTypeOf(node.getChild(1)));

		} else if(node instanceof MultDivModExprContext
				|| node instanceof AddSubExprContext
				|| node instanceof ComparisonExprContext
				|| node instanceof EqualityExprContext
				|| node instanceof AndExprContext
				|| node instanceof OrExprContext
				|| node instanceof AssignExprContext){
			ParserRuleContext pCtx = (ParserRuleContext) node;
			return this.getExprReturnedType(pCtx.getStart().getLine(), pCtx.getStart().getCharPositionInLine(), OPERATOR.getEnum(node.getChild(1)), this.getTypeOf(node.getChild(0)), this.getTypeOf(node.getChild(2)));
		}
		return "null";
	}
	
	private String getTypeOf(ParseTree node) {
		if(this.isStructExpression(node)) {
			return this.enterStructExpression(((EquationExprContext) node).structExpr());

		} else if(this.isArrayExpression(node)) {
			return this.enterArrayExpression(((EquationExprContext)node));
			
		} else if(node.getChildCount() == 2 && node.getChild(1) instanceof CreatorContext && node.getParent() instanceof AssignExprContext) {
			System.out.println("array assignment initialization");
			return this.enterArrayInitExpression((AssignExprContext) node.getParent());
			
		} else if(node instanceof VariableExprContext
				|| node instanceof EquationExprContext) {
			ParserRuleContext eCtx = (ParserRuleContext) node;
			SymbolContext ctx = scopes.peek().checkTables(node.getText());
			
			if(ctx == null) {
				SemanticErrors.throwError(SemanticErrors.UNDECLARED_VAR, eCtx.getStart().getLine(), eCtx.getStop().getCharPositionInLine(), node.getText());
				return "null";
			}
			if(ctx.getCtxType() == ContextType.ARRAY) {
				ArrayInfo a = (ArrayInfo) ctx.getOther();
				a.setInitialized(true);
			}
			return ctx.getSymbolType();
		} else if (node instanceof PrimaryContext && node.getChildCount() == 1 && !(node.getChild(0) instanceof ParExpressionContext)){
			String text = node.getText();
//			System.out.println(text+"-------------------------");
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
			} else if(node.getChild(0) instanceof EquationExprContext) {
				return this.getTypeOf(node.getChild(0));
			} else {
				SemanticErrors.throwError(SemanticErrors.UNDECLARED_VAR, pCtx.getStart().getLine(), pCtx.getStop().getCharPositionInLine(), text);
				return "null";
			}
		} else {
			return this.expressionCheck(node);
		}
		
	}
	
	private boolean isStructExpression(ParseTree node) {
		return node instanceof EquationExprContext
				&& ((EquationExprContext) node).structExpr() != null;
	}
	
	private boolean isArrayExpression(ParseTree node) {
		return node instanceof EquationExprContext
				&& ((EquationExprContext) node).variableExpr() != null;
	}

	//expression checking for unary operations
	private String getExprReturnedType(int lineNum, int charPos, OPERATOR operator, String type) {
		switch (operator) {
		case ADD:
			if(this.canBeOfType(type, "int", "float", "char", "int*", "float*", "char*"))
				return type;
		case SUB: 
			if(this.canBeOfType(type, "int", "float", "int*", "float*"))
				return type;
			break;
		case INC:
		case DEC:
			if(this.canBeOfType(type, "int", "float", "char", "int*", "float*", "char*"))
				return type;
			break;
		case NOT:
			if(this.canBeOfType(type, "boolean", "boolean*"))
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
			if(this.canBeOfType(type1, "string", "string*") && this.canBeOfType(type2, "string", "int", "char", "float", "string*", "int*", "char*", "float*","boolean"))
				return type1;
			if(this.canBeOfType(type1, "string", "int", "char", "float", "string*", "int*", "char*", "float*","boolean") && this.canBeOfType(type2, "string", "string*"))
				return type2;
		case SUB:
		case MULT:
		case DIV:
		case MOD:
		case ASSIGN:
			if(this.arrayAssignCheck(type1, type2)) //will also work for array of structs and array of pointers
				return type1;
			if(this.structAssignCheck(type1, type2)) //will only work for structs
				return type1;
			if(this.pointerAssignCheck(type1, type2)) //will work for all pointers
				return type1;
		case PLUSASSIGN:
			if(this.canBeOfType(type1, "string", "string*") && this.canBeOfType(type2, "string", "string*"))
				return type1;
		case SUBASSIGN:
		case MULTASSIGN:
		case DIVASSIGN:
		case MODASSIGN:
			if(this.canBeOfType(type1, "int", "int*") && this.canBeOfType(type2, "int", "int*"))
				return "int|char|float";
			if(this.canBeOfType(type1, "int", "int*") && this.canBeOfType(type2, "float", "float*"))
				return "float";
			if(this.canBeOfType(type1, "float", "float*") && this.canBeOfType(type2, "int", "int*"))
				return "float";
			if(this.canBeOfType(type1, "float", "float*") && this.canBeOfType(type2, "float", "float*"))
				return "float";
			if(this.canBeOfType(type1, "char", "char*") && this.canBeOfType(type2, "char", "char*"))
				return "int|char|float";
			if(this.canBeOfType(type1, "char", "char*") && this.canBeOfType(type2, "int", "int*"))
				return "int|char|float";
			if(this.canBeOfType(type1, "int", "int*") && this.canBeOfType(type2, "char", "char*"))
				return "int|char|float";
			if(this.canBeOfType(type1, "float", "float*") && this.canBeOfType(type2, "char", "char*"))
				return "float";
			if(this.canBeOfType(type1, "char", "char*") && this.canBeOfType(type2, "float", "float*"))
				return "float";
			break;
		case EQUAL:
		case NEQUAL:
			if(this.canBeOfType(type1, "string", "string*") && this.canBeOfType(type2, "string", "string*"))
				return "boolean";
			if(this.canBeOfType(type1, "boolean", "boolean*") && this.canBeOfType(type2, "boolean", "boolean*"))
				return "boolean";
		case LESS:
		case LEQ:
		case GREATER:
		case GEQ:
			if(this.canBeOfType(type1, "int", "float", "char", "int*", "float*", "char*") && this.canBeOfType(type2, "int", "float", "char", "int*", "float*", "char*"))
				return "boolean";
			if(this.canBeOfType(type1, "boolean", "boolean*") && this.canBeOfType(type2, "boolean", "boolean*"))
				return "boolean";
			break;
		case AND:
		case OR:
			if(this.canBeOfType(type1, "boolean", "boolean*") && this.canBeOfType(type2, "boolean", "boolean*"))
				return "boolean";
		default:
			break;
		}
		SemanticErrors.throwError(SemanticErrors.BIN_OP_TYPE_MISMATCH, lineNum, charPos, operator.toString(), type1, type2);
		return "null";
	}
	
	private boolean canBeOfType(String type, String ...args) {
//		String t = type.replace("*", "\\*").replace("[", "\\[").replace("]", "\\]");
		for(int i = 0; i < args.length; i++) {
//			String arg = args[i].replace("*", "\\*").replace("[", "\\[").replace("]", "\\]");
			if(this.regexComparison(args[i], type))
				return true;
		}
		
		return false;
	}
	
	private boolean regexComparison(String val, String regex) {
		String reg = regex.replace("*", "").replace("[", "\\[").replace("]", "\\]");
		
		return val.matches(reg);
	}
	
	private boolean arrayAssignCheck(String type1, String type2) {
		String[] t1 = type1.split("\\[");
		String[] t2 = type2.split("\\[");
		
		if(t1.length == 0 && t2.length == 0)
			return false;
		
		if(t1[0].equals(t2[0]) && t1.length == t2.length)
			return true;
		
		return false;
	}
	
	private boolean structAssignCheck(String type1, String type2) {
		return this.structDefTable.containsKey(type1)
				&& this.structDefTable.containsKey(type2)
				&& type1.equals(type2);
	}
	
	private boolean pointerAssignCheck(String type1, String type2) {
//		if(!type1.contains("*"))
//			return false;
		if(type1.equals(type2))
			return true;
		
		String t1WOpointer = type1.replace("*", "");
		String t2WOpointer = type2.replace("*", "");
		
		System.out.println(t1WOpointer+"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"+t2WOpointer);
		
		if(this.regexComparison(t1WOpointer, t2WOpointer))
			return true;
		if(this.regexComparison(t1WOpointer, t2WOpointer))
			return true;

//		String t1WOpointer = type1.replace("*", "");
//		System.out.println(t1WOpointer+"~~~~~~~~~~~~~~~~~~"+type2);
////		if(t1WOpointer.equals(type2)) //if type1 without '*' equal to type2
////			return true;
//		if(this.regexComparison(t1WOpointer, type2))
//			return true;
//
//		String t2WOpointer = type2.replace("*", "");
//		System.out.println(t2WOpointer+"~~~~~~~~~~~~~~~~~~"+type1);
////		if(t2WOpointer.equals(type1)) //if type1 without '*' equal to type2
////			return true;
//		if(this.regexComparison(t2WOpointer, type2))
//			return true;

		return false;
	}
}
