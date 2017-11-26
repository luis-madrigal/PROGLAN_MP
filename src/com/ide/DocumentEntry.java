package com.ide;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.ide.styles.Styles;

public class DocumentEntry extends JPanel {
	private static final long serialVersionUID = 1L;

	private String title;
	private int lineNumber;
	private int linePosition;
	private JLabel lblTextBorder;
	private JLabel lblText;

	private JLabel lblLineNumberBorder;
	private JLabel lblLineNumber;
	
//	private JButton btnEntry;
	
	public DocumentEntry(String title, int lineNumber, int linePosition, int width) {
		this.title = title;
		this.lineNumber = lineNumber;
		this.linePosition = linePosition;
		
		
		this.setSize(width, 30);
		this.setMinimumSize(this.getSize());
		this.setPreferredSize(this.getSize());
		this.setOpaque(true);
		this.setBackground(Styles.LIGHT_GRAY);
		
//		this.setText(lineNumber+" "+title);
		Cursor.getPredefinedCursor(Cursor.HAND_CURSOR);
//		this.btnEntry = new JButton(title);
//		this.add(this.btnEntry);
		

		Font font = new Font("Consolas", Font.BOLD, 14);
		Font fontLine = new Font("Consolas", Font.BOLD, 12);
		
		this.lblLineNumberBorder = new JLabel();
		lblLineNumberBorder.setSize(10/*this.getHeight()*/, this.getHeight());
		lblLineNumberBorder.setPreferredSize(lblLineNumberBorder.getSize());
		lblLineNumberBorder.setMinimumSize(lblLineNumberBorder.getSize());
		lblLineNumberBorder.setMaximumSize(lblLineNumberBorder.getSize());
//		lblLineNumberBorder.setBackground(Color.WHITE);
//		lblLineNumberBorder.setOpaque(true);
		
		this.lblLineNumber = new JLabel();
		lblLineNumber.setFont(fontLine);
		lblLineNumber.setForeground(Styles.TEXT_GRAY);
//		lblLineNumber.setText(" "+lineNumber);
		
		lblLineNumber.setSize(lblLineNumberBorder.getWidth(), lblLineNumberBorder.getHeight()-1);
		lblLineNumber.setPreferredSize(lblLineNumber.getSize());
		lblLineNumber.setMinimumSize(lblLineNumber.getSize());
		lblLineNumber.setMaximumSize(lblLineNumber.getSize());
		lblLineNumber.setBackground(Styles.SKY_BLUE);
		lblLineNumber.setOpaque(true);
		
		lblLineNumberBorder.setAlignmentX(Component.RIGHT_ALIGNMENT);
		this.lblLineNumberBorder.add(lblLineNumber);
		
		this.lblTextBorder = new JLabel();
		lblTextBorder.setSize(this.getWidth()-lblLineNumber.getWidth()-10, lblLineNumberBorder.getHeight());
		lblTextBorder.setPreferredSize(lblTextBorder.getSize());
		lblTextBorder.setMinimumSize(lblTextBorder.getSize());
		lblTextBorder.setMaximumSize(lblTextBorder.getSize());
//		lblTextBorder.setOpaque(true);
//		lblTextBorder.setBackground(Styles.DARK_GRAY);
		lblTextBorder.setLayout(null);
		
		lblTextBorder.setAlignmentX(Component.RIGHT_ALIGNMENT);
		
		
		this.lblText = new JLabel();
		lblText.setFont(font);
		lblText.setForeground(Styles.TEXT_GRAY);
		lblText.setOpaque(true);
		lblText.setBackground(Color.WHITE);
		
		lblText.setText("  "+title);
		lblText.setSize(lblTextBorder.getWidth(), lblTextBorder.getHeight()-1);
		lblText.setPreferredSize(lblText.getSize());
		lblText.setMinimumSize(lblText.getSize());
		lblText.setMaximumSize(lblText.getSize());
		lblText.setBounds(0, 0, lblText.getWidth(), lblText.getHeight());
		
		lblTextBorder.add(lblText);
		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		this.add(lblLineNumberBorder);
		this.add(lblTextBorder);
	
	}

	public String getTitle() {
		return title;
	}

	public int getLineNumber() {
		return lineNumber;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}

	public int getLinePosition() {
		return linePosition;
	}

	public void setLinePosition(int linePosition) {
		this.linePosition = linePosition;
	}
}
