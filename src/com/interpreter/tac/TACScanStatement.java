package com.interpreter.tac;

import com.interpreter.AST.NodeType;
import com.interpreter.tac.operands.Variable;

public class TACScanStatement extends TACStatement{
	
	private Variable variable;

	public TACScanStatement(NodeType type, Variable variable) {
		super(type);
		this.variable = variable;
	}

	public Variable getVariable() {
		return variable;
	}

	public void setVariable(Variable variable) {
		this.variable = variable;
	}
	
	public String toString() {
		return this.getLabel() + ": scan: " + this.variable;
	}

}
