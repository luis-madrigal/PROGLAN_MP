package com.ide;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;


public class DialogConfirm extends JDialog implements MouseListener {
	private static final long serialVersionUID = 1L;
	public static final String MSG_START = "STARTING... ";
	public static final String MSG_PROCESS = "PROCESSING: ";

	public static final String MSG_EXPORT = "EXPORTING: ";
	public static final String MSG_COMPLETE = "COMPLETE";
	
	private JLabel lblBackground;
	private JButton btnNo;
	private JButton btnYes;
	private JLabel lblMessage;
	private JLabel lblTopBar;

	private int total;
	
	public DialogConfirm(int width) {
		FrameStatic.initDialog(this, width, 80, Color.WHITE, true, false, false);
//		this.setModalityType(ModalityType.APPLICATION_MODAL);
		this.setUndecorated(true);
		this.setModal(true);
		this.initComponents();
		
		this.add(lblTopBar);
		this.add(btnNo);
		this.add(lblMessage);
		this.add(btnYes);
		this.add(lblBackground);
	}

	public void initComponents() {
		int width;
		int height = 20;
		int padding;
		int buttonWidth = 55;
		
		lblTopBar = new JLabel();
		FrameStatic.initLabel(lblTopBar, FrameStatic.fntDefault, FrameStatic.clrDisabled, Color.LIGHT_GRAY, this.getWidth()-2, 17);
		lblTopBar.setLocation(1, 1);
		
		width = 20;
		height = width;
		btnNo = new JButton();
		FrameStatic.initButtons(btnNo, FrameStatic.clrWhite, this.getWidth()-width, 0, width, height, this);	
		btnNo.setRolloverEnabled(false);
		btnNo.setFont(FrameStatic.fntDefault12);
		btnNo.setForeground(FrameStatic.clrWhite);
		
		padding = 25;
		width = this.getWidth();
		height = 20;
		lblMessage = new JLabel("Cancel Process?");
		FrameStatic.initLabel(lblMessage, FrameStatic.fntDefault12, FrameStatic.clrAutomatic, padding/2, btnNo.getHeight(), this.getWidth()-padding, height);

		width = this.getWidth()-100;
		height = 22;
		padding = 25;
		btnYes = new JButton("Yes");
		FrameStatic.initButtons(btnYes, Color.WHITE, padding, lblMessage.getY()+lblMessage.getHeight()+6, buttonWidth, lblMessage.getHeight(), this);	
		btnYes.setRolloverEnabled(false);
	
		btnNo = new JButton("No");
		FrameStatic.initButtons(btnNo, Color.WHITE, this.getWidth()-btnYes.getWidth()-padding, btnYes.getY(), btnYes.getWidth(), btnYes.getHeight(), this);	
		btnNo.setRolloverEnabled(false);
		
		
		lblBackground = new JLabel();
		FrameStatic.initLabel(lblBackground, FrameStatic.fntDefault, FrameStatic.clrAutomatic, Color.WHITE, this.getWidth(), this.getHeight());
		lblBackground.setBorder(FrameStatic.brdrLine);
		
	}
	
	public void show(JComponent parent) {
		this.setLocationRelativeTo(parent);
		this.setBounds(this.getX(), this.getY(), this.getWidth(), this.getHeight());
		this.setVisible(true);
	}
	
	public void close() {
		this.setVisible(false);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
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
		if(e.getSource() == this.btnNo) {
			this.close();
		}
		if(e.getSource() == this.btnYes) {
			this.close();
		}
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public JButton getBtnYes() {
		return btnYes;
	}
}
