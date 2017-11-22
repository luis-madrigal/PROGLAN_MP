package com.interpreter.codegen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.interpreter.AST.ProcedureNode;
import com.interpreter.tac.ICGenerator;
import com.interpreter.tac.TACStatement;

public class CodeGenerator {
	
	private HashMap<String, HashMap<String, TACStatement>> methodICodes;
	private HashMap<String, ArrayList<TACStatement>> registers;

	public CodeGenerator(HashMap<String, ProcedureNode> methodASTTable) {
		this.methodICodes = new HashMap<String, HashMap<String, TACStatement>>();
		ICGenerator icg = new ICGenerator();
		
		for (Map.Entry<String, ProcedureNode> entry : methodASTTable.entrySet()) {
			System.out.println("GENERATE ICODE FOR: "+entry.getKey());
			
			this.methodICodes.put(entry.getKey(), this.convertToMap(icg.generateICode(entry.getValue())));
			icg.print();
		}
	}
	
	public void run() {
		this.run(methodICodes.get("main"));
	}
	
	private void run(HashMap<String, TACStatement> icode) {
		
	}
	
	private HashMap<String, TACStatement> convertToMap(ArrayList<TACStatement> icode) {
		HashMap<String, TACStatement> tacMap = new HashMap<String, TACStatement>();
		
		for (TACStatement tacStatement : icode) {
			tacMap.put(tacStatement.getLabel(), tacStatement);
		}
		
		return tacMap;
	}
}
