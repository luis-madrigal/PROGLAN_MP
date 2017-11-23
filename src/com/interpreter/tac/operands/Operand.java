package com.interpreter.tac.operands;

public class Operand {
	
	private OperandTypes operandType;
	private Object value;
	public Operand(OperandTypes type, Object value) {
		super();
		this.operandType = type;
		this.value = value;
	}

	public OperandTypes getOperandType() {
		return operandType;
	}
	public void setOperandType(OperandTypes type) {
		this.operandType = type;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	
	public String toString() {
		return this.value.toString();
	}
	
}
