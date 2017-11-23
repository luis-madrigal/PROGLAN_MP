package com.interpreter.tac;

import com.interpreter.AST.NodeType;
import com.interpreter.tac.operands.Operand;
import com.interpreter.tac.operands.Variable;
import com.utils.KeyTokens.OPERATOR;

public class TACAssignStatement extends TACStatement{
	
	private OPERATOR operator;
	private Variable variable;
	private Operand value;

	public TACAssignStatement(NodeType type, OPERATOR operator, Variable variable, Operand value) {
		super(type);
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

	public Variable getVariable() {
		return variable;
	}

	public void setVariable(Variable variable) {
		this.variable = variable;
	}

	public Operand getValue() {
		return value;
	}

	public void setValue(Operand value) {
		this.value = value;
	}

	public String toString() {
		return this.getLabel() + ": " + this.variable.toString() + " " + this.getOperator().toString() + " " + this.value.toString();
	}
}
