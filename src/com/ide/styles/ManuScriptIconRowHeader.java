package com.ide.styles;

import java.awt.event.MouseEvent;

import javax.swing.text.BadLocationException;

import org.fife.ui.rtextarea.IconRowHeader;
import org.fife.ui.rtextarea.RTextArea;

public class ManuScriptIconRowHeader extends IconRowHeader {
	private static final long serialVersionUID = 1L;

	public ManuScriptIconRowHeader(RTextArea textArea) {
		super(textArea);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if (bookmarkingEnabled && bookmarkIcon!=null) {
			try {
				int line = viewToModelLine(e.getPoint());
				if (line>-1) {
					toggleBookmark(line);
					System.out.println(line);
				}
			} catch (BadLocationException ble) {
				ble.printStackTrace(); // Never happens
			}
		}
	}
}
