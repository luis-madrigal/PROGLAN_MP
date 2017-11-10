package com.interpreter.contexts;

import com.interpreter.Scope;

public abstract class Context {
	
	protected String identifier;
	protected Scope scope;
	
	public Context(String identifier, Scope scope) {
		this.identifier = identifier;
		this.scope = scope;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public Scope getScope() {
		return scope;
	}

	public void setScope(Scope scope) {
		this.scope = scope;
	}

}
