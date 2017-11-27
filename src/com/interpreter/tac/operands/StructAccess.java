package com.interpreter.tac.operands;

import java.util.ArrayList;

public class StructAccess extends Operand{
	
	private String alias;
	private ArrayList<Variable> vars;

	public StructAccess(String alias, OperandTypes type, Object value) {
		super(type, value);
		this.alias = alias;
		this.vars = new ArrayList<>();
	}
	
	public void addVar(Variable v) {
		this.vars.add(v);
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public ArrayList<Variable> getVars() {
		return vars;
	}

	public String toString() {
		String str = this.alias;
		for (Variable variable : vars) {
			str = str.concat("."+variable.getAlias());
		}
		
		return str;
	}
}
