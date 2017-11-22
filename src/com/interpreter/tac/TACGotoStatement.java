package com.interpreter.tac;

import com.interpreter.AST.NodeType;

public class TACGotoStatement extends TACStatement {
	
	private String jumpDest;
	
	public TACGotoStatement(NodeType type, String jumpDest) {
		super(type);
		this.jumpDest = jumpDest;
	}
	
	public TACGotoStatement(NodeType type) {
		super(type);
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
