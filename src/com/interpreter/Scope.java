package com.interpreter;

import java.util.HashMap;
import java.util.HashSet;

import com.interpreter.contexts.SymbolContext;

public class Scope extends HashSet<String>{
	
	private Scope parent;
	private HashMap<String, SymbolContext> symTable;

	public Scope(Scope parent) {
		this.parent = parent;
		symTable = new HashMap<String, SymbolContext>();
	}
	
	public boolean inScope(String varName) {
		if(super.contains(varName))
			return true;
		
		return (parent == null)? false : parent.inScope(varName);
	}
	
	public SymbolContext checkTables(String varName) {
		if(symTable.containsKey(varName))
			return symTable.get(varName);
		
		return (parent == null)? null : parent.checkTables(varName);
	}

	public HashMap<String, SymbolContext> getSymTable() {
		return symTable;
	}

	public void setSymTable(HashMap<String, SymbolContext> symTable) {
		this.symTable = symTable;
	}
}
