package com.ide;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.Element;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

import org.antlr.v4.gui.TreeViewer;
import org.fife.ui.rsyntaxtextarea.AbstractTokenMakerFactory;
import org.fife.ui.rsyntaxtextarea.Style;
import org.fife.ui.rsyntaxtextarea.SyntaxScheme;
import org.fife.ui.rsyntaxtextarea.Token;
import org.fife.ui.rsyntaxtextarea.TokenMakerFactory;
import org.fife.ui.rtextarea.RTextScrollPane;

import com.ide.styles.IdeStyle;
import com.ide.styles.RSyntaxTextAreaManuscript;
import com.ide.styles.Styles;
import com.override.CustomScrollBarUISky;
import com.parser.ScannerModel;
import com.save.TextFileHandler;
import com.utils.Console;



public class Panel implements ActionListener, KeyListener, MouseListener {
	private Frame frameParent;
	private DialogSave dlgSave;

	private TextFileHandler textFileHandler;
	
	private JPanel pnlMain;
	private JPanel pnlMenu;
	private JButton btnRun;
	private JButton btnLoad;
	private JButton btnSave;

	
	private Styles styles;
	
	private JLabel lblCodeInput;
	private JLabel lblParsedOut;
	private JLabel lblConsole;
	
	private JTextArea inputLines;
	
	private JSplitPane topSplitPane;
	private JSplitPane bottomSplitPane;
	
	private JPanel bottomPane;
	private JTabbedPane outputTabs;
	
	private RSyntaxTextAreaManuscript codeInput;
	private JTextPane parsedOut;
	public static JTextPane threeACOut;


	private JPanel inputPaneParent;
	private RTextScrollPane inputPane;
	private JScrollPane parsedPane;
	private JScrollPane threeACPane;
	private JScrollPane treePane;
	private JScrollPane consolePane;

	private JButton btnScaleUp;
	private JButton btnScaleDown;

	public final static Color SUBLIME_BG = new Color(39, 40, 34);
	public final static Color SUBLIME_HIGHLIGHT = new Color(51, 51, 42);
	public final static Color SUBLIME_KEYWORD = new Color(102, 217, 239);
	public final static Color SUBLIME_LITERAL = new Color(230, 219, 116);
	public final static String newline = "\n";
	
	private ScannerModel scanner;

	public static int baseFontSize = (int) Frame.SCREEN_SIZE.getHeight() / 60;
	
	public Panel() {
		
		// Remove JTabbedPane "Borders"
		UIManager.getDefaults().put("TabbedPane.contentBorderInsets", new Insets(0,0,0,0));
		UIManager.getDefaults().put("TabbedPane.tabsOverlapBorder", true);

	
		UIManager.getDefaults().put("SplitPane.border", BorderFactory.createEmptyBorder());
		UIManager.getDefaults().put("SplitPane.contentBorderInsets", new Insets(0,0,0,0));
		
		UIManager.put("TabbedPane.selected", Styles.SKY_BLUE);
		UIManager.getLookAndFeelDefaults().put("TabbedPane:TabbedPaneTab[Enabled].backgroundPainter", new BackgroundPainter(Color.WHITE));
        UIManager.getLookAndFeelDefaults().put("TabbedPane:TabbedPaneTab[Enabled+MouseOver].backgroundPainter", new BackgroundPainter(Color.WHITE));
        UIManager.getLookAndFeelDefaults().put("TabbedPane:TabbedPaneTab[Enabled+Pressed].backgroundPainter", new BackgroundPainter(Color.WHITE));
        UIManager.getLookAndFeelDefaults().put("TabbedPane:TabbedPaneTab[Focused+MouseOver+Selected].backgroundPainter", new BackgroundPainter(Color.WHITE));
        UIManager.getLookAndFeelDefaults().put("TabbedPane:TabbedPaneTab[Focused+Pressed+Selected].backgroundPainter", new BackgroundPainter(Color.WHITE));
        UIManager.getLookAndFeelDefaults().put("TabbedPane:TabbedPaneTab[Focused+Selected].backgroundPainter", new BackgroundPainter(Color.GRAY));
        UIManager.getLookAndFeelDefaults().put("TabbedPane:TabbedPaneTab[MouseOver+Selected].backgroundPainter", new BackgroundPainter(Color.WHITE));
        UIManager.getLookAndFeelDefaults().put("TabbedPane:TabbedPaneTab[Pressed+Selected].backgroundPainter", new BackgroundPainter(Color.WHITE));
        UIManager.getLookAndFeelDefaults().put("TabbedPane:TabbedPaneTab[Selected].backgroundPainter", new BackgroundPainter(Color.WHITE));
		
        
        UIManager.put("TabbedPane.borderHightlightColor", Color.WHITE);
        UIManager.put("TabbedPane.darkShadow", Color.WHITE);
        UIManager.put("TabbedPane.shadow", Color.WHITE);
        UIManager.put("TabbedPane.light", Color.WHITE);
        UIManager.put("TabbedPane.highlight", Color.WHITE);
        UIManager.put("TabbedPane.focus", Color.WHITE);
        UIManager.put("TabbedPane.selectHighlight", Color.WHITE);
        

		this.textFileHandler = new TextFileHandler();
		this.styles = new Styles();
		//-----------------------Syntax Highlighting (for output) TO REMOVE----------------------------------
		SimpleAttributeSet attrKeyword = new SimpleAttributeSet();
        attrKeyword.addAttribute(StyleConstants.Foreground, SUBLIME_KEYWORD);
        attrKeyword.addAttribute(StyleConstants.Bold, Boolean.TRUE);
        
        SimpleAttributeSet attrLiteral = new SimpleAttributeSet();
        attrLiteral.addAttribute(StyleConstants.Foreground, SUBLIME_LITERAL);
        

        
        DefaultStyledDocument doc = new DefaultStyledDocument() {            
			private static final long serialVersionUID = 1L;

			public void insertString (int offset, String str, AttributeSet a) throws BadLocationException {
                super.insertString(offset, str, a);

                String text = getText(0, getLength());
                for (IdeStyle style : styles.getStyles()) {
	                Pattern pattern = Pattern.compile(style.getRegex());
	                Matcher matcher = pattern.matcher(text);
	                while (matcher.find()) {
	                    setCharacterAttributes(matcher.start(), matcher.end() - matcher.start() - 1, style.getAttrSet(), false);
	                }
	            }
            }
        };
        //--------------------------------------TO REMOVE----------------------------------------------------
        
		//Main Panel
		this.pnlMain = new JPanel();
		this.pnlMain.setLayout(new GridBagLayout());
		this.pnlMain.setBackground(Color.WHITE);
		this.pnlMain.isOpaque();
		GridBagConstraints gbc;
		
		
		
		
		//Run Button		
		gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.NORTHWEST;
		gbc.fill = GridBagConstraints.BOTH;

		gbc.gridwidth = 1;
		gbc.gridheight = 0;
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.insets = new Insets(0, 0, 0, 0);
		gbc.weightx = 1;
		gbc.weighty = 0.5;

		this.pnlMenu = new JPanel();
//		pnlMenu.setBackground(FrameStatic.clrTransparent);
		pnlMenu.setOpaque(false);
//		pnlMenu.setBackground(FrameStatic.clrAccent);
		pnlMenu.setLayout(null);
//		pnlMenu.setMaximumSize(new Dimension(1920, 100));
//		pnlMenu.setSize(new Dimension(1920, 100));
//		pnlMenu.setPreferredSize(new Dimension(1920, 100));
		pnlMenu.setMinimumSize(new Dimension(400, 100));
		
		this.btnRun = new JButton();
		this.btnRun.setFocusable(false);
		this.btnRun.addActionListener(this);
       
		btnRun.setBackground(Color.WHITE);
//        btnRun.setBorder(null);
		btnRun.setBorder(FrameStatic.brdrBarUn);
		btnRun.setIcon(new ImageIcon(getClass().getClassLoader().getResource("res/ico_play_off.png")));
        btnRun.setRolloverIcon(new ImageIcon(getClass().getClassLoader().getResource("res/ico_play_on.png")));
        btnRun.setPressedIcon(new ImageIcon(getClass().getClassLoader().getResource("res/ico_play_on.png")));
        btnRun.setFocusable(false);
		btnRun.getInsets().set(5, 0, 0, 0);

		btnRun.setSize(40, 35);
		btnRun.setPreferredSize(btnRun.getSize());
//		btnRun.setBounds(-10, 40, btnRun.getWidth(), btnRun.getHeight());
		pnlMenu.add(btnRun);


		this.btnLoad = new JButton();
		btnLoad.setFocusable(false);
		btnLoad.addActionListener(this);
		btnLoad.addMouseListener(this);
//		btnLoad.setBorder(null);
		btnLoad.setBorder(FrameStatic.brdrBarUn);
		btnLoad.setBackground(Color.WHITE);
		btnLoad.setIcon(new ImageIcon(getClass().getClassLoader().getResource("res/ico_open_off.png")));
		btnLoad.setRolloverIcon(new ImageIcon(getClass().getClassLoader().getResource("res/ico_open_on.png")));
		btnLoad.setPressedIcon(new ImageIcon(getClass().getClassLoader().getResource("res/ico_open_on.png")));

		btnLoad.setFocusable(false);
		btnLoad.getInsets().set(30, 0, 0, 0);

		btnLoad.setSize(40, 35);
		btnLoad.setPreferredSize(btnLoad.getSize());
		pnlMenu.add(btnLoad);


		this.btnSave = new JButton();
		btnSave.setFocusable(false);
		btnSave.addActionListener(this);
		btnSave.addMouseListener(this);
//		btnSave.setBorder(null);
		btnSave.setBorder(FrameStatic.brdrBarUn);
		btnSave.setBackground(Color.WHITE);
		btnSave.setIcon(new ImageIcon(getClass().getClassLoader().getResource("res/ico_save_off.png")));
		btnSave.setRolloverIcon(new ImageIcon(getClass().getClassLoader().getResource("res/ico_save_on.png")));
		btnSave.setPressedIcon(new ImageIcon(getClass().getClassLoader().getResource("res/ico_save_on.png")));
		btnSave.setFocusable(false);
		btnSave.getInsets().set(30, 0, 0, 0);

		btnSave.setSize(40, 35);
		btnSave.setPreferredSize(btnSave.getSize());
		pnlMenu.add(btnSave);
				
		

		int offsetX = 7;

//		btnRun.setLocation(10, 6);
		btnRun.setLocation(20, 6);
		btnLoad.setLocation(btnRun.getX()+btnRun.getWidth()+offsetX, btnRun.getY());
		btnSave.setLocation(btnLoad.getX()+btnLoad.getWidth()+offsetX, btnRun.getY());
		this.pnlMain.add(this.pnlMenu, gbc);
		
		//Code Input
		this.lblCodeInput = new JLabel("Code Input:");
		this.lblCodeInput.setFont(new Font("Segoe UI", 150, baseFontSize));
		this.lblCodeInput.setForeground(Color.BLACK);
		this.lblCodeInput.setBackground(Color.GRAY);
		this.lblCodeInput.setOpaque(true);
		this.lblCodeInput.setLayout(new BorderLayout());
		gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.NORTHWEST;
		gbc.fill = GridBagConstraints.VERTICAL;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.insets = new Insets(5, 10, 0, 0);
		gbc.weightx = 1.0;
		gbc.weighty = 0;
//		this.pnlMain.add(this.lblCodeInput, gbc);
		
		this.codeInput = new RSyntaxTextAreaManuscript();
		this.codeInput.setSyntaxScheme(getExpressionColorScheme(this.codeInput.getSyntaxScheme()));
		AbstractTokenMakerFactory atmf = (AbstractTokenMakerFactory)TokenMakerFactory.getDefaultInstance();
		atmf.putMapping("text/manuscript", "com.ide.styles.ManuScriptTokenMaker");
		
		this.codeInput.setSyntaxEditingStyle("text/manuscript");

		this.codeInput.setCurrentLineHighlightColor(SUBLIME_HIGHLIGHT);
		this.codeInput.setCodeFoldingEnabled(true);
		this.codeInput.setFont(new Font("Consolas", 150, baseFontSize));
		this.codeInput.setForeground(Color.WHITE);
		this.codeInput.setBackground(SUBLIME_BG);
//		this.codeInput.isOpaque();
		this.codeInput.setCaretColor(Color.WHITE);
		this.codeInput.setMargin(new Insets(5, 5, 0, 0));
		Console.instance().setCodeInput(codeInput);
		Console.instance().getTextPane().addMouseListener(this);
		
		this.inputLines = new JTextArea("1");
	      
		this.inputLines.setFont(new Font("Consolas", 150, baseFontSize));
		this.inputLines.setBackground(Color.DARK_GRAY);
		this.inputLines.setForeground(Color.WHITE);
		this.inputLines.setEditable(false);
		this.inputLines.setMargin(new Insets(0, 5, 0, 5));
		
		this.inputPane = new RTextScrollPane(this.codeInput);
		this.inputPane.setPreferredSize(new Dimension((int) Frame.SCREEN_SIZE.getWidth()/2, 150));
//		this.inputPane.setSize(new Dimension((int) Frame.SCREEN_SIZE.getWidth()/2, 150));
//		this.inputPane.setMaximumSize(new Dimension((int) Frame.SCREEN_SIZE.getWidth()/2, 150));
//		this.inputPane.setMinimumSize(new Dimension((int) Frame.SCREEN_SIZE.getWidth()/2, 150));
		
		this.inputPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		this.inputPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
//		this.inputPane.setRowHeaderView(this.inputLines);
		this.inputPane.getVerticalScrollBar().setUI(new CustomScrollBarUISky());
		this.inputPane.getHorizontalScrollBar().setUI(new CustomScrollBarUISky());
		this.inputPane.getTextArea().setFadeCurrentLineHighlight(true);
//		this.inputPane.getTextArea().setCurrentLineHighlightColor(Styles.UN_HIGHLIGHT);
		this.inputPane.getTextArea().setSelectionColor(Styles.UN_HIGHLIGHT);
		this.inputPane.setBorder(null);
		int horizontalHeight = 10;
		
		this.inputPane.getHorizontalScrollBar().setPreferredSize(new Dimension(
		        (int)inputPane.getHorizontalScrollBar().getPreferredSize().getWidth(),
		        (int)horizontalHeight
		));
		
		this.inputPane.getVerticalScrollBar().setPreferredSize(new Dimension(
		        (int)horizontalHeight,
		        (int)inputPane.getVerticalScrollBar().getPreferredSize().getWidth()
		));

		gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.NORTHWEST;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridwidth = 3;
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.insets = new Insets(30, 10, 10, 0);
		gbc.weighty = 0;
		
		
		//Output Parse Tree
		this.lblParsedOut = new JLabel("Parsed Out:");
		this.lblParsedOut.setFont(new Font("Segoe UI", 150, baseFontSize));
		this.lblParsedOut.setForeground(Color.BLACK);
		gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.NORTHWEST;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridwidth = 3;
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.insets = new Insets(0, 10, 0, 0);
		gbc.weightx = 1;
		gbc.weighty = 1;
		
		this.parsedOut = new JTextPane(doc);
        this.parsedOut.setFont(new Font("Consolas", 150, baseFontSize));
        this.parsedOut.setEditable(false);
        this.parsedOut.setForeground(Color.WHITE);
        this.parsedOut.setBackground(SUBLIME_BG);
        this.parsedOut.isOpaque();
		
        
		this.parsedPane = new JScrollPane(this.parsedOut);
		this.parsedPane.setPreferredSize(new Dimension((int) Frame.SCREEN_SIZE.getWidth()/2, 150));
		this.parsedPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		this.parsedPane.getVerticalScrollBar().setUI(new CustomScrollBarUISky());
		this.parsedPane.getHorizontalScrollBar().setUI(new CustomScrollBarUISky());
		this.parsedPane.setBorder(null);
	
		this.parsedPane.getHorizontalScrollBar().setPreferredSize(new Dimension(
		        (int)parsedPane.getHorizontalScrollBar().getPreferredSize().getWidth(),
		        (int)horizontalHeight
		));
		
		this.parsedPane.getVerticalScrollBar().setPreferredSize(new Dimension(
		        (int)horizontalHeight,
		        (int)parsedPane.getVerticalScrollBar().getPreferredSize().getHeight()
		));
		
		
		// For three address code
		threeACOut = new JTextPane();
        threeACOut.setFont(new Font("Consolas", 150, baseFontSize));
        threeACOut.setEditable(false);
        threeACOut.setForeground(Color.WHITE);
        threeACOut.setBackground(SUBLIME_BG);
        threeACOut.isOpaque();
		
        
		this.threeACPane = new JScrollPane(threeACOut);
		this.threeACPane.setPreferredSize(new Dimension((int) Frame.SCREEN_SIZE.getWidth()/2, 150));
		this.threeACPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	
		this.threeACPane.getVerticalScrollBar().setUI(new CustomScrollBarUISky());
		this.threeACPane.getHorizontalScrollBar().setUI(new CustomScrollBarUISky());
		this.threeACPane.setBorder(null);
	
		this.threeACPane.getHorizontalScrollBar().setPreferredSize(new Dimension(
		        (int)threeACPane.getHorizontalScrollBar().getPreferredSize().getWidth(),
		        (int)horizontalHeight
		));
		
		this.threeACPane.getVerticalScrollBar().setPreferredSize(new Dimension(
		        (int)horizontalHeight,
		        (int)threeACPane.getVerticalScrollBar().getPreferredSize().getHeight()
		));
		
		this.treePane = new JScrollPane(); //TODO: do parse tree
		this.treePane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		this.treePane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		
		this.treePane.getVerticalScrollBar().setUI(new CustomScrollBarUISky());
		this.treePane.getHorizontalScrollBar().setUI(new CustomScrollBarUISky());
		this.treePane.setBorder(null);
	
		this.treePane.getHorizontalScrollBar().setPreferredSize(new Dimension(
		        (int)treePane.getHorizontalScrollBar().getPreferredSize().getWidth(),
		        (int)horizontalHeight
		));

		this.treePane.getVerticalScrollBar().setPreferredSize(new Dimension(
		        (int)horizontalHeight,
		        (int)treePane.getVerticalScrollBar().getPreferredSize().getHeight()
		));
		
		JPanel parentPane = new JPanel();
		parentPane.setLayout(new BoxLayout(parentPane, BoxLayout.Y_AXIS));
		
		//Scale Button
		JPanel pnlScaleMenu = new JPanel();
		pnlScaleMenu.setLayout(null);
        this.btnScaleUp = new JButton();
        btnScaleUp.setBackground(Color.WHITE);
        btnScaleUp.setBorder(null);
        
        // TODO Proper res retrieval
        btnScaleUp.setIcon(new ImageIcon(getClass().getClassLoader().getResource("res/ico_add_off.png")));
        btnScaleUp.setRolloverIcon(new ImageIcon(getClass().getClassLoader().getResource("res/ico_add_on.png")));
        btnScaleUp.setPressedIcon(new ImageIcon(getClass().getClassLoader().getResource("res/ico_add_on.png")));
        btnScaleUp.setFocusable(false);
        
		this.btnScaleUp.setBounds(3, 3, 30, 30);
		this.btnScaleUp.addActionListener(this);
		pnlScaleMenu.add(this.btnScaleUp);
        
        this.btnScaleDown = new JButton();
        btnScaleDown.setBackground(Color.WHITE);
        btnScaleDown.setBorder(null);
        btnScaleDown.setIcon(new ImageIcon(getClass().getClassLoader().getResource("res/ico_subtract_off.png")));
        btnScaleDown.setRolloverIcon(new ImageIcon(getClass().getClassLoader().getResource("res/ico_subtract_on.png")));
        btnScaleDown.setPressedIcon(new ImageIcon(getClass().getClassLoader().getResource("res/ico_subtract_on.png")));
        btnScaleDown.setFocusable(false);
        
		this.btnScaleDown.setBounds(38, 3, 30, 30);
		this.btnScaleDown.addActionListener(this);
		this.btnScaleDown.addActionListener(this);
		pnlScaleMenu.add(this.btnScaleDown);
		
		pnlScaleMenu.setMaximumSize(new Dimension(1366, 36));
		pnlScaleMenu.setMinimumSize(new Dimension(0, 36));
		pnlScaleMenu.setPreferredSize(new Dimension(1366, 36));
		pnlScaleMenu.setBackground(Color.WHITE);
		parentPane.add(pnlScaleMenu);
		parentPane.add(treePane);
		
		this.outputTabs = new JTabbedPane();
		this.outputTabs.add("Parsed Out", this.parsedPane);
		this.outputTabs.add("Parse Tree", parentPane);
		this.outputTabs.add("3 Address Code", this.threeACPane);

		this.outputTabs.setFont(FrameStatic.fntDefault);
		outputTabs.setBackground(Color.WHITE);
		parentPane.setSize(outputTabs.getWidth(), 40);
		
		this.inputPaneParent = new JPanel();
		this.inputPaneParent.setLayout(new BoxLayout(inputPaneParent, BoxLayout.Y_AXIS));
		inputPaneParent.setOpaque(false);
		inputPaneParent.setBackground(FrameStatic.clrTransparent);
		JPanel lblInput = new JPanel();
//		lblInput.setFont(FrameStatic.fntGothamLight20);
		lblInput.setBackground(FrameStatic.clrTransparent);
		
		lblInput.setSize(900, 20);
		lblInput.setPreferredSize(lblInput.getSize());
		lblInput.setMinimumSize(new Dimension(210, lblInput.getHeight()));
		lblInput.setMaximumSize(lblInput.getSize());
//		lblInput.setHorizontalAlignment(JLabel.LEFT);
//		lblInput.setLayout(new FlowLayout());
		lblInput.setOpaque(false);
		lblInput.setLayout(null);


		
		
		this.inputPaneParent.add(lblInput);
		this.inputPaneParent.add(this.inputPane);
		
		this.topSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		this.topSplitPane.setLeftComponent(this.inputPaneParent);
		topSplitPane.setBackground(FrameStatic.clrTransparent);
		topSplitPane.setOpaque(false);
		topSplitPane.setResizeWeight(1.0);
//		((JScrollPane)topSplitPane.getLeftComponent()).setBounds(0, 30, topSplitPane.getLeftComponent().getWidth(),
//				topSplitPane.getLeftComponent().getHeight());
//		
//		((JScrollPane)topSplitPane.getLeftComponent()).setLocation(0, 50);
		
		
		
//		topSplitPane.getLeftComponent().setBounds(0, 0, topSplitPane.getLeftComponent().getWidth(),
//				topSplitPane.getLeftComponent().getHeight());
		this.topSplitPane.setRightComponent(this.outputTabs);
		this.topSplitPane.setDividerLocation((int) Frame.SCREEN_SIZE.getWidth()-440);
		gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.NORTHEAST;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridwidth = 6;
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.insets = new Insets(30, 100, 10, 10);
		this.pnlMain.add(this.topSplitPane, gbc);
		
		this.bottomPane = new JPanel();
		this.bottomPane.setLayout(new GridBagLayout());
		this.bottomPane.setBackground(Color.WHITE);
		this.bottomPane.isOpaque();
		
		this.lblConsole = new JLabel("Console:");
//		this.lblConsole.setFont(new Font("Segoe UI", 150, baseFontSize));
		this.lblConsole.setFont(FrameStatic.fntDefault);
		lblConsole.setVerticalAlignment(JLabel.BOTTOM);
		this.lblConsole.setForeground(Color.BLACK);
		gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.NORTHWEST;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridwidth = 3;
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.insets = new Insets(10, 10, 0, 0);
		gbc.weightx = 1;
		gbc.weighty = 1;
		this.bottomPane.add(this.lblConsole, gbc);
				
		this.consolePane = new JScrollPane(Console.instance().getTextPane());
		this.consolePane.setPreferredSize(new Dimension(350, 150));
		this.consolePane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.NORTHEAST;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridwidth = 6;
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.insets = new Insets(30, 10, 10, 10);
		this.bottomPane.add(this.consolePane, gbc);
		
		this.bottomSplitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		this.bottomSplitPane.setTopComponent(this.topSplitPane);
		this.bottomSplitPane.setBottomComponent(this.bottomPane);
		this.bottomSplitPane.setDividerLocation((int) Frame.SCREEN_SIZE.getHeight()-300);
		bottomSplitPane.setOpaque(false);
		bottomSplitPane.setBackground(FrameStatic.clrTransparent);
		gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.NORTHEAST;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridwidth = 6;
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.insets = new Insets(30, 10, 10, 10);
		this.pnlMain.add(this.bottomSplitPane, gbc);
		
		this.topSplitPane.addPropertyChangeListener(JSplitPane.DIVIDER_LOCATION_PROPERTY, 
		    new PropertyChangeListener() {
		        @Override
		        public void propertyChange(PropertyChangeEvent pce) {
		        	lblParsedOut.setLocation(topSplitPane.getDividerLocation() + 20, lblParsedOut.getY());
		        }
		});
		
		//Scanner for input string
		this.scanner = new ScannerModel();
		
		this.topSplitPane.setDividerSize(2);
		this.topSplitPane.setBackground(Color.WHITE);
		this.topSplitPane.setContinuousLayout(true);
		
		this.bottomSplitPane.setDividerSize(2);
		this.bottomSplitPane.setBackground(Color.WHITE);
		this.bottomSplitPane.setContinuousLayout(true);

		this.dlgSave = new DialogSave();
		this.dlgSave.setProgressColor(FrameStatic.clrLightBlue);
		this.dlgSave.getBtnSave().addMouseListener(this);
		
	}
	
	public RSyntaxTextAreaManuscript getCodeInput() {
		return codeInput;
	}

	public void setCodeInput(RSyntaxTextAreaManuscript codeInput) {
		this.codeInput = codeInput;
	}

	public JTextArea getInputLines() {
		return inputLines;
	}

	public void setInputLines(JTextArea inputLines) {
		this.inputLines = inputLines;
	}

//	public void generateThreeAddressCode() {
//		threeACOut.setText(this.scanner.getIcg().getPrintText());
//		
//	}
	/*
	 * TODO: SyntaxHighlighting
	 * Specify the color for a Token type here using syntaxScheme.
	 * 
	 * The Token class is from the RSyntax external library. It has static methods
	 * for the generic token types.
	 * 
	 * To assign a word as a token to highlight, go to ManuScriptTokenMaker.java in
	 * src.com.ide.styles and check the getWordsToHighlight() function.
	 * 
	 */
	private SyntaxScheme getExpressionColorScheme(SyntaxScheme textAreaSyntaxScheme) {
		SyntaxScheme syntaxScheme = textAreaSyntaxScheme;

		syntaxScheme.setStyle(Token.RESERVED_WORD, new Style(Styles.UN_RESERVED_WORD));
		syntaxScheme.setStyle(Token.SEPARATOR, new Style(Styles.UN_SEPARATOR));
		syntaxScheme.setStyle(Token.LITERAL_STRING_DOUBLE_QUOTE, new Style(Styles.UN_LITERAL_STRING_DOUBLE_QUOTE));
		syntaxScheme.setStyle(Token.VARIABLE, new Style(Styles.UN_VARIABLE));
		syntaxScheme.setStyle(Token.COMMENT_KEYWORD, new Style(Styles.UN_COMMENT_KEYWORD));
		syntaxScheme.setStyle(Token.COMMENT_EOL, new Style(Styles.UN_COMMENT_EOL));
		syntaxScheme.setStyle(Token.OPERATOR, new Style(Styles.UN_OPERATOR));
		return syntaxScheme;
	}
	public JPanel getUI() {
		return this.pnlMain;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.btnRun) {
			Console.instance().purge();
			String text = this.codeInput.getText();		
			
			this.parsedOut.setText("");
//			this.parsedOut.setText(this.parsedOut.getText() + newline);
			this.parsedOut.setText(this.parsedOut.getText() + this.scanner.getTokens(text+newline));
			
			this.scanner.generateTree(); // Required to do this
			this.treePane.setViewportView(this.scanner.getTree());			
			
//			this.generateThreeAddressCode();
//			this.console.setText(this.console.getText() + this.scanner.getMessage());			
			this.codeInput.selectAll();
			this.parsedOut.setCaretPosition(parsedOut.getDocument().getLength());
		
		}
		
		if(e.getSource() == this.btnScaleUp) {
			TreeViewer treeViewer = this.scanner.getTree();
			if(treeViewer != null) {
				treeViewer.setScale(treeViewer.getScale()+0.5);
				this.treePane.setViewportView(treeViewer);

			}
		}
		
		if(e.getSource() == this.btnScaleDown) {
			TreeViewer treeViewer = this.scanner.getTree();
			if(treeViewer != null) {
				double scale = treeViewer.getScale();
				if(scale > 0.5) {
					treeViewer.setScale(scale-0.5);
					this.treePane.setViewportView(treeViewer);
				}
			}
		}
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		if((e.getKeyCode() == KeyEvent.VK_R) &&
			(e.getModifiers() & KeyEvent.CTRL_MASK) != 0) {
			
			String text = this.codeInput.getText();
			
			this.parsedOut.setText("");
			this.parsedOut.setText(this.parsedOut.getText()+this.scanner.getTokens(text+newline));
			
			this.codeInput.selectAll();
			
			this.parsedOut.setCaretPosition(parsedOut.getDocument().getLength());
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {

		if(e.getSource() == Console.instance().getTextPane()) {
			JTextPane textPane = Console.instance().getTextPane();
			Element ele = textPane.getStyledDocument().getCharacterElement(textPane.viewToModel(e.getPoint()));
			AttributeSet attributeSet = ele.getAttributes();

			if(attributeSet != null && attributeSet.getAttribute("key") != null) {

//				Console.instance().getTextPane().setCursor(new Cursor(Cursor.HAND_CURSOR));
			 }	
		}
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if(e.getSource() == Console.instance().getTextPane()) {
			JTextPane textPane = Console.instance().getTextPane();
			Element ele = textPane.getStyledDocument().getCharacterElement(textPane.viewToModel(e.getPoint()));
			AttributeSet attributeSet = ele.getAttributes();

			if(attributeSet != null && attributeSet.getAttribute("key") != null) {

				Console.instance().getTextPane().setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			 }	
		}		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if(e.getSource() == Console.instance().getTextPane()) {
			System.out.println("Enter");
			gotoErrorLine(e);
		}
		
		if(e.getSource() == btnSave) {
			// TODO: Open Save Dialog
			System.out.println("Save");
			this.dlgSave.show(pnlMain);	

		}
		
		if(e.getSource() == btnLoad) {
			// TODO Open Load Dialog
			System.out.println("Load");
		}
		
		if(e.getSource() == this.dlgSave.getBtnSave()) {
			createSaveFile(this.dlgSave.getTxtfFilename().getText());
			this.dlgSave.close();
		}
		
	}
	public void createSaveFile(String strFilename) {
		
		String strFile = this.codeInput.getText();
		this.textFileHandler.save(strFilename, strFile);
	}
	
	void gotoErrorLine(MouseEvent e) {
		JTextPane textPane = Console.instance().getTextPane();
		Element ele = textPane.getStyledDocument().getCharacterElement(textPane.viewToModel(e.getPoint()));
		AttributeSet attributeSet = ele.getAttributes();

		if(attributeSet != null && attributeSet.getAttribute("key") != null) {

			int line = Integer.parseInt(attributeSet.getAttribute("key").toString());

			RXTextUtilities.gotoStartOfLine(codeInput, line);
			RXTextUtilities.centerLineInScrollPane(codeInput);
		 }
	}

	public Frame getFrameParent() {
		return frameParent;
	}

	public void setFrameParent(Frame frameParent) {
		this.frameParent = frameParent;
	}
}