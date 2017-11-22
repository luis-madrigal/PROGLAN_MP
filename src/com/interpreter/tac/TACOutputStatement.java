package com.interpreter.tac;

import com.interpreter.AST.NodeType;

public abstract class TACOutputStatement extends TACStatement {
	
	private String outputRegister;

	public TACOutputStatement(NodeType type, String outputRegister) {
		super(type);
		this.outputRegister = outputRegister;
	}
	
	public TACOutputStatement(NodeType type) {
		super(type);
	}

	public String getOutputRegister() {
		return outputRegister;
	}

	public void setOutputRegister(String outputRegister) {
		this.outputRegister = outputRegister;
	}
	
	public String toString() {
		return this.getLabel() + ": " + this.outputRegister + " := ";
	}
	
	

}
