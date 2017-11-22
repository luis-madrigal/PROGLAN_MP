package com.interpreter.tac;

public class TACGotoStatement extends TACStatement {
	
	private String jumpDest;
	
	public TACGotoStatement(String jumpDest) {
		this.jumpDest = jumpDest;
	}
	
	public TACGotoStatement() {
		
	}

	public String getJumpDest() {
		return jumpDest;
	}



	public void setJumpDest(String jumpDest) {
		this.jumpDest = jumpDest;
	}



	public String toString() {
		return this.getLabel() + ": goto "+this.jumpDest;
	}
}
