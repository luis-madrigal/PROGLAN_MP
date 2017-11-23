package com.ide;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;


public class DialogSuccess extends JDialog implements MouseListener {
	private static final long serialVersionUID = 1L;
	
	private JButton btnOk;
	private JLabel lblMessage;
	
	public DialogSuccess() {
		FrameStatic.initDialog(this, 225, 100, Color.WHITE, true, false, false);
		this.initComponents();
		
		this.add(lblMessage);
		this.add(btnOk);
	}

	public void initComponents() {
		int width = this.getWidth()/3;
		int height = 20;
		
		this.btnOk = new JButton("Ok");
		FrameStatic.initButtons(btnOk, Color.WHITE, (this.getWidth()-width)/2, (this.getHeight()-height)/2, width, height, this);
	
		width = this.getWidth();
		this.lblMessage = new JLabel();
		this.lblMessage.setHorizontalAlignment(JLabel.CENTER);
		FrameStatic.initLabel(lblMessage, FrameStatic.fntDefault12, FrameStatic.clrAutomatic, (this.getWidth()-width)/2, 5, width, height);
	}
	
	public void show(String message, JComponent parent) {
		this.lblMessage.setText(message);
		this.setLocationRelativeTo(parent);
		this.setBounds(this.getX(), this.getY()-20, this.getWidth(), this.getHeight());
		this.setVisible(true);
		Toolkit.getDefaultToolkit().beep();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() == this.btnOk) {
			this.setVisible(false);
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {		
	}
}
