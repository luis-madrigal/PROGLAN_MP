package com.interpreter.intermediatecode;

public class TACFuncDeclarationStatement extends TACStatement{
	
	private String methodName;

	public TACFuncDeclarationStatement() {
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

}
