package com.interpreter.tac;

import com.interpreter.AST.NodeType;
import com.interpreter.tac.operands.Operand;
import com.utils.KeyTokens.OPERATOR;

public class TACAssignStatement extends TACStatement{
	
	private OPERATOR operator;
	private Operand operand;
	private Operand value;

	public TACAssignStatement(NodeType type, OPERATOR operator, Operand variable, Operand value, boolean isBreakpoint) {
		super(type, isBreakpoint);
		this.operator = operator;
		this.operand = variable;
		this.value = value;
	}

	public OPERATOR getOperator() {
		return operator;
	}

	public void setOperator(OPERATOR operator) {
		this.operator = operator;
	}

	public Operand getOperand() {
		return operand;
	}

	public void setVariable(Operand variable) {
		this.operand = variable;
	}

	public Operand getValue() {
		return value;
	}

	public void setValue(Operand value) {
		this.value = value;
	}

	public String toString() {
		return this.getLabel() + ": " + this.operand.toString() + " " + this.getOperator().toString() + " " + this.value.toString();
	}
}
