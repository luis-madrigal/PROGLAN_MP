package com.interpreter.tac;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import com.ide.Panel;
import com.interpreter.Scope;
import com.interpreter.AST.AbstractSyntaxTree;
import com.interpreter.AST.LeafNode;
import com.interpreter.AST.NodeType;
import com.interpreter.AST.ProcedureNode;
import com.interpreter.contexts.MethodContext;
import com.interpreter.contexts.SymbolContext;
import com.interpreter.matchers.LiteralMatcher;
import com.interpreter.tac.operands.Literal;
import com.interpreter.tac.operands.Operand;
import com.interpreter.tac.operands.OperandTypes;
import com.interpreter.tac.operands.Register;
import com.interpreter.tac.operands.Variable;
import com.utils.KeyTokens;
import com.utils.KeyTokens.OPERATOR;

public class ICGenerator {
	
	public static final String LABEL_ALIAS = "L";
	public static final String REGISTER_ALIAS = "T";
	
	private ArrayList<TACStatement> tac;
	private int registerCount;
	private int labelCount; //TODO: each instruction has label (not sure)
	private AbstractSyntaxTree currentMethodBlock;
	private Stack<Scope> scopes;
	private Scope currentScope;
	private HashMap<String, MethodContext> methodTable;
	
	public ICGenerator(HashMap<String, MethodContext> methodTable) {
		this.registerCount = 0;
		this.labelCount = 0;
		this.methodTable = methodTable;
	}
	
	public ArrayList<TACStatement> generateICode(AbstractSyntaxTree tree) {
		this.tac = new ArrayList<TACStatement>();
		this.scopes = new Stack<Scope>();
		Scope s = new Scope(null);
		this.scopes.push(s);
		this.currentScope = s;
//		registerCount = 0;
//		labelCount = 0;
		this.storeStatement(tree);
		return this.tac;
	}
	
	public void storeStatement(AbstractSyntaxTree node) {//TODO: not parseing properties
		boolean flag = true;
		Queue<AbstractSyntaxTree> queue = new LinkedList<AbstractSyntaxTree>();
		queue.add(node);
		while (!queue.isEmpty()) {
			AbstractSyntaxTree n = queue.poll();
			switch(n.getNodeType()) {
			case VAR_DECLARE: this.declareVar(n); break;
			case ASSIGN: this.storeExpression(n); flag = false; break;
			case FUNCTION_INVOKE: this.storeExpression(n); flag = false; break;
			case BRANCH: this.branch(n); flag = false; break;
			case WHILE: this.whileStmt(n); flag = false; break;
			case DO_WHILE: this.doWhileStmt(n); flag = false; break;
			case FOR: this.forStmt(n); flag = false; break;
			case BLOCK: break; //TODO: distinguish between enter and exit
			case FUNCTION_DECLARATION: this.declareFunc(n); this.addStatement(new TACFuncDeclarationStatement(n.getNodeType(), ((ProcedureNode)n).getProcedureName())); break;
			case RETURN: this.addStatement(new TACReturnStatement(n.getNodeType(), this.storeExpression(n))); flag = false;break;
			case PRINT: this.addStatement(new TACPrintStatement(n.getNodeType(), this.storeExpression(n))); flag = false; break;
			case SCAN: this.addStatement(new TACScanStatement(n.getNodeType(), n.getChild(0).getValue().toString())); flag = false; break;
			default:
				break;
			}
			if(currentMethodBlock != null && currentMethodBlock.getChild(currentMethodBlock.getChildren().size()-1).equals(n)) { //if block is finished
				this.exitBlock();
			}
			if(flag) 
				for (AbstractSyntaxTree child : n.getChildren()) {
					queue.add(child);
				}
			
			
		}
	}
	
	private void declareVar(AbstractSyntaxTree n) {
		LeafNode lNode = (LeafNode) n.getChild(0);
		SymbolContext ctx = new SymbolContext(lNode.getLiteralType(), this.currentScope, lNode.getValue().toString());
		this.addStatement(new TACVariableDeclaration(n.getNodeType(), ctx));
		this.currentScope.addToScope(ctx);
	}
	
	private void declareFunc(AbstractSyntaxTree n) {
		this.enterBlock();
		this.currentMethodBlock = n.getChild(0);
		
		ProcedureNode pNode = (ProcedureNode) n;
		MethodContext ctx = this.methodTable.get(pNode.getProcedureName());
		for(int i = 0; i < ctx.getArgs().size(); i++) {
			this.currentScope.addToScope(new SymbolContext(ctx.getArgTypes().get(i), this.currentScope,ctx.getArgs().get(i)));
		}
	}
	
	private void enterBlock() {
		TACBlockStatement bs = new TACBlockStatement(NodeType.BLOCK, true);
		this.addStatement(bs); 
		bs.setLabel(ICGenerator.LABEL_ALIAS+this.labelCount);
		Scope s = new Scope(scopes.peek());
		s.setLabel(ICGenerator.LABEL_ALIAS+this.labelCount);
		scopes.peek().addChild(s);
		scopes.push(s);
		this.currentScope = s;
	}
	
	private void exitBlock() {
		TACBlockStatement bs = new TACBlockStatement(NodeType.BLOCK, false);
		this.addStatement(bs); 
		bs.setLabel(ICGenerator.LABEL_ALIAS+this.labelCount);
		scopes.pop();
		this.currentScope = scopes.peek();
	}
	
	private void forStmt(AbstractSyntaxTree node) {
		this.storeExpression(node.getChild(0));
		
		int currentLblCount = this.labelCount + 1;
		TACLoopStatement stmt = new TACLoopStatement(node.getNodeType(), this.storeExpression(node.getChild(1)));
		this.addStatement(stmt);
		this.enterBlock();
		stmt.setJumpDestTrue(ICGenerator.LABEL_ALIAS+(this.labelCount+1));
		this.storeExpression(node.getChild(2));
		this.storeStatement(node.getChild(3));
		this.exitBlock();
		this.addStatement(new TACGotoStatement(NodeType.GOTO, ICGenerator.LABEL_ALIAS+currentLblCount));
		stmt.setJumpDestFalse(ICGenerator.LABEL_ALIAS+(this.labelCount+1));
	}
	
	private void doWhileStmt(AbstractSyntaxTree node) {
		this.enterBlock();
		int currentLblCount = this.labelCount + 1;
		this.storeStatement(node.getChild(0));
		TACLoopStatement stmt = new TACLoopStatement(node.getNodeType(), this.storeExpression(node.getChild(1)));
		this.addStatement(stmt);
		stmt.setJumpDestTrue(ICGenerator.LABEL_ALIAS+currentLblCount);
		stmt.setJumpDestFalse(ICGenerator.LABEL_ALIAS+(this.labelCount+1));
		this.exitBlock();
	}
	
	private void whileStmt(AbstractSyntaxTree node) {
		int currentLblCount = this.labelCount + 1;
		TACLoopStatement stmt = new TACLoopStatement(node.getNodeType(), this.storeExpression(node.getChild(0)));
		this.addStatement(stmt);
		this.enterBlock();
		stmt.setJumpDestTrue(ICGenerator.LABEL_ALIAS+(this.labelCount+1));
		this.storeStatement(node.getChild(1));
		this.exitBlock();
		this.addStatement(new TACGotoStatement(NodeType.GOTO, ICGenerator.LABEL_ALIAS+currentLblCount)); //check condition if still true
		stmt.setJumpDestFalse(ICGenerator.LABEL_ALIAS+(this.labelCount+1));
	}
	
	private void branch(AbstractSyntaxTree node) {
		TACIfStatement stmt = new TACIfStatement(node.getNodeType(), this.storeExpression(node.getChild(0)));
		TACGotoStatement gotoStmt = new TACGotoStatement(NodeType.GOTO);
		this.addStatement(stmt);
		this.enterBlock();
		stmt.setJumpDestTrue(ICGenerator.LABEL_ALIAS+(this.labelCount+1));
		
		this.storeStatement(node.getChild(1));
//		this.addStatement(new TACGotoStatement(ICGenerator.LABEL_ALIAS+(this.labelCount-1)));
		this.exitBlock();
		this.addStatement(gotoStmt);
		stmt.setJumpDestFalse(ICGenerator.LABEL_ALIAS+(this.labelCount+1));

		for(int i = 2; i < node.getChildren().size(); i++) {
			this.storeStatement(node.getChild(i));	
		}
		
		gotoStmt.setJumpDest(ICGenerator.LABEL_ALIAS+(this.labelCount+1));
	}
	
	private Operand storeExpression(AbstractSyntaxTree node) {
		Queue<AbstractSyntaxTree> queue = new LinkedList<AbstractSyntaxTree>();
		queue.add(node);
		TACOutputStatement stmt;
		
		while(!queue.isEmpty()) {
			AbstractSyntaxTree n = queue.poll();
			switch(n.getNodeType()) {
			case VARIABLE: return new Variable(OperandTypes.VARIABLE, n.getValue(), n.getValue().toString());
			case LITERAL: return new Literal(OperandTypes.LITERAL, LiteralMatcher.instance().parseAttempt(n.getValue()), KeyTokens.LITERAL_TYPE.getEnum(((LeafNode)n).getLiteralType()));
			case ASSIGN: TACAssignStatement aStmt = new TACAssignStatement(node.getNodeType(), OPERATOR.getEnum(n.getValue()), (Variable)this.storeExpression(n.getChild(0)), this.storeExpression(n.getChild(1)));
						 this.addAssignStatement(aStmt); break;
			case BIN_ARITHMETIC:
			case BIN_LOGIC: stmt = new TACBinaryOpStatement(node.getNodeType(), OPERATOR.getEnum(n.getValue()), this.storeExpression(n.getChild(0)), this.storeExpression(n.getChild(1)));
							return this.addOutputStatement(stmt);
			case UNIPOST_ARITHMETIC:
			case UNIPRE_ARITHMETIC:
			case UNI_LOGIC: stmt = new TACUnaryOpStatement(node.getNodeType(), OPERATOR.getEnum(n.getValue()), this.storeExpression(n.getChild(0)));
							return this.addOutputStatement(stmt);
			case ARRAY_ACCESS: stmt = new TACIndexingStatement(node.getNodeType(), n.getChild(0).toString(), this.storeExpression(n.getChild(1)));
							   return this.addOutputStatement(stmt);
			case FUNCTION_INVOKE: return this.funcInvoke(n); 
			default:
				break;
			}
			for (AbstractSyntaxTree child : n.getChildren()) {
				queue.add(child);
			}
		}
		
		return null;
	}
	
	private Operand funcInvoke(AbstractSyntaxTree node) {
		ProcedureNode pNode = (ProcedureNode) node;
		ArrayList<Operand> params = new ArrayList<Operand>();
		for (AbstractSyntaxTree astNode : node.getChildren()) {
			params.add(this.storeExpression(astNode));
		}
		
		TACFuncInvokeStatement stmt = new TACFuncInvokeStatement(node.getNodeType(), pNode.getProcedureName(), params);
		return this.addOutputStatement(stmt);
	}
	
	private void addAssignStatement(TACAssignStatement stmt) {
		switch (stmt.getOperator()) {
		case ASSIGN:
			break;
		default:
			TACBinaryOpStatement binOp = new TACBinaryOpStatement(NodeType.BIN_ARITHMETIC, OPERATOR.getOpOfAssign(stmt.getOperator()), stmt.getVariable(), stmt.getValue());
			this.addOutputStatement(binOp);
			stmt.setOperator(OPERATOR.ASSIGN);
			stmt.setValue(new Operand(OperandTypes.REGISTER, binOp.getOutputRegister()));
			break;
		}
		this.addStatement(stmt);
	}
	
	private Register addOutputStatement(TACOutputStatement stmt) {
		this.registerCount++;
		Register r = new Register(OperandTypes.REGISTER, ICGenerator.REGISTER_ALIAS+this.registerCount);
		stmt.setOutputRegister(r);
		this.addStatement(stmt);
		
		return r;
	}
	
	private void addStatement(TACStatement stmt) {
		this.labelCount++;
		this.tac.add(stmt);
		stmt.setLabel(ICGenerator.LABEL_ALIAS+this.labelCount);
		System.out.println(stmt.toString());
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

	public Scope getScope() {
		return scopes.peek();
	}

}
