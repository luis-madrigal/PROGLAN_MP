package com.interpreter.tac;

import com.utils.KeyTokens.OPERATOR;

public class TACIfStatement extends TACStatement{
	private String condition;
	private String jumpDestTrue;
	private String jumpDestFalse;

	public TACIfStatement(String operand) {
		this.condition = operand;
	}

	public String getOperand() {
		return condition;
	}

	public void setOperand(String operand) {
		this.condition = operand;
	}

	public String getJumpDestTrue() {
		return jumpDestTrue;
	}

	public void setJumpDestTrue(String jumpDestTrue) {
		this.jumpDestTrue = jumpDestTrue;
	}

	public String getJumpDestFalse() {
		return jumpDestFalse;
	}

	public void setJumpDestFalse(String jumpDestFalse) {
		this.jumpDestFalse = jumpDestFalse;
	}
	
	public String toString() {
		return this.getLabel() + ": if "+ this.condition + " goto " + this.jumpDestTrue + " else goto " + this.jumpDestFalse;
	}
	
}
