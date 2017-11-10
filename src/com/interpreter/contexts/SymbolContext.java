package com.interpreter.contexts;

import com.interpreter.Scope;
import com.parser.ManuScriptParser.LocalVariableDeclarationContext;

public class SymbolContext extends Context{
	
	private String type;
		
	public SymbolContext(String type, Scope scope, String identifier) {
		super(identifier, scope);
		this.type = type;
	}

	public String getSymbolType() {
		return this.type;
	}
}
