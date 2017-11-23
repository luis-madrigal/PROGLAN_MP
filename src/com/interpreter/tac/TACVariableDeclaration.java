package com.interpreter.tac;

import com.interpreter.AST.NodeType;
import com.interpreter.contexts.SymbolContext;

public class TACVariableDeclaration extends TACStatement{
	
	private SymbolContext ctx;

	public TACVariableDeclaration(NodeType type, SymbolContext ctx) {
		super(type);
		this.ctx = ctx;
		// TODO Auto-generated constructor stub
	}

	public SymbolContext getCtx() {
		return ctx;
	}

	public void setCtx(SymbolContext ctx) {
		this.ctx = ctx;
	}

	public String toString() {
		return this.getLabel() + ": declare variable "+ctx.getIdentifier();
	}
}
