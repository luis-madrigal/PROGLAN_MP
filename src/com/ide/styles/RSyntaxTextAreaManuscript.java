package com.ide.styles;

import java.awt.Color;
import java.awt.Font;
import java.awt.datatransfer.Clipboard;
import java.util.ArrayList;

import javax.swing.UIManager;

import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.RtfGenerator;
import org.fife.ui.rsyntaxtextarea.RtfTransferable;
import org.fife.ui.rsyntaxtextarea.Token;

import com.utils.Tokens;

public class RSyntaxTextAreaManuscript extends RSyntaxTextArea {
	private static final long serialVersionUID = 1L;
	protected ArrayList<Color> nextColor;
	
	public RSyntaxTextAreaManuscript() {
		nextColor = new ArrayList<Color>();
	}
	/**
	 * Returns the foreground color to use when painting a token.
	 *
	 * @param t The token.
	 * @return The foreground color to use for that token.  This
	 *         value is never <code>null</code>.
	 * @see #getBackgroundForToken(Token)
	 */
	public Color getForegroundForToken(Token t) {
		
		if (getHyperlinksEnabled() && hoveredOverLinkOffset==t.getOffset() &&
				(t.isHyperlink() || linkGeneratorResult!=null)) {
			return hyperlinkFG;
		}
		
		Color fg = getForegroundForTokenTypeCompound(t);
		
		
		
		return fg;
	}
	
	
	
	public Color getForegroundForTokenTypeCompound(Token t) {
		int type = t.getType();
		String strToken = t.getLexeme();
		
		if(Tokens.COMPOUND_KEYWORDS_START.contains(strToken)
				&& t.getNextToken() != null
				&& t.getNextToken().getNextToken() != null) {
			Token tNext = t.getNextToken().getNextToken(); // Get twice since the next token is a space
			
			String strCompoundToken;
			strCompoundToken = strToken+t.getNextToken().getLexeme()+tNext.getLexeme();
			if(strToken.equals("can") // special case, look ahead twice
					&& tNext.getNextToken() != null
					&& tNext.getNextToken().getNextToken() != null) {
				
				strCompoundToken += tNext.getNextToken().getLexeme()+
									tNext.getNextToken().getNextToken().getLexeme();
			}
			
			if(Tokens.COMPOUND_KEYWORDS.contains(strCompoundToken)) {
				type = Token.RESERVED_WORD;
				nextColor.add(Styles.UN_RESERVED_WORD);
				nextColor.add(Styles.UN_RESERVED_WORD);
			}
		}
		
		Color fg = syntaxScheme.getStyle(type).foreground;
		
		if(!t.getLexeme().contains(" ")) {
			if(nextColor.size() > 0) {
				int index = nextColor.size()-1;
				fg = nextColor.get(index);
				nextColor.remove(index);
			}
		}
		
		return fg!=null ? fg : getForeground();
	}
	

	/**
	 * Copies the currently selected text to the system clipboard, with
	 * any necessary style information (font, foreground color and background
	 * color).  Does nothing for <code>null</code> selections.
	 */
	@SuppressWarnings("deprecation")
	@Override
	public void copyAsRtf() {

		int selStart = getSelectionStart();
		int selEnd = getSelectionEnd();
		if (selStart==selEnd) {
			return;
		}

		// Make sure there is a system clipboard, and that we can write
		// to it.
		SecurityManager sm = System.getSecurityManager();
		if (sm!=null) {
			try {
				sm.checkSystemClipboardAccess();
			} catch (SecurityException se) {
				UIManager.getLookAndFeel().provideErrorFeedback(null);
				return;
			}
		}
		Clipboard cb = getToolkit().getSystemClipboard();

		// Create the RTF selection.
		RtfGenerator gen = new RtfGenerator();
		Token tokenList = getTokenListFor(selStart, selEnd);
		for (Token t=tokenList; t!=null; t=t.getNextToken()) {

			if (t.isPaintable()) {
				if (t.length()==1 && t.charAt(0)=='\n') {
					gen.appendNewline();
				}
				else {
					Font font = getFontForTokenType(t.getType());
					Color bg = getBackgroundForToken(t);
					boolean underline = getUnderlineForToken(t);

					// Small optimization - don't print fg color if this
					// is a whitespace color.  Saves on RTF size.
					if (t.isWhitespace()) {
						gen.appendToDocNoFG(t.getLexeme(), font, bg, underline);
					}
					else {
						Color fg = getForegroundForToken(t);
						gen.appendToDoc(t.getLexeme(), font, fg, bg, underline);
					}
				}
			}
		}

		// Set the system clipboard contents to the RTF selection.
		RtfTransferable contents = new RtfTransferable(gen.getRtf().getBytes());
		try {
			cb.setContents(contents, null);
		} catch (IllegalStateException ise) {
			UIManager.getLookAndFeel().provideErrorFeedback(null);
			return;
		}

	}
}
