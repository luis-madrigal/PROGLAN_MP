package com.interpreter.contexts;

import com.interpreter.Scope;
import com.parser.ManuScriptParser.LocalVariableDeclarationContext;
import com.utils.Types;

public class SymbolContext extends Context{
	
	private String type;
	private boolean isConstant = false;
	private Object value;
	private int arraySize; //TODO: bad implementation. arraySize is null if symbol is not an array
		
	public SymbolContext(String type, Scope scope, String identifier) {
		super(identifier, scope);
		this.type = type;
		this.value = Types.NULL;
	}
	
	public SymbolContext(String type, Scope scope, String identifier, boolean isConstant) {
		super(identifier, scope);
		this.type = type;
		this.isConstant = isConstant;
		this.value = Types.NULL;
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
