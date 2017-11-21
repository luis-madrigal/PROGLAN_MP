package com.interpreter.intermediatecode;

import com.interpreter.AST.LeafNode;
import com.utils.KeyTokens.OPERATOR;

public class TACIfStatement extends TACStatement{
	private OPERATOR operator;
	private String operand;
	private String jumpDest;

	public TACIfStatement(OPERATOR operator, String operand, String jumpDest) {
		this.operator = operator;
		this.operand = operand;
		this.jumpDest = jumpDest;
	}
}
