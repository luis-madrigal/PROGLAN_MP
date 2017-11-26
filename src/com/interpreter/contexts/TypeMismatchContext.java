package com.interpreter.contexts;

import com.interpreter.SemanticErrors;
import com.utils.Console;

public class TypeMismatchContext {
	
	private String expectedType;
	private int lineNumber;
	private int charPositionInLine;

	public TypeMismatchContext(String expectedType, int lineNumber, int charPositionInLine) {
		this.expectedType = expectedType;
		this.lineNumber = lineNumber;
		this.charPositionInLine = charPositionInLine;
	}

	public String getExpectedType() {
		return expectedType;
	}

	public int getLineNumber() {
		return lineNumber;
	}

	public int getCharPositionInLine() {
		return charPositionInLine;
	}
}
