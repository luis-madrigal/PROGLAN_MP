package com.parser;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Stack;

import com.interpreter.AST.ASTBuildVisitor;
import com.interpreter.contexts.MethodContext;
import com.interpreter.tac.ICGenerator;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import com.debug.watch.VariableNode;
import com.ide.Panel;
import com.interpreter.BaseListener;
import com.interpreter.Scope;
import com.interpreter.SemanticErrors;
import com.parser.ManuScriptLexer;
import com.parser.ManuScriptParser;
import com.threads.CodeGeneratorRunnable;
import com.utils.Console;
import com.utils.Tokens;

@SuppressWarnings("deprecation")
public class ScannerModel {
	private CodeGeneratorRunnable runnableCodeGenerator;
	private Panel pnlParent;
	private String message;
	private ParseTree tree;
	private List<String> ruleNames;
	private TreeViewer treeViewer;
	private ICGenerator icg;
	private ASTBuildVisitor astbv;
	private HashMap<String, MethodContext> methodTable;
	private ManuScriptParser parser;
	private CommonTokenStream tokens;
	private Thread threadCodeGenerator;
	
	public ScannerModel(Panel pnlParent) {
		this.pnlParent = pnlParent;
	}
	
	public String getTokens(String input, Stack<Integer> listBreakpoints, ArrayList<VariableNode> varList) {
		ANTLRInputStream istream = new ANTLRInputStream(input);
		
		message = "";
		ANTLRErrorListener listener = new ANTLRErrorListener() {
			
			@Override
			public void syntaxError(Recognizer<?, ?> arg0, Object arg1, int arg2, int arg3, String arg4,
					RecognitionException arg5) {
				
			    String sourceName = arg0.getInputStream().getSourceName();
			    if (!sourceName.isEmpty()) {
			        sourceName = String.format("%s:%d:%d: ", sourceName, arg2, arg3);
			    }
			    Console.instance().err("line "+arg2+":"+arg3+" "+arg4);
			}
			
			@Override
			public void reportContextSensitivity(Parser arg0, DFA arg1, int arg2, int arg3, int arg4, ATNConfigSet arg5) {
				
			}
			
			@Override
			public void reportAttemptingFullContext(Parser arg0, DFA arg1, int arg2, int arg3, BitSet arg4, ATNConfigSet arg5) {
					
			}
			
			@Override
			public void reportAmbiguity(Parser arg0, DFA arg1, int arg2, int arg3, boolean arg4, BitSet arg5,
					ATNConfigSet arg6) {
						
			}
		};
		
		
		ManuScriptLexer lexer = new ManuScriptLexer(istream);

		
		lexer.removeErrorListeners();
		lexer.addErrorListener(listener);
		
		this.tokens = new CommonTokenStream(lexer);
		this.parser = new ManuScriptParser(tokens);
		parser.removeErrorListeners();
		parser.setErrorHandler(new ManuscriptErrorHandler());
		parser.addErrorListener(listener);
		

		this.ruleNames = Arrays.asList(parser.getRuleNames());
		this.tree = parser.compilationUnit();
		
		Scope scope = new Scope(null); //scope of program. contains the symbol tables
		this.methodTable = new HashMap<String, MethodContext>(); //the methods in the program. no overloading

		BaseListener baseListen = new BaseListener(scope, methodTable);
		ParseTreeWalker.DEFAULT.walk(baseListen, this.tree);
		
		if(Console.instance().errorCount == 0) {
			scope.print();
			
			this.astbv = new ASTBuildVisitor(scope, baseListen.getMethodTable(), listBreakpoints);
			astbv.visit(tree);
			if(astbv.getMethodASTTable().containsKey("main")) {
//				astbv.printAST("main");
				astbv.printAllAST();
				this.stopThread();
					
				this.runnableCodeGenerator = new CodeGeneratorRunnable(this.pnlParent, this.astbv, methodTable, varList);
				this.threadCodeGenerator = new Thread(runnableCodeGenerator);
				threadCodeGenerator.start();
			} else
				SemanticErrors.throwError(SemanticErrors.NO_MAIN_METHOD);
		}
		
	
		String tokenized = "";
		
		Vocabulary vocabulary = parser.getVocabulary();
		for(Token token : this.tokens.getTokens()) {
			tokenized += "<"+this.getTokenClass(vocabulary.getDisplayName(token.getType()))+", "+token.getText()+">"+"\n";
			
		}

		return tokenized;
	}
	
	public void stopThread() {
		if(this.threadCodeGenerator != null) {
			this.runnableCodeGenerator.stop();
			this.threadCodeGenerator.interrupt();
			System.out.println("isAlive "+threadCodeGenerator.isAlive());
		}
	}
	public ICGenerator getIcg() {
		return icg;
	}

	public void setIcg(ICGenerator icg) {
		this.icg = icg;
	}

	public String getTokenClass(String displayName) {
		if(Tokens.match(displayName, Tokens.KEYWORDS))
			return "Keyword";
		else if(Tokens.match(displayName, Tokens.OPERATORS))
			return "Operator";
		else if(Tokens.match(displayName, Tokens.SEPARATORS))
			return "Separator";
		else
			return displayName;
	}
	
	public String getMessage() {
		return this.message;
	}
	
	public String addTabs(String input, char opening, char closing) {
    	Stack<Character> symbols = new Stack<>();
    	
    	for(int i = 0; i < input.length(); i++) {
    		if(input.charAt(i) == opening) {
    			symbols.push(opening);
    			input = input.substring(0, i+1) + "\n" + tabGenerator(symbols.size()) + input.substring(i+1, input.length());
    		} else if(input.charAt(i) == closing) {
    			symbols.pop();
    			input = input.substring(0, i) + "\n" + tabGenerator(symbols.size()) + input.substring(i, input.length());
    			i = i + 1 + symbols.size();
    		}
    	}
    	
    	return input;
    }
	
	public String tabGenerator(int n) {
		String tabs = "";
		
		for(int j = 0; j < n; j++) {
			tabs = tabs.concat("\t");
		}
		 
		return tabs;
	}

	public void generateTree() {
		this.treeViewer = new TreeViewer(ruleNames, tree);
		this.treeViewer.setUseCurvedEdges(true);
	}

	public TreeViewer getTree() {
		return treeViewer;
	}

	public TreeViewer getTreeViewer() {
		return treeViewer;
	}

	public void setTreeViewer(TreeViewer treeViewer) {
		this.treeViewer = treeViewer;
	}

	public CodeGeneratorRunnable getRunnableCodeGenerator() {
		return runnableCodeGenerator;
	}

	public Thread getThreadCodeGenerator() {
		return threadCodeGenerator;
	}

	public void setRunnableCodeGenerator(CodeGeneratorRunnable runnableCodeGenerator) {
		this.runnableCodeGenerator = runnableCodeGenerator;
	}

	public void setThreadCodeGenerator(Thread threadCodeGenerator) {
		this.threadCodeGenerator = threadCodeGenerator;
	}
}
