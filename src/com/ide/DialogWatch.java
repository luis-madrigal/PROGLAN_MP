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

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.debug.watch.VariableNode;
import com.ide.styles.Styles;
import com.override.CustomScrollBarUISky;

public class DialogWatch extends JDialog implements MouseListener {
	private static final long serialVersionUID = 1L;
	private static final int MAX_WIDTH = 400;
	private static final int MAX_HEIGHT = 400;
	private static final int P_MAX_WIDTH = 400;
	private static final int P_MAX_HEIGHT = 400;
	public static final int SCROLLBAR_HEIGHT_H = 10;
	
	private JPanel paneWatch;
	private JScrollPane scrollWatch;
	
	private JLabel lblLine;
	private JLabel lblVarName;
	private JLabel lblType;
	private JLabel lblMethod;
	private JLabel lblBlock;
	private JPanel pnlButtons;
	private JPanel pnlTopBar;

	private ArrayList<JCheckBox> checkboxList;
	private JCheckBox selectAll;
	private JButton btnOK;
	private JButton btnClose;
	private JPanel pnlContents;
	private JPanel pnlParent;
	private ArrayList<VariableNode> varList;
	private ArrayList<VariableNode> selectedVar;
	private Panel pnlParentPanel;
	public DialogWatch(Panel pnlParentPanel, ArrayList<VariableNode> varList) {
		this.pnlParentPanel = pnlParentPanel;
		
		this.varList = varList;
		this.selectedVar = new ArrayList<VariableNode>();
		this.initComponents();
		

		this.pnlTopBar = new JPanel();
		pnlTopBar.setSize(this.getWidth(), 20);
		pnlTopBar.setPreferredSize(pnlTopBar.getSize());
		pnlTopBar.setBackground(Styles.UN_RESERVED_WORD);
//		pnlTopBar.setBorder(FrameStatic.brdrBar);
		this.btnClose.setSize(pnlTopBar.getHeight()+2, pnlTopBar.getHeight());
		btnClose.setBorder(FrameStatic.brdrBar);
		pnlTopBar.add(btnClose);
		btnClose.setText("");
		btnClose.setBackground(Color.WHITE);
		pnlTopBar.setLayout(null);
		btnClose.setBounds(pnlTopBar.getWidth()-btnClose.getWidth(),
				-3, btnClose.getWidth(), btnClose.getHeight());
		
		this.pnlParent = new JPanel();
		this.pnlParent.setSize(this.getWidth(), this.getHeight());
		this.pnlParent.setPreferredSize(pnlParent.getSize());
		
		this.pnlParent.setLayout(new BoxLayout(pnlParent, BoxLayout.Y_AXIS));
		
		pnlParent.setBorder(FrameStatic.brdrBar);
		
		this.pnlButtons = new JPanel();
		pnlButtons.setLayout(new BoxLayout(pnlButtons, BoxLayout.X_AXIS));
		pnlButtons.add(btnOK);
//		pnlButtons.add(btnClose);
		pnlButtons.setSize(this.getWidth(), 40);
		pnlButtons.setPreferredSize(pnlButtons.getSize());

		pnlParent.add(pnlTopBar);
		pnlParent.add(pnlContents);
		pnlParent.add(pnlButtons);
		
		this.add(pnlParent);
//		this.pack();
	}
	
	public void initComponents() {
		this.setSize(P_MAX_WIDTH, P_MAX_HEIGHT);
		this.setMaximumSize(new Dimension(P_MAX_WIDTH, P_MAX_HEIGHT));
		this.getContentPane().setBackground(Color.WHITE);
	
		this.setUndecorated(true);
		this.setModal(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		
		pnlContents = new JPanel();
		pnlContents.setLayout(new GridBagLayout());
		pnlContents.setSize(this.getWidth()-3, P_MAX_HEIGHT-63);
		pnlContents.setMaximumSize(new Dimension(P_MAX_WIDTH, P_MAX_HEIGHT));
		
//		pnlContents.setMinimumSize(pnlContents.getMaximumSize());
		this.paneWatch = new JPanel();
		this.paneWatch.setLayout(new GridBagLayout());
//		this.paneWatch.setMaximumSize(new Dimension(MAX_WIDTH-2, MAX_HEIGHT));
		this.paneWatch.setBackground(Color.WHITE);
		paneWatch.setSize(pnlContents.getMaximumSize());
		paneWatch.setMinimumSize(pnlContents.getSize());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weightx = 1;
		gbc.weighty = 1;
//		gbc.anchor = GridBagConstraints.NORTHWEST;
		gbc.fill = GridBagConstraints.BOTH;
		
		this.scrollWatch = new JScrollPane(this.paneWatch);
		this.scrollWatch.setPreferredSize(new Dimension(MAX_WIDTH, MAX_HEIGHT));
		this.scrollWatch.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		this.scrollWatch.getVerticalScrollBar().setUI(new CustomScrollBarUISky());
		this.scrollWatch.getVerticalScrollBar().setPreferredSize(new Dimension(
				10,
				(int)scrollWatch.getVerticalScrollBar().getPreferredSize().getHeight()));
		this.scrollWatch.setBorder(null);
		scrollWatch.setSize(pnlContents.getMaximumSize());
		scrollWatch.setPreferredSize(scrollWatch.getSize());
		this.pnlContents.add(this.scrollWatch, gbc);
		
		this.lblLine = this.initLabelHeader("Line No.");
		this.lblVarName = this.initLabelHeader("Variable");
		this.lblType = this.initLabelHeader("Data Type");
		this.lblMethod = this.initLabelHeader("In method");
		this.lblBlock = this.initLabelHeader("In method block");
		
		this.checkboxList = new ArrayList<JCheckBox>();
		
		this.selectAll = new JCheckBox();
		this.selectAll.setBackground(Color.WHITE);
		selectAll.setMargin(new Insets(0, 20, 2, 0));
		selectAll.setIcon(new ImageIcon(getClass().getClassLoader().getResource("res/ico_check_off.png")));
		selectAll.setSelectedIcon(new ImageIcon(getClass().getClassLoader().getResource("res/ico_check_on.png")));
		
		
		this.selectAll.addMouseListener(this);
		
		this.btnOK = new JButton("      OK      ");
		this.btnOK.setRolloverEnabled(false);
		this.btnOK.setOpaque(true);
		this.btnOK.setBackground(Color.WHITE);
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
		gbc.anchor = GridBagConstraints.NORTHWEST;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.ipadx = 20;
		gbc.gridy = 0;
		gbc.gridx = 0;
		gbc.weightx = 0.8;
		this.paneWatch.add(this.selectAll, gbc);
		
		gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.NORTHWEST;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.ipadx = 70;
		gbc.weightx = 0.1;
		gbc.gridy = 0;
		gbc.gridx = 1;
		this.paneWatch.add(this.lblVarName, gbc);
		
		gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.NORTHWEST;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.ipadx = 50;
		gbc.gridy = 0;
		gbc.gridx = 2;
		gbc.weightx = 0.1;
		this.paneWatch.add(this.lblType, gbc);
		
		gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.NORTHWEST;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.ipadx = 50;
		gbc.gridy = 0;
		gbc.weightx = 0.1;
		gbc.gridx = 3;
		this.paneWatch.add(this.lblLine, gbc);
		
		gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.NORTHWEST;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.ipadx = 50;
		gbc.gridy = 0;
		gbc.weightx = 0.1;
		gbc.gridx = 4;
		this.paneWatch.add(this.lblMethod, gbc);
		
		gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.NORTHWEST;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.ipadx = 50;
		gbc.gridy = 0;
		gbc.weightx = 0.1;
		gbc.gridx = 5;
		this.paneWatch.add(this.lblBlock, gbc);
		
		gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.NORTHWEST;
		gbc.gridx = 0;
//		gbc.gridy = 1;
		gbc.gridwidth = 4;
		gbc.anchor = GridBagConstraints.NORTHWEST;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.weightx = 1;
		gbc.weighty = 0.9;
		JSeparator mainSep = this.initSeparatorHorizontal();
		mainSep.setBackground(Color.WHITE);
		this.paneWatch.add(mainSep, gbc);
		int y = 2;
		for(VariableNode variable : varList) {
			gbc = new GridBagConstraints();
		
			gbc.anchor = GridBagConstraints.NORTHWEST;
			gbc.fill = GridBagConstraints.VERTICAL;
			gbc.anchor = GridBagConstraints.NORTHWEST;
			gbc.gridy = y;
			gbc.gridwidth = 4;
			gbc.gridx = 0;
//			gbc.weightx = 1;
//			gbc.weighty = 1;
//			gbc.weightx = 0.1;
			JCheckBox checkbox = this.initCheckbox();
			checkbox.setSelected(false);
			checkbox.setFont(FrameStatic.fntDefault);
			this.checkboxList.add(checkbox);
			this.paneWatch.add(checkbox, gbc);
			
			gbc.gridx = 1;
			gbc.weightx = 0.2;
			gbc.anchor = GridBagConstraints.NORTHWEST;
//			gbc.gridwidth = 2;
//			gbc.ipadx = 0;
			JLabel varName = this.initLabelVarName(variable.getLiteral());
			this.paneWatch.add(varName, gbc);
			
			gbc.gridx = 2;
//			gbc.weightx = 0.1;
			gbc.anchor = GridBagConstraints.NORTHWEST;
			gbc.weightx = 0.2;
			JLabel dataType = this.initLabelDataType(variable.getDataType());
			this.paneWatch.add(dataType, gbc);
			
			gbc.gridx = 3;
			gbc.anchor = GridBagConstraints.NORTHWEST;
			gbc.fill = GridBagConstraints.BOTH;
//			gbc.weightx = 0.1;
			JLabel lineNo = this.initLabelLineNum(String.valueOf(variable.getLineNumber()));
			this.paneWatch.add(lineNo, gbc);
			
			gbc.gridx = 4;
			gbc.anchor = GridBagConstraints.NORTHWEST;
//			gbc.weightx = 0.1;
			JLabel method = this.initLabelMethod(variable.getFuncParent());
			this.paneWatch.add(method, gbc);

			gbc.anchor = GridBagConstraints.NORTHWEST;
			gbc.gridx = 5;
//			gbc.weightx = 0.1;
			JLabel methodBlock = this.initLabelMethod(variable.getFuncChild());
			this.paneWatch.add(methodBlock, gbc);
			
			y+=2;
		}
		

//		gbc = new GridBagConstraints();
//		gbc.gridx = x; 
//		 **** add here:
//		gbc.gridx = 0;
//		gbc.gridy = 0;
//		gbc.weightx = 1.0;
//		gbc.weighty = 1.0;
//		gbc = new GridBagConstraints();
//		gbc.anchor = GridBagConstraints.SOUTHWEST;
//		gbc.anchor = GridBagConstraints.NORTHWEST;
//		gbc.gridy = y-1;
//		gbc.gridx = 0;
//		gbc.weightx = 0.1;
//		gbc.gridwidth = 6;
//		JSeparator lastSep = this.initSeparatorHorizontal();
////		this.paneWatch.add(lastSep, gbc);
//		
//		gbc = new GridBagConstraints();
//		gbc.anchor = GridBagConstraints.SOUTHEAST;
//		gbc.anchor = GridBagConstraints.NORTHWEST;
//		gbc.gridy = y;
//		gbc.gridx = 5;
//		gbc.insets = new Insets(10, 0, 10, 10);
////		this.paneWatch.add(this.btnClose, gbc);
//		
//		gbc.insets = new Insets(10, 0, 10, 100);
////		this.paneWatch.add(this.btnOK, gbc);
		
//		this.pack();
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
		checkbox.setBackground(Color.WHITE);
		checkbox.setSelected(false);
		checkbox.setOpaque(true);
		checkbox.setAlignmentX(JFrame.CENTER_ALIGNMENT);
		checkbox.setSize(10, 10);
		checkbox.setMargin(new Insets(0, 20, 0, 0));

		checkbox.setIcon(new ImageIcon(getClass().getClassLoader().getResource("res/ico_check_off.png")));
		checkbox.setSelectedIcon(new ImageIcon(getClass().getClassLoader().getResource("res/ico_check_on.png")));
		return checkbox;
	}
	
	public JLabel initLabelMain(String text) {
		JLabel lbl = new JLabel();
		lbl.setOpaque(true);
		lbl.setBackground(Color.WHITE);
		lbl.setForeground(Color.BLACK);
//		lbl.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		Font font = lbl.getFont();
		lbl.setFont(font.deriveFont(font.getStyle() & ~Font.BOLD));
		lbl.setFont(FrameStatic.fntDefault);
		return lbl;
	}
	
	public JLabel initLabelHeader(String text) {
		JLabel lbl = new JLabel(text);
		lbl.setOpaque(true);
		lbl.setBackground(Color.WHITE);
		lbl.setForeground(Color.BLACK);
//		lbl.setBorder(new EmptyBorder(5, 5, 5, 5));
		lbl.setSize(30, 24);
		lbl.setPreferredSize(lbl.getSize());
		Font font = lbl.getFont();
		lbl.setFont(font.deriveFont(font.getStyle() & ~Font.BOLD));

		lbl.setFont(FrameStatic.fntDefault);
		return lbl;
	}
	
	public JLabel initLabelLineNum(String text) {
		JLabel lbl = new JLabel(text);
		lbl.setOpaque(true);
		lbl.setBackground(Color.WHITE);
		lbl.setForeground(Color.DARK_GRAY);
//		lbl.setBorder(new EmptyBorder(5, 5, 5, 2));
		
//		Font font = lbl.getFont();
//		lbl.setFont(font.deriveFont(font.getStyle() & ~Font.BOLD));

		lbl.setFont(FrameStatic.fntDefault14_BOLD);
//		lbl.setHorizontalAlignment(JLabel.CENTER);
		return lbl;
	}
	
	public JLabel initLabelVarName(String text) {
		JLabel lbl = new JLabel(text);
		lbl.setOpaque(true);
		lbl.setBackground(Color.WHITE);
		lbl.setForeground(Color.BLACK);
//		lbl.setBorder(new EmptyBorder(1, 0, 0, 0));
		lbl.setSize(100, 25);
		
		lbl.setPreferredSize(lbl.getSize());
		lbl.setFont(FrameStatic.fntDefault14_BOLD);
		return lbl;
	}
	
	public JLabel initLabelDataType(String text) {
		JLabel lbl = new JLabel(text);
		lbl.setOpaque(true);
		lbl.setBackground(Color.WHITE);
		lbl.setForeground(Styles.UN_RESERVED_WORD_2);
//		lbl.setBorder(new EmptyBorder(5, 1, 5, 2));

		lbl.setSize(30, 25);
		lbl.setPreferredSize(lbl.getSize());
		Font font = lbl.getFont();
		lbl.setFont(font.deriveFont(font.getStyle() & ~Font.BOLD));

		lbl.setFont(FrameStatic.fntDefault14_BOLD);
		return lbl;
	}
	
	public JLabel initLabelMethod(String text) {
		JLabel lbl = new JLabel(text);
		lbl.setOpaque(true);
		lbl.setBackground(Color.WHITE);
		lbl.setForeground(Color.BLACK);
//		lbl.setBorder(new EmptyBorder(4, 0, 0, 0));

		lbl.setSize(40, 25);
		Font font = lbl.getFont();
		lbl.setFont(font.deriveFont(font.getStyle() & ~Font.BOLD));

		lbl.setFont(FrameStatic.fntDefault);
		return lbl;
	}
	
	public JLabel initLabelMethodBlock(String text) {
		JLabel lbl = new JLabel(text);
		lbl.setOpaque(true);
		lbl.setBackground(Color.WHITE);
		lbl.setForeground(Color.BLACK);
//		lbl.setBorder(new EmptyBorder(5, 1, 5, 2));
		
		Font font = lbl.getFont();
		lbl.setFont(font.deriveFont(font.getStyle() & ~Font.BOLD));

		lbl.setSize(80, 25);
		lbl.setFont(FrameStatic.fntDefault);
		return lbl;
	}

	public ArrayList<VariableNode> getSelectedVar() {
		return this.selectedVar;
	}
	
	@Override
	public void mouseReleased(MouseEvent arg0) {
		if(arg0.getSource().equals(this.selectAll)) {
			if(!this.checkboxList.isEmpty()) {
				for(int i = 0; i < this.checkboxList.size(); i++) {
					this.checkboxList.get(i).setSelected(this.selectAll.isSelected());
				}
			}
		}
		else if(arg0.getSource().equals(this.btnOK)) {

			pnlParentPanel.purgeWatchTab();
			for(int i = 0; i < this.checkboxList.size(); i++) {
				if(this.checkboxList.get(i).isSelected()) {
					this.selectedVar.add(this.varList.get(i));
				}
			}
			pnlParentPanel.setListWatchVariables(this.selectedVar);
			this.dispose();
		}
		else if(arg0.getSource().equals(this.btnClose)) {
			pnlParentPanel.closeWatch();
			this.dispose();
		}
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
