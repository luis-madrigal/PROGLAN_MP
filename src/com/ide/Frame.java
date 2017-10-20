package com.ide;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame {
	private JFrame frame;
	public static Dimension SCREEN_SIZE = Toolkit.getDefaultToolkit().getScreenSize();
	
	public void showGUI(JPanel pnlScanner) {
		this.frame = new JFrame("ManuScript");
		this.frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.frame.setBackground(new Color(86, 86, 86));
		this.frame.getContentPane().add(pnlScanner);
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.pack();
		this.frame.setVisible(true);
		
	}
}
