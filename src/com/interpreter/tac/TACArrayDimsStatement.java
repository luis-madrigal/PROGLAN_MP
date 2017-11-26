package com.interpreter.tac;

import com.interpreter.AST.NodeType;
import com.interpreter.tac.operands.Operand;

public class TACArrayDimsStatement extends TACOutputStatement{
	
	private Operand[] dims;

	public TACArrayDimsStatement(NodeType type, boolean isBreakpoint) {
		super(type, isBreakpoint);
		// TODO Auto-generated constructor stub
	}
	
	public void initArr(int i) {
		this.dims = new Operand[i];
	}
	
	public void add(int i, Operand op) {
		this.dims[i] = op;
	}

	public String toString() {
		String print = super.toString() + "{";
		for(int i = 0; i < dims.length; i++) {
			print = print.concat(dims[i].toString());
			if(i < dims.length-1)
				print = print.concat(", ");
		}
		print = print.concat("}");
		return print;
	}

}
