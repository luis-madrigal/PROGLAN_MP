package com.interpreter.tac.operands;

import java.util.ArrayList;

public class ArrayAccess extends Operand{
	
	private String alias;
	private ArrayList<Operand> indeces;

	public ArrayAccess(String alias, OperandTypes type, Object value) {
		super(type, value);
		this.alias = alias;
		this.indeces = new ArrayList<>();
	}
	
	public void addIndex(Operand op) {
		this.indeces.add(op);
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public ArrayList<Operand> getIndeces() {
		return indeces;
	}

	public void setIndeces(ArrayList<Operand> indeces) {
		this.indeces = indeces;
	}
	
	public String toString() {
		String str = this.alias;
		for (Operand operand : indeces) {
			str = str.concat("[" +operand.toString()+ "]");
		}
		return str;
	}

}
