package com.ide.styles;

import org.fife.ui.rtextarea.Gutter;
import org.fife.ui.rtextarea.GutterIconInfo;
import org.fife.ui.rtextarea.RTextArea;

public class ManuScriptGutter extends Gutter {
	private static final long serialVersionUID = 1L;
	private ManuScriptLineNumberList lineNumberList;
	private ManuScriptIconRowHeader iconArea;
	
	public ManuScriptGutter(RTextArea textArea) {
		super(textArea);
		this.lineNumberList = new ManuScriptLineNumberList(textArea);
		this.setLineNumberList(lineNumberList);
		this.iconArea = new ManuScriptIconRowHeader(textArea);
		this.setIconArea(iconArea);
	}
	
	public boolean hasBookmark(int line) {
		return this.iconArea.hasBookmark(line);
	}
	

	public ManuScriptLineNumberList getLineNumberList() {
		return lineNumberList;
	}

	public void setLineNumberList(ManuScriptLineNumberList lineNumberList) {
		this.lineNumberList = lineNumberList;
	}
}
