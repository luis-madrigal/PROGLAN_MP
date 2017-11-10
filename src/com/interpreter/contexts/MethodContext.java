package com.interpreter.contexts;

import java.util.ArrayList;

import com.interpreter.Scope;
import com.parser.ManuScriptParser.FormalParameterContext;
import com.parser.ManuScriptParser.MethodDeclarationContext;

public class MethodContext extends Context{
	
	private MethodDeclarationContext ctx;
	private ArrayList<String> argTypes;

	public MethodContext(MethodDeclarationContext ctx, Scope scope, String identifier) {
		super(identifier, scope);
		this.ctx = ctx;

		argTypes = new ArrayList<String>();
		if(ctx.formalParameters().formalParameterList() != null) {
			for (FormalParameterContext fpctx : ctx.formalParameters().formalParameterList().formalParameter()) {
				argTypes.add(fpctx.typeType().getText());
			}
		}
	}

	public MethodDeclarationContext getCtx() {
		return ctx;
	}

	public void setCtx(MethodDeclarationContext ctx) {
		this.ctx = ctx;
	}

	public ArrayList<String> getArgTypes() {
		return argTypes;
	}

	public void setArgTypes(ArrayList<String> argTypes) {
		this.argTypes = argTypes;
	}

}
