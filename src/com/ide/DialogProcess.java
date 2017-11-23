package com.ide;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class DialogProcess extends JDialog implements MouseListener {
	private static final long serialVersionUID = 1L;
	public static final String MSG_START = "STARTING... ";
	public static final String MSG_PROCESS = "PROCESSING: ";

	public static final String MSG_EXPORT = "EXPORTING: ";
	public static final String MSG_COMPLETE = "COMPLETE";
	
	private JLabel lblBackground;
	private JButton btnClose;
	private JButton lblMessage;
	private JButton btnCancel;
	
	private JLabel lblTotal;

	private JPanel pnlProgressBar;
	private JLabel lblProgress;
	private int total;
	private JTextField txtfFilename;
	
	private DialogConfirm dlgConfirm;
//	private SwingWorker<Void, ProcessNode> swProcess;
	
	public DialogProcess() {
		FrameStatic.initDialog(this, 340, 90, Color.WHITE, true, false, false);
//		this.setModalityType(ModalityType.APPLICATION_MODAL);
		this.setUndecorated(true);
		this.setModal(true);
		this.initComponents();
		
		this.add(btnCancel);
		this.add(lblMessage);
		this.add(lblTotal);
		this.add(pnlProgressBar);
		this.add(btnClose);
		this.add(lblBackground);
	}

	public void initComponents() {
		int width;
		int height = 20;
		
		lblBackground = new JLabel();
		FrameStatic.initLabel(lblBackground, FrameStatic.fntDefault, FrameStatic.clrAutomatic, Color.WHITE, this.getWidth(), this.getHeight());
		lblBackground.setBorder(FrameStatic.brdrLine);
		
		width = this.getWidth()*5/6;
		height = 22;
		pnlProgressBar = new JPanel();
		FrameStatic.initPanel(pnlProgressBar, Color.LIGHT_GRAY, (this.getWidth()-width)/2, 30, width, height);
		

//		pnlProgressBar.add(lblProgress);
		
		width = 75;
		
		txtfFilename = new JTextField();
		FrameStatic.initTextField(txtfFilename, width, 0, pnlProgressBar.getWidth()-width, pnlProgressBar.getHeight(),
				FrameStatic.fntDefault12, FrameStatic.clrDifficulty, this);
		
		pnlProgressBar.add(txtfFilename);
		
		lblProgress = new JLabel("Filename: ");
		FrameStatic.initLabel(lblProgress, FrameStatic.fntDefault13_BOLD, FrameStatic.clrAutomatic, FrameStatic.clrWhite, width, txtfFilename.getHeight());
		
		pnlProgressBar.add(lblProgress);
		
		lblTotal = new JLabel();
		FrameStatic.initLabel(lblTotal, FrameStatic.fntDefault, FrameStatic.clrAutomatic, pnlProgressBar.getX(), pnlProgressBar.getY(), pnlProgressBar.getWidth(), pnlProgressBar.getHeight());
		lblTotal.setHorizontalAlignment(JLabel.CENTER);
		
		
		width = 80;//pnlProgressBar.getWidth();
		height = 20;
		lblMessage = new JButton("SAVE");
//		FrameStatic.initButtons(lblMessage, FrameStatic.fntDefault12, FrameStatic.clrAutomatic, pnlProgressBar.getX(), pnlProgressBar.getY()+pnlProgressBar.getHeight(), width, height);
		FrameStatic.initButtons(lblMessage, Color.WHITE,  pnlProgressBar.getX()+pnlProgressBar.getWidth()-width, pnlProgressBar.getY()+pnlProgressBar.getHeight()+5, width, height, this);
		lblMessage.setFont(FrameStatic.fntDefault12_BOLD);
		lblMessage.setRolloverEnabled(false);
		
		width = this.getWidth()/4;
		height = 22;
		btnClose = new JButton("Close");
		FrameStatic.initButtons(btnClose, Color.WHITE, (this.getWidth()-width)/2, lblMessage.getY()+5, width, height, this);

		JLabel lblLabel = new JLabel();
		FrameStatic.initLabel(lblLabel, FrameStatic.fntDefault12,
				FrameStatic.clrDifficulty, FrameStatic.clrAccentUn, lblBackground.getWidth(),
				btnClose.getHeight());
		lblLabel.setBounds(1, 1, lblLabel.getWidth()-2, lblLabel.getHeight()-3);
		lblBackground.add(lblLabel);
		
		width = 20;
		height = width;
		btnCancel = new JButton();
		FrameStatic.initButtons(btnCancel, FrameStatic.clrWhite, this.getWidth()-width, 0, width, height, this);	
		btnCancel.setRolloverEnabled(false);
		btnCancel.setFont(FrameStatic.fntDefault12);
		btnCancel.setForeground(FrameStatic.clrWhite);
		
		this.dlgConfirm = new DialogConfirm(170);
		dlgConfirm.getBtnYes().addMouseListener(this);
		dlgConfirm.close();
	}
	
	public void show(String message, JComponent parent) {
//		this.swProcess = swProcess;
		this.setLocationRelativeTo(parent);
		this.btnClose.setVisible(false);
		this.lblMessage.setVisible(true);
//		this.lblMessage.setText(message);
		this.setBounds(this.getX(), this.getY()-30, this.getWidth(), this.getHeight());
		this.setVisible(true);
	}
	
	
	public void close() {
		this.setVisible(false);
		refresh();
	}
	
	public void refresh() {
		this.revalidate();
		this.repaint();
	}
	public void cancel() {
		this.dlgConfirm.show(this.lblBackground);
	}
	
	
	public void setProgressColor(Color color) {
//		this.lblProgress.setBackground(color);
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
		if(e.getSource() == this.btnClose) {
			this.close();
		}
		if(e.getSource() == this.btnCancel) {
			if(!btnClose.isVisible())
				this.cancel();
			else
				this.close();
		}
		if(e.getSource() == dlgConfirm.getBtnYes()) {
//			this.swProcess.cancel(true);
			this.close();
		}
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
}
