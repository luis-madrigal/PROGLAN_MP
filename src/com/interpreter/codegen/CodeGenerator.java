package com.interpreter.codegen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import com.ide.Panel;
import com.interpreter.Scope;
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
import com.utils.KeyTokens.OPERATOR;

public class CodeGenerator {
	
	private HashMap<String, ArrayList<TACStatement>> methodICodes;
	private HashMap<String, TACStatement> labelMap;
	private HashMap<String, Register> registers;
	private HashMap<String, Scope> variables;
	private Scope parentScope;
	private Scope currentScope;
	private String currentMethod;
	private Stack<Scope> prevBlocks;
	
	public CodeGenerator(HashMap<String, ProcedureNode> methodASTTable, HashMap<String, MethodContext> methodTable) {
		this.methodICodes = new HashMap<String, ArrayList<TACStatement>>();
		this.labelMap = new HashMap<String, TACStatement>();
		this.variables = new HashMap<String, Scope>();
		this.registers = new HashMap<String, Register>();
		this.prevBlocks = new Stack<Scope>();
		ICGenerator icg = new ICGenerator(methodTable);
		
		for (Map.Entry<String, ProcedureNode> entry : methodASTTable.entrySet()) {
			Panel.threeACOut.setText(Panel.threeACOut.getText() + "ICODE FOR: "+entry.getKey() + "\n");
//			System.out.println("GENERATE ICODE FOR: "+entry.getKey());
			
			this.methodICodes.put(entry.getKey(), icg.generateICode(entry.getValue()));
			this.variables.put(entry.getKey(), icg.getScope());
			this.addToLabelMap(this.methodICodes.get(entry.getKey()));
			icg.print();
		}
		
	}
	
	public void run() {
		this.currentMethod = "main";
		this.parentScope = this.variables.get(currentMethod);
		System.out.println(parentScope);
		this.run(methodICodes.get(currentMethod));
	}
	
	private Object run(ArrayList<TACStatement> icode, Operand ...args) {//TODO: store the arguments in variables
		String pointer = icode.get(0).getLabel();
		int pointerCount = Integer.parseInt(icode.get(0).getLabel().substring(1));
		TACStatement stmt = null;
		
		while(!this.labelMap.get(pointer).getType().equals(NodeType.RETURN) || this.labelMap.containsKey(pointer)) {
			System.out.println(pointer);
			stmt = this.labelMap.get(pointer);
			pointerCount = this.evaluate(stmt, pointerCount);
			pointer = ICGenerator.LABEL_ALIAS+pointerCount;
		}
		
		if(stmt.getType().equals(NodeType.RETURN)) {
			TACReturnStatement rStmt = (TACReturnStatement) stmt;
			return this.getValue(rStmt.getExpression());
		} else
			return null;
	}
	
	private void enterBlock(String label) {
		Scope s = this.parentScope.findWithLabel(label);
		this.currentScope = s;
		this.prevBlocks.push(s);
	}
	
	private void exitBlock() {
		this.currentScope = this.prevBlocks.pop();
	}
	
	private int evaluate(TACStatement statement, int pointerCount) {
		switch (statement.getType()) {
		case BLOCK:
			TACBlockStatement bStmt = (TACBlockStatement) statement;
			if(bStmt.isEnter())
				this.enterBlock(bStmt.getLabel());
			else
				this.exitBlock();
			pointerCount++;
			break;			
		case FUNCTION_INVOKE: 
			TACFuncInvokeStatement stmt = (TACFuncInvokeStatement) statement;
			this.currentMethod = stmt.getMethodName();
			this.parentScope = this.variables.get(currentMethod);
			Register r = new Register(OperandTypes.REGISTER, stmt.getOutputRegister().getName());
			Object value = this.run(this.methodICodes.get(stmt.getMethodName()), stmt.getParams().toArray(new Operand[stmt.getParams().size()])); 
			r.setValue(value);
			this.registers.put(r.getName(), r);
			pointerCount++;
			break;
		case ASSIGN:
			TACAssignStatement aStmt = (TACAssignStatement) statement;
			this.currentScope.findVar(aStmt.getVariable().getAlias()).setValue(this.getValue(aStmt.getValue()));
			pointerCount++;
			break;
		case GOTO:
			TACGotoStatement gStmt = (TACGotoStatement) statement;
			pointerCount = gStmt.getJumpDestInt();
			break;
		case BRANCH:
			TACIfStatement ifStmt = (TACIfStatement) statement;
			if(Boolean.parseBoolean(this.getValue(ifStmt.getOperand()).toString())) {
				pointerCount = ifStmt.getJumpDestTrueInt();
			} else
				pointerCount = ifStmt.getJumpDestFalseInt();
			break;
		case WHILE:
		case DO_WHILE:
		case FOR:
			TACLoopStatement loopStmt = (TACLoopStatement) statement;
			System.out.println(loopStmt.getCondition().toString());
			if(Boolean.parseBoolean(this.getValue(loopStmt.getCondition()).toString())) {
				pointerCount = loopStmt.getJumpDestTrueInt();
			} else
				pointerCount = loopStmt.getJumpDestFalseInt();
			break;
		case PRINT:
			TACPrintStatement printStmt = (TACPrintStatement) statement;
			Writer.printText(this.getValue(printStmt.getExpression()).toString());
			pointerCount++;
			break;
		case SCAN:
			TACScanStatement scanStmt = (TACScanStatement) statement;
			Object scanVal = Reader.readInput();
			this.currentScope.findVar(scanStmt.getVariable()).setValue(LiteralMatcher.instance().parseAttempt(scanVal));
			pointerCount++;
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
					this.registers.put(rb.getName(), rb);
					this.registers.get(rb.getName()).setValue(this.binOpEval(binOp.getOperator(), binOp.getOperand1(), binOp.getOperand2())); break;
				case UNIPRE_ARITHMETIC:
				case UNIPOST_ARITHMETIC:
				case UNI_LOGIC:
					TACUnaryOpStatement unOp = (TACUnaryOpStatement) statement;
					Register rb1 = ((TACOutputStatement) statement).getOutputRegister();
					this.registers.put(rb1.getName(), rb1);
					this.registers.get(rb1.getName()).setValue(this.unOpEval(unOp.getOperator(), unOp.getOperand1())); break;
				default:
					break;
				}
				
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
	
	private Object binOpEval(OPERATOR operator, Operand operand1, Operand operand2) {
		Object op1Value = this.getValue(operand1);
		Object op2Value = this.getValue(operand2);
		
		System.out.println(op1Value + " " + operator.toString() + " " +op2Value);
		
		switch (operator) {
		case ADD: return ExpressionEvaluator.add(op1Value, op2Value);
		case SUB: return ExpressionEvaluator.subtract(op1Value, op2Value);
		case DIV: return ExpressionEvaluator.divide(op1Value, op2Value);
		case MULT: return ExpressionEvaluator.multiply(op1Value, op2Value);
		case LESS: return ExpressionEvaluator.lessThan(op1Value, op2Value);
		case LEQ: return ExpressionEvaluator.lessThanOrEqual(op1Value, op2Value);
		case GREATER: return ExpressionEvaluator.greaterThan(op1Value, op2Value);
		case GEQ: return ExpressionEvaluator.greaterThanOrEqual(op1Value, op2Value);
		case EQUAL: return ExpressionEvaluator.equal((Boolean)op1Value, (Boolean)op2Value);
		case NEQUAL: return ExpressionEvaluator.notEqual((Boolean)op1Value, (Boolean)op2Value);
		case AND: return ExpressionEvaluator.and((Boolean)op1Value, (Boolean)op2Value);
		case OR: return ExpressionEvaluator.or((Boolean)op1Value, (Boolean)op2Value);
		default:
			return null;
		}
	}
	
	private Object unOpEval(OPERATOR operator, Operand operand) {
		Object opValue = this.getValue(operand);
		
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
	
	private Object getValue(Operand operand) {
		switch (operand.getOperandType()) {
		case REGISTER:
			System.out.println("in reg");
			Register r = (Register) operand;
			System.out.println(this.registers.containsKey(r.getName()));
			return this.registers.get(r.getName()).getValue();
		case LITERAL:
			return operand.getValue();
		case VARIABLE:
			Variable v = (Variable) operand;
			return this.currentScope.findVar(v.getAlias()).getValue();
		default:
			return null;
		}
	}
	
//	private void setValue(Operand operand) {
//		switch (operand.getOperandType()) {
//		case REGISTER:
//			Register r = (Register) operand;
//			this.registers.put(r.getName(), r);
//		case LITERAL:
//			return operand.getValue();
//		case VARIABLE:
//			Variable v = (Variable) operand;
//			return this.currentScope.findVar(v.getAlias());
//		default:
//			return null;
//		}
//	}
}
