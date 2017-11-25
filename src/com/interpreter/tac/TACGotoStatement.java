package com.interpreter.tac;

import com.interpreter.AST.NodeType;

public class TACGotoStatement extends TACStatement {
	
	private String jumpDest;
	
	public TACGotoStatement(NodeType type, String jumpDest, boolean isBreakpoint) {
		super(type, isBreakpoint);
		this.jumpDest = jumpDest;
	}
	
	public TACGotoStatement(NodeType type, boolean isBreakpoint) {
		super(type, isBreakpoint);
	}

	public String getJumpDest() {
		return jumpDest;
	}

	public void setJumpDest(String jumpDest) {
		this.jumpDest = jumpDest;
	}

	public int getJumpDestInt() {
		return Integer.parseInt(this.jumpDest.substring(1, this.jumpDest.length()));
	}

	public String toString() {
		return this.getLabel() + ": goto "+this.jumpDest;
	}
}
