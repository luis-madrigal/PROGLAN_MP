package com.ide;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;

import com.debug.watch.VariableNode;

public class DialogWatch extends JFrame implements WindowListener {
	private static final long serialVersionUID = 1L;
	private static final int MAX_WIDTH = 560;
	private static final int MAX_HEIGHT = 450;
	public static final int SCROLLBAR_HEIGHT_H = 10;
	
	private JLabel header;
	
	public DialogWatch() {
		this.initComponents();
	}
	
	public void initComponents() {
		this.header = new JLabel("Select which variables to watch");
		
		this.setSize(MAX_WIDTH, MAX_HEIGHT);
		this.setLayout(new GridLayout());
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		
		this.setBackground(Color.GRAY);
		
		this.setFocusable(true);
		this.setAutoRequestFocus(true);
	}
	
	public void initWatchList(ArrayList<VariableNode> varList) {
		
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
	
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		
	}
}
