package com.interpreter.tac;

import com.interpreter.AST.NodeType;

public class TACFieldDeclarationStatement extends TACStatement {

	private String methodName;

	public TACFieldDeclarationStatement(NodeType type, boolean isBreakpoint) {
		super(type, isBreakpoint);
		this.methodName = "%FIELD";
	}
	
	public TACFieldDeclarationStatement(NodeType type) {
		super(type, false);
		this.methodName = "%FIELD";
	}
	
	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	
	public String toString() {
		if(this.getType().equals(NodeType.FIELD_DEC))
			return this.getLabel() + ": declare " + this.methodName;
		else
			return this.getLabel() + ": end " + this.methodName;
	}

}
