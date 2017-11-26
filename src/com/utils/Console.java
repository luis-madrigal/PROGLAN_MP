package com.utils;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.JTextPane;
import javax.swing.text.*;

import com.ide.Panel;
import com.ide.styles.RSyntaxTextAreaManuscript;
import com.ide.styles.Styles;

public class Console {
	private String messageFinished = "[SYSTEM]: Finished";
	private static Console instance;
	private JTextPane textPane;
	private RSyntaxTextAreaManuscript codeInput;
	private Panel pnlParent;
	public int errorCount;
	private Console(int fontSize) {
		this.textPane = new JTextPane();
		this.textPane.setFont(new Font("Consolas", 150, fontSize));
		this.textPane.setEditable(false);
		this.textPane.setForeground(Color.RED);
		this.textPane.setBackground(Color.WHITE);
		this.textPane.isOpaque();
		this.textPane.setMargin(new Insets(3, 5, 0, 0));
		this.errorCount = 0;
	}
	
	public static Console instance() {
		if(instance == null)
			instance = new Console(Panel.baseFontSize);
		return instance;
	}
	
	public void logFinished() {
		StyledDocument doc = this.textPane.getStyledDocument();
		Style styleLog = doc.addStyle("styleLog", StyleContext.getDefaultStyleContext().getStyle(StyleContext.DEFAULT_STYLE));
		StyleConstants.setForeground(styleLog, Styles.UN_CONSOLE_SYSTEM);
		StyleConstants.setBold(styleLog, true);
		styleLog.addAttribute("log", "Log");
		try {
			doc.insertString(doc.getLength(), this.messageFinished, styleLog);
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
	}
	
	public void log(String msg) {
	
		StyledDocument doc = this.textPane.getStyledDocument();
		Style styleLog = doc.addStyle("styleLog", StyleContext.getDefaultStyleContext().getStyle(StyleContext.DEFAULT_STYLE));
		StyleConstants.setForeground(styleLog, Styles.UN_CONSOLE_LOG);
		styleLog.addAttribute("log", "Log");
		try {
			doc.insertString(findLineNumber(msg)/*doc.getLength()*/, msg, styleLog);
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
	}
	
	public void logln(String msg) {
		this.log(msg+"\n");
		
//		StyledDocument doc = this.textPane.getStyledDocument();
//		Style styleLog = doc.addStyle("styleLog", StyleContext.getDefaultStyleContext().getStyle(StyleContext.DEFAULT_STYLE));
//		StyleConstants.setForeground(styleLog, Styles.UN_CONSOLE_LOG);
//		styleLog.addAttribute("log", "Log");
//		try {
//			doc.insertString(findLineNumber(msg)/*doc.getLength()*/, msg+"\n", styleLog);
//		} catch (BadLocationException e) {
//			e.printStackTrace();
//		}
	}
	
	/**
	 * @param msg
	 */
	public void err(String msg) {
		System.out.println("MSG "+msg);
		this.err(msg, extractLineNumber(msg));
	}

	/**
	 * @param msg
	 * @param lineNumber
	 */
	public void err(String msg, int lineNumber) {
		System.out.println("ERR CALLED "+lineNumber);
		StyledDocument doc = this.textPane.getStyledDocument();
		Style styleError = doc.addStyle("styleError"+lineNumber, StyleContext.getDefaultStyleContext().getStyle(StyleContext.DEFAULT_STYLE));
		StyleConstants.setForeground(styleError, Styles.UN_CONSOLE_ERR);
		StyleConstants.setUnderline(styleError, true);
		styleError.addAttribute("key", lineNumber);
		try {
//			findLineNumber(msg);
			doc.insertString(findLineNumber(msg)/*doc.getLength()*/, msg+"\n", styleError);
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
		
		try {
			this.codeInput.addLineHighlight(lineNumber-1, new Color(255, 0, 0, 100));
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
		this.errorCount++;
		this.pnlParent.changeToPlay();
		this.textPane.setCaretPosition(0);
	}
	
	public int findLineNumber(String message) {
		String[] splitMessage = message.split(":");
		String strLine = splitMessage[0];
		strLine = strLine.replace("line ", "").trim();
		
		
		String[] listText = this.textPane.getText().split("\n");
		int lineNumber;
		int messageLineNumber = extractLineNumber(message);
		int offsetCount = 0;
		for(int i = 0; i < listText.length; i++) {
			lineNumber = extractLineNumber(listText[i]);
			
			if(messageLineNumber < lineNumber) {
				return offsetCount;
			}
			else {
				offsetCount += listText[i].length();
			}
		}
		return offsetCount;
		
//		System.out.println("style "+message+" Line "+strLine);
		
//		for(int i = 0; i < root.getElementCount(); i++) {
//			element = root.getElement(i);
//			lineDoc = element.getDocument();
//			
//			try {
//				System.out.println("====");
//				System.out.println(element.getStartOffset()+" "+element.getEndOffset()+" EN");
//				System.out.println("ec "+lineDoc.getText(element.getStartOffset(), element.getEndOffset()-1));
//				System.out.println("<<<<");
//			} catch (BadLocationException e) {
//				e.printStackTrace();
//			}
//		}
	}
	
	public int extractLineNumber(String message) {
		int lineNumber = 0;
		
		if(message.contains("line ")) {
			String[] splitMessage = message.split(":");
			String strLine = splitMessage[0];
			strLine = strLine.replace("line ", "").trim();
			lineNumber = Integer.parseInt(strLine);
		}
		
		
		return lineNumber;
	}
	
	public void purge() {
		this.textPane.setText("");
		this.codeInput.removeAllLineHighlights();
		this.errorCount = 0;
	}
	
	public JTextPane getTextPane() {
		return this.textPane;
	}
	
	public void setCodeInput(RSyntaxTextAreaManuscript codeInput) {
		this.codeInput = codeInput;
	}

	public Panel getPnlParent() {
		return pnlParent;
	}

	public void setPnlParent(Panel pnlParent) {
		this.pnlParent = pnlParent;
	}

	public String getMessageFinished() {
		return messageFinished;
	}

	public void setMessageFinished(String messageFinished) {
		this.messageFinished = messageFinished;
	}
}
