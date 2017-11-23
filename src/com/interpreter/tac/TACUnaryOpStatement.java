package com.interpreter.tac;

import com.interpreter.AST.NodeType;
import com.interpreter.tac.operands.Operand;
import com.utils.KeyTokens.OPERATOR;

public class TACUnaryOpStatement extends TACOutputStatement {
	
	private OPERATOR operator;
	private Operand operand1;

	public TACUnaryOpStatement(NodeType type, OPERATOR operator, Operand operand1) {
		super(type);
		this.operator = operator;
		this.operand1 = operand1;
	}

	public OPERATOR getOperator() {
		return operator;
	}

	public void setOperator(OPERATOR operator) {
		this.operator = operator;
	}

	public Operand getOperand1() {
		return operand1;
	}

	public void setOperand1(Operand operand1) {
		this.operand1 = operand1;
	}
	
	public String toString() {
		return super.toString() + this.operator.toString() + " " + this.operand1.toString();
	}

}
