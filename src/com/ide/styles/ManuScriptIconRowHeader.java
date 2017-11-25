package com.ide.styles;

import java.awt.Color;
import java.awt.event.MouseEvent;

import javax.swing.text.BadLocationException;

import org.fife.ui.rtextarea.GutterIconInfo;
import org.fife.ui.rtextarea.IconRowHeader;
import org.fife.ui.rtextarea.RTextArea;

public class ManuScriptIconRowHeader extends IconRowHeader {
	private static final long serialVersionUID = 1L;
	
	public ManuScriptIconRowHeader(RTextArea textArea) {
		super(textArea);
		this.setBackground(Color.WHITE);
		
	}
	
	public boolean hasBookmark(int line) {
		GutterIconInfo[] icons;
		try {
			icons = getTrackingIcons(line);
			if (icons.length == 0) {
				System.out.println("no");
				return false;
			}
			else {

				System.out.println("has");
				return true;
			}
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean hasText(int i) {
		String[] listText = textArea.getText().split("\n");
		if(i < listText.length) {
			if(listText[i].trim().length() > 0)
				return true;
			else
				return false;	
		}
		return false;
	}
	@Override
	public void mousePressed(MouseEvent e) {
		if (bookmarkingEnabled && bookmarkIcon!=null) {
			try {
				int line = viewToModelLine(e.getPoint());
				if (line > -1 && hasText(line)) {
					hasText(line);
					toggleBookmark(line);
					System.out.println(line);
				}
			} catch (BadLocationException ble) {
				ble.printStackTrace(); // Never happens
			}
		}
	}
}
