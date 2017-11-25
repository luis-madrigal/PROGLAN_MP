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
import com.interpreter.contexts.MethodContext;
import com.interpreter.contexts.SymbolContext;
import com.interpreter.matchers.LiteralMatcher;
import com.interpreter.modules.ExpressionEvaluator;
import com.interpreter.modules.Reader;
import com.interpreter.modules.Writer;
import com.interpreter.tac.ICGenerator;
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
import com.interpreter.tac.operands.Operand;
import com.interpreter.tac.operands.OperandTypes;
import com.interpreter.tac.operands.Register;
import com.interpreter.tac.operands.Variable;
import com.rits.cloning.Cloner;
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
	private Scope globalScope;
	private Scope methodScope;
	private Scope currentScope;
	private String currentMethod;
	private Stack<Scope> prevBlocks;
	private HashMap<String, MethodContext> methodTable;
<<<<<<< HEAD:src/com/interpreter/codegen/CodeGenerator.java
	private boolean isRunning;
=======
	private HashMap<String, ProcedureNode> methodASTTable;
>>>>>>> DebugThread:src/com/threads/CodeGeneratorRunnable.java
	
//	public CodeGeneratorRunnable(ASTBuildVisitor astbv, HashMap<String, MethodContext> methodTable) {
//		this.astbv = astbv;
//		this.methodTable = methodTable;
//		this.isRunning = true;
//		this.isPlay = true;
//		
//	}
	
	public CodeGeneratorRunnable(ASTBuildVisitor astbv, HashMap<String, MethodContext> methodTable) {
		this.astbv = astbv;
		this.methodASTTable = astbv.getMethodASTTable();
		this.methodTable = methodTable;
		this.isRunning = true;
		this.isPlay = true;
		
		this.methodTable = methodTable;
		this.methodICodes = new HashMap<String, ArrayList<TACStatement>>();
		this.labelMap = new HashMap<String, TACStatement>();
		this.variables = new HashMap<String, Scope>();
		this.registers = new HashMap<String, Register>();
		this.prevBlocks = new Stack<Scope>();
		this.isRunning = true;
		ICGenerator icg = new ICGenerator(methodTable);
		
		Panel.threeACOut.setText("");
		
		for (Map.Entry<String, ProcedureNode> entry : methodASTTable.entrySet()) {
			Panel.threeACOut.setText(Panel.threeACOut.getText() + "ICODE FOR: "+entry.getKey() + "\n");
			
			// System.out.println("GENERATE ICODE FOR: "+entry.getValue().getProcedureName());
			
			this.methodICodes.put(entry.getKey(), icg.generateICode(entry.getValue()));
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
		
		this.globalScope = icg.getGlobalScope();
		
		for(Map.Entry<String, Scope> entry : this.variables.entrySet()) {
			if(entry.getValue() != this.globalScope.getChildren().get(0)) {
				this.globalScope.getChildren().add(entry.getValue());
			}
		}
	}

	
	@Override
	public void run() {
<<<<<<< HEAD:src/com/interpreter/codegen/CodeGenerator.java
//		this.methodScope = this.variables.get(currentMethod);
		this.run("main");
=======
//		CodeGenerator codegen = new CodeGenerator(astbv.getMethodASTTable(), methodTable);
//		codegen.run();
		
		this.currentMethod = "main";
		this.parentScope = this.variables.get(currentMethod);
		this.run(methodICodes.get(currentMethod));
		
//		while(isRunning) {
//			if(isPlay) {
////				// System.out.println("Play");
//				// TODO: Continue per line processing
//			}
//		}
>>>>>>> DebugThread:src/com/threads/CodeGeneratorRunnable.java
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
<<<<<<< HEAD:src/com/interpreter/codegen/CodeGenerator.java
			methodScope.setSymbolContext(fnArgs.get(i), args[i]);
//			System.out.println(args[i]+"--------------");
		}
		do {
			System.out.println(pointer);
			stmt = this.labelMap.get(pointer);
			pointerCount = this.evaluate(methodScope, registers, stmt, pointerCount);
			pointer = ICGenerator.LABEL_ALIAS+pointerCount;
		}while(!this.labelMap.get(pointer).getType().equals(NodeType.FUNCTION_END) && !this.labelMap.get(pointer).getType().equals(NodeType.RETURN) && this.isRunning);
=======
			this.variables.get(currentMethod).findVar(fnArgs.get(i)).setValue(args[i]);

		}
		do {
			if(isPlay) {
				stmt = this.labelMap.get(pointer);
				pointerCount = this.evaluate(stmt, pointerCount);
				pointer = ICGenerator.LABEL_ALIAS+pointerCount;
				
//				if(stmt.isBreakpoint()) {
//					System.out.println("BRK "+	stmt.getType()+": "+stmt.isBreakpoint());
//					this.isPlay = false;
//				}
			}
		}while(isRunning && this.labelMap.containsKey(pointer) && !this.labelMap.get(pointer).getType().equals(NodeType.RETURN));
>>>>>>> DebugThread:src/com/threads/CodeGeneratorRunnable.java
		
		while(this.prevBlocks.peek() != null) {
			this.prevBlocks.pop();
		}
		this.prevBlocks.pop();
		if(!this.prevBlocks.isEmpty())
			this.currentScope = this.prevBlocks.peek();
		
//		if(stmt.getType().equals(NodeType.RETURN)) {
		if(this.labelMap.containsKey(pointer) && this.labelMap.get(pointer).getType().equals(NodeType.RETURN)) {
			stmt = this.labelMap.get(pointer);
			TACReturnStatement rStmt = (TACReturnStatement) stmt;
			System.out.println("RETURN: "+this.getValue(registers, rStmt.getExpression()));
			return this.getValue(registers, rStmt.getExpression());
		} else
			return null;
	}
	
	private void enterBlock(Scope methodScope, String label) {
		Scope s = methodScope.findWithLabel(label);
		this.currentScope = s;
		this.prevBlocks.push(s);
	}
	
	private void exitBlock() {
		this.currentScope = this.prevBlocks.pop();
	}
	
	private int evaluate(Scope methodScope, HashMap<String, Register> registers, TACStatement statement, int pointerCount) {
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
		case FUNCTION_INVOKE: 
			TACFuncInvokeStatement stmt = (TACFuncInvokeStatement) statement;
//			this.currentMethod = stmt.getMethodName();
//			this.methodScope = this.variables.get(currentMethod).clone();
			Register r = new Register(OperandTypes.REGISTER, stmt.getOutputRegister().getName());
			
			Object[] params = new Object[stmt.getParams().size()];
			for(int i = 0; i < stmt.getParams().size(); i++) {
				params[i] = this.getValue(registers, stmt.getParams().get(i));
			}
			
			Object value = this.run(stmt.getMethodName(), params); 
//			System.out.println(value);
			r.setValue(value);
<<<<<<< HEAD:src/com/interpreter/codegen/CodeGenerator.java
			registers.put(r.getName(), r);
=======
			this.registers.put(r.getName(), r);
			
			if(stmt.isBreakpoint()) {
				System.out.println("BRK "+	stmt.getType()+": "+stmt.isBreakpoint());
				this.isPlay = false;
			}
			
>>>>>>> DebugThread:src/com/threads/CodeGeneratorRunnable.java
			pointerCount++;
			break;
		case ASSIGN:
			TACAssignStatement aStmt = (TACAssignStatement) statement;
<<<<<<< HEAD:src/com/interpreter/codegen/CodeGenerator.java
			this.currentScope.findVar(aStmt.getVariable().getAlias()).setValue(this.getValue(registers, aStmt.getValue()));
=======
			this.currentScope.findVar(aStmt.getVariable().getAlias()).setValue(this.getValue(aStmt.getValue()));
			
			if(aStmt.isBreakpoint()) {
				System.out.println("BRK "+	aStmt.getType()+": "+aStmt.isBreakpoint());
				this.isPlay = false;
			}
>>>>>>> DebugThread:src/com/threads/CodeGeneratorRunnable.java
			pointerCount++;
			break;
		case GOTO:
			TACGotoStatement gStmt = (TACGotoStatement) statement;
			pointerCount = gStmt.getJumpDestInt();
			break;
		case BRANCH:
			TACIfStatement ifStmt = (TACIfStatement) statement;
<<<<<<< HEAD:src/com/interpreter/codegen/CodeGenerator.java
//			System.out.println("==="+Boolean.parseBoolean(this.getValue(ifStmt.getOperand()).toString()));
			if(Boolean.parseBoolean(this.getValue(registers, ifStmt.getOperand()).toString())) {
=======
			// System.out.println("==="+Boolean.parseBoolean(this.getValue(ifStmt.getOperand()).toString()));
			if(Boolean.parseBoolean(this.getValue(ifStmt.getOperand()).toString())) {
>>>>>>> DebugThread:src/com/threads/CodeGeneratorRunnable.java
				pointerCount = ifStmt.getJumpDestTrueInt();
			} else
				pointerCount = ifStmt.getJumpDestFalseInt();
			break;
		case WHILE:
		case DO_WHILE:
		case FOR:
			TACLoopStatement loopStmt = (TACLoopStatement) statement;
<<<<<<< HEAD:src/com/interpreter/codegen/CodeGenerator.java
			System.out.println(loopStmt.getCondition().toString());
			if(Boolean.parseBoolean(this.getValue(registers, loopStmt.getCondition()).toString())) {
=======
			// System.out.println(loopStmt.getCondition().toString());
			if(Boolean.parseBoolean(this.getValue(loopStmt.getCondition()).toString())) {
>>>>>>> DebugThread:src/com/threads/CodeGeneratorRunnable.java
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
<<<<<<< HEAD:src/com/interpreter/codegen/CodeGenerator.java
			Writer.printText(this.getValue(registers, printStmt.getExpression()).toString());
=======
			Writer.printText(this.getValue(printStmt.getExpression()).toString());
			
			if(printStmt.isBreakpoint()) {
				System.out.println("BRK "+	printStmt.getType()+": "+printStmt.isBreakpoint());
				this.isPlay = false;
			}
>>>>>>> DebugThread:src/com/threads/CodeGeneratorRunnable.java
			pointerCount++;
			break;
		case SCAN:
			TACScanStatement scanStmt = (TACScanStatement) statement;
<<<<<<< HEAD:src/com/interpreter/codegen/CodeGenerator.java
			SymbolContext ctx = this.currentScope.findVar(scanStmt.getVariable());
			Object scanVal = Reader.readInput(ctx.getSymbolType());
			if(scanVal == null)
				this.isRunning = false;
			else {
				ctx.setValue(scanVal);
				pointerCount++;
			}
=======
			Object scanVal = Reader.readInput();
			this.currentScope.findVar(scanStmt.getVariable()).setValue(LiteralMatcher.instance().parseAttempt(scanVal));
			
			if(scanStmt.isBreakpoint()) {
				System.out.println("BRK "+	scanStmt.getType()+": "+scanStmt.isBreakpoint());
				this.isPlay = false;
			}
			pointerCount++;
>>>>>>> DebugThread:src/com/threads/CodeGeneratorRunnable.java
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
					Register rb = ((TACOutputStatement) statement).getOutputRegister();
					registers.put(rb.getName(), rb);
					registers.get(rb.getName()).setValue(this.binOpEval(registers, binOp.getOperator(), binOp.getOperand1(), binOp.getOperand2())); 
					System.out.println(registers.get(rb.getName()).getValue());break;
				case UNIPRE_ARITHMETIC:
				case UNIPOST_ARITHMETIC:
				case UNI_LOGIC:
					TACUnaryOpStatement unOp = (TACUnaryOpStatement) statement;
					Register rb1 = ((TACOutputStatement) statement).getOutputRegister();
					registers.put(rb1.getName(), rb1);
					registers.get(rb1.getName()).setValue(this.unOpEval(registers, unOp.getOperator(), unOp.getOperand1())); break;
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
	
	
	private HashMap<String, TACStatement> addToLabelMap(ArrayList<TACStatement> icode) {
		for (TACStatement tacStatement : icode) {
			this.labelMap.put(tacStatement.getLabel(), tacStatement);
		}
		
		return this.labelMap;
	}
	
	private Object binOpEval(HashMap<String, Register> registers, OPERATOR operator, Operand operand1, Operand operand2) {
		Object op1Value = this.getValue(registers, operand1);
		Object op2Value = this.getValue(registers, operand2);
		
//		// System.out.println(op1Value + " " + operator.toString() + " " +op2Value);

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
<<<<<<< HEAD:src/com/interpreter/codegen/CodeGenerator.java
//			System.out.println(this.registers.containsKey(r.getName()));
//			System.out.println("+++++++++++++++"+this.registers.get(r.getName()).getValue());
			return registers.get(r.getName()).getValue();
=======
//			// System.out.println(this.registers.containsKey(r.getName()));
			// System.out.println("+++++++++++++++"+this.registers.get(r.getName()).getValue());
			return this.registers.get(r.getName()).getValue();
>>>>>>> DebugThread:src/com/threads/CodeGeneratorRunnable.java
		case LITERAL:
			return operand.getValue();
		case VARIABLE:
			Variable v = (Variable) operand;
<<<<<<< HEAD:src/com/interpreter/codegen/CodeGenerator.java
//			System.out.println(v.getAlias());
//			System.out.println("asfbiafbakdbfkshds" + (this.currentScope.findVar(v.getAlias()) == this.testctx));
//			System.out.println(this.currentScope.findVar(v.getAlias()).getValue());
=======
			// System.out.println(v.getAlias());
>>>>>>> DebugThread:src/com/threads/CodeGeneratorRunnable.java
			return this.currentScope.findVar(v.getAlias()).getValue();
		default:
			return null;
		}
	}
	public void play() {
        isPlay = true;
    }
	
<<<<<<< HEAD:src/com/interpreter/codegen/CodeGenerator.java
=======
	public void pause() {
        isPlay = false;
    }
	
	public void stop() {
		this.isRunning = false;
		System.out.println("Stop");
	}
>>>>>>> DebugThread:src/com/threads/CodeGeneratorRunnable.java
}
