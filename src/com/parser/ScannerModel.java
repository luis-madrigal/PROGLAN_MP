package com.parser;
import java.util.List;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Stack;

import com.interpreter.AST.ASTBuildVisitor;
import com.interpreter.AST.AbstractSyntaxTree;
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

import com.interpreter.BaseListener;
import com.interpreter.Scope;
import com.parser.ManuScriptLexer;
import com.parser.ManuScriptParser;
import com.utils.Console;
import com.utils.Tokens;

@SuppressWarnings("deprecation")
public class ScannerModel {
	
	private String message;
	private ParseTree tree;
	private List<String> ruleNames;
	private TreeViewer treeViewer;
	private ICGenerator icg;
	public String getTokens(String input) {
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

//			    System.err.println(sourceName+"line "+arg2+":"+arg3+" "+arg4);
//			    message = message + "line "+arg2+":"+arg3+" "+arg4+"\n";
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
		
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ManuScriptParser parser = new ManuScriptParser(tokens);
		parser.removeErrorListeners();
		parser.setErrorHandler(new ManuscriptErrorHandler());
		parser.addErrorListener(listener);
		

		this.ruleNames = Arrays.asList(parser.getRuleNames());
		this.tree = parser.compilationUnit();
		
		Scope scope = new Scope(null); //scope of program. contains the symbol tables
		HashMap<String, MethodContext> methodTable = new HashMap<String, MethodContext>(); //the methods in the program. no overloading


		ParseTreeWalker.DEFAULT.walk(new BaseListener(scope, methodTable), this.tree);
		
		System.out.println(scope.getChildren().size());
		System.out.println(methodTable.size());

		//todo: stop from continuing if errors exist
		//todo: add reference to baselistener then do BaseListener.getScopes and give to ASTBuildVIsitor constructor

	//	System.out.println("varX child 1: "+scope.getChildren().get(1).getIfInScope("x"));
	//	System.out.println("IS IN SCOPE: "+scope.getChildren().get(1).inScope("z"));
//		System.out.println("IS IN SCOPE(x): "+scope.getChildren().get(2).inScope("x"));
		scope.print();

		ASTBuildVisitor astbv = new ASTBuildVisitor(scope);
		astbv.visit(tree);
		astbv.printAST("main");
		
		this.icg = new ICGenerator(astbv.getMethodASTTable().get("main"));
		this.icg.print();

//		System.out.println(tree.toStringTree(parser));
		
		String tokenized = "";
		
		Vocabulary vocabulary = parser.getVocabulary();
		for(Token token : tokens.getTokens()) {
			tokenized += "<"+this.getTokenClass(vocabulary.getDisplayName(token.getType()))+", "+token.getText()+">"+"\n";
		}

		return tokenized;
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
}
