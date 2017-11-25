package com.interpreter.tac;

import com.interpreter.AST.NodeType;

public class TACFuncDeclarationStatement extends TACStatement{
	
	private String methodName;

	public TACFuncDeclarationStatement(NodeType type, String methodName, boolean isBreakpoint) {
		super(type, isBreakpoint);
		this.methodName = methodName;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	
	public String toString() {
		return this.getLabel() + ": declare " + this.methodName;
	}

}
