package com.interpreter;

import com.parser.ManuScriptParser.LocalVariableDeclarationContext;

public class SymbolContext {
	
	private LocalVariableDeclarationContext ctx;
	private Scope scope;
	
	public SymbolContext(LocalVariableDeclarationContext ctx, Scope scope) {
		this.ctx = ctx;
		this.scope = scope;
	}

	public LocalVariableDeclarationContext getCtx() {
		return ctx;
	}

	public void setCtx(LocalVariableDeclarationContext ctx) {
		this.ctx = ctx;
	}

	public Scope getScope() {
		return scope;
	}

	public void setScope(Scope scope) {
		this.scope = scope;
	}

}
