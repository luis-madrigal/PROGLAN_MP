package com.interpreter.tac;

import com.interpreter.AST.NodeType;

public abstract class TACStatement {
	
	private String label;
	private NodeType type;
	private boolean isBreakpoint;
	
	
	public TACStatement(NodeType type, boolean isBreakpoint) {
		this.type = type;
		this.isBreakpoint = isBreakpoint;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public NodeType getType() {
		return type;
	}

	public void setType(NodeType type) {
		this.type = type;
	}

	public boolean isBreakpoint() {
		return isBreakpoint;
	}

	public void setBreakpoint(boolean isBreakpoint) {
		this.isBreakpoint = isBreakpoint;
	}

}
