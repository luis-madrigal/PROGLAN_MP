package com.interpreter.tac;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import com.ide.Panel;
import com.interpreter.AST.AbstractSyntaxTree;
import com.interpreter.AST.ProcedureNode;
import com.utils.KeyTokens.OPERATOR;

public class ICGenerator {
	
	private static final String LABEL_ALIAS = "L";
	private static final String REGISTER_ALIAS = "T";
	
	private ArrayList<TACStatement> tac;
	private int registerCount;
	private int labelCount; //TODO: each instruction has label (not sure)
	
	public ICGenerator() {
		this.registerCount = 0;
		this.labelCount = 0;
	}
	
	public ArrayList<TACStatement> generateICode(AbstractSyntaxTree tree) {
		this.tac = new ArrayList<TACStatement>();
//		registerCount = 0;
//		labelCount = 0;
		this.storeStatement(tree);
		return this.tac;
	}
	
	public void storeStatement(AbstractSyntaxTree node) {
		boolean flag = true;
		Queue<AbstractSyntaxTree> queue = new LinkedList<AbstractSyntaxTree>();
		queue.add(node);
		while (!queue.isEmpty()) {
			AbstractSyntaxTree n = queue.poll();
			switch(n.getNodeType()) {
			case ASSIGN: this.storeExpression(n); flag = false; break;
			case FUNCTION_INVOKE: this.storeExpression(n); flag = false; break;
			case BRANCH: this.branch(n); flag = false; break;
			case WHILE: this.whileStmt(n); flag = false; break;
			case DO_WHILE: this.doWhileStmt(n); flag = false; break;
			case FOR: this.forStmt(n); flag = false; break;
			case BLOCK: this.addStatement(new TACBlockStatement()); break; //TODO: distinguish between enter and exit
			case FUNCTION_DECLARATION: this.addStatement(new TACFuncDeclarationStatement(((ProcedureNode)n).getProcedureName())); break;
			case RETURN: this.addStatement(new TACReturnStatement(this.storeExpression(n))); flag = false;break;
			case PRINT: this.addStatement(new TACPrintStatement(this.storeExpression(n))); flag = false; break;
			case SCAN: this.addStatement(new TACScanStatement(n.getChild(0).getValue().toString())); flag = false; break;
			default:
				break;
			}
			if(flag)
				for (AbstractSyntaxTree child : n.getChildren()) {
					queue.add(child);
				}
			
		}
	}
	
	private void forStmt(AbstractSyntaxTree node) {
		this.storeExpression(node.getChild(0));
		
		int currentLblCount = this.labelCount + 1;
		TACLoopStatement stmt = new TACLoopStatement(this.storeExpression(node.getChild(1)));
		this.addStatement(stmt);
		stmt.setJumpDestTrue(ICGenerator.LABEL_ALIAS+(this.labelCount+1));
		this.storeExpression(node.getChild(2));
		this.storeStatement(node.getChild(3));
		this.addStatement(new TACGotoStatement(ICGenerator.LABEL_ALIAS+currentLblCount));
		stmt.setJumpDestFalse(ICGenerator.LABEL_ALIAS+(this.labelCount+1));
	}
	
	private void doWhileStmt(AbstractSyntaxTree node) {
		int currentLblCount = this.labelCount + 1;
		this.storeStatement(node.getChild(0));
		TACLoopStatement stmt = new TACLoopStatement(this.storeExpression(node.getChild(1)));
		this.addStatement(stmt);
		stmt.setJumpDestTrue(ICGenerator.LABEL_ALIAS+currentLblCount);
		stmt.setJumpDestFalse(ICGenerator.LABEL_ALIAS+(this.labelCount+1));
	}
	
	private void whileStmt(AbstractSyntaxTree node) {
		int currentLblCount = this.labelCount + 1;
		TACLoopStatement stmt = new TACLoopStatement(this.storeExpression(node.getChild(0)));
		this.addStatement(stmt);
		stmt.setJumpDestTrue(ICGenerator.LABEL_ALIAS+(this.labelCount+1));
		this.storeStatement(node.getChild(1));
		this.addStatement(new TACGotoStatement(ICGenerator.LABEL_ALIAS+currentLblCount)); //check condition if still true
		stmt.setJumpDestFalse(ICGenerator.LABEL_ALIAS+(this.labelCount+1));
	}
	
	private void branch(AbstractSyntaxTree node) {
		TACIfStatement stmt = new TACIfStatement(this.storeExpression(node.getChild(0)));
		TACGotoStatement gotoStmt = new TACGotoStatement();
		this.addStatement(stmt);
		stmt.setJumpDestTrue(ICGenerator.LABEL_ALIAS+(this.labelCount+1));
		
		this.storeStatement(node.getChild(1));
//		this.addStatement(new TACGotoStatement(ICGenerator.LABEL_ALIAS+(this.labelCount-1)));
		this.addStatement(gotoStmt);
		stmt.setJumpDestFalse(ICGenerator.LABEL_ALIAS+(this.labelCount+1));

		for(int i = 2; i < node.getChildren().size(); i++) {
			this.storeStatement(node.getChild(i));	
		}
		
		gotoStmt.setJumpDest(ICGenerator.LABEL_ALIAS+(this.labelCount+1));
	}
	
	private String storeExpression(AbstractSyntaxTree node) {
		Queue<AbstractSyntaxTree> queue = new LinkedList<AbstractSyntaxTree>();
		queue.add(node);
		TACOutputStatement stmt;
		
		while(!queue.isEmpty()) {
			AbstractSyntaxTree n = queue.poll();
			switch(n.getNodeType()) {
			case VARIABLE: 
			case LITERAL: return n.getValue().toString();
			case ASSIGN: TACAssignStatement aStmt = new TACAssignStatement(OPERATOR.getEnum(n.getValue()), this.storeExpression(n.getChild(0)), this.storeExpression(n.getChild(1)));
						 this.addAssignStatement(aStmt); break;
			case BIN_ARITHMETIC:
			case BIN_LOGIC: stmt = new TACBinaryOpStatement(OPERATOR.getEnum(n.getValue()), this.storeExpression(n.getChild(0)), this.storeExpression(n.getChild(1)));
							this.addOutputStatement(stmt);
							return stmt.getOutputRegister();
			case UNIPOST_ARITHMETIC:
			case UNIPRE_ARITHMETIC:
			case UNI_LOGIC: stmt = new TACUnaryOpStatement(OPERATOR.getEnum(n.getValue()), this.storeExpression(n.getChild(0)));
							this.addOutputStatement(stmt);
							return stmt.getOutputRegister();
			case ARRAY_ACCESS: stmt = new TACIndexingStatement(this.storeExpression(n.getChild(0)), this.storeExpression(n.getChild(1)));
							   this.addOutputStatement(stmt);
							   return stmt.getOutputRegister();
			case FUNCTION_INVOKE: return this.funcInvoke(n); 
			default:
				break;
			}
			for (AbstractSyntaxTree child : n.getChildren()) {
				queue.add(child);
			}
		}
		
		return "";
	}
	
	private String funcInvoke(AbstractSyntaxTree node) {
		ProcedureNode pNode = (ProcedureNode) node;
		ArrayList<String> params = new ArrayList<String>();
		for (AbstractSyntaxTree astNode : node.getChildren()) {
			params.add(this.storeExpression(astNode));
		}
		
		TACFuncInvokeStatement stmt = new TACFuncInvokeStatement(pNode.getProcedureName(), params);
		this.addOutputStatement(stmt);
		
		return stmt.getOutputRegister();
	}
	
	private void addAssignStatement(TACAssignStatement stmt) {
		switch (stmt.getOperator()) {
		case ASSIGN:
			break;
		default:
			TACBinaryOpStatement binOp = new TACBinaryOpStatement(OPERATOR.getOpOfAssign(stmt.getOperator()), stmt.getVariable(), stmt.getValue());
			this.addOutputStatement(binOp);
			stmt.setOperator(OPERATOR.ASSIGN);
			stmt.setValue(binOp.getOutputRegister());
			break;
		}
		this.addStatement(stmt);
	}
	
	private void addOutputStatement(TACOutputStatement stmt) {
		this.registerCount++;
		stmt.setOutputRegister(ICGenerator.REGISTER_ALIAS+this.registerCount);
		this.addStatement(stmt);
	}
	
	private void addStatement(TACStatement stmt) {
		this.labelCount++;
		this.tac.add(stmt);
		stmt.setLabel(ICGenerator.LABEL_ALIAS+this.labelCount);
	}
	
	public void print() {
		for (TACStatement tacStatement : tac) {
//			System.out.println(tacStatement.toString());
			Panel.threeACOut.setText(Panel.threeACOut.getText() + tacStatement.toString() + "\n");
		}
		Panel.threeACOut.setText(Panel.threeACOut.getText() + "\n");
	}
	
	public String getPrintText() {
		String strTac = "";
		for (TACStatement tacStatement : tac) {
			strTac += tacStatement.toString()+"\n";
		}
		return strTac;
	}

	public ArrayList<TACStatement> getTac() {
		return tac;
	}

	public void setTac(ArrayList<TACStatement> tac) {
		this.tac = tac;
	}
}
