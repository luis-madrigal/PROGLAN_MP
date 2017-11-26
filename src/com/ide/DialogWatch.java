package com.ide;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.debug.watch.VariableNode;
import com.ide.styles.Styles;

public class DialogWatch extends JDialog implements MouseListener {
	private static final long serialVersionUID = 1L;
	private static final int MAX_WIDTH = 700;
	private static final int MAX_HEIGHT = 450;
	public static final int SCROLLBAR_HEIGHT_H = 10;
	
	private JLabel lblHeader;
	private JLabel lblLine;
	private JLabel lblVarName;
	private JLabel lblType;
	private JLabel lblMethod;
	private JLabel lblBlock;
	
	private ArrayList<JCheckBox> checkboxList;
	private JButton btnOK;
	private JButton btnClose;
	
	private ArrayList<VariableNode> varList;
	private ArrayList<VariableNode> selectedVar;
	
	public DialogWatch(ArrayList<VariableNode> varList) {
		this.varList = varList;
		this.selectedVar = new ArrayList<VariableNode>();
		this.initComponents();
	}
	
	public void initComponents() {
		this.setSize(MAX_WIDTH, MAX_HEIGHT);
		this.getContentPane().setBackground(Color.WHITE);
		this.setLayout(new GridBagLayout());
		this.setUndecorated(true);
		this.setModal(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		
		this.lblHeader = this.initLabelHeader("");
		this.lblLine = this.initLabelHeader("Line No.");
		this.lblVarName = this.initLabelHeader("Variable");
		this.lblType = this.initLabelHeader("Data Type");
		this.lblMethod = this.initLabelHeader("In method");
		this.lblBlock = this.initLabelHeader("In method block");
		
		this.checkboxList = new ArrayList<JCheckBox>();
		
		this.btnOK = new JButton("OK");
		this.btnOK.setRolloverEnabled(false);
		this.btnOK.setOpaque(true);
		this.btnOK.setBackground(Styles.SKY_BLUE);
		this.btnOK.addMouseListener(this);
		
		this.btnClose = new JButton("Cancel");
		this.btnClose.setRolloverEnabled(false);
		this.btnClose.setOpaque(true);
		this.btnClose.setBackground(Styles.SKY_BLUE);
		this.btnClose.addMouseListener(this);
	}
	
	public void placeVarList() {
		GridBagConstraints gbc;
		
		gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridy = 0;
		gbc.gridx = 0;
		this.add(this.lblHeader, gbc);
		
		gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		gbc.ipadx = 70;
		gbc.gridy = 0;
		gbc.gridx = 1;
		this.add(this.lblVarName, gbc);
		
		gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		gbc.ipadx = 50;
		gbc.gridy = 0;
		gbc.gridx = 2;
		this.add(this.lblType, gbc);
		
		gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		gbc.ipadx = 50;
		gbc.gridy = 0;
		gbc.gridx = 3;
		this.add(this.lblLine, gbc);
		
		gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		gbc.ipadx = 50;
		gbc.gridy = 0;
		gbc.gridx = 4;
		this.add(this.lblMethod, gbc);
		
		gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		gbc.ipadx = 50;
		gbc.gridy = 0;
		gbc.gridx = 5;
		this.add(this.lblBlock, gbc);
		
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 6;
		gbc.anchor = GridBagConstraints.NORTHWEST;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.weightx = 1;
		JSeparator mainSep = this.initSeparatorHorizontal();
		this.add(mainSep, gbc);
		
		int y = 2;
		
		for(VariableNode variable : varList) {
			gbc = new GridBagConstraints();
			gbc.anchor = GridBagConstraints.NORTHWEST;
			gbc.gridy = y;
			
			gbc.gridx = 0;
			JCheckBox checkbox = this.initCheckbox();
			checkbox.setSelected(false);
			this.checkboxList.add(checkbox);
			this.add(checkbox, gbc);
			
			gbc.gridx = 1;
			JLabel varName = this.initLabelVarName(variable.getLiteral());
			this.add(varName, gbc);
			
			gbc.gridx = 2;
			JLabel dataType = this.initLabelDataType(variable.getDataType());
			this.add(dataType, gbc);
			
			gbc.gridx = 3;
			JLabel lineNo = this.initLabelLineNum(String.valueOf(variable.getLineNumber()));
			this.add(lineNo, gbc);
			
			gbc.gridx = 4;
			JLabel method = this.initLabelMethod(variable.getFuncParent());
			this.add(method, gbc);
			
			gbc.gridx = 5;
			JLabel methodBlock = this.initLabelMethod(variable.getFuncChild());
			this.add(methodBlock, gbc);
			
			y+=2;
		}
		
		gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.SOUTHWEST;
		gbc.gridy = y-1;
		gbc.gridx = 0;
		gbc.gridwidth = 6;
		JSeparator lastSep = this.initSeparatorHorizontal();
		this.add(lastSep, gbc);
		
		gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.SOUTHEAST;
		gbc.gridy = y;
		gbc.gridx = 5;
		gbc.insets = new Insets(10, 0, 10, 10);
		this.add(this.btnClose, gbc);
		
		gbc.insets = new Insets(10, 0, 10, 100);
		this.add(this.btnOK, gbc);
		
		this.pack();
	}
	
	public JSeparator initSeparatorHorizontal() {
		JSeparator sep = new JSeparator(SwingConstants.HORIZONTAL);
		sep.setBackground(Color.BLACK);
		sep.setOpaque(true);
		sep.setPreferredSize(new Dimension(MAX_WIDTH, 1));
		
		return sep;
	}
	
	public JCheckBox initCheckbox() {
		JCheckBox checkbox = new JCheckBox();
		checkbox.setSelected(false);
		checkbox.setOpaque(true);
		checkbox.setBackground(Color.WHITE);
		checkbox.setAlignmentX(JFrame.CENTER_ALIGNMENT);
		
		return checkbox;
	}
	
	public JLabel initLabelMain(String text) {
		JLabel lbl = new JLabel();
		lbl.setOpaque(true);
		lbl.setBackground(Color.WHITE);
		lbl.setForeground(Color.BLACK);
		lbl.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		Font font = lbl.getFont();
		lbl.setFont(font.deriveFont(font.getStyle() & ~Font.BOLD));
		
		return lbl;
	}
	
	public JLabel initLabelHeader(String text) {
		JLabel lbl = new JLabel(text);
		lbl.setOpaque(true);
		lbl.setBackground(Styles.SKY_BLUE);
		lbl.setForeground(Color.BLACK);
		lbl.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		Font font = lbl.getFont();
		lbl.setFont(font.deriveFont(font.getStyle() & ~Font.BOLD));
		
		return lbl;
	}
	
	public JLabel initLabelLineNum(String text) {
		JLabel lbl = new JLabel(text);
		lbl.setOpaque(true);
		lbl.setBackground(Color.WHITE);
		lbl.setForeground(Color.DARK_GRAY);
		lbl.setBorder(new EmptyBorder(5, 5, 5, 2));
		
		Font font = lbl.getFont();
		lbl.setFont(font.deriveFont(font.getStyle() & ~Font.BOLD));
		
		return lbl;
	}
	
	public JLabel initLabelVarName(String text) {
		JLabel lbl = new JLabel(text);
		lbl.setOpaque(true);
		lbl.setBackground(Color.WHITE);
		lbl.setForeground(Color.BLACK);
		lbl.setBorder(new EmptyBorder(5, 1, 5, 20));
		
		return lbl;
	}
	
	public JLabel initLabelDataType(String text) {
		JLabel lbl = new JLabel(text);
		lbl.setOpaque(true);
		lbl.setBackground(Color.WHITE);
		lbl.setForeground(Styles.UN_RESERVED_WORD);
		lbl.setBorder(new EmptyBorder(5, 1, 5, 2));
		
		Font font = lbl.getFont();
		lbl.setFont(font.deriveFont(font.getStyle() & ~Font.BOLD));
		
		return lbl;
	}
	
	public JLabel initLabelMethod(String text) {
		JLabel lbl = new JLabel(text);
		lbl.setOpaque(true);
		lbl.setBackground(Color.WHITE);
		lbl.setForeground(Color.BLACK);
		lbl.setBorder(new EmptyBorder(5, 1, 5, 10));
		
		Font font = lbl.getFont();
		lbl.setFont(font.deriveFont(font.getStyle() & ~Font.BOLD));
		
		return lbl;
	}
	
	public JLabel initLabelMethodBlock(String text) {
		JLabel lbl = new JLabel(text);
		lbl.setOpaque(true);
		lbl.setBackground(Color.WHITE);
		lbl.setForeground(Color.BLACK);
		lbl.setBorder(new EmptyBorder(5, 1, 5, 2));
		
		Font font = lbl.getFont();
		lbl.setFont(font.deriveFont(font.getStyle() & ~Font.BOLD));
		
		return lbl;
	}

	public ArrayList<VariableNode> getSelectedVar() {
		return this.selectedVar;
	}
	
	@Override
	public void mouseReleased(MouseEvent arg0) {
		if(arg0.getSource().equals(this.btnOK)) {
			for(int i = 0; i < this.checkboxList.size(); i++) {
				if(this.checkboxList.get(i).isSelected()) {
					this.selectedVar.add(this.varList.get(i));
				}
			}
			
			this.dispose();
		}
		else if(arg0.getSource().equals(this.btnClose))
			this.dispose();
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		
	}
	
}
