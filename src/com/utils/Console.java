package com.utils;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;

import com.ide.Panel;
import com.ide.styles.RSyntaxTextAreaManuscript;

public class Console implements MouseListener {
	
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
		this.textPane.addMouseListener(this);
	}
	
	public static Console instance() {
		if(instance == null)
			instance = new Console(Panel.baseFontSize);
		return instance;
	}
	
	public void log(String msg) {
		this.textPane.setText(this.textPane.getText() + msg);
	}
	
	public void logln(String msg) {
		this.textPane.setText(this.textPane.getText() + msg +"\n");
	}
	
	//TODO: messages called here are supposed to be red
	public void err(String msg) {
		this.textPane.setText(this.textPane.getText() + msg + "\n");
	}
	
	public void err(String msg, int lineNumber) {
		StyledDocument doc = this.textPane.getStyledDocument();
		Style regularBlue = doc.addStyle("regularBlue"+lineNumber, StyleContext.getDefaultStyleContext().getStyle(StyleContext.DEFAULT_STYLE));
//		 StyleConstants.setForeground(regularBlue, Color.BLUE);
//		 StyleConstants.setUnderline(regularBlue, true);
		 regularBlue.addAttribute("key", lineNumber);
		 try {
			doc.insertString(doc.getLength(), msg+"\n", regularBlue);
		} catch (BadLocationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 
//		this.textPane.setText(this.textPane.getText() + msg +"\n");
		try {
			this.codeInput.addLineHighlight(lineNumber-1, new Color(255, 0, 0, 100));
		} catch (BadLocationException e) {
			// TODO Auto-generated catch block
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

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
		
	}

}
