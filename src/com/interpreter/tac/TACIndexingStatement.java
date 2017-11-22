package com.interpreter.tac;

public class TACIndexingStatement extends TACOutputStatement {
	
	private String arrayName;
	private String index;

	public TACIndexingStatement(String arrayName, String index) {
		this.arrayName = arrayName;
		this.index = index;
	}

	public String getArrayName() {
		return arrayName;
	}

	public void setArrayName(String arrayName) {
		this.arrayName = arrayName;
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}
	
	public String toString() {
		return super.toString() + this.arrayName + "[" + this.index + "]";
	}

}
