package com.interpreter.tac;

import com.interpreter.AST.NodeType;
import com.interpreter.modules.ExpressionEvaluator;
import com.interpreter.tac.operands.Operand;
import com.utils.KeyTokens.OPERATOR;

public class TACBinaryOpStatement extends TACOutputStatement{
	
	private OPERATOR operator;
	private Operand output;
	private Operand operand1;
	private Operand operand2;
	
	public TACBinaryOpStatement(NodeType type, OPERATOR operator, Operand operand1, Operand operand2, boolean isBreakpoint) {
		super(type, isBreakpoint);
		this.operator = operator;
		this.operand1 = operand1;
		this.operand2 = operand2;
		this.output = null;
	}
	
	public String toString() {
		return super.toString() + this.operand1.toString() + " " + this.operator.toString() + " " + this.operand2.toString();
	}

	public OPERATOR getOperator() {
		return operator;
	}

	public void setOperator(OPERATOR operator) {
		this.operator = operator;
	}

	public Operand getOutput() {
		return output;
	}

	public void setOutput(Operand output) {
		this.output = output;
	}

	public Operand getOperand1() {
		return operand1;
	}

	public void setOperand1(Operand operand1) {
		this.operand1 = operand1;
	}

	public Operand getOperand2() {
		return operand2;
	}

	public void setOperand2(Operand operand2) {
		this.operand2 = operand2;
	}
}
