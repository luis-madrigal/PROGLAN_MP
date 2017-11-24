package com.threads;

import java.util.HashMap;

import com.interpreter.AST.ASTBuildVisitor;
import com.interpreter.codegen.CodeGenerator;
import com.interpreter.contexts.MethodContext;

public class CodeGeneratorThread extends Thread {
	private ASTBuildVisitor astbv;
	private HashMap<String, MethodContext> methodTable;
	
	public CodeGeneratorThread(ASTBuildVisitor astbv, HashMap<String, MethodContext> methodTable) {
		this.astbv = astbv;
		this.methodTable = methodTable;
		
	}
	
	@Override
	public void run() {
		super.run();

		CodeGenerator codegen = new CodeGenerator(astbv.getMethodASTTable(), methodTable);
		codegen.run();
	}
}
