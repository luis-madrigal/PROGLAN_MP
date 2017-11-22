package com.interpreter.tac;

import com.interpreter.AST.NodeType;
import com.interpreter.tac.operands.Operand;

public class TACIfStatement extends TACStatement{
	private Operand condition;
	private String jumpDestTrue;
	private String jumpDestFalse;

	public TACIfStatement(NodeType type, Operand operand) {
		super(type);
		this.condition = operand;
	}

	public Operand getOperand() {
		return condition;
	}

	public void setOperand(Operand operand) {
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
		return this.getLabel() + ": if "+ this.condition.toString() + " goto " + this.jumpDestTrue + " else goto " + this.jumpDestFalse;
	}
	
}
