package com.interpreter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import com.interpreter.contexts.SymbolContext;

public class Scope extends HashSet<String>{
	
	private Scope parent;
	private HashMap<String, SymbolContext> symTable;
	private List<Scope> children;

	public Scope(Scope parent) {
		this.parent = parent;
		symTable = new HashMap<String, SymbolContext>();
		children = new ArrayList<>();
	}
	
	public boolean inScope(String varName) {
		if(super.contains(varName))
			return true;
		
		return (parent == null)? false : parent.inScope(varName);
	}

	public void print() {
		print("", true);
	}

	private void print(String prefix, boolean isTail) {
		System.out.println(prefix + (isTail ? "└── " : "├── ") + "scope");
		for (int i = 0; i < children.size() - 1; i++) {
			children.get(i).print(prefix + (isTail ? "    " : "│   "), false);
		}
		if (children.size() > 0) {
			children.get(children.size() - 1)
					.print(prefix + (isTail ?"    " : "│   "), true);
		}
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

	public Scope getParent(){
		return parent;
	}

	public void addChild(Scope child){
		children.add(child);
	}

	public List<Scope> getChildren() {
		return children;
	}

	public void setChildren(List<Scope> children) {
		this.children = children;
	}

	public void setParent(Scope parent) {
		this.parent = parent;
	}
}
