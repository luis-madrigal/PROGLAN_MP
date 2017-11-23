package com.interpreter.contexts;

import com.interpreter.Scope;
import com.parser.ManuScriptParser.LocalVariableDeclarationContext;
import com.utils.Types;

public class SymbolContext extends Context{
	
	protected String type;	//the type of the variable itself
	protected boolean isConstant = false;
	protected Object value;	//todo: is this needed?
	protected GenericInfo other; //pointer if symbol is array/struct/pointer type
		
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

	public Object getOther() {
		return other;
	}

	public void setOther(GenericInfo other) {
		this.other = other;
	}
}
