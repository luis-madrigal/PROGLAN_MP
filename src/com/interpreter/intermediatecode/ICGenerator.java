package com.interpreter.intermediatecode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

import com.interpreter.AST.AbstractSyntaxTree;
import com.utils.KeyTokens.LITERAL_TYPE;
import com.utils.KeyTokens.OPERATOR;

public class ICGenerator {
	
	private ArrayList<TACStatement> tac;
	private int registerCount;
	private int labelCount; //TODO: each instruction has label (not sure)
	
	public ICGenerator(AbstractSyntaxTree tree) {
		tac = new ArrayList<TACStatement>();
		registerCount = 0;
		labelCount = 0;
	}
	
	public void findNode(AbstractSyntaxTree node) {
		Stack<AbstractSyntaxTree> stack = new Stack<AbstractSyntaxTree>();
		stack.push(node);
		while (!stack.isEmpty()) {
			AbstractSyntaxTree n = stack.pop();
			switch(n.getNodeType()) {
			case BRANCH: tac.add(new TACIfStatement(OPERATOR.toEnum(n.getNodeType()), this.storeExpression(node.getChild(0)), null)); break;
			case WHILE:
			case DO_WHILE:
			case FOR:
			case BLOCK: tac.add(new TACBlockStatement()); //TODO: distinguish between enter and exit
			case FUNCTION_DECLARATION:
			case RETURN:
			case PRINT:
			case SCAN:
			default: 
				for (AbstractSyntaxTree child : n.getChildren()) {
					stack.push(child);
				}
			}
			
		}
	}
	
	private String branch(AbstractSyntaxTree node) {
		
	}
	
	private String storeExpression(AbstractSyntaxTree node) {
		Stack<AbstractSyntaxTree> stack = new Stack<AbstractSyntaxTree>();
		stack.push(node);
		TACOutputStatement stmt;
		
		while(!stack.isEmpty()) {
			AbstractSyntaxTree n = stack.pop();
			switch(n.getNodeType()) {
			case VARIABLE: 
			case LITERAL: return node.getValue().toString();
			case ASSIGN:
			case BIN_ARITHMETIC:
			case BIN_LOGIC: stmt = new TACBinaryOpStatement(OPERATOR.toEnum(node.getValue()), this.storeExpression(node.getChild(0)), this.storeExpression(node.getChild(1)));
							this.addStatement(stmt);
							return stmt.getLabel();
			case UNIPOST_ARITHMETIC:
			case UNIPRE_ARITHMETIC:
			case UNI_LOGIC: stmt = new TACUnaryOpStatement(OPERATOR.toEnum(node.getValue()), this.storeExpression(node.getChild(0)));
							this.addStatement(stmt);
							return stmt.getLabel();
			case ARRAY_ACCESS: stmt = new TACIndexingStatement(this.storeExpression(node.getChild(0)), this.storeExpression(node.getChild(1)));
							   this.addStatement(stmt);
							   return stmt.getLabel();
			default: 
				for (AbstractSyntaxTree child : n.getChildren()) {
					stack.push(child);
				}
			}
		}
		
		return "";
	}
	
	private void addStatement(TACFuncInvokeStatement stmt) {
		
	}
	
	private void addStatement(TACOutputStatement stmt) {
		this.registerCount++;
		stmt.setOutputRegister("T"+this.registerCount);
		this.addStatement(stmt);
	}
	
	private void addStatement(TACStatement stmt) {
		this.labelCount++;
		this.tac.add(stmt);
		stmt.setLabel("L"+this.labelCount);
	}
}
