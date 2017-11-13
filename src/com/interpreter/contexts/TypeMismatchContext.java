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

	public void throwError() {
		Console.instance().err(String.format(SemanticErrors.TYPE_MISMATCH, lineNumber, charPositionInLine, expectedType));
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
