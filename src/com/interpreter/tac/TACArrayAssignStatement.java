package com.interpreter.tac;

import com.interpreter.AST.NodeType;
import com.interpreter.contexts.SymbolContext;
import com.interpreter.tac.operands.Operand;

public class TACArrayAssignStatement extends TACStatement {
	
	private SymbolContext ctx;
	private Operand[] arr;
	private int dims;

	public TACArrayAssignStatement(SymbolContext ctx, NodeType type, boolean isBreakpoint) {
		super(type, isBreakpoint);
		// TODO Auto-generated constructor stub
	}

}
