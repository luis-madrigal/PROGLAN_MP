package com.interpreter.tac;

import com.interpreter.AST.NodeType;

public abstract class TACStatement {
	
	private String label;
	private NodeType type;
	
	public TACStatement(NodeType type) {
		this.type = type;
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

}
