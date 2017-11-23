package com.ide;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class DialogOpen extends JDialog implements MouseListener {
	private static final long serialVersionUID = 1L;

	private JFileChooser flchFFT1;
	private JLabel lblBackground;
	private JButton btnClose;
	private JButton btnOpen;
	private JButton btnCancel;
	
	private JLabel lblTotal;

	private JPanel pnlProgressBar;
	private JLabel lblProgress;
	private int total;
	private JTextField txtfFilename;
	
	private DialogConfirm dlgConfirm;
//	private SwingWorker<Void, ProcessNode> swProcess;
	
	public DialogOpen() {
		FrameStatic.initDialog(this, 340, 90, Color.WHITE, true, false, false);
//		this.setModalityType(ModalityType.APPLICATION_MODAL);
		this.setUndecorated(true);
		this.setModal(true);
		this.initComponents();
		
		this.add(btnCancel);
		this.add(btnOpen);
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
		btnOpen = new JButton("SAVE");
//		FrameStatic.initButtons(lblMessage, FrameStatic.fntDefault12, FrameStatic.clrAutomatic, pnlProgressBar.getX(), pnlProgressBar.getY()+pnlProgressBar.getHeight(), width, height);
		FrameStatic.initButtons(btnOpen, Color.WHITE,  pnlProgressBar.getX()+pnlProgressBar.getWidth()-width, pnlProgressBar.getY()+pnlProgressBar.getHeight()+5, width, height, this);
		btnOpen.setFont(FrameStatic.fntDefault12_BOLD);
		btnOpen.setRolloverEnabled(false);
		
		width = this.getWidth()/4;
		height = 22;
		btnClose = new JButton("Close");
		FrameStatic.initButtons(btnClose, Color.WHITE, (this.getWidth()-width)/2, btnOpen.getY()+5, width, height, this);

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
		

		File dirWorking = new File(System.getProperty("user.home"));
		
		this.flchFFT1 = new JFileChooser();		
		this.flchFFT1.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		this.flchFFT1.setCurrentDirectory(dirWorking);
		
		this.dlgConfirm = new DialogConfirm(170);
		dlgConfirm.getBtnYes().addMouseListener(this);
		dlgConfirm.close();
	}
	
	public JButton getBtnSave() {
		return btnOpen;
	}

	public void setBtnSave(JButton btnSave) {
		this.btnOpen = btnSave;
	}

	public void show(JComponent parent) {
//		this.swProcess = swProcess;
		this.setLocationRelativeTo(parent);
		this.btnClose.setVisible(false);
		this.btnOpen.setVisible(true);
//		this.lblMessage.setText(message);
		this.setBounds(this.getX(), this.getY()-30, this.getWidth(), this.getHeight());
		this.setVisible(true);
	}
	
	
	public JTextField getTxtfFilename() {
		return txtfFilename;
	}

	public void setTxtfFilename(JTextField txtfFilename) {
		this.txtfFilename = txtfFilename;
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
