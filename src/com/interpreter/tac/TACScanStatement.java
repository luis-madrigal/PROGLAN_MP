package com.interpreter.tac;

import com.interpreter.AST.NodeType;

public class TACScanStatement extends TACStatement{
	
	private String variable;

	public TACScanStatement(NodeType type, String variable) {
		super(type);
		this.variable = variable;
	}

	public String getVariable() {
		return variable;
	}

	public void setVariable(String variable) {
		this.variable = variable;
	}
	
	public String toString() {
		return this.getLabel() + ": scan: " + this.variable;
	}

}
