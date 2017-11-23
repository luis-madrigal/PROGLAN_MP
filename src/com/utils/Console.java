package com.utils;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JTextPane;
import javax.swing.text.*;

import com.ide.Panel;
import com.ide.styles.RSyntaxTextAreaManuscript;
import com.ide.styles.Styles;

public class Console {
	
	private static Console instance;
	private JTextPane textPane;
	private RSyntaxTextAreaManuscript codeInput;
	private Console(int fontSize) {
		this.textPane = new JTextPane();
		this.textPane.setFont(new Font("Consolas", 150, fontSize));
		this.textPane.setEditable(false);
		this.textPane.setForeground(Color.RED);
		this.textPane.setBackground(Color.WHITE);
		this.textPane.isOpaque();
	}
	
	public static Console instance() {
		if(instance == null)
			instance = new Console(Panel.baseFontSize);
		return instance;
	}
	
	public void log(String msg) {
	
		StyledDocument doc = this.textPane.getStyledDocument();
		Style styleLog = doc.addStyle("styleLog", StyleContext.getDefaultStyleContext().getStyle(StyleContext.DEFAULT_STYLE));
		StyleConstants.setForeground(styleLog, Styles.UN_CONSOLE_LOG);
		styleLog.addAttribute("log", "Log");
		try {
			doc.insertString(doc.getLength(), msg, styleLog);
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
	}
	
	public void logln(String msg) {
		StyledDocument doc = this.textPane.getStyledDocument();
		Style styleLog = doc.addStyle("styleLog", StyleContext.getDefaultStyleContext().getStyle(StyleContext.DEFAULT_STYLE));
		StyleConstants.setForeground(styleLog, Styles.UN_CONSOLE_LOG);
		styleLog.addAttribute("log", "Log");
		try {
			doc.insertString(doc.getLength(), msg+"\n", styleLog);
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
	}
	

	/**
	 * @see public void err(String msg, int lineNumber)
	 * @param msg
	 */
	public void err(String msg) {
		StyledDocument doc = this.textPane.getStyledDocument();
		Style styleError = doc.addStyle("styleError", StyleContext.getDefaultStyleContext().getStyle(StyleContext.DEFAULT_STYLE));
		StyleConstants.setForeground(styleError, Styles.UN_CONSOLE_ERR);
		styleError.addAttribute("key", "Error");
		try {
			doc.insertString(doc.getLength(), msg+"\n", styleError);
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Preferred function 
	 * @param msg
	 * @param lineNumber
	 */
	public void err(String msg, int lineNumber) {
		StyledDocument doc = this.textPane.getStyledDocument();
		Style styleError = doc.addStyle("styleError"+lineNumber, StyleContext.getDefaultStyleContext().getStyle(StyleContext.DEFAULT_STYLE));
		StyleConstants.setForeground(styleError, Styles.UN_CONSOLE_ERR);
		StyleConstants.setUnderline(styleError, true);
		styleError.addAttribute("key", lineNumber);
		try {
			doc.insertString(doc.getLength(), msg+"\n", styleError);
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
		
		try {
			this.codeInput.addLineHighlight(lineNumber-1, new Color(255, 0, 0, 100));
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
	}
	
	public void purge() {
		this.textPane.setText("");
		this.codeInput.removeAllLineHighlights();
	}
	
	public JTextPane getTextPane() {
		return this.textPane;
	}
	
	public void setCodeInput(RSyntaxTextAreaManuscript codeInput) {
		this.codeInput = codeInput;
	}
}
