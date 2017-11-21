package com.interpreter.intermediatecode;

public class TACGotoStatement extends TACStatement {
	
	private String jumpDest;
	
	public TACGotoStatement(String jumpDest) {
		this.jumpDest = jumpDest;
	}

	public String toString() {
		return this.getLabel() + ": goto "+this.jumpDest;
	}
}
