package com.interpreter.tac.operands;

public class Variable extends Operand{
	private String alias;

	public Variable(OperandTypes type, Object value, String alias) {
		super(type, value);
		this.alias = alias;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}
	
	public String toString() {
		System.out.println("ALSIASDASD: "+this.alias);
		return this.alias;
	}
	
}
