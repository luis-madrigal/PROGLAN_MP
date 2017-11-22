package com.interpreter.tac;

import com.interpreter.AST.NodeType;
import com.interpreter.tac.operands.Operand;
import com.utils.KeyTokens.OPERATOR;

public class TACBinaryOpStatement extends TACOutputStatement{
	
	private OPERATOR operator;
	private Operand output;
	private Operand operand1;
	private Operand operand2;
	
	public TACBinaryOpStatement(NodeType type, OPERATOR operator, Operand operand1, Operand operand2) {
		super(type);
		this.operator = operator;
		this.operand1 = operand1;
		this.operand2 = operand2;
		this.output = null;
	}
	
	public String toString() {
		return super.toString() + this.operand1.toString() + " " + this.operator.toString() + " " + this.operand2.toString();
	}
}
