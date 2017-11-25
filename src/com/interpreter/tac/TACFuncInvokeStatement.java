package com.interpreter.tac;

import java.util.ArrayList;

import com.interpreter.AST.NodeType;
import com.interpreter.tac.operands.Operand;

public class TACFuncInvokeStatement extends TACOutputStatement{
	
	private String methodName;
	private ArrayList<Operand> params;

	public TACFuncInvokeStatement(NodeType type, String methodName, ArrayList<Operand> params, boolean isBreakpoint) {
		super(type, isBreakpoint);
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
		for (Operand param : params) {
			msg = msg.concat(param.toString() + ", ");
		}
		msg = msg.substring(0, msg.length()-2);
		
		return msg;
	}

	public ArrayList<Operand> getParams() {
		return params;
	}

	public void setParams(ArrayList<Operand> params) {
		this.params = params;
	}

}
