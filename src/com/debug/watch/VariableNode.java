package com.debug.watch;

public class VariableNode {
	private int lineNumber;
	private String dataType;
	private String literal;
	private String funcParent;
	private String funcChild;
	private String count;
	private String value;
	private boolean isPrint;
	
	public VariableNode(int lineNumber, String dataType, String literal, String funcName, String funcBlock, String count) {
		this.setLineNumber(lineNumber);
		this.setDataType(dataType);
		this.setLiteral(literal);
		this.setFuncParent(funcName);
		this.setFuncChild(funcBlock);
		this.setCount(count);
		this.setValue("");
		this.setPrint(true);
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

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public boolean isPrint() {
		return isPrint;
	}

	public void setPrint(boolean isPrint) {
		this.isPrint = isPrint;
	}
	
}
