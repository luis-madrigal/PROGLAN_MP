package com.interpreter.contexts;

import com.interpreter.Scope;
import com.parser.ManuScriptParser.LocalVariableDeclarationContext;

public class SymbolContext extends Context{
	
	private String type;
	private boolean isConstant = false;
		
	public SymbolContext(String type, Scope scope, String identifier) {
		super(identifier, scope);
		this.type = type;
	}
	
	public SymbolContext(String type, Scope scope, String identifier, boolean isConstant) {
		super(identifier, scope);
		this.type = type;
		this.isConstant = isConstant;
	}

	public String getSymbolType() {
		return this.type;
	}

	public boolean isConstant() {
		return isConstant;
	}

	public void setConstant(boolean isConstant) {
		this.isConstant = isConstant;
	}
}
