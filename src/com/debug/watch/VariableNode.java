package com.debug.watch;

public class VariableNode {
	private int lineNumber;
	private String dataType;
	private String literal;
	private String funcParent;
	private String funcChild;
	
	public VariableNode(int lineNumber, String dataType, String literal, String funcName, String funcBlock) {
		this.setLineNumber(lineNumber);
		this.setDataType(dataType);
		this.setLiteral(literal);
		this.setFuncParent(funcName);
		this.setFuncChild(funcBlock);
	}

	public int getLineNumber() {
		return lineNumber;
	}

	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getLiteral() {
		return literal;
	}

	public void setLiteral(String literal) {
		this.literal = literal;
	}

	public String getFuncParent() {
		return funcParent;
	}

	public void setFuncParent(String funcParent) {
		this.funcParent = funcParent;
	}

	public String getFuncChild() {
		return funcChild;
	}

	public void setFuncChild(String funcChild) {
		this.funcChild = funcChild;
	}
	
	
}
