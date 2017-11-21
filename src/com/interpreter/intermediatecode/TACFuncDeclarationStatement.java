package com.interpreter.intermediatecode;

public class TACFuncDeclarationStatement extends TACStatement{
	
	private String methodName;

	public TACFuncDeclarationStatement(String methodName) {
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
