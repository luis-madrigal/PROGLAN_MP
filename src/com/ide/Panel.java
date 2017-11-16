package com.ide;
import java.awt.Color;
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
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
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
import com.parser.ScannerModel;
import com.utils.Console;



public class Panel implements ActionListener, KeyListener, MouseListener {
	private JPanel pnlMain;
	private JButton btnRun;
	
	private Styles styles;
	
	private JLabel lblCodeInput;
	private JLabel lblParsedOut;
	private JLabel lblConsole;
	
	private JTextArea inputLines;
//	private JTextArea outputLines;
	
	private JSplitPane topSplitPane;
	private JSplitPane bottomSplitPane;
	
//	private JPanel topPane;
	private JPanel bottomPane;
//	private JPanel parseTreePane;
	
	private JTabbedPane outputTabs;
	
	private RSyntaxTextAreaManuscript codeInput;
	private JTextPane parsedOut;
//	private JTextPane console;
	
	private RTextScrollPane inputPane;
	private JScrollPane parsedPane;
	private JScrollPane treePane;
	private JScrollPane consolePane;

	private JButton btnScaleUp;
	private JButton btnScaleDown;

	private final static Color SUBLIME_BG = new Color(39, 40, 34);
	private final static Color SUBLIME_HIGHLIGHT = new Color(51, 51, 42);
	private final static Color SUBLIME_KEYWORD = new Color(102, 217, 239);
	private final static Color SUBLIME_LITERAL = new Color(230, 219, 116);
	private final static String newline = "\n";
	
	private ScannerModel scanner;
//	private ParseTreePane parseTreePane;
	
	public static int baseFontSize = (int) Frame.SCREEN_SIZE.getHeight() / 60;
	
	public Panel() {
		this.styles = new Styles();
		//-----------------------Syntax Highlighting (for output) TO REMOVE----------------------------------
		SimpleAttributeSet attrKeyword = new SimpleAttributeSet();
        attrKeyword.addAttribute(StyleConstants.Foreground, SUBLIME_KEYWORD);
        attrKeyword.addAttribute(StyleConstants.Bold, Boolean.TRUE);
        
        SimpleAttributeSet attrLiteral = new SimpleAttributeSet();
        attrLiteral.addAttribute(StyleConstants.Foreground, SUBLIME_LITERAL);
        
//        SimpleAttributeSet attrDefault = new SimpleAttributeSet();
//        attrLiteral.addAttribute(StyleConstants.Foreground, Color.WHITE);
        

        
        DefaultStyledDocument doc = new DefaultStyledDocument() {            
			private static final long serialVersionUID = 1L;

			public void insertString (int offset, String str, AttributeSet a) throws BadLocationException {
                super.insertString(offset, str, a);

                String text = getText(0, getLength());
//                setCharacterAttributes(0, getLength(), attrDefault, false);

//                Pattern pattern = Pattern.compile("\\s(" +Tokens.KEYWORDS+ ")>");
//                Matcher matcher = pattern.matcher(text);
//                
//                while(matcher.find()) {
//                	setCharacterAttributes(matcher.start(), matcher.end() - matcher.start() - 1, attrKeyword, false);
//                }
//                
//                pattern = Pattern.compile("\"(.*)\"");
//                matcher = pattern.matcher(text);
//                
//                while(matcher.find()) {
//                	setCharacterAttributes(matcher.start(), matcher.end() - matcher.start(), attrLiteral, false);
//                }
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
		this.btnRun = new JButton("\u25B6");
		gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.WEST;
		gbc.fill = GridBagConstraints.NONE;
		gbc.gridwidth = 1;
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.insets = new Insets(10, 10, 10, 0);
		gbc.weightx = 1;
		this.btnRun.setFocusable(false);
		this.btnRun.addActionListener(this);
		this.pnlMain.add(this.btnRun, gbc);
		
		
		//Code Input
		this.lblCodeInput = new JLabel("Code Input:");
		this.lblCodeInput.setFont(new Font("Segoe UI", 150, baseFontSize));
		this.lblCodeInput.setForeground(Color.BLACK);
		gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.NORTHWEST;
		gbc.fill = GridBagConstraints.NONE;
		gbc.gridwidth = 3;
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.insets = new Insets(0, 10, 0, 0);
		gbc.weightx = 1;
		gbc.weighty = 1;
		this.pnlMain.add(this.lblCodeInput, gbc);
		
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
		Console.instance().setCodeInput(codeInput);
		Console.instance().getTextPane().addMouseListener(this);
		
		this.inputLines = new JTextArea("1");
	      
		this.inputLines.setFont(new Font("Consolas", 150, baseFontSize));
		this.inputLines.setBackground(Color.DARK_GRAY);
		this.inputLines.setForeground(Color.WHITE);
		this.inputLines.setEditable(false);
		this.inputLines.setMargin(new Insets(0, 5, 0, 5));
		
		this.codeInput.getDocument().addDocumentListener(new DocumentListener() {
			public String getText() {
				int caretPosition = codeInput.getDocument().getLength();
				Element root = codeInput.getDocument().getDefaultRootElement();
				String text = "1" + System.getProperty("line.separator");
				for(int i = 2; i < root.getElementIndex(caretPosition)+2; i++) {
					text += i+System.getProperty("line.separator");
				}
				
				return text;
			}

			@Override
			public void changedUpdate(DocumentEvent arg0) {
				inputLines.setText(getText());
			}

			@Override
			public void insertUpdate(DocumentEvent arg0) {
				inputLines.setText(getText());
				
			}

			@Override
			public void removeUpdate(DocumentEvent arg0) {
				inputLines.setText(getText());
			}
		});
		
		this.inputPane = new RTextScrollPane(this.codeInput);
		this.inputPane.setPreferredSize(new Dimension((int) Frame.SCREEN_SIZE.getWidth()/2, 150));
		this.inputPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		this.inputPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
//		this.inputPane.setRowHeaderView(this.inputLines);

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
	
		this.treePane = new JScrollPane(); //TODO: do parse tree
		this.treePane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		this.treePane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		
		
		JPanel parentPane = new JPanel();
		parentPane.setLayout(new BoxLayout(parentPane, BoxLayout.Y_AXIS));
		
		//Scale Button
		JPanel pnlScaleMenu = new JPanel();
		pnlScaleMenu.setLayout(null);
        this.btnScaleUp = new JButton();
        btnScaleUp.setBackground(Color.WHITE);
        btnScaleUp.setBorder(null);
        btnScaleUp.setIcon(new ImageIcon("res/ico_add_off.png"));
        btnScaleUp.setRolloverIcon(new ImageIcon("res/ico_add_on.png"));
        btnScaleUp.setPressedIcon(new ImageIcon("res/ico_add_on.png"));
        btnScaleUp.setFocusable(false);
        
		this.btnScaleUp.setBounds(3, 3, 30, 30);
		this.btnScaleUp.addActionListener(this);
		pnlScaleMenu.add(this.btnScaleUp);
        
        this.btnScaleDown = new JButton();
        btnScaleDown.setBackground(Color.WHITE);
        btnScaleDown.setBorder(null);
        btnScaleDown.setIcon(new ImageIcon("res/ico_subtract_off.png"));
        btnScaleDown.setRolloverIcon(new ImageIcon("res/ico_subtract_on.png"));
        btnScaleDown.setPressedIcon(new ImageIcon("res/ico_subtract_on.png"));
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
		
		parentPane.setSize(outputTabs.getWidth(), 40);
		
		this.topSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		this.topSplitPane.setLeftComponent(this.inputPane);
		this.topSplitPane.setRightComponent(this.outputTabs);
		this.topSplitPane.setDividerLocation((int) Frame.SCREEN_SIZE.getWidth()/2);
		gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.NORTHEAST;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridwidth = 6;
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.insets = new Insets(30, 10, 10, 10);
		this.pnlMain.add(this.topSplitPane, gbc);
		
		this.bottomPane = new JPanel();
		this.bottomPane.setLayout(new GridBagLayout());
		this.bottomPane.setBackground(Color.WHITE);
		this.bottomPane.isOpaque();
		
		this.lblConsole = new JLabel("Console:");
		this.lblConsole.setFont(new Font("Segoe UI", 150, baseFontSize));
		this.lblConsole.setForeground(Color.BLACK);
		gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.NORTHWEST;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridwidth = 3;
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.insets = new Insets(0, 10, 0, 0);
		gbc.weightx = 1;
		gbc.weighty = 1;
		this.bottomPane.add(this.lblConsole, gbc);
//		this.pnlMain.add(this.lblConsole, gbc);
		
//		this.console = new JTextPane();
////        this.parsedOut.setSize(30, 50);
//        this.console.setFont(new Font("Consolas", 150, baseFontSize));
//        this.console.setEditable(false);
//        this.console.setForeground(Color.RED);
//        this.console.setBackground(Color.WHITE);
//        this.console.isOpaque();
				
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
		this.bottomSplitPane.setDividerLocation((int) Frame.SCREEN_SIZE.getHeight()/2);
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
		
		
	}
	
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if(e.getSource() == Console.instance().getTextPane()) {
			gotoErrorLine(e);
		}
		
	}
	
	void gotoErrorLine(MouseEvent e) {
		JTextPane textPane = Console.instance().getTextPane();
		 Element ele = textPane.getStyledDocument().getCharacterElement(textPane.viewToModel(e.getPoint()));
		 AttributeSet attributeSet = ele.getAttributes();
		 
//		 int line = Integer.parseInt(attributeSet.getAttribute("key").toString());
//		 try {
//			this.codeInput.addLineHighlight(line-1, Color.CYAN);
//		} catch (NumberFormatException e1) {
//			e1.printStackTrace();
//		} catch (BadLocationException e1) {
//			e1.printStackTrace();
//		}

//		 RXTextUtilities.gotoStartOfLine(codeInput, line);
//		 RXTextUtilities.centerLineInScrollPane(codeInput);
	}
}