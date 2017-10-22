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
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

import com.ide.styles.Style;
import com.ide.styles.Styles;
import com.scanner.ScannerModel;


public class Panel implements ActionListener, KeyListener {
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
	
	private JPanel topPane;
	private JPanel bottomPane;
	
	private JTabbedPane outputTabs;
	
	private JTextPane codeInput;
	private JTextPane parsedOut;
	private JPanel parseTree;
	private JTextPane console;
	
	private JScrollPane inputPane;
	private JScrollPane parsedPane;
	private JScrollPane consolePane;
	

	private final static Color SUBLIME_BG = new Color(39, 40, 34);
	private final static Color SUBLIME_KEYWORD = new Color(102, 217, 239);
	private final static Color SUBLIME_LITERAL = new Color(230, 219, 116);
	private final static String newline = "\n";
	
	private ScannerModel scanner;
	
	private int baseFontSize = (int) Frame.SCREEN_SIZE.getHeight() / 60;
	
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
                for (Style style : styles.getStyles()) {
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
		
		this.codeInput = new JTextPane();
		this.codeInput.setFont(new Font("Consolas", 150, baseFontSize));
		this.codeInput.setForeground(Color.WHITE);
		this.codeInput.setBackground(SUBLIME_BG);
		this.codeInput.isOpaque();
		this.codeInput.setCaretColor(Color.WHITE);
		
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
//				highlight();
				
			}

			@Override
			public void removeUpdate(DocumentEvent arg0) {
				inputLines.setText(getText());
//				highlight();
			}
			
//			private void highlight() {
//				
//				Runnable doHighlight = new Runnable() {
//					
//					@Override
//					public void run() {
//						String text = codeInput.getText();
//
//			            for (Style style : styles.getStyles()) {
//			                Pattern pattern = Pattern.compile(style.getRegex());
//			                Matcher matcher = pattern.matcher(text);
//
//			                while (matcher.find()) {
//			                	System.out.print("Start index: " + matcher.start());
//			                    System.out.print(" End index: " + matcher.end());
//			                    System.out.println(" Found: " + matcher.group());
//			                    
//			                    codeInput.getStyledDocument().setCharacterAttributes(matcher.start(), matcher.end() - matcher.start(), style.getAttrSet(), true);
//			                }
//			            }
//					}
//				};
//				SwingUtilities.invokeLater(doHighlight);
//			}
		});
		
		this.inputPane = new JScrollPane(this.codeInput);
		this.inputPane.setPreferredSize(new Dimension((int) Frame.SCREEN_SIZE.getWidth()/2, 150));
		this.inputPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		this.inputPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		this.inputPane.setRowHeaderView(this.inputLines);

		gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.NORTHWEST;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridwidth = 3;
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.insets = new Insets(30, 10, 10, 0);
		gbc.weighty = 0;
//		this.pnlMain.add(this.inputPane, gbc);
		
		
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
//		this.pnlMain.add(this.lblParsedOut, gbc);
		
//		this.outputLines = new JTextArea("1");
//		this.outputLines.setFont(new Font("Consolas", 150, 12));
//		this.outputLines.setBackground(Color.DARK_GRAY);
//		this.outputLines.setForeground(Color.WHITE);
//		this.outputLines.setEditable(false);
//		this.outputLines.setMargin(new Insets(0, 5, 0, 5));
		
		this.parsedOut = new JTextPane(doc);
//        this.parsedOut.setSize(30, 50);
        this.parsedOut.setFont(new Font("Consolas", 150, baseFontSize));
        this.parsedOut.setEditable(false);
        this.parsedOut.setForeground(Color.WHITE);
        this.parsedOut.setBackground(SUBLIME_BG);
        this.parsedOut.isOpaque();
		
//		this.parsedOut.getDocument().addDocumentListener(new DocumentListener() {
//			public String getText() {
//				int caretPosition = parsedOut.getDocument().getLength();
//				Element root = parsedOut.getDocument().getDefaultRootElement();
//				String text = "1" + System.getProperty("line.separator");
//				for(int i = 2; i < root.getElementIndex(caretPosition)+2; i++) {
//					text += i+System.getProperty("line.separator");
//				}
//				
//				return text;
//			}
//
//			@Override
//			public void changedUpdate(DocumentEvent arg0) {
//				outputLines.setText(getText());
//			}
//
//			@Override
//			public void insertUpdate(DocumentEvent arg0) {
//				outputLines.setText(getText());	
//			}
//
//			@Override
//			public void removeUpdate(DocumentEvent arg0) {
//				outputLines.setText(getText());
//			}
//		});
        
		this.parsedPane = new JScrollPane(this.parsedOut);
		this.parsedPane.setPreferredSize(new Dimension((int) Frame.SCREEN_SIZE.getWidth()/2, 150));
		this.parsedPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//		this.parsedPane.setRowHeaderView(this.outputLines);
		
//		gbc = new GridBagConstraints();
//		gbc.anchor = GridBagConstraints.NORTHEAST;
//		gbc.fill = GridBagConstraints.BOTH;
//		gbc.gridwidth = 3;
//		gbc.gridx = 1;
//		gbc.gridy = 1;
//		gbc.insets = new Insets(30, 10, 10, 10);
//		gbc.weightx = 1;
//		gbc.weighty = 1;
//		this.pnlMain.add(this.parsedPane, gbc);
		this.parseTree = new JPanel(); //TODO: do parse tree
		
		this.outputTabs = new JTabbedPane();
		this.outputTabs.add("Parsed Out", this.parsedPane);
		this.outputTabs.add("Parse Tree", this.parseTree);
		
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
		
		this.console = new JTextPane();
//        this.parsedOut.setSize(30, 50);
        this.console.setFont(new Font("Consolas", 150, baseFontSize));
        this.console.setEditable(false);
        this.console.setForeground(Color.RED);
        this.console.setBackground(Color.WHITE);
        this.console.isOpaque();
		
		this.consolePane = new JScrollPane(this.console);
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
	
	public JPanel getUI() {
		return this.pnlMain;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String text = this.codeInput.getText();
		
		this.parsedOut.setText("");
//		this.parsedOut.setText(this.parsedOut.getText() + newline);
		this.parsedOut.setText(this.parsedOut.getText() + this.scanner.generateParseTree(text+newline));
		
		this.console.setText(this.scanner.getMessage());
		
		this.codeInput.selectAll();
		
		this.parsedOut.setCaretPosition(parsedOut.getDocument().getLength());
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		if((e.getKeyCode() == KeyEvent.VK_R) &&
			(e.getModifiers() & KeyEvent.CTRL_MASK) != 0) {
			
			String text = this.codeInput.getText();
			
			this.parsedOut.setText("");
			this.parsedOut.setText(this.parsedOut.getText()+this.scanner.generateParseTree(text+newline));
			
			this.codeInput.selectAll();
			
			this.parsedOut.setCaretPosition(parsedOut.getDocument().getLength());
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}