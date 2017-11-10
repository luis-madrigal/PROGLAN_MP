package com.utils;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JTextPane;

import com.ide.Panel;

public class Console {
	
	private static Console instance;
	private JTextPane textPane;
	
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
	
	public void err(String msg) {
		this.textPane.setText(this.textPane.getText() + msg +"\n");
	}
	
	public void purge() {
		this.textPane.setText("");
	}
	
	public JTextPane getTextPane() {
		return this.textPane;
	}

}
