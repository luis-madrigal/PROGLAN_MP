package com.interpreter.intermediatecode;

public class TACFuncInvokeStatement extends TACOutputStatement{
	
	private String methodName;

	public TACFuncInvokeStatement() {
	}
	
	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

}
