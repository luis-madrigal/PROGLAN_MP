package com.interpreter.contexts;

import java.util.ArrayList;

import com.interpreter.Scope;
import com.parser.ManuScriptParser.FormalParameterContext;
import com.parser.ManuScriptParser.MethodDeclarationContext;
import com.utils.KeyTokens;
import com.utils.Types;
import com.utils.Utils;

public class MethodContext extends Context{
	
	private MethodDeclarationContext ctx;
	private ArrayList<KeyTokens.LITERAL_TYPE> argTypes;//TODO: bad implementation
	private ArrayList<String> args;
	
	private KeyTokens.LITERAL_TYPE returnType;

	public MethodContext(MethodDeclarationContext ctx, Scope scope, String identifier) {
		super(identifier, scope);
		this.ctx = ctx;

		argTypes = new ArrayList<KeyTokens.LITERAL_TYPE>();
		args = new ArrayList<String>();
		if(ctx.formalParameters().formalParameterList() != null) {
			for (FormalParameterContext fpctx : ctx.formalParameters().formalParameterList().formalParameter()) {
				argTypes.add(KeyTokens.LITERAL_TYPE.getEnum(fpctx.typeType().getText()));
				args.add(fpctx.variableDeclaratorId().getText());
			}
		}

		returnType = KeyTokens.LITERAL_TYPE.NULL;
	}
	
	public boolean matchesArgs(MethodDeclarationContext ctx) {
		ArrayList<KeyTokens.LITERAL_TYPE> argTypes = new ArrayList<KeyTokens.LITERAL_TYPE>();
		if(ctx.formalParameters().formalParameterList() != null) {
			if(ctx.formalParameters().formalParameterList().formalParameter().size() != this.argTypes.size())
				return false;
			for (FormalParameterContext fpctx : ctx.formalParameters().formalParameterList().formalParameter()) {
				argTypes.add(KeyTokens.LITERAL_TYPE.getEnum(fpctx.typeType().getText()));
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

	public ArrayList<KeyTokens.LITERAL_TYPE> getArgTypes() {
		return argTypes;
	}

	public void setArgTypes(ArrayList<KeyTokens.LITERAL_TYPE> argTypes) {
		this.argTypes = argTypes;
	}

	public KeyTokens.LITERAL_TYPE getReturnType() {
		return returnType;
	}

	public void setReturnType(KeyTokens.LITERAL_TYPE returnType) {
		this.returnType = returnType;
	}

	public ArrayList<String> getArgs() {
		return args;
	}

	public void setArgs(ArrayList<String> args) {
		this.args = args;
	}

}
