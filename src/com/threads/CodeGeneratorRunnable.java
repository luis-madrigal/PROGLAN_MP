package com.threads;

import java.util.HashMap;

import com.ide.Panel;
import com.interpreter.AST.ASTBuildVisitor;
import com.interpreter.codegen.CodeGenerator;
import com.interpreter.contexts.MethodContext;

public class CodeGeneratorRunnable implements Runnable {
	private ASTBuildVisitor astbv;
	private HashMap<String, MethodContext> methodTable;
	private boolean isRunning;
	volatile boolean isPlay = false;
	
	public CodeGeneratorRunnable(ASTBuildVisitor astbv, HashMap<String, MethodContext> methodTable) {
		this.astbv = astbv;
		this.methodTable = methodTable;
		this.isRunning = true;
		this.isPlay = true;
		
	}
	
	public void play() {
        isPlay = true;
    }
	
	public void pause() {
        isPlay = false;
    }
	
	public void stop() {
		this.isRunning = false;
	}
	
	
	@Override
	public void run() {
		CodeGenerator codegen = new CodeGenerator(astbv.getMethodASTTable(), methodTable);
		codegen.run();
		
		while(isRunning) {
			if(isPlay) {
				System.out.println("Play");
				// TODO: Continue per line processing
			}
		}
	}
	
}
