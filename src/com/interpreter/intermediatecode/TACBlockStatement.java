package com.interpreter.intermediatecode;

public class TACBlockStatement extends TACStatement{
	
	private String message;

	public TACBlockStatement() {
		this.message = "BLOCK";
	}
	
	public String toString() {
		return this.getLabel() +": " +this.message;
	}

}
