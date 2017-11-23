package com.interpreter.tac;

import com.interpreter.AST.NodeType;
import com.interpreter.tac.operands.Operand;

public class TACIndexingStatement extends TACOutputStatement {
	
	private String arrayName;
	private Operand index;

	public TACIndexingStatement(NodeType type, String arrayName, Operand index) {
		super(type);
		this.arrayName = arrayName;
		this.index = index;
	}

	public String getArrayName() {
		return arrayName;
	}

	public void setArrayName(String arrayName) {
		this.arrayName = arrayName;
	}

	public Operand getIndex() {
		return index;
	}

	public void setIndex(Operand index) {
		this.index = index;
	}
	
	public String toString() {
		return super.toString() + this.arrayName + "[" + this.index.toString() + "]";
	}

}
