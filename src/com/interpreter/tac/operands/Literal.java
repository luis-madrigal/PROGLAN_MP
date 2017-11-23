package com.interpreter.tac.operands;

import com.utils.KeyTokens.LITERAL_TYPE;

public class Literal extends Operand{
	
	private LITERAL_TYPE type;
	
	public Literal(OperandTypes opType, Object value, LITERAL_TYPE type) {
		super(opType, value);
		this.type = type;
	}

	public LITERAL_TYPE getType() {
		return type;
	}

	public void setType(LITERAL_TYPE type) {
		this.type = type;
	}	
	

}
