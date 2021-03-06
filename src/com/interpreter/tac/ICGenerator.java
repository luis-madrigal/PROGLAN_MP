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
import com.interpreter.tac.arrassign.ArrayAssignType;
import com.interpreter.tac.operands.ArrayAccess;
import com.interpreter.tac.operands.Literal;
import com.interpreter.tac.operands.Operand;
import com.interpreter.tac.operands.OperandTypes;
import com.interpreter.tac.operands.Register;
import com.interpreter.tac.operands.StructAccess;
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
		this.storeStatement(tree);
		if(!isField)
			this.addStatement(new TACFuncDeclarationStatement(NodeType.FUNCTION_END, this.methodName));
		else
			this.addStatement(new TACFieldDeclarationStatement(NodeType.FIELD_DEC_END));
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
			case UNI_LOGIC:
			case ARRAY_ACCESS: 
			case STRUCT_ACCESS: 
			case BIN_ARITHMETIC:
			case BIN_LOGIC:
			case FUNCTION_INVOKE: this.storeExpression(n); flag = false; break;
			case ASSIGN: TACAssignStatement aStmt = new TACAssignStatement(n.getNodeType(), OPERATOR.getEnum(n.getValue()), this.storeExpression(n.getChild(0)), this.storeExpression(n.getChild(1)), n.isBreakpoint());
			 			 this.addAssignStatement(aStmt); flag = false; break;
			case VAR_DECLARE: this.declareVar(n); break;
			case BRANCH: this.branch(n); flag = false; break;
			case WHILE: this.whileStmt(n); flag = false; break;
			case DO_WHILE: this.doWhileStmt(n); flag = false; break;
			case FOR: this.forStmt(n); flag = false; break;
			case BLOCK: break;
			case FIELD_DEC: this.addStatement(new TACFieldDeclarationStatement(n.getNodeType(), n.isBreakpoint())); break;
			case FUNCTION_DECLARATION: this.declareFunc(n); this.addStatement(new TACFuncDeclarationStatement(n.getNodeType(), ((ProcedureNode)n).getProcedureName(), n.isBreakpoint())); break;
			case RETURN: 
				if(n.getChildren().size() > 0)//error here
					this.addStatement(new TACReturnStatement(n.getNodeType(), this.storeExpression(n.getChild(0)), n.isBreakpoint()));
				else
					this.addStatement(new TACReturnStatement(n.getNodeType(), null, n.isBreakpoint())); 
				flag = false;
				break;
			case PRINT: this.addStatement(new TACPrintStatement(n.getNodeType(), this.storeExpression(n.getChild(0)), n.isBreakpoint())); flag = false; break;
			case SCAN: this.addStatement(new TACScanStatement(n.getNodeType(), (Variable) this.storeExpression(n.getChild(0)), n.isBreakpoint())); flag = false; break;
			case ARRAY_ASSIGN: this.assignArray(n); flag = false; break;
			default:
				break;
			}
			if(currentMethodBlock != null) {
				if(currentMethodBlock.getChildren().size() > 0 && currentMethodBlock.getChild(currentMethodBlock.getChildren().size()-1).equals(n)) { //if block is finished
					this.exitBlock(n.isBreakpoint());
				}
			}
			if(flag) 
				for (AbstractSyntaxTree child : n.getChildren()) {
					queue.add(child);
				}
			
			
		}
	}
	
	private void assignArray(AbstractSyntaxTree n) {
		SymbolContext sctx = (SymbolContext) n.getChild(0).getValue();
		this.currentScope.addToScope(sctx);
		
		TACArrayAssignStatement stmt = new TACArrayAssignStatement(sctx, n.getNodeType(), n.isBreakpoint());
		
		if(n.getChild(1).getNodeType() == NodeType.VARIABLE) {
			stmt.setAssignType(ArrayAssignType.ARRAY_DEREF);
		} else {
			if(n.getChild(1).getChild(0).getNodeType() == NodeType.ARRAY_BLOCK)
				stmt.setAssignType(ArrayAssignType.ARRAY_BLOCK);
			else
				stmt.setAssignType(ArrayAssignType.ARRAY_DIMS);
		}
		
		if(n.getChild(1).getNodeType() == NodeType.VARIABLE)
			stmt.setValue(this.storeExpression(n.getChild(1)));
		else
			stmt.setValue(this.evalArrayInit(n.getChild(1)));
		
		this.addStatement(stmt);	
	}
	
	private Operand evalArrayInit(AbstractSyntaxTree n) {
		if(n.getChild(0).getNodeType() == NodeType.ARRAY_BLOCK) {
			TACArrayBlockStatement bStmt = new TACArrayBlockStatement(NodeType.ARRAY_BLOCK, n.isBreakpoint());
			bStmt.initArr(n.getChildren().size());
			for(int i = 0; i < n.getChildren().size(); i++) {
				bStmt.add(i, this.storeExpression(n.getChild(i)));
			}
			return this.addOutputStatement(bStmt);
		} else {
			TACArrayDimsStatement dStmt = new TACArrayDimsStatement(NodeType.ARRAY_DIMS, n.isBreakpoint());
			dStmt.initArr(n.getChildren().size());
			for (int i = 0; i < n.getChildren().size(); i++) {
				dStmt.add(i, this.storeExpression(n.getChild(i)));
			}
			return this.addOutputStatement(dStmt);
		}
	}
	
	private void declareVar(AbstractSyntaxTree n) {
		LeafNode lNode = (LeafNode) n.getChild(0);
		SymbolContext ctx = (SymbolContext) lNode.getValue();
		this.addStatement(new TACVariableDeclaration(NodeType.VAR_DECLARE, ctx, n.isBreakpoint()));
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
		this.storeStatement(node.getChild(0));
		this.enterBlock(node.isBreakpoint());
		int currentLblCount = this.labelCount + 1;
		TACLoopStatement stmt = new TACLoopStatement(node.getNodeType(), this.storeExpression(node.getChild(1)), node.isBreakpoint());
		this.addStatement(stmt);
		stmt.setJumpDestTrue(ICGenerator.LABEL_ALIAS+(this.labelCount+1));
		this.storeStatement(node.getChild(3));

		this.storeExpression(node.getChild(2));
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
		this.exitBlock(node.isBreakpoint());
		this.addStatement(gotoStmt);
		stmt.setJumpDestFalse(ICGenerator.LABEL_ALIAS+(this.labelCount+1));

		for(int i = 2; i < node.getChildren().size(); i++) {
			if(node.getChild(i).getNodeType().equals(NodeType.BLOCK)) {
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
			case VARIABLE:
				SymbolContext ctx = (SymbolContext)n.getValue();
				return new Variable(OperandTypes.VARIABLE, ctx.getValue(), ctx.getIdentifier());
			case LITERAL: return new Literal(OperandTypes.LITERAL, LiteralMatcher.instance().parseAttempt(n.getValue()), LITERAL_TYPE.getEnum(((LeafNode)n).getLiteralType()));
			case ARRAY_ACCESS: return this.arrayAccess(n);
			case STRUCT_ACCESS: return this.structAccess(n);
			case ASSIGN: TACAssignStatement aStmt = new TACAssignStatement(n.getNodeType(), OPERATOR.getEnum(n.getValue()), this.storeExpression(n.getChild(0)), this.storeExpression(n.getChild(1)), n.isBreakpoint());
						 this.addAssignStatement(aStmt);
			case BIN_ARITHMETIC:
			case BIN_LOGIC: stmt = new TACBinaryOpStatement(n.getNodeType(), OPERATOR.getEnum(n.getValue()), this.storeExpression(n.getChild(0)), this.storeExpression(n.getChild(1)), n.isBreakpoint());
							return this.addOutputStatement(stmt);
			case UNIPOST_ARITHMETIC:
			case UNIPRE_ARITHMETIC:
			case UNI_LOGIC: stmt = new TACUnaryOpStatement(n.getNodeType(), OPERATOR.getEnum(n.getValue()), this.storeExpression(n.getChild(0)), n.isBreakpoint());
							return this.addOutputStatement(stmt);
			case ARRAY_INIT: return this.evalArrayInit(n);
			case ARRAY_BLOCK: return this.genArrayBlock(n);
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
	
	private StructAccess structAccess(AbstractSyntaxTree node) {
		SymbolContext ctx = (SymbolContext) node.getValue();
		StructAccess s = new StructAccess(ctx.getIdentifier(), OperandTypes.STRUCT_ACCESS, ctx.getValue());
		
		for(int i = 0; i < node.getChildren().size(); i++) {
			s.addVar((Variable) this.storeExpression(node.getChild(i)));
		}
		
		return s;
	}
	
	private ArrayAccess arrayAccess(AbstractSyntaxTree node) {
		SymbolContext ctx = (SymbolContext) node.getValue();
		ArrayAccess a = new ArrayAccess(ctx.getIdentifier(), OperandTypes.ARR_ACCESS, ctx.getValue());
		
		for(int i = 0; i < node.getChildren().size(); i++) {
			a.addIndex(this.storeExpression(node.getChild(i)));
		}
		
		return a;
	}
	
	private Operand genArrayBlock(AbstractSyntaxTree node) {
		TACArrayBlockStatement stmt = new TACArrayBlockStatement(NodeType.ARRAY_BLOCK, node.isBreakpoint());
		stmt.initArr(node.getChildren().size());
		for(int i = 0; i < node.getChildren().size(); i++) {
			stmt.add(i, this.storeExpression(node.getChild(i)));
		}
		
		return this.addOutputStatement(stmt);
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
			TACBinaryOpStatement binOp = new TACBinaryOpStatement(NodeType.BIN_ARITHMETIC, OPERATOR.getOpOfAssign(stmt.getOperator()), stmt.getOperand(), stmt.getValue(), stmt.isBreakpoint());
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
	}
	
	public void print() {
		for (TACStatement tacStatement : tac) {
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
		if(!scopes.peek().getChildren().isEmpty())
			return scopes.peek().getChildren().get(0);
		return scopes.peek();
	}

}
