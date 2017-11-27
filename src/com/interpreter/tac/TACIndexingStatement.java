package com.interpreter.tac;

import java.util.ArrayList;

import com.interpreter.AST.NodeType;
import com.interpreter.tac.operands.Operand;

public class TACIndexingStatement extends TACOutputStatement {
	
	private String arrayName;
	private ArrayList<Operand> indeces;

	public TACIndexingStatement(NodeType type, String arrayName, boolean isBreakpoint) {
		super(type, isBreakpoint);
		this.arrayName = arrayName;
		this.indeces = new ArrayList<>();
	}

	public String getArrayName() {
		return arrayName;
	}

	public void setArrayName(String arrayName) {
		this.arrayName = arrayName;
	}

	public void addIndex(Operand op) {
		this.indeces.add(op);
	}
	
	public String toString() {
		String str = super.toString() + this.arrayName;
		for (Operand index : indeces) {
			str = str.concat("[" + index.toString() + "]");
		}
		return str;
	}

}
