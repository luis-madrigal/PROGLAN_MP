package com.interpreter.tac;

public class TACScanStatement extends TACStatement{
	
	private String variable;

	public TACScanStatement(String variable) {
		super();
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
