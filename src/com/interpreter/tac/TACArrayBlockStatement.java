package com.interpreter.tac;

import com.interpreter.AST.NodeType;
import com.interpreter.tac.operands.Operand;

public class TACArrayBlockStatement extends TACOutputStatement{
	
	private Operand[] arr;

	public TACArrayBlockStatement(NodeType type, boolean isBreakpoint) {
		super(type, isBreakpoint);
	}
	
	public void initArr(int i) {
		this.arr = new Operand[i];
	}
	
	public void add(int i, Operand op) {
		this.arr[i] = op;
	}

	public String toString() {
		String print = super.toString() + "{";
		for(int i = 0; i < arr.length; i++) {
			print = print.concat(arr[i].toString());
			if(i < arr.length-1)
				print = print.concat(", ");
		}
		print = print.concat("}");
		return print;
	}
}
