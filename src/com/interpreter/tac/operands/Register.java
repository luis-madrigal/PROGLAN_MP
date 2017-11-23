package com.interpreter.tac.operands;

public class Register extends Operand{
	
	private String name;

	public Register(OperandTypes type, String name) {
		super(type, "");
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return this.name.toString();
	}
	
}
