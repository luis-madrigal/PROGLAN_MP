package com.interpreter.tac;

import com.interpreter.AST.NodeType;
import com.interpreter.tac.operands.Operand;

public class TACLoopStatement extends TACStatement{
	
	private String jumpDestTrue;
	private String jumpDestFalse;
	private Operand condition;
	public TACLoopStatement(NodeType type, Operand condition) {
		super(type);
		this.condition = condition;
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
	public Operand getCondition() {
		return condition;
	}
	public void setCondition(Operand condition) {
		this.condition = condition;
	}
	
	public int getJumpDestTrueInt() {
		return Integer.parseInt(this.jumpDestTrue.substring(1, this.jumpDestTrue.length()));
	}
	
	public int getJumpDestFalseInt() {
		return Integer.parseInt(this.jumpDestFalse.substring(1, this.jumpDestFalse.length()));
	}
	
	public String toString() {
		return this.getLabel() + ": loop " + ((this.condition != null)? this.condition.toString() : "null") + " goto " + this.jumpDestTrue + " else goto " + this.jumpDestFalse;
	}
	
}
