package com.interpreter.tac;

public abstract class TACOutputStatement extends TACStatement {
	
	private String outputRegister;

	public TACOutputStatement(String outputRegister) {
		this.outputRegister = outputRegister;
	}
	
	public TACOutputStatement() {
		
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
