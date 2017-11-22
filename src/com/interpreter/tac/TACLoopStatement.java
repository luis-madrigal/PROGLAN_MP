package com.interpreter.tac;

public class TACLoopStatement extends TACStatement{
	
	private String jumpDestTrue;
	private String jumpDestFalse;
	private String condition;
	public TACLoopStatement(String condition) {
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
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	
	public String toString() {
		return this.getLabel() + ": loop " + this.condition + " goto " + this.jumpDestTrue + " else goto " + this.jumpDestFalse;
	}
	
}
