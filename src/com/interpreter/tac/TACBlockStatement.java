package com.interpreter.tac;

import com.interpreter.AST.NodeType;

public class TACBlockStatement extends TACStatement{
	
	private String message;

	public TACBlockStatement(NodeType type) {
		super(type);
		this.message = "BLOCK";
	}
	
	public String toString() {
		return this.getLabel() +": " +this.message;
	}

}
