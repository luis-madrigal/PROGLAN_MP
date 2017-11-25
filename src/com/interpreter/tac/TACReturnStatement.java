package com.interpreter.tac;

import com.interpreter.AST.NodeType;
import com.interpreter.tac.operands.Operand;

public class TACReturnStatement extends TACStatement{

	private Operand expression;

	public TACReturnStatement(NodeType type, Operand expression, boolean isBreakpoint) {
		super(type, isBreakpoint);
		this.expression = expression;
	}

	public Operand getExpression() {
		return expression;
	}

	public void setExpression(Operand expression) {
		this.expression = expression;
	}
	
	public String toString() {
		return this.getLabel() + ": return " + this.expression.toString();
	}
}
