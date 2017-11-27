package com.threads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import com.ide.Panel;
import com.interpreter.Scope;
import com.interpreter.AST.ASTBuildVisitor;
import com.interpreter.AST.NodeType;
import com.interpreter.AST.ProcedureNode;
import com.interpreter.contexts.ArrayInfo;
import com.interpreter.contexts.ContextType;
import com.interpreter.contexts.MethodContext;
import com.interpreter.contexts.PointerInfo;
import com.interpreter.contexts.SymbolContext;
import com.interpreter.matchers.LiteralMatcher;
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
import com.interpreter.tac.TACIndexingStatement;
import com.interpreter.tac.TACLoopStatement;
import com.interpreter.tac.TACOutputStatement;
import com.interpreter.tac.TACPrintStatement;
import com.interpreter.tac.TACReturnStatement;
import com.interpreter.tac.TACScanStatement;
import com.interpreter.tac.TACStatement;
import com.interpreter.tac.TACUnaryOpStatement;
import com.interpreter.tac.operands.Operand;
import com.interpreter.tac.operands.OperandTypes;
import com.interpreter.tac.operands.Register;
import com.interpreter.tac.operands.Variable;
import com.rits.cloning.Cloner;
import com.utils.Console;
import com.utils.KeyTokens.LITERAL_TYPE;
import com.utils.KeyTokens.OPERATOR;

public class CodeGeneratorRunnable implements Runnable {
	private ASTBuildVisitor astbv;
	private volatile boolean isRunning;
	volatile boolean isPlay = false;

	private HashMap<String, ArrayList<TACStatement>> methodICodes;
	private HashMap<String, TACStatement> labelMap;
	private HashMap<String, Register> registers;
	private HashMap<String, Scope> variables;
	private Scope parentScope;
	private Scope globalScope;
	private Scope currentScope;
	private Stack<Scope> prevBlocks;
	private HashMap<String, MethodContext> methodTable;
	private HashMap<String, ProcedureNode> methodASTTable;
	private Panel pnlParent;
	public CodeGeneratorRunnable(Panel pnlParent, ASTBuildVisitor astbv, HashMap<String, MethodContext> methodTable) {
		this.astbv = astbv;
		this.methodASTTable = astbv.getMethodASTTable();
		this.methodTable = methodTable;
		this.isRunning = true;
		this.isPlay = true;
		this.pnlParent = pnlParent;
		
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
	//			System.out.println("GENERATE ICODE FOR: "+entry.getKey());
				
				this.methodICodes.put(entry.getKey(), icg.generateICode(entry.getValue(), false));
				this.variables.put(entry.getKey(), icg.getScope());
				this.addToLabelMap(this.methodICodes.get(entry.getKey()));
				icg.print();
				
				ArrayList<String> args = methodTable.get(entry.getKey()).getArgs();
				ArrayList<String> argTypes = methodTable.get(entry.getKey()).getArgTypes();
				for(int i = 0; i < args.size(); i++) {
	//				System.out.println(this.variables.get(entry.getKey()).getSymTable().containsKey(args.get(i)));
					this.variables.get(entry.getKey()).addToScope(new SymbolContext(argTypes.get(i), icg.getGlobalScope(), args.get(i)));
				}
			}
		}
//		this.globalScope = icg.getGlobalScope();
		
		
		for(Map.Entry<String, Scope> entry : this.variables.entrySet()) {
//			if(entry.getValue() != this.globalScope.getChildren().get(0)) {
				this.globalScope.getChildren().add(entry.getValue());
				entry.getValue().setParent(this.globalScope);
//			}
		}
	}

	
	@Override
	public void run() {
		this.pnlParent.changeToPause();
//		this.methodScope = this.variables.get(currentMethod);
		ArrayList<TACStatement> icode = this.methodICodes.get("%FIELD");
		String pointer = icode.get(0).getLabel();
		int pointerCount = Integer.parseInt(icode.get(0).getLabel().substring(1));
		HashMap<String, Register> registers = Cloner.standard().deepClone(this.registers);
		TACStatement stmt = null;
		
		do {
			System.out.println(pointer);
			stmt = this.labelMap.get(pointer);
			pointerCount = this.evaluate(this.globalScope, registers, stmt, pointerCount);
			pointer = ICGenerator.LABEL_ALIAS+pointerCount;
		}while(this.checkEndRun(pointer));
		
		System.out.println("+++++++++++ RUN MAIN");
		System.out.println(this.run("main"));
		
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
//		System.out.println(currentMethod);
		
		ArrayList<String> fnArgs = this.methodTable.get(methodName).getArgs();
		for(int i = 0; i < args.length; i++) {
			if(args[i] instanceof SymbolContext) {
				SymbolContext argCtx = (SymbolContext) args[i];
				SymbolContext ctx = methodScope.findVar(fnArgs.get(i));
				if(argCtx.getCtxType() != ContextType.NORMAL) {
					ctx.setOther(argCtx.getOther());
				} 
				ctx.setValue(argCtx.getValue());
			} else {
				methodScope.findVar(fnArgs.get(i)).setValue(args[i]);
			}
		}

//		Panel.printWatch(methodScope.getSymTable().get("solanaceae").getValue().toString());
//		Panel.printWatch(methodScope.getSymTable().keySet().toString());
		
//		System.out.println("METHSCOP "+methodScope.printString());
		do {
			if(isPlay) {
				pnlParent.changeToInactive();
				stmt = this.labelMap.get(pointer);
				// TODO
//				Panel.printWatch("evaluating: "+pointer);
				pointerCount = this.evaluate(methodScope, registers, stmt, pointerCount);
				pointer = ICGenerator.LABEL_ALIAS+pointerCount;
				
//				if(stmt.isBreakpoint()) {
//					System.out.println("BRK "+	stmt.getType()+": "+stmt.isBreakpoint());
//					this.isPlay = false;
//				}
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
			System.out.println("RETURN: "+value);
		}
		
		this.returnScope();
		return value;
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
	
	private int evaluate(Scope methodScope, HashMap<String, Register> registers, TACStatement statement, int pointerCount) {
		// TODO
//		Panel.printWatch("P"+pointerCount+"    "+methodScope.getSymTable().keySet().toString());
//		Panel.printWatch(statement+"");
		
		switch (statement.getType()) {
		
		case BLOCK:
			TACBlockStatement bStmt = (TACBlockStatement) statement;
			if(bStmt.isEnter())
				this.enterBlock(methodScope, bStmt.getLabel());
			else
				this.exitBlock();
			
			if(bStmt.isBreakpoint()) {
				System.out.println("BRK "+	bStmt.getType()+": "+bStmt.isBreakpoint());
				this.isPlay = false;
			}
			
			pointerCount++;
			break;		
		case ARRAY_ASSIGN:
			TACArrayAssignStatement asStmt = (TACArrayAssignStatement) statement;
			if(this.labelMap.containsKey(ICGenerator.LABEL_ALIAS+(pointerCount-1))
					&& this.labelMap.get(ICGenerator.LABEL_ALIAS+(pointerCount-1)).getType() == NodeType.ARRAY_BLOCK) {
				System.out.println("ARRAY BLOCK");
				this.setArrayBlockValues(methodScope, registers, asStmt);
			}
			else {
				System.out.println("ARRAY DIMS");
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
			System.out.println(r1.getName()+"=================");
			
			pointerCount++;
			break;
		case FUNCTION_INVOKE: 
			TACFuncInvokeStatement stmt = (TACFuncInvokeStatement) statement;
//			this.currentMethod = stmt.getMethodName();
//			this.methodScope = this.variables.get(currentMethod).clone();
			Register r = new Register(OperandTypes.REGISTER, stmt.getOutputRegister().getName());
			
			Object[] params = new Object[stmt.getParams().size()];
			for(int i = 0; i < stmt.getParams().size(); i++) {
				if(stmt.getParams().get(i) instanceof Variable) {
					Variable var = (Variable) stmt.getParams().get(i);
					SymbolContext ctx = this.currentScope.findVar(var.getAlias());
					if(this.isPointer(ctx) || this.isStruct(ctx) || this.isArray(ctx))
						params[i] = Cloner.standard().deepClone(ctx);
					else
						params[i] = this.getValue(registers, stmt.getParams().get(i));
				} else {
					params[i] = this.getValue(registers, stmt.getParams().get(i));
				}
			}
			
			Object value = this.run(stmt.getMethodName(), params); 
//			System.out.println(value);
			r.setValue(value);
			registers.put(r.getName(), r);
			
			if(stmt.isBreakpoint()) {
				System.out.println("BRK "+	stmt.getType()+": "+stmt.isBreakpoint());
				this.isPlay = false;
			}
			
			pointerCount++;
			break;
		case ASSIGN:
			TACAssignStatement aStmt = (TACAssignStatement) statement;
			SymbolContext sctx = this.currentScope.findVar(aStmt.getVariable().getAlias());
			
			//if its type is a pointer TODO: also include for structs and arrays
			if(this.isPointer(sctx)) {
				PointerInfo ptrInf = (PointerInfo) sctx.getOther();
				if(aStmt.getValue().getOperandType() == OperandTypes.VARIABLE) { //pointer assigned should be variable
					System.out.println("POINTER ASSIGN: "+aStmt.getValue().toString());
					SymbolContext assignCtx = this.currentScope.findVar(aStmt.getValue().toString());
					if(this.isPointer(assignCtx)) {
						sctx.setOther(assignCtx.getOther());
					} else {
						ptrInf.setPointee(assignCtx);
						ptrInf.setPointsToCtxType(assignCtx.getCtxType());
						ptrInf.setPointsToType(assignCtx.getSymbolType());
					}
					
				}
//				sctx.setValue(this.getValue(registers, aStmt.getValue()));
			} else {
				sctx.setValue(this.getValue(registers, aStmt.getValue()));
			}

//			this.currentScope.findVar(aStmt.getVariable().getAlias()).setValue(this.getValue(registers, aStmt.getValue()));
			
			if(aStmt.isBreakpoint()) {
				System.out.println("BRK "+	aStmt.getType()+": "+aStmt.isBreakpoint());
				this.isPlay = false;
			}
			pointerCount++;
			break;
		case GOTO:
			TACGotoStatement gStmt = (TACGotoStatement) statement;
			pointerCount = gStmt.getJumpDestInt();
			break;
		case BRANCH:
			TACIfStatement ifStmt = (TACIfStatement) statement;

			// System.out.println("==="+Boolean.parseBoolean(this.getValue(ifStmt.getOperand()).toString()));
			if(Boolean.parseBoolean(this.getValue(registers, ifStmt.getOperand()).toString())) {
				pointerCount = ifStmt.getJumpDestTrueInt();
			} else
				pointerCount = ifStmt.getJumpDestFalseInt();
			break;
		case WHILE:
		case DO_WHILE:
		case FOR:
			TACLoopStatement loopStmt = (TACLoopStatement) statement;

			// System.out.println(loopStmt.getCondition().toString());
			if(Boolean.parseBoolean(this.getValue(registers, loopStmt.getCondition()).toString())) {
				pointerCount = loopStmt.getJumpDestTrueInt();
			} else
				pointerCount = loopStmt.getJumpDestFalseInt();
			
			if(loopStmt.isBreakpoint()) {
				System.out.println("BRK "+	loopStmt.getType()+": "+loopStmt.isBreakpoint());
				this.isPlay = false;
			}
			break;
		case PRINT:
			TACPrintStatement printStmt = (TACPrintStatement) statement;

			Writer.printText(this.getValue(registers, printStmt.getExpression()).toString());
			
			if(printStmt.isBreakpoint()) {
				System.out.println("BRK "+	printStmt.getType()+": "+printStmt.isBreakpoint());
				this.isPlay = false;
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
				if(scanStmt.isBreakpoint()) {
					System.out.println("BRK "+	scanStmt.getType()+": "+scanStmt.isBreakpoint());
					this.isPlay = false;
				}
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
					System.out.println(registers.get(rb.getName()).getValue());break;
				case UNIPRE_ARITHMETIC:
				case UNIPOST_ARITHMETIC:
				case UNI_LOGIC:
					TACUnaryOpStatement unOp = (TACUnaryOpStatement) statement;
					Register rb1 = unOp.getOutputRegister();
					registers.put(rb1.getName(), rb1);
					registers.get(rb1.getName()).setValue(this.unOpEval(registers, unOp.getOperator(), unOp.getOperand1())); break;
				case ARRAY_ACCESS:
					TACIndexingStatement iOp = (TACIndexingStatement) statement;
					Register rb2 = iOp.getOutputRegister();
					SymbolContext iCtx = this.currentScope.findVar(iOp.getArrayName());
					ArrayInfo info = (ArrayInfo) iCtx.getOther();
					
					registers.put(rb2.getName(), rb2);
					registers.get(rb2.getName()).setValue(info.getObject(Integer.parseInt(this.getValue(registers, iOp.getIndex()).toString())));
					pointerCount++;
					break;
				default:
					break;
				}
				
			}
			
			if(statement.isBreakpoint()) {
				System.out.println("BRK "+	statement.getType()+": "+statement.isBreakpoint());
				this.isPlay = false;
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
		
		System.out.println(op1Value + " " + operator.toString() + " " +op2Value);

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
			if(value instanceof Variable) {
				SymbolContext sctx = this.currentScope.findVar(r.getName());
				if(this.isPointer(sctx)) {//if pointer
					PointerInfo ptrInf = (PointerInfo) sctx.getOther();
					return ptrInf.getPointee().getValue();
				} else if(this.isArray(sctx)) {//if array
					return sctx;
				} else if(this.isStruct(sctx)) {
					return sctx;
				}
			}
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
		System.out.println("Stop");
		this.pnlParent.changeToPlay();
	}
}
