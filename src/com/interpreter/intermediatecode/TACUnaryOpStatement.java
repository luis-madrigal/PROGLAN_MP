package com.interpreter.intermediatecode;

import com.interpreter.AST.LeafNode;
import com.utils.KeyTokens.OPERATOR;

public class TACUnaryOpStatement extends TACOutputStatement {
	
	private OPERATOR operator;
	private String operand1;

	public TACUnaryOpStatement(OPERATOR operator, String operand1) {
		this.operator = operator;
		this.operand1 = operand1;
	}

	public OPERATOR getOperator() {
		return operator;
	}

	public void setOperator(OPERATOR operator) {
		this.operator = operator;
	}

	public String getOperand1() {
		return operand1;
	}

	public void setOperand1(String operand1) {
		this.operand1 = operand1;
	}
	
	public String toString() {
		return super.toString() + this.operator.toString() + " " + this.operand1;
	}

}
