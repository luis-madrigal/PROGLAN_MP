package com.interpreter.intermediatecode;

import com.interpreter.AST.LeafNode;
import com.utils.KeyTokens.OPERATOR;

public class TACBinaryOpStatement extends TACOutputStatement{
	
	private OPERATOR operator;
	private LeafNode output;
	private String operand1;
	private String operand2;
	
	public TACBinaryOpStatement(OPERATOR operator, String operand1, String operand2) {
		this.operator = operator;
		this.operand1 = operand1;
		this.operand2 = operand2;
		this.output = null;
	}
	
//	public LeafNode evaluate() {
//		if(output == null) {
//			switch(operator) {
//			
//			}
//		}
//		
//		return output;
//	}
}
