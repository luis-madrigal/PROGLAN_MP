package com.interpreter.tac;

import com.interpreter.AST.NodeType;
import com.interpreter.tac.operands.Register;

public abstract class TACOutputStatement extends TACStatement {
	
	private Register outputRegister;

	public TACOutputStatement(NodeType type, Register outputRegister, boolean isBreakpoint) {
		super(type, isBreakpoint);
		this.outputRegister = outputRegister;
	}
	
	public TACOutputStatement(NodeType type, boolean isBreakpoint) {
		super(type, isBreakpoint);
	}
	
	public Object evaluate() {
		return this.outputRegister.getValue();
	}

	public Register getOutputRegister() {
		return outputRegister;
	}

	public void setOutputRegister(Register outputRegister) {
		this.outputRegister = outputRegister;
	}
	
	public String toString() {
		return this.getLabel() + ": " + this.outputRegister.getName() + " := ";
	}
	
	

}
