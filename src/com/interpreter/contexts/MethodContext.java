package com.interpreter.contexts;

import java.util.ArrayList;

import com.interpreter.Scope;
import com.parser.ManuScriptParser.FormalParameterContext;
import com.parser.ManuScriptParser.MethodDeclarationContext;
import com.utils.Types;
import com.utils.Utils;

public class MethodContext extends Context{
	
	private MethodDeclarationContext ctx;
	private ArrayList<String> argTypes;
	private String returnType;

	public MethodContext(MethodDeclarationContext ctx, Scope scope, String identifier) {
		super(identifier, scope);
		this.ctx = ctx;

		argTypes = new ArrayList<String>();
		if(ctx.formalParameters().formalParameterList() != null) {
			for (FormalParameterContext fpctx : ctx.formalParameters().formalParameterList().formalParameter()) {
				argTypes.add(fpctx.typeType().getText());
			}
		}
		
		returnType = Types.NULL;
	}
	
	public boolean matchesArgs(MethodDeclarationContext ctx) {
		ArrayList<String> argTypes = new ArrayList<String>();
		if(ctx.formalParameters().formalParameterList() != null) {
			if(ctx.formalParameters().formalParameterList().formalParameter().size() != this.argTypes.size())
				return false;
			for (FormalParameterContext fpctx : ctx.formalParameters().formalParameterList().formalParameter()) {
				argTypes.add(fpctx.typeType().getText());
			}
		}
		
		return Utils.listEqualsIgnoreOrder(argTypes, this.argTypes);
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

	public String getReturnType() {
		return returnType;
	}

	public void setReturnType(String returnType) {
		this.returnType = returnType;
	}

}
