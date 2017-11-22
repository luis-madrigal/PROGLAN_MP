package com.interpreter.codegen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import com.ide.Panel;
import com.interpreter.Scope;
import com.interpreter.AST.NodeType;
import com.interpreter.AST.ProcedureNode;
import com.interpreter.tac.ICGenerator;
import com.interpreter.tac.TACFuncInvokeStatement;
import com.interpreter.tac.TACStatement;
import com.interpreter.tac.operands.Operand;
import com.interpreter.tac.operands.Variable;

public class CodeGenerator {
	
	private HashMap<String, ArrayList<TACStatement>> methodICodes;
	private HashMap<String, TACStatement> labelMap;
	private HashMap<String, ArrayList<TACStatement>> registers;
	private HashMap<String, Variable> variables;
	private Stack<Scope> scopes;
	
	private ArrayList<Integer> levelIndexTracker;
    private int lvlDepth;
    private int lvlIndex;
    private int nExitBlock;

	public CodeGenerator(HashMap<String, ProcedureNode> methodASTTable) {
		this.methodICodes = new HashMap<String, ArrayList<TACStatement>>();
		this.labelMap = new HashMap<String, TACStatement>();
		ICGenerator icg = new ICGenerator();
		
		for (Map.Entry<String, ProcedureNode> entry : methodASTTable.entrySet()) {
			Panel.threeACOut.setText(Panel.threeACOut.getText() + "ICODE FOR: "+entry.getKey() + "\n");
//			System.out.println("GENERATE ICODE FOR: "+entry.getKey());
			
			this.methodICodes.put(entry.getKey(), icg.generateICode(entry.getValue()));
			this.addToLabelMap(this.methodICodes.get(entry.getKey()));
			icg.print();
		}
		
		this.levelIndexTracker = new ArrayList<>();
        this.levelIndexTracker.add(0);
        System.out.println("init size: "+levelIndexTracker.size());
        this.lvlIndex = 0;
        this.lvlDepth = 0;
        this.nExitBlock = 0;
	}
	
	public void run() {
//		this.run(methodICodes.get("main"));
	}
	
	private void run(ArrayList<TACStatement> icode, Operand ...args) {//TODO: store the arguments in variables
		String pointer = icode.get(0).getLabel();
		int pointerCount = Integer.parseInt(icode.get(0).getLabel().substring(1));
		TACStatement stmt;
		
		while(!(stmt = this.labelMap.get(pointer)).getType().equals(NodeType.RETURN)) {
			this.evaluate(stmt, pointerCount);
			pointer = ICGenerator.LABEL_ALIAS+pointerCount;
		}
	}
	
	private void evaluate(TACStatement statement, int pointerCount) {
		switch (statement.getType()) {
		case BLOCK:
			
			break;
		case BIN_ARITHMETIC:
			
			break;
		case FUNCTION_INVOKE: 
			TACFuncInvokeStatement stmt = ((TACFuncInvokeStatement) statement);
			this.run(this.methodICodes.get(stmt.getMethodName()), stmt.getParams().toArray(new Operand[stmt.getParams().size()]));
		default:
			break;
		}
	}
	
	private HashMap<String, TACStatement> addToLabelMap(ArrayList<TACStatement> icode) {
		for (TACStatement tacStatement : icode) {
			this.labelMap.put(tacStatement.getLabel(), tacStatement);
		}
		
		return this.labelMap;
	}
}
