package com.interpreter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import com.interpreter.contexts.SymbolContext;
import com.rits.cloning.Cloner;

public class Scope extends HashSet<String>{
	
	private String label;
	private Scope parent;
	private HashMap<String, SymbolContext> symTable;
	private List<Scope> children;

	public Scope(Scope parent) {
		this.parent = parent;
		symTable = new HashMap<String, SymbolContext>();
		children = new ArrayList<>();
	}
	
	public SymbolContext findVar(String varName) {
		System.out.println("find var with name: "+varName);
		if(this.symTable.containsKey(varName))
			return this.symTable.get(varName);
		else if(parent != null)
			return this.parent.findVar(varName);
		else {
			System.out.println("not existing var");
			return null;
		}
	}
	
	public void setSymbolContext(String varName, Object value) {
		if(this.symTable.containsKey(varName))
			this.symTable.get(varName).setValue(value);
		else if(parent != null)
			this.parent.setSymbolContext(varName, value);
	}
	
	public Scope findWithLabel(String label) {
//		System.out.println("looking for: "+label+" in "+this.label);
		if(this.parent != null && this.label.equals(label)) {
			return this;
		}
		else {
			for (Scope scope : children) {
				Scope s;
				if((s = scope.findWithLabel(label)) != null) {
//					System.out.println("found");
					return s;
				} else
					System.out.println("not found");
			}
		}
//		System.out.println("nothing");
		return null;
	}
	
	public void addToScope(SymbolContext ctx) {
		this.symTable.put(ctx.getIdentifier(), ctx);
		System.out.println("add "+ctx.getIdentifier()+" to scope");
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

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	
	public Scope clone() {
		Scope s;
//		if(this.getParent() == null)
//			s = new Scope(null);
//		else
//			s = new Scope(this.getParent().clone());
//		s.setChildren(new ArrayList<Scope>(this.cloneChildren()));
//		s.setLabel(this.getLabel());
//		s.setSymTable((HashMap)this.getSymTable().clone());
//		
//		s = this;
//		s.setChildren(new ArrayList<Scope>(this.cloneChildren()));
		Cloner cloner = new Cloner();
		s = cloner.deepClone(this);
		s.setParent(getParent());
		
		return s;
	}
	
	public HashMap<String, SymbolContext> cloneSymbolTable() {
		HashMap<String, SymbolContext> sTable = new HashMap<>();
		for(Map.Entry<String, SymbolContext> entry: this.symTable.entrySet()) {
			sTable.put(entry.getKey(), entry.getValue().clone());
		}
		
		return sTable;
	}
	
	private ArrayList<Scope> cloneChildren() {
		ArrayList<Scope> scopes = new ArrayList<Scope>();
		for (Scope scope : this.getChildren()) {
			Scope s = scope.clone();
			s.setSymTable(s.cloneSymbolTable());
			scopes.add(s);
		}
		
		return scopes;
	}
}
