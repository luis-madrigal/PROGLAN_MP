package com.ide;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import com.save.TextFileHandler;

public class Frame implements WindowListener {
	private JFrame frame;
	private TextFileHandler textFileHandler;
	private Panel pnlScanner;
	public static Dimension SCREEN_SIZE = Toolkit.getDefaultToolkit().getScreenSize();
	
	public void showGUI(Frame frameParent, Panel pnlScanner) {
		this.textFileHandler = new TextFileHandler();
		this.pnlScanner = pnlScanner;
		
		this.frame = new JFrame("ManuScript");
		this.frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.frame.setBackground(new Color(86, 86, 86));
		this.frame.getContentPane().add(pnlScanner.getUI());
		
		this.pnlScanner.setFrameParent(frameParent);
//		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.pack();
		this.frame.setVisible(true);
		
		this.frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.frame.addWindowListener(this);
		
		ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("res/ico_frame.png"));
		this.frame.setIconImage(icon.getImage());
	
		
	}

	public void autosave() {
		String strFile = this.pnlScanner.getCodeInput().getText();
		this.textFileHandler.save(strFile);
	}
	
	public void autoload() {
		String strFile = this.textFileHandler.load();
		this.pnlScanner.getCodeInput().setText(strFile);
	}
	
	@Override
	public void windowActivated(WindowEvent e) {
	}

	@Override
	public void windowClosed(WindowEvent e) {
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		this.autosave();
		System.exit(0);		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		this.autoload();
	}
}
