package com.interpreter.tac;

import com.utils.KeyTokens.OPERATOR;

public class TACAssignStatement extends TACStatement{
	
	private OPERATOR operator;
	private String variable;
	private String value;

	public TACAssignStatement(OPERATOR operator, String variable, String value) {
		super();
		this.operator = operator;
		this.variable = variable;
		this.value = value;
	}

	public OPERATOR getOperator() {
		return operator;
	}

	public void setOperator(OPERATOR operator) {
		this.operator = operator;
	}

	public String getVariable() {
		return variable;
	}

	public void setVariable(String variable) {
		this.variable = variable;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String toString() {
		return this.getLabel() + ": " + this.variable + " " + this.getOperator().toString() + " " + this.value;
	}
}
