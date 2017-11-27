package com.interpreter.tac;

import java.util.ArrayList;

import com.interpreter.AST.NodeType;
import com.interpreter.tac.operands.Operand;
import com.interpreter.tac.operands.Variable;
import com.utils.KeyTokens.OPERATOR;

public class TACAssignStatement extends TACStatement{
	
	private OPERATOR operator;
	private Operand operand;
	private Operand value;
//	private ArrayList<Operand> indeces; //for array access

	public TACAssignStatement(NodeType type, OPERATOR operator, Operand variable, Operand value, boolean isBreakpoint) {
		super(type, isBreakpoint);
		this.operator = operator;
		this.operand = variable;
		this.value = value;
	}
	
//	public TACAssignStatement(NodeType type, OPERATOR operator, Operand value, boolean isBreakpoint) {
//		super(type, isBreakpoint);
//		this.operator = operator;
//		this.value = value;
//		this.indeces = new ArrayList<>();
//	}
//	
//	public void addIndex(Operand op) {
//		this.indeces.add(op);
//	}

	public OPERATOR getOperator() {
		return operator;
	}

	public void setOperator(OPERATOR operator) {
		this.operator = operator;
	}

	public Operand getOperand() {
		return operand;
	}

	public void setVariable(Operand variable) {
		this.operand = variable;
	}

	public Operand getValue() {
		return value;
	}

	public void setValue(Operand value) {
		this.value = value;
	}

//	public ArrayList<Operand> getIndeces() {
//		return indeces;
//	}
//
//	public void setIndeces(ArrayList<Operand> indeces) {
//		this.indeces = indeces;
//	}

	public String toString() {
//		if(this.indeces.size() > 0) {
//			String str = this.getLabel() + ": " + this.variable.toString();
//			for (Operand operand : indeces) {
//				str = str.concat("[" +operand.toString()+ "]");
//			}
//			str = str.concat(" " + this.operator.toString() + " " + this.value.toString());
//			return str;
//		}
		return this.getLabel() + ": " + this.operand.toString() + " " + this.getOperator().toString() + " " + this.value.toString();
	}
}
