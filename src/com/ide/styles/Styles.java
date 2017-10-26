package com.ide.styles;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

import com.utils.Tokens;

public class Styles {
	
	private final static Color SUBLIME_KEYWORD = new Color(102, 217, 239);
	private final static Color SUBLIME_LITERAL = new Color(230, 219, 116);
	
	private ArrayList<IdeStyle> styles;
	
//	public static Style LITERAL = new Style("\"(.*)\"", new SimpleAttributeSet());
		
	public Styles() {
		this.styles = new ArrayList<IdeStyle>();
		
		SimpleAttributeSet attrDefault = new SimpleAttributeSet();
		attrDefault.addAttribute(StyleConstants.Foreground, Color.WHITE);
		
		this.styles.add(new IdeStyle(".", attrDefault));
		
		SimpleAttributeSet attrKeyword = new SimpleAttributeSet();
        attrKeyword.addAttribute(StyleConstants.Foreground, SUBLIME_KEYWORD);
        attrKeyword.addAttribute(StyleConstants.Bold, Boolean.TRUE);
        
        this.styles.add(new IdeStyle("\\W(" +Tokens.KEYWORDS+ ")\\W", attrKeyword));
        
        SimpleAttributeSet attrLiteral = new SimpleAttributeSet();
        attrLiteral.addAttribute(StyleConstants.Foreground, SUBLIME_LITERAL);
        
        this.styles.add(new IdeStyle("\"(.)\"", attrLiteral));
	}
	
	public void addStyle(IdeStyle style) {
		this.styles.add(style);
	}

	public ArrayList<IdeStyle> getStyles() {
		return styles;
	}

	public void setStyles(ArrayList<IdeStyle> styles) {
		this.styles = styles;
	}
	
	
}
