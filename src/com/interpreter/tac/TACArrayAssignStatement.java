package com.interpreter.tac;

import com.interpreter.AST.NodeType;
import com.interpreter.contexts.SymbolContext;
import com.interpreter.tac.arrassign.ArrayAssignType;
import com.interpreter.tac.operands.Operand;

public class TACArrayAssignStatement extends TACStatement {
	
	private SymbolContext ctx;
	private Operand value;
	private ArrayAssignType assignType;

	public TACArrayAssignStatement(SymbolContext ctx, NodeType type, boolean isBreakpoint) {
		super(type, isBreakpoint);
		this.ctx = ctx;
	}
	
	public Operand getValue() {
		return value;
	}

	public ArrayAssignType getAssignType() {
		return assignType;
	}

	public void setAssignType(ArrayAssignType type) {
		this.assignType = type;
	}

	public void setValue(Operand value) {
		this.value = value;
	}

	public String getArrName() {
		return ctx.getIdentifier();
	}

	public String toString() {
		return this.getLabel() + ": declare " + ctx.getIdentifier() + " = " + value.toString();
	}
	
}
