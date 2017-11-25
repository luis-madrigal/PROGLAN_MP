package com.ide.styles;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

import com.utils.Tokens;

public class Styles {
	

	public final static Color SUBLIME_KEYWORD = new Color(102, 217, 239);
	public final static Color SUBLIME_LITERAL = new Color(230, 219, 116);
	public final static Color SUBLIME_LINE_NUMBER = new Color(153, 153, 153);
	public final static Color LIGHT_GRAY = new Color(175, 175, 175);
	public final static Color PALE_GRAY = new Color(234, 234, 234);
	public final static Color DARK_GRAY = new Color(128, 128, 128);

	public final static Color TEXT_GRAY = new Color(96, 96, 96);

	public final static Color SKY_BLUE = new Color(32, 227, 255, 200);
	public final static Color UN_HIGHLIGHT = new Color(64, 64, 64);
	public final static Color UN_LITERAL_STRING_DOUBLE_QUOTE = new Color(23, 198, 163);
	public final static Color UN_VARIABLE = new Color(82, 227, 246);

	public final static Color UN_RESERVED_WORD = new Color(103, 194, 217); // new Color(255, 0, 127);	
	public final static Color UN_COMMENT_KEYWORD = new Color(99, 221, 221);// new Color(167, 236, 33);	
	public final static Color UN_COMMENT_EOL = UN_COMMENT_KEYWORD;// new Color(167, 236, 33);	
	
	public final static Color UN_OPERATOR = TEXT_GRAY; //Color.WHITE;
	public final static Color UN_SEPARATOR = new Color(97, 187, 229);
		
	public final static Color UN_CONSOLE_LOG = new Color(0, 168, 133);
	public final static Color UN_CONSOLE_ERR = Color.RED;

	public final static Color VIOLET = new Color(178, 103, 244);
		
	
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
