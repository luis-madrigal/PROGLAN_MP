package com.threads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import com.debug.watch.VariableNode;
import com.ide.Panel;
import com.interpreter.Scope;
import com.interpreter.AST.ASTBuildVisitor;
import com.interpreter.AST.NodeType;
import com.interpreter.AST.ProcedureNode;
import com.interpreter.contexts.ArrayInfo;
import com.interpreter.contexts.ContextType;
import com.interpreter.contexts.MethodContext;
import com.interpreter.contexts.PointerInfo;
import com.interpreter.contexts.StructInfo;
import com.interpreter.contexts.SymbolContext;
import com.interpreter.modules.ExpressionEvaluator;
import com.interpreter.modules.Reader;
import com.interpreter.modules.Writer;
import com.interpreter.tac.ICGenerator;
import com.interpreter.tac.TACArrayAssignStatement;
import com.interpreter.tac.TACArrayBlockStatement;
import com.interpreter.tac.TACArrayDimsStatement;
import com.interpreter.tac.TACAssignStatement;
import com.interpreter.tac.TACBinaryOpStatement;
import com.interpreter.tac.TACBlockStatement;
import com.interpreter.tac.TACFuncInvokeStatement;
import com.interpreter.tac.TACGotoStatement;
import com.interpreter.tac.TACIfStatement;
import com.interpreter.tac.TACLoopStatement;
import com.interpreter.tac.TACOutputStatement;
import com.interpreter.tac.TACPrintStatement;
import com.interpreter.tac.TACReturnStatement;
import com.interpreter.tac.TACScanStatement;
import com.interpreter.tac.TACStatement;
import com.interpreter.tac.TACUnaryOpStatement;
import com.interpreter.tac.arrassign.ArrayAssignType;
import com.interpreter.tac.operands.ArrayAccess;
import com.interpreter.tac.operands.Operand;
import com.interpreter.tac.operands.OperandTypes;
import com.interpreter.tac.operands.Register;
import com.interpreter.tac.operands.StructAccess;
import com.interpreter.tac.operands.Variable;
import com.rits.cloning.Cloner;
import com.utils.Console;
import com.utils.KeyTokens.OPERATOR;

public class CodeGeneratorRunnable implements Runnable {
	private volatile boolean isRunning;
	volatile boolean isPlay = false;

	private HashMap<String, ArrayList<TACStatement>> methodICodes;
	private HashMap<String, TACStatement> labelMap;
	private HashMap<String, Register> registers;
	private HashMap<String, Scope> variables;
	private Scope globalScope;
	private Scope currentScope;
	private Stack<Scope> prevBlocks;
	private HashMap<String, MethodContext> methodTable;
	private HashMap<String, ProcedureNode> methodASTTable;
	private Panel pnlParent;
	private ArrayList<VariableNode> varList;
	private ArrayList<Integer> listBlockDepth;
	public CodeGeneratorRunnable(Panel pnlParent, ASTBuildVisitor astbv, HashMap<String, MethodContext> methodTable, ArrayList<VariableNode> varList) {
		this.varList = varList;
		this.methodASTTable = astbv.getMethodASTTable();
		this.methodTable = methodTable;
		this.isRunning = true;
		this.isPlay = true;
		this.pnlParent = pnlParent;

		this.listBlockDepth = new ArrayList<Integer>();
		this.methodTable = methodTable;
		this.methodICodes = new HashMap<String, ArrayList<TACStatement>>();
		this.labelMap = new HashMap<String, TACStatement>();
		this.variables = new HashMap<String, Scope>();
		this.registers = new HashMap<String, Register>();
		this.prevBlocks = new Stack<Scope>();
		this.isRunning = true;
		ICGenerator icg = new ICGenerator(methodTable);
		
		Panel.threeACOut.setText("");
		
		Panel.threeACOut.setText(Panel.threeACOut.getText() + "ICODE FOR: %FIELD\n");
		this.methodICodes.put("%FIELD", icg.generateICode(methodASTTable.get("%FIELD"), true));
		this.globalScope = icg.getGlobalScope();
		this.globalScope.setParent(null);
		this.addToLabelMap(this.methodICodes.get("%FIELD"));
		icg.print();
		
		this.currentScope = this.globalScope;
				
		for (Map.Entry<String, ProcedureNode> entry : methodASTTable.entrySet()) {
			if(!entry.getKey().equals("%FIELD")) {
				Panel.threeACOut.setText(Panel.threeACOut.getText() + "ICODE FOR: "+entry.getKey() + "\n");
				
				this.methodICodes.put(entry.getKey(), icg.generateICode(entry.getValue(), false));
				this.variables.put(entry.getKey(), icg.getScope());
				this.addToLabelMap(this.methodICodes.get(entry.getKey()));
				icg.print();
			}
		}
		
		
		for(Map.Entry<String, Scope> entry : this.variables.entrySet()) {
			this.globalScope.getChildren().add(entry.getValue());
			entry.getValue().setParent(this.globalScope);
		}
	}

	
	@Override
	public void run() {
		this.pnlParent.changeToPause();
		ArrayList<TACStatement> icode = this.methodICodes.get("%FIELD");
		String pointer = icode.get(0).getLabel();
		int pointerCount = Integer.parseInt(icode.get(0).getLabel().substring(1));
		HashMap<String, Register> registers = Cloner.standard().deepClone(this.registers);
		TACStatement stmt = null;

		this.listBlockDepth = new ArrayList<Integer>();
		this.listBlockDepth.add(0);
		do {
			stmt = this.labelMap.get(pointer);
			pointerCount = this.evaluate(this.globalScope, registers, stmt, pointerCount, "main");
			pointer = ICGenerator.LABEL_ALIAS+pointerCount;
		}while(this.checkEndRun(pointer));
		
		this.run("main");
		
		this.pnlParent.changeToPlay();
		Console.instance().logFinished();
	}
	
	private Object run(String methodName, Object ...args) {
		ArrayList<TACStatement> icode = this.methodICodes.get(methodName);
		String pointer = icode.get(0).getLabel();
		int pointerCount = Integer.parseInt(icode.get(0).getLabel().substring(1));
		TACStatement stmt = null;
		this.prevBlocks.push(null);
		Scope methodScope = this.variables.get(methodName).clone();
		HashMap<String, Register> registers = Cloner.standard().deepClone(this.registers);
		
		ArrayList<String> fnArgs = this.methodTable.get(methodName).getArgs();
		for(int i = 0; i < args.length; i++) {
			SymbolContext ctx = methodScope.findVar(fnArgs.get(i));
			if(args[i] instanceof SymbolContext) {
				SymbolContext argCtx = (SymbolContext) args[i];
				if(argCtx.getCtxType() != ContextType.NORMAL) {
					ctx.setOther(argCtx.getOther());
				} 
				if(ctx.getCtxType() == ContextType.POINTER) {
					PointerInfo p = (PointerInfo) ctx.getOther();
					if(p == null)
						p = new PointerInfo(ctx.getSymbolType());
					p.setPointee(argCtx);
					ctx.setOther(p);
				}
				ctx.setValue(argCtx.getValue());
			} else {
				if(this.isPointer(ctx)) {
					PointerInfo p = new PointerInfo(ctx.getSymbolType());
					p.setPointsToObj(args[i]);
					ctx.setOther(p);
				}
				methodScope.findVar(fnArgs.get(i)).setValue(args[i]);
			}
		}

		do {
			if(isPlay) {
				pnlParent.changeToInactive();
				stmt = this.labelMap.get(pointer);
				
				this.checkBlockCount(stmt);
				pointerCount = this.evaluate(methodScope, registers, stmt, pointerCount, methodName);
				pointer = ICGenerator.LABEL_ALIAS+pointerCount;
			}
			else {
				pnlParent.changeToActive();
			}
		}while(pnlParent.isRunning() && this.checkEndRun(pointer));
		
		Object value = null;
		if(this.labelMap.containsKey(pointer) && this.labelMap.get(pointer).getType().equals(NodeType.RETURN)) {
			stmt = this.labelMap.get(pointer);
			TACReturnStatement rStmt = (TACReturnStatement) stmt;
			if(rStmt.getExpression() == null)
				value = null;
			else
				value = this.getValue(registers, rStmt.getExpression());
		}
		
		this.returnScope();
		return value;
	}
	
	public void checkBlockCount(TACStatement stmt) {
		if(stmt.getType() == NodeType.VAR_DECLARE) {
			if(listBlockDepth.size() > 0) {
				
				this.listBlockDepth.set(
						this.listBlockDepth.size()-1,
						this.listBlockDepth.get(listBlockDepth.size()-1)+1);
			}
			else {
			
				this.listBlockDepth.add(0);
			}
		}
		else if(stmt.toString().contains("ENTER BLOCK")) { 
			this.listBlockDepth.add(new Integer(0)); // Add new depth
		}
		else if(stmt.toString().contains("EXIT BLOCK")) {
			if(this.listBlockDepth.size() > 0)
				this.listBlockDepth.remove(listBlockDepth.size()-1);
		}
		
	}
	
	public String convertToMethodString(ArrayList<Integer> listDepth) {
		String strMethod = "";
		if(listDepth != null) {
			int size = listDepth.size();
			if(size > 0) {

				for(int i = size-1; i >= 0; i--) {
					strMethod += listDepth.get(0)+"-";
					listDepth.remove(0);
				}
			}
		}
		return strMethod;
	}
	public void filterPrintVarList(ArrayList<VariableNode> listVar, Scope scopeMethod, String methodName, TACStatement stmt) {
		
		if(listVar != null) {
			Set<String> listKeys = scopeMethod.getSymTable().keySet();
			
			for(String key : listKeys) {
				for(VariableNode node : listVar) {
					if(node.getLiteral().trim().equals(key) &&
							methodName.trim().equals(node.getFuncParent().trim()) &&
							node.getCount().trim().equals(this.convertToMethodString(this.listBlockDepth))) {
						node.setValue(scopeMethod.getSymTable().get(key).getValue().toString());
						node.setPrint(true);
					}
					else {
						node.setPrint(false);
					}
				}
			}
		}
	
		pnlParent.printVarList(listVar);
	
	}
	private void enterBlock(Scope methodScope, String label) {
		Scope s = methodScope.findWithLabel(label);
		this.currentScope = s;
		this.prevBlocks.push(s);
	}
	
	private void exitBlock() {
		this.prevBlocks.pop();
		this.currentScope = this.prevBlocks.peek();
	}
	
	private int evaluate(Scope methodScope, HashMap<String, Register> registers, TACStatement statement, int pointerCount, String methodName) {
		filterPrintVarList(this.varList, methodScope, methodName, statement);
		
		if(statement.isBreakpoint()) {
			this.isPlay = false;
		}
		switch (statement.getType()) {
		
		case BLOCK:
			TACBlockStatement bStmt = (TACBlockStatement) statement;
			if(bStmt.isEnter())
				this.enterBlock(methodScope, bStmt.getLabel());
			else
				this.exitBlock();
			
			pointerCount++;
			break;		
		case ARRAY_ASSIGN:
			TACArrayAssignStatement asStmt = (TACArrayAssignStatement) statement;
			
			if(asStmt.getAssignType() == ArrayAssignType.ARRAY_BLOCK) {
				this.setArrayBlockValues(methodScope, registers, asStmt);
			} else if(asStmt.getAssignType() == ArrayAssignType.ARRAY_DIMS) {
				this.setArrayDims(methodScope, registers, asStmt);
			}
				
			pointerCount++;
			break;
		case ARRAY_DIMS:
			TACArrayDimsStatement adStmt = (TACArrayDimsStatement) statement;
			Register r2 = new Register(OperandTypes.REGISTER, adStmt.getOutputRegister().getName());
			r2.setValue(adStmt.getDims());
			registers.put(r2.getName(), r2);
			
			pointerCount++;
			break;
		case ARRAY_BLOCK:
			TACArrayBlockStatement abStmt = (TACArrayBlockStatement) statement;
			Register r1 = new Register(OperandTypes.REGISTER, abStmt.getOutputRegister().getName());
			r1.setValue(abStmt.getArr());
			registers.put(r1.getName(), r1);
			
			pointerCount++;
			break;
		case FUNCTION_INVOKE: 
			TACFuncInvokeStatement stmt = (TACFuncInvokeStatement) statement;
			Register r = new Register(OperandTypes.REGISTER, stmt.getOutputRegister().getName());
			
			Object[] params = new Object[stmt.getParams().size()];
			for(int i = 0; i < stmt.getParams().size(); i++) {
				if(stmt.getParams().get(i) instanceof Variable) {
					Variable var = (Variable) stmt.getParams().get(i);
					SymbolContext ctx = this.currentScope.findVar(var.getAlias());
					params[i] = ctx;
				} else {
					params[i] = this.getValue(registers, stmt.getParams().get(i));
				}
			}
			
			Object value = this.run(stmt.getMethodName(), params); 
			r.setValue(value);
			registers.put(r.getName(), r);
			
			pointerCount++;
			break;
		case ASSIGN:
			TACAssignStatement aStmt = (TACAssignStatement) statement;
			
			if(aStmt.getOperand().getOperandType() == OperandTypes.ARR_ACCESS) {
				ArrayAccess a = (ArrayAccess) aStmt.getOperand();
				SymbolContext sctx = this.currentScope.findVar(a.getAlias());
				ArrayInfo arInf = (ArrayInfo) sctx.getOther();
				
				int[] indeces = new int[arInf.getDims()];
				for(int i = 0; i < indeces.length; i++) {
					indeces[i] = Integer.parseInt(this.getValue(registers, a.getIndeces().get(i)).toString());
				}
				
				arInf.setObject(this.getValue(registers, aStmt.getValue()), indeces);
			} else if(aStmt.getOperand().getOperandType() == OperandTypes.STRUCT_ACCESS) {
				StructAccess s= (StructAccess) aStmt.getOperand();
				SymbolContext sctx = this.currentScope.findVar(s.getAlias());
				StructInfo sInf = (StructInfo) sctx.getOther();
				
				for(int i = 0; i < s.getVars().size(); i++) {
					sctx = sInf.getMember(s.getVars().get(i).getAlias());
				}
				
				sctx.setValue(this.getValue(registers, aStmt.getValue()));
			} else if(aStmt.getOperand().getOperandType() == OperandTypes.VARIABLE) {
				Variable v = (Variable) aStmt.getOperand();
				SymbolContext sctx = this.currentScope.findVar(v.getAlias());
				SymbolContext assignCtx = this.currentScope.findVar(aStmt.getValue().toString());
				
				if(this.isPointer(sctx)) {
					PointerInfo ptrInf = (PointerInfo) sctx.getOther();
					if(assignCtx == null) {
						ptrInf.getPointee().setValue(this.getValue(registers, aStmt.getValue()));
					} else if(this.isPointer(assignCtx)) {
						sctx.setOther(assignCtx.getOther());
					} else {
						ptrInf.setPointee(assignCtx);
						ptrInf.setPointsToCtxType(assignCtx.getCtxType());
						ptrInf.setPointsToType(assignCtx.getSymbolType());
					}
				} else if (this.isArray(sctx) || this.isStruct(sctx)) {
					Object val = this.getValue(registers, aStmt.getValue());
					if(val instanceof SymbolContext) {//this gets the array returned
						this.currentScope.getSymTable().put(v.getAlias(), Cloner.standard().deepClone((SymbolContext)val));
					}
				} else if(assignCtx != null && this.isPointer(assignCtx)) {
					PointerInfo pInfo = (PointerInfo) assignCtx.getOther();
					if(pInfo != null && pInfo.getPointsToObj() != null)
						sctx.setValue(pInfo.getPointsToObj());
				} else
					sctx.setValue(this.getValue(registers, aStmt.getValue()));
				
			}
			pointerCount++;
			break;
		case GOTO:
			TACGotoStatement gStmt = (TACGotoStatement) statement;
			pointerCount = gStmt.getJumpDestInt();
			break;
		case BRANCH:
			TACIfStatement ifStmt = (TACIfStatement) statement;

			if(Boolean.parseBoolean(this.getValue(registers, ifStmt.getOperand()).toString())) {
				pointerCount = ifStmt.getJumpDestTrueInt();
			} else
				pointerCount = ifStmt.getJumpDestFalseInt();
			break;
		case WHILE:
		case DO_WHILE:
		case FOR:
			TACLoopStatement loopStmt = (TACLoopStatement) statement;

			if(Boolean.parseBoolean(this.getValue(registers, loopStmt.getCondition()).toString())) {
				pointerCount = loopStmt.getJumpDestTrueInt();
			} else
				pointerCount = loopStmt.getJumpDestFalseInt();
			break;
		case PRINT:
			TACPrintStatement printStmt = (TACPrintStatement) statement;
			
			if(printStmt.getExpression().getOperandType() == OperandTypes.VARIABLE) {
				Variable v= (Variable) printStmt.getExpression();
				SymbolContext ctx = this.currentScope.findVar(v.getAlias());
				if(ctx.getSymbolType().contains("char")) {
					if(ctx.getValue() instanceof Integer)
						Writer.printText((char)Integer.parseInt(ctx.getValue().toString()));
					else
						Writer.printText((Character) ctx.getValue());
				}else
					Writer.printText(this.getValue(registers, printStmt.getExpression()).toString());
			} else {
				Writer.printText(this.getValue(registers, printStmt.getExpression()).toString());
			}
			pointerCount++;
			break;
		case SCAN:
			TACScanStatement scanStmt = (TACScanStatement) statement;
			SymbolContext ctx = this.currentScope.findVar(scanStmt.getVariable().getAlias());
			Object scanVal = Reader.readInput(ctx.getSymbolType());
			if(scanVal == null)
				this.isRunning = false;
			else {
				ctx.setValue(scanVal);
				pointerCount++;
			}
			break;
		case VAR_DECLARE:
			pointerCount++;
			break;
		default:
			if(statement instanceof TACOutputStatement) {
				switch (statement.getType()) {
				case BIN_ARITHMETIC:
				case BIN_LOGIC: 
					TACBinaryOpStatement binOp = (TACBinaryOpStatement) statement;
					Register rb = binOp.getOutputRegister();
					registers.put(rb.getName(), rb);
					registers.get(rb.getName()).setValue(this.binOpEval(registers, binOp.getOperator(), binOp.getOperand1(), binOp.getOperand2())); 
					break;
				case UNIPRE_ARITHMETIC:
				case UNIPOST_ARITHMETIC:
				case UNI_LOGIC:
					TACUnaryOpStatement unOp = (TACUnaryOpStatement) statement;
					Register rb1 = unOp.getOutputRegister();
					registers.put(rb1.getName(), rb1);
					registers.get(rb1.getName()).setValue(this.unOpEval(registers, unOp.getOperator(), unOp.getOperand1())); break;
				default:
					break;
				}
				
			}
			pointerCount++;
			break;
		}
		return pointerCount;
	}
	
	private void setArrayDims(Scope methodScope, HashMap<String, Register> registers, TACArrayAssignStatement stmt) {
		SymbolContext sctx = methodScope.checkTables(stmt.getArrName());
		ArrayInfo arInf = (ArrayInfo) sctx.getOther();
		Object[] dimVals = (Object[]) this.getValue(registers, stmt.getValue());
		int[] dims = new int[dimVals.length];
		
		for(int i = 0; i < dims.length; i++) {
			dims[i] = Integer.parseInt(this.getValue(registers, (Operand) dimVals[i]).toString());
		}
		
		arInf.initArr(dims);
	}
	
	private void setArrayBlockValues(Scope methodScope, HashMap<String, Register> registers, TACArrayAssignStatement stmt) {
		SymbolContext sctx = methodScope.checkTables(stmt.getArrName());
		ArrayInfo arInf = (ArrayInfo) sctx.getOther();
		Object[] temp = (Object[]) this.getValue(registers, stmt.getValue());
		if(temp.length == 0)
			return;
		Operand toEval = (Operand) temp[0];
		Object[] arr = (Object[]) this.evalBlocks(registers, toEval);
		
		arInf.setArray(arr);
	}
	
	private Object evalBlocks(HashMap<String, Register> registers, Operand block) {
		Object ob = this.getValue(registers, block);
		if(ob instanceof Object[]) {
			Object[] arr = (Object[]) ob;
			Object[] arrToStore = new Object[arr.length];
			for(int i = 0; i < arrToStore.length; i++) {
				arrToStore[i] = this.evalBlocks(registers, (Operand)arr[i]);
			}
			return arrToStore;
		} else {
			return this.getValue(registers, block);
		}
	}
	
	private HashMap<String, TACStatement> addToLabelMap(ArrayList<TACStatement> icode) {
		for (TACStatement tacStatement : icode) {
			this.labelMap.put(tacStatement.getLabel(), tacStatement);
		}
		
		return this.labelMap;
	}
	
	private Object binOpEval(HashMap<String, Register> registers, OPERATOR operator, Operand operand1, Operand operand2) {
		Object op1Value = this.getValue(registers, operand1);
		Object op2Value = this.getValue(registers, operand2);
		
		switch (operator) {
		case ADD: return ExpressionEvaluator.add(op1Value, op2Value);
		case SUB: return ExpressionEvaluator.subtract(op1Value, op2Value);
		case DIV: return ExpressionEvaluator.divide(op1Value, op2Value);
		case MULT: return ExpressionEvaluator.multiply(op1Value, op2Value);
		case MOD: return ExpressionEvaluator.modulo(op1Value, op2Value);
		case LESS: return ExpressionEvaluator.lessThan(op1Value, op2Value);
		case LEQ: return ExpressionEvaluator.lessThanOrEqual(op1Value, op2Value);
		case GREATER: return ExpressionEvaluator.greaterThan(op1Value, op2Value);
		case GEQ: return ExpressionEvaluator.greaterThanOrEqual(op1Value, op2Value);
		case EQUAL: return ExpressionEvaluator.equal(op1Value, op2Value);
		case NEQUAL: return ExpressionEvaluator.notEqual(op1Value, op2Value);
		case AND: return ExpressionEvaluator.and((Boolean)op1Value, (Boolean)op2Value);
		case OR: return ExpressionEvaluator.or((Boolean)op1Value, (Boolean)op2Value);
		default:
			return null;
		}
	}
	
	private Object unOpEval(HashMap<String, Register> registers, OPERATOR operator, Operand operand) {
		Object opValue = this.getValue(registers, operand);
		
		switch (operator) {
		case INC: return ExpressionEvaluator.preInc(opValue);
		case DEC: return ExpressionEvaluator.preDec(opValue);
		case NOT: return ExpressionEvaluator.negate((Boolean)opValue);
		case ADD: return ExpressionEvaluator.positive(opValue);
		case SUB: return ExpressionEvaluator.negate(opValue);
		default:
			return null;
		}
	}
	
	private Object getValue(HashMap<String, Register> registers, Operand operand) {
		switch (operand.getOperandType()) {
		case REGISTER:
			Register r = (Register) operand;
			Object value = registers.get(r.getName()).getValue();

			return value;
		case LITERAL:
			return operand.getValue();
		case VARIABLE:
			Variable v = (Variable) operand;
			SymbolContext ctx = this.currentScope.findVar(v.getAlias());
			if(this.isPointer(ctx)) {
				PointerInfo ptrInf = (PointerInfo) ctx.getOther();
				return ptrInf.getPointee().getValue();
			} else if(this.isArray(ctx)) {
				return ctx;
			} else if(this.isStruct(ctx)) {
				return ctx;
			}
			Object valueClone = Cloner.standard().deepClone(ctx.getValue());
			return valueClone;
		case ARR_ACCESS:
			ArrayAccess a = (ArrayAccess) operand;
			SymbolContext aCtx = this.currentScope.findVar(a.getAlias());
			ArrayInfo arInfo = (ArrayInfo) aCtx.getOther();
			
			int[] indeces = new int[arInfo.getDims()];
			for(int i = 0; i < indeces.length; i++) {
				indeces[i] = Integer.parseInt(this.getValue(registers, a.getIndeces().get(i)).toString());
			}
			
			return arInfo.getObject(indeces);
		case STRUCT_ACCESS:
			StructAccess s = (StructAccess) operand;
			SymbolContext sCtx = this.currentScope.findVar(s.getAlias());
			StructInfo sInfo = (StructInfo) sCtx.getOther();
			
			for(int i = 0; i < s.getVars().size(); i++) {
				sCtx = sInfo.getMember(s.getVars().get(i).getAlias());
			}
			
			return sCtx.getValue();
		default:
			return null;
		}
	}
	public void play() {
        isPlay = true;
    }
	
	private boolean checkEndRun(String pointer) {
		return !this.labelMap.get(pointer).getType().equals(NodeType.FUNCTION_END) 
				&& !this.labelMap.get(pointer).getType().equals(NodeType.FIELD_DEC_END)
				&& !this.labelMap.get(pointer).getType().equals(NodeType.RETURN) 
				&& this.isRunning
				&& Console.instance().errorCount == 0;
	}
	
	private void returnScope() {
		while(this.prevBlocks.peek() != null) {
			this.prevBlocks.pop();
		}
		this.prevBlocks.pop();
		if(!this.prevBlocks.isEmpty())
			this.currentScope = this.prevBlocks.peek();
	}
	
	private boolean isPointer(SymbolContext ctx) {
		return ctx.getCtxType() == ContextType.POINTER;
	}
	
	private boolean isStruct(SymbolContext ctx) {
		return ctx.getCtxType() == ContextType.STRUCT;
	}

	private boolean isArray(SymbolContext ctx) {
		return ctx.getCtxType() == ContextType.ARRAY;
	}
	
	public void pause() {
        isPlay = false;
    }
	
	public void stop() {
		this.isRunning = false;
		this.pnlParent.changeToPlay();
	}
}
