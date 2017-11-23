package com.interpreter.tac;

public class TACBlockStatement extends TACStatement{
	
	private String message;

	public TACBlockStatement() {
		this.message = "BLOCK";
	}
	
	public String toString() {
		return this.getLabel() +": " +this.message;
	}

}
