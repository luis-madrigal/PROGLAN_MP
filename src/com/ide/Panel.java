package com.ide;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
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
import java.util.ArrayList;
import java.util.Stack;
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
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.table.DefaultTableModel;
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
import org.fife.ui.rsyntaxtextarea.folding.CurlyFoldParser;
import org.fife.ui.rsyntaxtextarea.folding.FoldParserManager;
import org.fife.ui.rtextarea.RTextScrollPane;

import com.debug.watch.VariableNode;
import com.debug.watch.Searcher;
import com.ide.styles.IdeStyle;
import com.ide.styles.ManuScriptGutter;
import com.ide.styles.RSyntaxTextAreaManuscript;
import com.ide.styles.Styles;
import com.override.CustomScrollBarUISky;
import com.parser.ScannerModel;
import com.save.TextFileHandler;
import com.utils.Console;




public class Panel implements CaretListener, Runnable, ActionListener, KeyListener, MouseListener, PropertyChangeListener {
	public static boolean status = true;
	private Frame frameParent;
	private DialogSave dlgSave;
	private DialogOpen dlgOpen;
	private DialogWatch dlgWatch;

	private TextFileHandler textFileHandler;
	private volatile boolean isRunning;
	private boolean isActive;
	private JPanel pnlMain;
	private JPanel pnlMenu;
	private JButton btnRun;
	private JButton btnLoad;
	private JButton btnSave;

	private JButton btnWatch;
	private JButton btnContinue;
	private JButton btnPause;

	private ManuScriptGutter gutter;
	private Styles styles;
	
	private JLabel lblCodeInput;
	private JLabel lblParsedOut;
	private JLabel lblConsole;
	
	private DefaultTableModel modelWatchTable;
	private JScrollPane tempWatchPane;
	private JTable watchTable;
	private JSplitPane documentSplitPane;
	private JSplitPane topSplitPane;
	private JSplitPane bottomSplitPane;
	
	private JPanel bottomPane;
	private JTabbedPane outputTabs;
	
	private RSyntaxTextAreaManuscript codeInput;
	private JTextPane parsedOut;
	public static JTextPane threeACOut;
	public static JTextPane watchOut;
	public DocumentPanel documentOut;

	private JPanel inputPaneParent;
	private RTextScrollPane inputPane;
	private JScrollPane parsedPane;
	private JScrollPane threeACPane;
	private JScrollPane watchPane;
	private JScrollPane treePane;
	private JScrollPane consolePane;
	private JScrollPane documentPane;

	private JButton btnScaleUp;
	private JButton btnScaleDown;

	public final static Color SUBLIME_BG = new Color(39, 40, 34);
	public final static Color SUBLIME_HIGHLIGHT = new Color(51, 51, 42);
	public final static Color SUBLIME_KEYWORD = new Color(102, 217, 239);
	public final static Color SUBLIME_LITERAL = new Color(230, 219, 116);
	public final static String newline = "\n";
	
	private ScannerModel scanner;
	private Searcher watcher;

	public static int baseFontSize = (int) Frame.SCREEN_SIZE.getHeight() / 60;

	public Panel() {
		Console.instance().setPnlParent(this);
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
        
      //For Watch Table
        UIManager.getLookAndFeelDefaults().put("Table.background", SUBLIME_BG);
        UIManager.getLookAndFeelDefaults().put("Table.gridColor", Styles.SKY_BLUE);
        UIManager.getLookAndFeelDefaults().put("Table.foreground", Color.WHITE);

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
//		pnlMenu.setOpaque(false);
		pnlMenu.setBackground(Color.WHITE);
		pnlMenu.setLayout(null);
		
//		pnlMenu.setLayout(new BoxLayout(pnlMenu, BoxLayout.X_AXIS));
//		pnlMenu.setMinimumSize(new Dimension(400, 30));
		pnlMenu.setSize(new Dimension(400, 30));
		pnlMenu.setMinimumSize(pnlMenu.getSize());
		pnlMenu.setMaximumSize(pnlMenu.getSize());
		pnlMenu.setPreferredSize(pnlMenu.getSize());
//		pnlMenu.setMaximumSize(new Dimension(400, 30));

//		pnlMenu.setPreferredSize(new Dimension(400, 30));
		this.initMenuButtons();
		
		
		
		JLabel pnlExtend = new JLabel();
		this.pnlMain.add(pnlExtend, gbc); // TODO
		pnlMain.setComponentZOrder(pnlExtend, 0);
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
		FoldParserManager.get().addFoldParserMapping("text/manuscript", new CurlyFoldParser());

		this.codeInput.setCodeFoldingEnabled(true);
		this.codeInput.setBracketMatchingEnabled(true);
		this.codeInput.setCloseCurlyBraces(true);
		this.codeInput.setMatchedBracketBGColor(SUBLIME_HIGHLIGHT);
		this.codeInput.addCaretListener(this);
//		this.codeInput.setCurrentLineHighlightColor(Styles.PALE_GRAY);
		this.codeInput.setCurrentLineHighlightColor(SUBLIME_HIGHLIGHT);
		this.codeInput.setSelectedTextColor(Styles.LIGHT_GRAY);
		this.codeInput.setFont(new Font("Consolas", 150, baseFontSize));
//		this.codeInput.setForeground(Styles.TEXT_GRAY);
		this.codeInput.setForeground(Color.WHITE);
//		this.codeInput.setBackground(Color.WHITE);
//		this.codeInput.setBackground(Styles.PALE_GRAY);
		this.codeInput.setBackground(SUBLIME_BG);
//		this.codeInput.isOpaque();
		this.codeInput.setCaretColor(Color.WHITE);
		this.codeInput.setMargin(new Insets(7, 7, 0, 0));
//		Border roundedBorder = new LineBorder(Color.WHITE, 5, true); // the third parameter - true, says it's round
//		this.codeInput.setBorder(roundedBorder);
		
		Console.instance().setCodeInput(codeInput);
		Console.instance().getTextPane().addMouseListener(this);
		

		this.gutter = new ManuScriptGutter(this.codeInput);
		this.inputPane = new RTextScrollPane(this.codeInput, true, Styles.SUBLIME_LINE_NUMBER, gutter);
//		gutter.setBackground(Color.WHITE);
//		this.gutter.setLineNumberColor(Color.CYAN);
		this.gutter.addMouseListener(this);
		this.gutter.getLineNumberList().addMouseListener(this);
		this.inputPane.setGutter(this.gutter);
		this.gutter.setBookmarkingEnabled(true);
		this.gutter.setBackground(Color.WHITE);
		this.gutter.setBookmarkIcon(new ImageIcon(getClass().getClassLoader().getResource("res/ico_bookmark.png")));
		this.inputPane.setFoldIndicatorEnabled(true);
		this.inputPane.setIconRowHeaderEnabled(true);

		this.inputPane.setPreferredSize(new Dimension((int) Frame.SCREEN_SIZE.getWidth()/2, 150));//		this.inputPane.setSize(new Dimension((int) Frame.SCREEN_SIZE.getWidth()/2, 150));
		
		this.inputPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		this.inputPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);

		this.inputPane.getVerticalScrollBar().setUI(new CustomScrollBarUISky());
		this.inputPane.getHorizontalScrollBar().setUI(new CustomScrollBarUISky());
		this.inputPane.getTextArea().setFadeCurrentLineHighlight(true);
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
        this.parsedOut.setForeground(Styles.TEXT_GRAY);
        this.parsedOut.setBackground(Color.WHITE);
        this.parsedOut.isOpaque();
		
        
		this.parsedPane = new JScrollPane(this.parsedOut);
		this.parsedPane.setPreferredSize(new Dimension((int) Frame.SCREEN_SIZE.getWidth()/2, 150));
		this.parsedPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		parsedPane.setBackground(Color.WHITE);
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
        threeACOut.setForeground(Styles.TEXT_GRAY);
        threeACOut.setBackground(Color.WHITE);
        threeACOut.isOpaque();
        threeACOut.setMargin(new Insets(5, 5, 0, 0));

        threeACOut.setSelectionColor(Styles.UN_HIGHLIGHT_BLUE);
        
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
		
		this.treePane = new JScrollPane();
		this.treePane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		this.treePane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		
		this.treePane.getVerticalScrollBar().setUI(new CustomScrollBarUISky());
		this.treePane.getHorizontalScrollBar().setUI(new CustomScrollBarUISky());
		this.treePane.setBorder(null);
		treePane.getViewport().setBackground(Color.WHITE);
		this.treePane.setBackground(Color.WHITE);
		this.treePane.getHorizontalScrollBar().setPreferredSize(new Dimension(
		        (int)treePane.getHorizontalScrollBar().getPreferredSize().getWidth(),
		        (int)horizontalHeight
		));

		this.treePane.getVerticalScrollBar().setPreferredSize(new Dimension(
		        (int)horizontalHeight,
		        (int)treePane.getVerticalScrollBar().getPreferredSize().getHeight()
		));
		
		// For watch variables
		this.watcher = new Searcher();
		
		watchOut = new JTextPane();
		watchOut.setFont(new Font("Consolas", 150, baseFontSize));
		watchOut.setEditable(false);
		watchOut.setForeground(Styles.TEXT_GRAY);
		watchOut.setBackground(Color.WHITE);
        watchOut.isOpaque();
        watchOut.setMargin(new Insets(5, 5, 0, 0));
        watchOut.setSelectionColor(Styles.UN_HIGHLIGHT_BLUE);
		this.watchPane = new JScrollPane(watchOut);
		this.watchPane.setPreferredSize(new Dimension((int) Frame.SCREEN_SIZE.getWidth()/2, 150));
		this.watchPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	
		this.watchPane.getVerticalScrollBar().setUI(new CustomScrollBarUISky());
		this.watchPane.getHorizontalScrollBar().setUI(new CustomScrollBarUISky());
		this.watchPane.setBorder(null);
	
		this.watchPane.getHorizontalScrollBar().setPreferredSize(new Dimension(
		        (int)watchPane.getHorizontalScrollBar().getPreferredSize().getWidth(),
		        (int)horizontalHeight
		));
		
		this.watchPane.getVerticalScrollBar().setPreferredSize(new Dimension(
		        (int)horizontalHeight,
		        (int)watchPane.getVerticalScrollBar().getPreferredSize().getHeight()
		));
		
		String header[] = new String[] {"Variable", "Line", "In method", "Current Value"};
		this.modelWatchTable = new DefaultTableModel(0, 0);
		this.modelWatchTable.setColumnIdentifiers(header);
		
		this.watchTable = new JTable();
//		this.watchTable.setUI(UIManager);
		this.watchTable.setModel(this.modelWatchTable);
		
		//TODO: Delete when merged with watchPane
		this.tempWatchPane = new JScrollPane(this.watchTable);
		this.tempWatchPane.setBackground(SUBLIME_BG);
		this.tempWatchPane.setPreferredSize(new Dimension((int) Frame.SCREEN_SIZE.getWidth()/2, 150));
		this.tempWatchPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		this.tempWatchPane.getVerticalScrollBar().setUI(new CustomScrollBarUISky());
		this.tempWatchPane.getHorizontalScrollBar().setUI(new CustomScrollBarUISky());
		this.tempWatchPane.setBorder(null);
		this.tempWatchPane.getHorizontalScrollBar().setPreferredSize(new Dimension(
				(int)tempWatchPane.getHorizontalScrollBar().getPreferredSize().getWidth(),
				(int)horizontalHeight));
		this.tempWatchPane.getVerticalScrollBar().setPreferredSize(new Dimension(
				(int)horizontalHeight,
				(int)tempWatchPane.getVerticalScrollBar().getPreferredSize().getHeight()));
		
		
		JPanel parentPane = new JPanel();
		parentPane.setLayout(new BoxLayout(parentPane, BoxLayout.Y_AXIS));
		parentPane.setBackground(Color.WHITE);
		//Scale Button
		JPanel pnlScaleMenu = new JPanel();
		pnlScaleMenu.setLayout(null);
        this.btnScaleUp = new JButton();
        btnScaleUp.setBackground(Color.WHITE);
        btnScaleUp.setBorder(null);
        
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
		this.outputTabs.add("IR Code", this.threeACPane);
//		this.outputTabs.add("Parsed Out", this.parsedPane);
		this.outputTabs.add("Parse Tree", parentPane);

		this.outputTabs.add("Watch", this.watchPane);
		this.outputTabs.add("Temp Watch", this.tempWatchPane); //TODO: Delete after

		this.outputTabs.setFont(FrameStatic.fntDefault);
		outputTabs.setBackground(Color.WHITE);
		outputTabs.setForeground(Styles.TEXT_GRAY);
		parentPane.setSize(outputTabs.getWidth(), 40);
		
	
		
		this.inputPaneParent = new JPanel();
		this.inputPaneParent.setLayout(new BoxLayout(inputPaneParent, BoxLayout.Y_AXIS));
//		inputPaneParent.setOpaque(false);
//		inputPaneParent.setBackground(FrameStatic.clrTransparent);
		inputPaneParent.setBackground(Color.WHITE);
		
		JPanel lblInput = new JPanel();
//		lblInput.setFont(FrameStatic.fntGothamLight20);
		lblInput.setBackground(FrameStatic.clrTransparent);
		
		lblInput.setSize(100, 20);
		lblInput.setPreferredSize(lblInput.getSize());
		lblInput.setMinimumSize(new Dimension(100, lblInput.getHeight()));
		lblInput.setMaximumSize(lblInput.getSize());
//		lblInput.setHorizontalAlignment(JLabel.LEFT);
//		lblInput.setLayout(new FlowLayout());
		lblInput.setOpaque(false);
		lblInput.setLayout(null);


		
		pnlMenu.setAlignmentX(Component.LEFT_ALIGNMENT);
//		pnlMenu.setBackground(Color.CYAN);
//		pnlMenu.setOpaque(true);
//		pnlMenu.setBounds(0, 0, 400, 30);
//		a.setAlignmentX( Component.LEFT_ALIGNMEN
		this.inputPaneParent.add(this.pnlMenu);
//		this.inputPaneParent.add(lblInput);
		this.inputPaneParent.add(this.inputPane);
		
		
		

		// For watch variables
		documentOut = new DocumentPanel(this, this.codeInput);
		documentOut.setFont(new Font("Consolas", 150, baseFontSize));
		documentOut.setForeground(Styles.TEXT_GRAY);
		documentOut.setBackground(Color.WHITE);
		documentOut.isOpaque();
        
		
		this.documentPane = new JScrollPane(documentOut);
		this.documentPane.setSize(new Dimension(160/*(int) Frame.SCREEN_SIZE.getWidth()/2*/, 150));
		
		this.documentPane.setPreferredSize(new Dimension(160/*(int) Frame.SCREEN_SIZE.getWidth()/2*/, 150));
		this.documentPane.setMaximumSize(documentPane.getSize());
//		this.documentPane.setMinimumSize(documentPane.getSize());
		
		this.documentPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	
		this.documentPane.getVerticalScrollBar().setUI(new CustomScrollBarUISky());
		this.documentPane.getHorizontalScrollBar().setUI(new CustomScrollBarUISky());
		this.documentPane.setBorder(null);
		this.documentPane.getHorizontalScrollBar().setPreferredSize(new Dimension(
		        (int)documentPane.getHorizontalScrollBar().getPreferredSize().getWidth(),
		        (int)horizontalHeight
		));
		
		this.documentPane.getVerticalScrollBar().setPreferredSize(new Dimension(
		        (int)horizontalHeight,
		        (int)documentPane.getVerticalScrollBar().getPreferredSize().getHeight()
		));
		this.documentPane.getVerticalScrollBar().addMouseListener(this);
		
		
		this.documentSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
//			new JSplitPane(JSplitPane.HORIZONTAL_SPLIT){
//				private static final long serialVersionUID = 1L;
//				private final int maxLocation = documentPane.getWidth();
//				private int location = maxLocation;
//
//			    {
//			        setDividerLocation(location);
//			    }
//			    
//			    @Override
//			    public void setDividerLocation(int newLocation) {
//			    	if(newLocation > maxLocation) {
//			    		newLocation = maxLocation;
//			    	}
//			    	this.dividerSize = location;
////			    	location = newLocation;
//			    }
//			    @Override
//			    public int getDividerLocation() {
//			        return location ;
//			    }
//			    @Override
//			    public int getLastDividerLocation() {
//			        return location ;
//			    }
//			};
		this.documentSplitPane.setEnabled(false);
		this.documentSplitPane.setLeftComponent(this.documentPane);
		this.documentSplitPane.setRightComponent(this.inputPaneParent);
		this.documentSplitPane.setDividerSize(2);
//		this.documentSplitPane.setDividerLocation(documentPane.getWidth());
//		documentSplitPane.setBackground(FrameStatic.clrAccent);
//		documentSplitPane.setOpaque(false);
		documentSplitPane.setResizeWeight(0);
		
		
		this.topSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
//		this.topSplitPane.setLeftComponent(this.inputPaneParent);
		this.topSplitPane.setLeftComponent(this.documentSplitPane);
		topSplitPane.setBackground(FrameStatic.clrTransparent);
		topSplitPane.setOpaque(false);
//		topSplitPane.setResizeWeight(1.0);
//		((JScrollPane)topSplitPane.getLeftComponent()).setBounds(0, 30, topSplitPane.getLeftComponent().getWidth(),
//				topSplitPane.getLeftComponent().getHeight());
//		
//		((JScrollPane)topSplitPane.getLeftComponent()).setLocation(0, 50);
		
		
		
//		topSplitPane.getLeftComponent().setBounds(0, 0, topSplitPane.getLeftComponent().getWidth(),
//				topSplitPane.getLeftComponent().getHeight());
		this.topSplitPane.setRightComponent(this.outputTabs);
		this.topSplitPane.setDividerLocation((int) Frame.SCREEN_SIZE.getWidth()-380); // TODO
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

		this.lblConsole.setForeground(Styles.TEXT_GRAY);
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
		this.consolePane.setPreferredSize(new Dimension(350, (int)Frame.SCREEN_SIZE.getHeight()-300));
		this.consolePane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		this.consolePane.getVerticalScrollBar().setUI(new CustomScrollBarUISky());
		this.consolePane.getHorizontalScrollBar().setUI(new CustomScrollBarUISky());
		horizontalHeight = 10;
		
		this.consolePane.getHorizontalScrollBar().setPreferredSize(new Dimension(
		        (int)consolePane.getHorizontalScrollBar().getPreferredSize().getWidth(),
		        (int)horizontalHeight
		));
		
		this.consolePane.getVerticalScrollBar().setPreferredSize(new Dimension(
		        (int)horizontalHeight,
		        (int)consolePane.getVerticalScrollBar().getPreferredSize().getWidth()
		));
		
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
		this.bottomSplitPane.setDividerLocation((int)Frame.SCREEN_SIZE.getHeight()-300);
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
		this.scanner = new ScannerModel(this);
		
		this.topSplitPane.setDividerSize(5);
		this.topSplitPane.setBackground(Color.WHITE);
		this.topSplitPane.setContinuousLayout(true);
		
		this.bottomSplitPane.setDividerSize(5);
		this.bottomSplitPane.setBackground(Color.WHITE);
		this.bottomSplitPane.setContinuousLayout(true);

		this.dlgSave = new DialogSave();
		this.dlgSave.setProgressColor(FrameStatic.clrLightBlue);
		this.dlgSave.getBtnSave().addMouseListener(this);
		
		this.dlgOpen = new DialogOpen();
		this.dlgOpen.setProgressColor(FrameStatic.clrLightBlue);
		this.dlgOpen.getBtnOpen().addMouseListener(this);

		this.isRunning = false;
		this.isActive = false;
		

		this.codeInput.addPropertyChangeListener(this); // Must be at the end
//		this.pnlMain.setComponentZOrder(pnlMenu, pnlMain.getComponentCount()-1);

//		if(this.codeInput.getText().contains("ACT ")) {
		this.codeInput.repaint();
		this.codeInput.revalidate();
			documentOut.generate(this.codeInput.getText());
//			System.out.println(" "+this.codeInput.getText());
//		}
		this.pnlMain.revalidate();
		this.pnlMain.repaint();
		
		documentOut.revalidate();
		documentOut.repaint();
		documentPane.addMouseListener(this);
//		this.foldDoument();
		documentOut.generate(this.codeInput.getText());
	}
	
	public void initMenuButtons() {
		
		int width = 50;
		int height = 30;
		
		this.btnRun = new JButton();
		this.btnRun.setFocusable(false);
		this.btnRun.addActionListener(this);
       
		btnRun.setBackground(Color.WHITE);
        btnRun.setBorder(null);
//		btnRun.setBorder(FrameStatic.brdrBarUn);
		btnRun.setIcon(new ImageIcon(getClass().getClassLoader().getResource("res/ico_play_off.png")));
        btnRun.setRolloverIcon(new ImageIcon(getClass().getClassLoader().getResource("res/ico_play_on.png")));
        btnRun.setPressedIcon(new ImageIcon(getClass().getClassLoader().getResource("res/ico_play_on.png")));
        btnRun.setFocusable(false);
		btnRun.getInsets().set(0, 0, 0, 0);

		btnRun.setSize(width, height);
		btnRun.setPreferredSize(btnRun.getSize());
//		btnRun.setBounds(-10, 40, btnRun.getWidth(), btnRun.getHeight());
		pnlMenu.add(btnRun);


		this.btnLoad = new JButton();
		btnLoad.setFocusable(false);
		btnLoad.addActionListener(this);
		btnLoad.addMouseListener(this);
		btnLoad.setBorder(null);
//		btnLoad.setBorder(FrameStatic.brdrBarUn);
		btnLoad.setBackground(Color.WHITE);
		btnLoad.setIcon(new ImageIcon(getClass().getClassLoader().getResource("res/ico_open_off.png")));
		btnLoad.setRolloverIcon(new ImageIcon(getClass().getClassLoader().getResource("res/ico_open_on.png")));
		btnLoad.setPressedIcon(new ImageIcon(getClass().getClassLoader().getResource("res/ico_open_on.png")));

		btnLoad.setFocusable(false);
		btnLoad.getInsets().set(0, 0, 0, 0);

		btnLoad.setSize(width, height);
		btnLoad.setPreferredSize(btnLoad.getSize());
		pnlMenu.add(btnLoad);


		this.btnSave = new JButton();
		btnSave.setFocusable(false);
		btnSave.addActionListener(this);
		btnSave.addMouseListener(this);
		btnSave.setBorder(null);
//		btnSave.setBorder(FrameStatic.brdrBarUn);
		btnSave.setBackground(Color.WHITE);
		btnSave.setIcon(new ImageIcon(getClass().getClassLoader().getResource("res/ico_save_off.png")));
		btnSave.setRolloverIcon(new ImageIcon(getClass().getClassLoader().getResource("res/ico_save_on.png")));
		btnSave.setPressedIcon(new ImageIcon(getClass().getClassLoader().getResource("res/ico_save_on.png")));
		btnSave.setFocusable(false);
		btnSave.getInsets().set(0, 0, 0, 0);

		btnSave.setSize(width, height);
		btnSave.setPreferredSize(btnSave.getSize());
		pnlMenu.add(btnSave);
				
		
		this.btnWatch = new JButton();
		btnWatch.setFocusable(false);
		btnWatch.addActionListener(this);
		btnWatch.addMouseListener(this);
		btnWatch.setBorder(null);
//		btnWatch.setBorder(FrameStatic.brdrBarUn);
		btnWatch.setBackground(Color.WHITE);
		btnWatch.setIcon(new ImageIcon(getClass().getClassLoader().getResource("res/ico_watch_off.png")));
		btnWatch.setRolloverIcon(new ImageIcon(getClass().getClassLoader().getResource("res/ico_watch_on.png")));
		btnWatch.setPressedIcon(new ImageIcon(getClass().getClassLoader().getResource("res/ico_watch_on.png")));
		btnWatch.setFocusable(false);
		btnWatch.getInsets().set(0, 0, 0, 0);

		btnWatch.setSize(width, height);
		btnWatch.setPreferredSize(btnWatch.getSize());
		pnlMenu.add(btnWatch);
		
		
		this.btnContinue = new JButton();
		btnContinue.setFocusable(false);
		btnContinue.addActionListener(this);
		btnContinue.addMouseListener(this);
		btnContinue.setBorder(null);
//		btnContinue.setBorder(FrameStatic.brdrBarUn);
		btnContinue.setBackground(Color.WHITE);
		btnContinue.setIcon(new ImageIcon(getClass().getClassLoader().getResource("res/ico_continue_off.png")));
		btnContinue.setRolloverIcon(new ImageIcon(getClass().getClassLoader().getResource("res/ico_continue_on.png")));
		btnContinue.setPressedIcon(new ImageIcon(getClass().getClassLoader().getResource("res/ico_continue_on.png")));
		btnContinue.setFocusable(false);
		btnContinue.getInsets().set(0, 0, 0, 0);

		btnContinue.setSize(width, height);
		btnContinue.setPreferredSize(btnContinue.getSize());
		pnlMenu.add(btnContinue);
		
		this.btnPause = new JButton("Pause");
		btnPause.setFocusable(false);
		btnPause.addActionListener(this);
		btnPause.addMouseListener(this);
//		btnPause.setBorder(null);
		btnPause.setBorder(FrameStatic.brdrBarUn);
		btnPause.setBackground(Color.WHITE);
//		btnPause.setIcon(new ImageIcon(getClass().getClassLoader().getResource("res/ico_watch_off.png")));
//		btnPause.setRolloverIcon(new ImageIcon(getClass().getClassLoader().getResource("res/ico_watch_on.png")));
//		btnPause.setPressedIcon(new ImageIcon(getClass().getClassLoader().getResource("res/ico_watch_on.png")));
		btnPause.setFocusable(false);
		btnPause.getInsets().set(0, 0, 0, 0);

		btnPause.setSize(width, height);
		btnPause.setPreferredSize(btnPause.getSize());
//		pnlMenu.add(btnPause);
		

		int offsetX = 0;

		btnRun.setLocation(28, 0);
		btnLoad.setLocation(btnRun.getX()+btnRun.getWidth()+offsetX, btnRun.getY());
		btnSave.setLocation(btnLoad.getX()+btnLoad.getWidth()+offsetX, btnRun.getY());
		btnWatch.setLocation(btnSave.getX()+btnSave.getWidth()+offsetX, btnRun.getY());
		btnContinue.setLocation(btnWatch.getX()+btnWatch.getWidth()+offsetX, btnRun.getY());
		btnPause.setLocation(btnContinue.getX()+btnContinue.getWidth()+offsetX, btnRun.getY());
		
	}
	
	public RSyntaxTextAreaManuscript getCodeInput() {
		return codeInput;
	}

	public void setCodeInput(RSyntaxTextAreaManuscript codeInput) {
		this.codeInput = codeInput;
	}

	
	/*
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
	
	public void changeToPlay() {
		this.isRunning = false;
		btnRun.setIcon(new ImageIcon(getClass().getClassLoader().getResource("res/ico_play_off.png")));
        btnRun.setRolloverIcon(new ImageIcon(getClass().getClassLoader().getResource("res/ico_play_on.png")));
        btnRun.setPressedIcon(new ImageIcon(getClass().getClassLoader().getResource("res/ico_play_on.png")));
      
	}
	
	public void changeToPause() {
		this.isRunning = true;
		btnRun.setIcon(new ImageIcon(getClass().getClassLoader().getResource("res/ico_pause_off.png")));
        btnRun.setRolloverIcon(new ImageIcon(getClass().getClassLoader().getResource("res/ico_pause_on.png")));
        btnRun.setPressedIcon(new ImageIcon(getClass().getClassLoader().getResource("res/ico_pause_on.png")));
      
	}
	
	public void changeToActive() {
		this.isActive = true;
		btnContinue.setIcon(new ImageIcon(getClass().getClassLoader().getResource("res/ico_continue_active_off.png")));
		btnContinue.setRolloverIcon(new ImageIcon(getClass().getClassLoader().getResource("res/ico_continue_active_on.png")));
		btnContinue.setPressedIcon(new ImageIcon(getClass().getClassLoader().getResource("res/ico_continue_active_on.png")));
		
	}
	
	public void changeToInactive() {
		this.isActive = false;
		btnContinue.setIcon(new ImageIcon(getClass().getClassLoader().getResource("res/ico_continue_off.png")));
		btnContinue.setRolloverIcon(new ImageIcon(getClass().getClassLoader().getResource("res/ico_continue_on.png")));
		btnContinue.setPressedIcon(new ImageIcon(getClass().getClassLoader().getResource("res/ico_continue_on.png")));
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.btnRun) {
			System.out.println("isRunn "+isRunning);
			// STOP
			if(this.isRunning) {
				this.changeToPlay();
				this.changeToInactive();
				System.out.println("Stop");
				this.scanner.stopThread();
			}
			// START
			else {
				Console.instance().purge();
				purgeWatch();
				
				this.changeToPause();
				String text = this.codeInput.getText();		
				
				this.parsedOut.setText("");

				this.parsedOut.setText(this.parsedOut.getText() + this.scanner.getTokens(text+newline, this.getListBreakpoints(text+newline)));
				this.scanner.generateTree(); // Required to do this
				this.treePane.setViewportView(this.scanner.getTree());			
				
//				this.generateThreeAddressCode();
//				this.console.setText(this.console.getText() + this.scanner.getMessage());			
				this.codeInput.selectAll();
				this.parsedOut.setCaretPosition(parsedOut.getDocument().getLength());

		
			}	
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
			this.parsedOut.setText(this.parsedOut.getText()+this.scanner.getTokens(text+newline, this.getListBreakpoints(text+newline)));
			
			this.codeInput.selectAll();
			
			this.parsedOut.setCaretPosition(parsedOut.getDocument().getLength());
		}
	}

	public Stack<Integer> getListBreakpoints(String text) {
		Stack<Integer> listBreakpoints = new Stack<Integer>();
		String listText = codeInput.getText();
		int length = listText.split("\n").length;
		
		for(int i = 0; i < length; i++) {
			if(gutter.hasBookmark(i)) {

				listBreakpoints.push(i);
//				System.out.println(i+" has");
			}
		}

//		this.gutter.hasBookmark(5);
		
		
//		listBreakpoints.push(0);
//		listBreakpoints.push(1);
//		listBreakpoints.push(2);
//		listBreakpoints.push(3);
//		listBreakpoints.push(5);
//		listBreakpoints.push(7);
		
		return listBreakpoints;
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

	
	public void foldDoument() {
		documentSplitPane.setDividerLocation(20);
		documentSplitPane.revalidate();
		documentSplitPane.repaint();
	}
		
	public void unfoldDoument() {
		documentSplitPane.setDividerLocation(160);
		documentSplitPane.revalidate();
		documentSplitPane.repaint();
	}


	public void documentFolding() {
		
		documentOut.generate(this.codeInput.getText());
//		System.out.println(" "+this.codeInput.getText());
//	}
		this.pnlMain.revalidate();
		this.pnlMain.repaint();
	
		documentOut.revalidate();
		documentOut.repaint();
		if(documentSplitPane.getDividerLocation() > 20) {
			this.foldDoument();
		}
		else {
			this.unfoldDoument();
		}
		
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println(e.getSource());

		documentSplitPane.revalidate();
		documentSplitPane.repaint();
		

		documentPane.revalidate();
		documentPane.repaint();
		
		if(e.getSource() == this.documentPane.getVerticalScrollBar()) {
			System.out.println("Scroll");
			this.documentFolding();
		}
		if(e.getSource() == this.documentPane) {
			this.documentFolding();
		}
		if(e.getSource() == Console.instance().getTextPane()) {
			gotoErrorLine(e);
		}
		
		if(e.getSource() == btnSave) {
			this.dlgSave.show(pnlMain);	
		}
		
		if(e.getSource() == btnLoad) {
			this.dlgOpen.show(pnlMain);	

		}
		
		if(e.getSource() == btnContinue) {
			if(isRunning && scanner.getRunnableCodeGenerator() != null) {

				scanner.getRunnableCodeGenerator().play();
			}
		}
		if(e.getSource() == btnPause) {

			scanner.getRunnableCodeGenerator().pause();
		}
		if(e.getSource() == btnWatch) {
			System.out.println("Watch");
			
			ArrayList<VariableNode> varList = new ArrayList<VariableNode>();
			watcher.generateVarList(this.codeInput.getText());
			varList = watcher.getVarList();
		
			this.dlgWatch = new DialogWatch(varList);
			this.dlgWatch.placeVarList();
			this.dlgWatch.setVisible(true);
			
			ArrayList<VariableNode> selectedVar = new ArrayList<VariableNode>();
			selectedVar = this.dlgWatch.getSelectedVar();
			
			for(VariableNode var : selectedVar) {
				this.modelWatchTable.addRow(new Object[] {var.getDataType()+" "+var.getLiteral(), var.getLineNumber(), var.getFuncParent()+" ("+var.getFuncChild()+")", "0"});
			}
			
			this.outputTabs.setSelectedIndex(this.outputTabs.getTabCount()-1);
		}
		
		if(e.getSource() == this.dlgSave.getBtnSave()) {
			createSaveFile(this.dlgSave.getTxtfFilename().getText());
			this.dlgSave.close();
		}
		
		if(e.getSource() == this.dlgOpen.getBtnOpen()) {
			loadTextFile(this.dlgOpen.getTxtfFilename().getText());
			this.dlgOpen.close();
		}
		
	}
	public void createSaveFile(String strFilename) {
		
		String strFile = this.codeInput.getText();
		this.textFileHandler.save(strFilename, strFile);
	}
	
	public void loadTextFile(String strFilename) {
		
		String strFile = this.textFileHandler.load(strFilename);
		this.codeInput.setText(strFile);
	}

	void gotoErrorLine(MouseEvent e) {
		JTextPane textPane = Console.instance().getTextPane();
		Element element = textPane.getStyledDocument().getCharacterElement(textPane.viewToModel(e.getPoint()));
		AttributeSet attributeSet = element.getAttributes();

		if(attributeSet != null && attributeSet.getAttribute("key") != null) {

			int line = Integer.parseInt(attributeSet.getAttribute("key").toString());

			
			RXTextUtilities.gotoStartOfLine(codeInput, line);
			RXTextUtilities.centerLineInScrollPane(codeInput);
			this.codeInput.setCurrentLineHighlightColor(Styles.UN_ERR_HIGHLIGHT);

		 }
	}

	public Frame getFrameParent() {
		return frameParent;
	}

	public void setFrameParent(Frame frameParent) {
		this.frameParent = frameParent;
	}

	@Override
	public void run() {
		
	}

	public boolean isRunning() {
		return isRunning;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public void propertyChange(PropertyChangeEvent e) {
		this.documentSplitPane.revalidate();
		this.documentSplitPane.repaint();
		
		if(this.codeInput.getText().contains("ACT ") && e.getSource() == this.codeInput) {
			documentOut.generate(this.codeInput.getText());
//			System.out.println(" "+this.codeInput.getText());
		}
		
	}
	public static void printWatch(String strLog) {
		watchOut.setText(watchOut.getText()+"\n"+strLog);
	}
	public static void purgeWatch() {
		watchOut.setText("");
	}

	@Override
	public void caretUpdate(CaretEvent e) {
		if(e.getSource() == this.codeInput) {

				
			if(this.codeInput.getCurrentLineHighlightColor() == Styles.UN_ERR_SELECTION) {
				System.out.println("col"+this.codeInput.getCurrentLineHighlightColor());
				this.codeInput.setCurrentLineHighlightColor(Styles.UN_ERR_HIGHLIGHT);
			}
			else {
				this.codeInput.setCurrentLineHighlightColor(SUBLIME_HIGHLIGHT);	
			}
		}
		
	}
}