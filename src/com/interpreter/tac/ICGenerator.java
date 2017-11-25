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
import com.utils.KeyTokens.LITERAL_TYPE;
import com.utils.KeyTokens.OPERATOR;

public class ICGenerator {
	
	public static final String LABEL_ALIAS = "L";
	public static final String REGISTER_ALIAS = "T";
	
	private ArrayList<TACStatement> tac;
	private int registerCount;
	private int labelCount;
	private AbstractSyntaxTree currentMethodBlock;
	private Stack<Scope> scopes;
	private Scope currentScope;
	private HashMap<String, MethodContext> methodTable;
	private String methodName;
	
	public ICGenerator(HashMap<String, MethodContext> methodTable) {
		this.registerCount = 0;
		this.labelCount = 0;
		this.methodTable = methodTable;
	}
	
	public ArrayList<TACStatement> generateICode(AbstractSyntaxTree tree, boolean isField) {
		this.tac = new ArrayList<TACStatement>();
		this.scopes = new Stack<Scope>();
		Scope s = new Scope(null);
		this.scopes.push(s);
		this.currentScope = s;
//		registerCount = 0;
//		labelCount = 0;
		this.storeStatement(tree);
		if(!isField)
			this.addStatement(new TACFuncDeclarationStatement(NodeType.FUNCTION_END, this.methodName));
		else
			this.addStatement(new TACFuncDeclarationStatement(NodeType.FIELD_DEC_END, "%FIELD"));
		return this.tac;
	}
	
	public void storeStatement(AbstractSyntaxTree node) {
		boolean flag = true;
		Queue<AbstractSyntaxTree> queue = new LinkedList<AbstractSyntaxTree>();
		queue.add(node);
		while (!queue.isEmpty()) {
			AbstractSyntaxTree n = queue.poll();
			switch(n.getNodeType()) {
			case UNIPOST_ARITHMETIC:
			case UNIPRE_ARITHMETIC:
			case ASSIGN: this.storeExpression(n); flag = false; break;
			case VAR_DECLARE: this.declareVar(n); break;
			case FUNCTION_INVOKE: this.storeExpression(n); flag = false; break;
			case BRANCH: this.branch(n); flag = false; break;
			case WHILE: this.whileStmt(n); flag = false; break;
			case DO_WHILE: this.doWhileStmt(n); flag = false; break;
			case FOR: this.forStmt(n); flag = false; break;
			case BLOCK: break;
			case FUNCTION_DECLARATION: this.declareFunc(n); this.addStatement(new TACFuncDeclarationStatement(n.getNodeType(), ((ProcedureNode)n).getProcedureName(), n.isBreakpoint())); break;
			case RETURN: this.addStatement(new TACReturnStatement(n.getNodeType(), this.storeExpression(n.getChild(0)), n.isBreakpoint())); flag = false;break;
			case PRINT: this.addStatement(new TACPrintStatement(n.getNodeType(), this.storeExpression(n.getChild(0)), n.isBreakpoint())); flag = false; break;
			case SCAN: this.addStatement(new TACScanStatement(n.getNodeType(), (Variable) this.storeExpression(n.getChild(0)), n.isBreakpoint())); flag = false; break;
			default:
				break;
			}
			if(currentMethodBlock != null && currentMethodBlock.getChild(currentMethodBlock.getChildren().size()-1).equals(n)) { //if block is finished
				this.exitBlock(n.isBreakpoint());
			}
			if(flag) 
				for (AbstractSyntaxTree child : n.getChildren()) {
					queue.add(child);
				}
			
			
		}
	}
	
	private void declareVar(AbstractSyntaxTree n) {
		LeafNode lNode = (LeafNode) n.getChild(0);
		SymbolContext ctx = (SymbolContext) lNode.getValue();
		this.addStatement(new TACVariableDeclaration(n.getNodeType(), ctx, n.isBreakpoint()));
		this.currentScope.addToScope(ctx);
		
		if(n.getValue() != null) {
			Operand value = this.storeExpression(n.getChild(1));
			TACAssignStatement aStmt = new TACAssignStatement(NodeType.ASSIGN, OPERATOR.getEnum(n.getValue()), new Variable(OperandTypes.VARIABLE, value, ctx.getIdentifier()), value, n.isBreakpoint());
			this.addAssignStatement(aStmt);
		}
	}
	
	private void declareFunc(AbstractSyntaxTree n) {
		this.enterBlock(n.isBreakpoint());
		this.currentMethodBlock = n.getChild(0);
		
		ProcedureNode pNode = (ProcedureNode) n;
		this.methodName = pNode.getProcedureName();
		MethodContext ctx = this.methodTable.get(pNode.getProcedureName());
		for(int i = 0; i < ctx.getArgs().size(); i++) {
			this.currentScope.addToScope(new SymbolContext(ctx.getArgTypes().get(i), this.currentScope,ctx.getArgs().get(i)));
		}
	}
	
	private void enterBlock(boolean isBreakpoint) {
		TACBlockStatement bs = new TACBlockStatement(NodeType.BLOCK, true, isBreakpoint);
		this.addStatement(bs); 
		bs.setLabel(ICGenerator.LABEL_ALIAS+this.labelCount);
		Scope s = new Scope(scopes.peek());
		s.setLabel(ICGenerator.LABEL_ALIAS+this.labelCount);
		scopes.peek().addChild(s);
		scopes.push(s);
		this.currentScope = s;
	}
	
	private void exitBlock(boolean isBreakpoint) {
		TACBlockStatement bs = new TACBlockStatement(NodeType.BLOCK, false, isBreakpoint);
		this.addStatement(bs); 
		bs.setLabel(ICGenerator.LABEL_ALIAS+this.labelCount);
		scopes.pop();
		this.currentScope = scopes.peek();
	}
	
	private void forStmt(AbstractSyntaxTree node) {
		this.enterBlock(node.isBreakpoint());
		this.storeStatement(node.getChild(0));
		int currentLblCount = this.labelCount + 1;
		TACLoopStatement stmt = new TACLoopStatement(node.getNodeType(), this.storeExpression(node.getChild(1)), node.isBreakpoint());
		this.addStatement(stmt);
		stmt.setJumpDestTrue(ICGenerator.LABEL_ALIAS+(this.labelCount+1));
		this.storeStatement(node.getChild(3));

		this.addStatement(new TACGotoStatement(NodeType.GOTO, ICGenerator.LABEL_ALIAS+currentLblCount, stmt.isBreakpoint()));
		this.exitBlock(node.isBreakpoint());
		stmt.setJumpDestFalse(ICGenerator.LABEL_ALIAS+(this.labelCount));
	}
	
	private void doWhileStmt(AbstractSyntaxTree node) {
		this.enterBlock(node.isBreakpoint());
		int currentLblCount = this.labelCount;
		this.storeStatement(node.getChild(0));
		this.exitBlock(node.isBreakpoint());
		TACLoopStatement stmt = new TACLoopStatement(node.getNodeType(), this.storeExpression(node.getChild(1)), node.isBreakpoint());
		this.addStatement(stmt);
		stmt.setJumpDestTrue(ICGenerator.LABEL_ALIAS+currentLblCount);
		stmt.setJumpDestFalse(ICGenerator.LABEL_ALIAS+(this.labelCount+1));
	}
	
	private void whileStmt(AbstractSyntaxTree node) {
		int currentLblCount = this.labelCount + 1;
		TACLoopStatement stmt = new TACLoopStatement(node.getNodeType(), this.storeExpression(node.getChild(0)), node.isBreakpoint());
		this.addStatement(stmt);
		this.enterBlock(node.isBreakpoint());
		stmt.setJumpDestTrue(ICGenerator.LABEL_ALIAS+(this.labelCount));
		this.storeStatement(node.getChild(1));
		this.exitBlock(node.isBreakpoint());
		this.addStatement(new TACGotoStatement(NodeType.GOTO, ICGenerator.LABEL_ALIAS+currentLblCount, stmt.isBreakpoint())); //check condition if still true
		stmt.setJumpDestFalse(ICGenerator.LABEL_ALIAS+(this.labelCount+1));
	}
	
	private void branch(AbstractSyntaxTree node) {
		TACIfStatement stmt = new TACIfStatement(node.getNodeType(), this.storeExpression(node.getChild(0)), node.isBreakpoint());
		TACGotoStatement gotoStmt = new TACGotoStatement(NodeType.GOTO, node.isBreakpoint());
		this.addStatement(stmt);
		this.enterBlock(node.isBreakpoint());
		stmt.setJumpDestTrue(ICGenerator.LABEL_ALIAS+(this.labelCount));
		
		this.storeStatement(node.getChild(1));
//		this.addStatement(new TACGotoStatement(ICGenerator.LABEL_ALIAS+(this.labelCount-1)));
		this.exitBlock(node.isBreakpoint());
		this.addStatement(gotoStmt);
		stmt.setJumpDestFalse(ICGenerator.LABEL_ALIAS+(this.labelCount+1));

		for(int i = 2; i < node.getChildren().size(); i++) {
			if(node.getChild(i).getNodeType().equals(NodeType.BLOCK)) { //ELSE STMT
				this.enterBlock(node.isBreakpoint());
				this.storeStatement(node.getChild(i));	
				this.exitBlock(node.isBreakpoint());
			} else {
				this.storeStatement(node.getChild(i));
			}
			
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
			case VARIABLE: System.out.println(n.getValue());
				SymbolContext ctx = (SymbolContext)n.getValue();
				return new Variable(OperandTypes.VARIABLE, ctx.getValue(), ctx.getIdentifier());
			case LITERAL: return new Literal(OperandTypes.LITERAL, LiteralMatcher.instance().parseAttempt(n.getValue()), LITERAL_TYPE.getEnum(((LeafNode)n).getLiteralType()));
			case ASSIGN: TACAssignStatement aStmt = new TACAssignStatement(node.getNodeType(), OPERATOR.getEnum(n.getValue()), (Variable)this.storeExpression(n.getChild(0)), this.storeExpression(n.getChild(1)), n.isBreakpoint());
						 this.addAssignStatement(aStmt); break;
			case BIN_ARITHMETIC:
			case BIN_LOGIC: stmt = new TACBinaryOpStatement(node.getNodeType(), OPERATOR.getEnum(n.getValue()), this.storeExpression(n.getChild(0)), this.storeExpression(n.getChild(1)), n.isBreakpoint());
							return this.addOutputStatement(stmt);
			case UNIPOST_ARITHMETIC:
			case UNIPRE_ARITHMETIC:
			case UNI_LOGIC: stmt = new TACUnaryOpStatement(node.getNodeType(), OPERATOR.getEnum(n.getValue()), this.storeExpression(n.getChild(0)), n.isBreakpoint());
							return this.addOutputStatement(stmt);
			case ARRAY_ACCESS: stmt = new TACIndexingStatement(node.getNodeType(), n.getChild(0).toString(), this.storeExpression(n.getChild(1)), n.isBreakpoint());
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
		
		TACFuncInvokeStatement stmt = new TACFuncInvokeStatement(node.getNodeType(), pNode.getProcedureName(), params, node.isBreakpoint());
		return this.addOutputStatement(stmt);
	}
	
	private void addAssignStatement(TACAssignStatement stmt) {
		switch (stmt.getOperator()) {
		case ASSIGN:
			break;
		default:
			TACBinaryOpStatement binOp = new TACBinaryOpStatement(NodeType.BIN_ARITHMETIC, OPERATOR.getOpOfAssign(stmt.getOperator()), stmt.getVariable(), stmt.getValue(), stmt.isBreakpoint());
			this.addOutputStatement(binOp);
			stmt.setOperator(OPERATOR.ASSIGN);
			stmt.setValue(new Register(OperandTypes.REGISTER, binOp.getOutputRegister().getName()));
			break;
		}
		this.addStatement(stmt);
	}
	
	private Register addOutputStatement(TACOutputStatement stmt) {
		switch(stmt.getType()) {
		case UNIPRE_ARITHMETIC:
		case UNIPOST_ARITHMETIC:
			TACUnaryOpStatement unOp = (TACUnaryOpStatement) stmt;
			return this.convertUnaryOp(unOp);
		default:
			this.registerCount++;
			Register r = new Register(OperandTypes.REGISTER, ICGenerator.REGISTER_ALIAS+this.registerCount);
			stmt.setOutputRegister(r);
			this.addStatement(stmt);
			return r;
		}
		
	}
		
	private Register convertUnaryOp(TACUnaryOpStatement stmt) {
		Register r = null;
		this.registerCount++;
		r = new Register(OperandTypes.REGISTER, ICGenerator.REGISTER_ALIAS+this.registerCount);
		switch (stmt.getType()) {
		case UNIPRE_ARITHMETIC:
			switch (stmt.getOperator()) {
			case INC: 
				TACBinaryOpStatement binOp = new TACBinaryOpStatement(NodeType.BIN_ARITHMETIC, OPERATOR.ADD, stmt.getOperand1(), new Literal(OperandTypes.LITERAL, new Integer(1), LITERAL_TYPE.INT), stmt.isBreakpoint());
				binOp.setOutputRegister(r);
				this.addStatement(binOp);
				TACAssignStatement assign = new TACAssignStatement(NodeType.ASSIGN, OPERATOR.ASSIGN, (Variable)stmt.getOperand1(), r, stmt.isBreakpoint());
				this.addAssignStatement(assign);
				break;
			case DEC:
				TACBinaryOpStatement binOp2 = new TACBinaryOpStatement(NodeType.BIN_ARITHMETIC, OPERATOR.SUB, stmt.getOperand1(), new Literal(OperandTypes.LITERAL, new Integer(1), LITERAL_TYPE.INT), stmt.isBreakpoint());
				binOp2.setOutputRegister(r);
				this.addStatement(binOp2);
				TACAssignStatement assign2 = new TACAssignStatement(NodeType.ASSIGN, OPERATOR.ASSIGN, (Variable)stmt.getOperand1(), r, stmt.isBreakpoint());
				this.addAssignStatement(assign2);
				break;
			case ADD:
			case SUB:
				stmt.setOutputRegister(r);
				this.addStatement(stmt);
			default:
				break;
			} break;
		case UNIPOST_ARITHMETIC:
			switch (stmt.getOperator()) {
			case INC:
			case DEC:
				TACUnaryOpStatement unOp = new TACUnaryOpStatement(NodeType.UNIPRE_ARITHMETIC, stmt.getOperator(), stmt.getOperand1(), stmt.isBreakpoint());
				stmt.setOperator(OPERATOR.ADD);
				stmt.setOutputRegister(r);
				this.addStatement(stmt);
				this.convertUnaryOp(unOp);
				break;
			default:
				break;
			} break;
		default:
			break;
		}
		
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
//			// System.out.println(tacStatement.toString());
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

	public Scope getGlobalScope() {
		return scopes.peek();
	}
	
	public Scope getScope() {
		return scopes.peek().getChildren().get(0);
	}

}
