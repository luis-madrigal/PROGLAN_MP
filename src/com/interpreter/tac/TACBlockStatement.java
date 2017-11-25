package com.interpreter.tac;

import com.interpreter.AST.NodeType;

public class TACBlockStatement extends TACStatement{
	
	private String message;
	private boolean isEnter;

	public TACBlockStatement(NodeType type, boolean isEnter, boolean isBreakpoint) {
		super(type, isBreakpoint);
		this.message = (isEnter)? "ENTER BLOCK" : "EXIT BLOCK";
		this.isEnter = isEnter;
	}
	
	public String toString() {
		return this.getLabel() +": " +this.message;
	}

	public boolean isEnter() {
		return isEnter;
	}

	public void setEnter(boolean isEnter) {
		this.isEnter = isEnter;
	}

}
