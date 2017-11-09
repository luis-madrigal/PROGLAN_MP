package com.ide.styles;

import javax.swing.text.SimpleAttributeSet;

public class IdeStyle {
	
	private String regex;
	private SimpleAttributeSet attrSet;
	public IdeStyle(String regex, SimpleAttributeSet attrSet) {
		super();
		this.regex = regex;
		this.attrSet = attrSet;
	}
	public String getRegex() {
		return regex;
	}
	public void setRegex(String regex) {
		this.regex = regex;
	}
	public SimpleAttributeSet getAttrSet() {
		return attrSet;
	}
	public void setAttrSet(SimpleAttributeSet attrSet) {
		this.attrSet = attrSet;
	}
}
