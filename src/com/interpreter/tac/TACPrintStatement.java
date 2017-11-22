package com.interpreter.tac;

public class TACPrintStatement extends TACStatement{
	
	private String expression;

	public TACPrintStatement(String expression) {
		this.expression = expression;
	}

	public String getExpression() {
		return expression;
	}

	public void setExpression(String expression) {
		this.expression = expression;
	}
	
	public String toString() {
		return this.getLabel() + ": print " + this.expression;
	}
	
}
