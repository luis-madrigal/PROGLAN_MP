package com.utils;

import javax.swing.text.Style;

public class ConsoleNode {
	private int lineNumber;
	private int docLength;
	private String message;
	private Style styleLog;
	
	public ConsoleNode(int docLength, String message, Style styleLog) {
		this.docLength = docLength;
		this.message = message;
		this.styleLog = styleLog;
	}
	
	public ConsoleNode(int lineNumber, int docLength, String message, Style styleLog) {
		this(docLength, message, styleLog);
		this.lineNumber = lineNumber;
	}



	public int getDocLength() {
		return docLength;
	}

	public String getMessage() {
		return message;
	}

	public Style getStyleLog() {
		return styleLog;
	}

	public void setDocLength(int docLength) {
		this.docLength = docLength;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setStyleLog(Style styleLog) {
		this.styleLog = styleLog;
	}

	public int getLineNumber() {
		return lineNumber;
	}

	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
}
