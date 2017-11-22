package com.interpreter.tac;

public class TACReturnStatement extends TACStatement{

	private String expression;

	public TACReturnStatement(String expression) {
		this.expression = expression;
	}

	public String getExpression() {
		return expression;
	}

	public void setExpression(String expression) {
		this.expression = expression;
	}
	
	public String toString() {
		return this.getLabel() + ": return " + this.expression;
	}
}
