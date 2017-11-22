package com.interpreter.tac;

import java.util.ArrayList;

public class TACFuncInvokeStatement extends TACOutputStatement{
	
	private String methodName;
	private ArrayList<String> params;

	public TACFuncInvokeStatement(String methodName, ArrayList<String> params) {
		this.methodName = methodName;
		this.params = params;
	}
	
	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	
	public String toString() {
		String msg = super.toString() + " call "+this.methodName+": ";
		for (String param : params) {
			msg = msg.concat(param + ", ");
		}
		msg = msg.substring(0, msg.length()-2);
		
		return msg;
	}

}
