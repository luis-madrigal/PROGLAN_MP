package com.interpreter.tac;

import com.interpreter.AST.NodeType;
import com.interpreter.contexts.SymbolContext;
import com.interpreter.tac.operands.Operand;

public class TACArrayAssignStatement extends TACStatement {
	
	private SymbolContext ctx;
	private Operand value;
	private int dims;

	public TACArrayAssignStatement(SymbolContext ctx, NodeType type, boolean isBreakpoint) {
		super(type, isBreakpoint);
		this.ctx = ctx;
	}
	
	public Operand getValue() {
		return value;
	}



	public void setValue(Operand value) {
		this.value = value;
	}



	public String toString() {
		return this.getLabel() + ": " + ctx.getIdentifier() + " assign " + value.toString();
	}
	
}
