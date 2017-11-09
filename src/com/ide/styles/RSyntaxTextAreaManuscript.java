package com.ide.styles;

import java.awt.Color;
import java.awt.Font;
import java.awt.datatransfer.Clipboard;
import java.util.ArrayList;

import javax.swing.UIManager;
import javax.swing.text.Element;

import org.fife.ui.rsyntaxtextarea.LinkGeneratorResult;
import org.fife.ui.rsyntaxtextarea.RSyntaxDocument;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.RtfGenerator;
import org.fife.ui.rsyntaxtextarea.RtfTransferable;
import org.fife.ui.rsyntaxtextarea.Token;
import org.fife.ui.rsyntaxtextarea.TokenImpl;

import com.utils.Tokens;

public class RSyntaxTextAreaManuscript extends RSyntaxTextArea {
	private static final long serialVersionUID = 1L;
	protected ArrayList<Color> nextColor;

	protected LinkGeneratorResult linkGeneratorResult;
	public RSyntaxTextAreaManuscript() {
		super();
		nextColor = new ArrayList<Color>();
	}
	
	@Override
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
			return getHyperlinkForeground();
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
		
		Color fg = this.getSyntaxScheme().getStyle(type).foreground;
		
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
	/**
	 * Clones a token list.  This is necessary as tokens are reused in
	 * {@link RSyntaxDocument}, so we can't simply use the ones we
	 * are handed from it.
	 *
	 * @param t The token list to clone.
	 * @return The clone of the token list.
	 */
	private TokenImpl cloneTokenList(Token t) {

		if (t==null) {
			return null;
		}

		TokenImpl clone = new TokenImpl(t);
		TokenImpl cloneEnd = clone;

		while ((t=t.getNextToken())!=null) {
			TokenImpl temp = new TokenImpl(t);
			cloneEnd.setNextToken(temp);
			cloneEnd = temp;
		}

		return clone;

	}
	/**
	 * Returns a token list for the given range in the document.
	 *
	 * @param startOffs The starting offset in the document.
	 * @param endOffs The end offset in the document.
	 * @return The first token in the token list.
	 */
	protected Token getTokenListFor(int startOffs, int endOffs) {

		TokenImpl tokenList = null;
		TokenImpl lastToken = null;

		Element map = getDocument().getDefaultRootElement();
		int startLine = map.getElementIndex(startOffs);
		int endLine = map.getElementIndex(endOffs);

		for (int line=startLine; line<=endLine; line++) {
			TokenImpl t = (TokenImpl)getTokenListForLine(line);
			t = cloneTokenList(t);
			if (tokenList==null) {
				tokenList = t;
				lastToken = tokenList;
			}
			else {
				lastToken.setNextToken(t);
			}
			while (lastToken.getNextToken()!=null &&
					lastToken.getNextToken().isPaintable()) {
				lastToken = (TokenImpl)lastToken.getNextToken();
			}
			if (line<endLine) {
				// Document offset MUST be correct to prevent exceptions
				// in getTokenListFor()
				int docOffs = map.getElement(line).getEndOffset()-1;
				t = new TokenImpl(new char[] { '\n' }, 0,0, docOffs,
								Token.WHITESPACE, 0);
				lastToken.setNextToken(t);
				lastToken = t;
			}
		}

		// Trim the beginning and end of the token list so that it starts
		// at startOffs and ends at endOffs.

		// Be careful and check that startOffs is actually in the list.
		// startOffs can be < the token list's start if the end "newline"
		// character of a line is the first character selected (the token
		// list returned for that line will be null, so the first token in
		// the final token list will be from the next line and have a
		// starting offset > startOffs?).
		if (startOffs>=tokenList.getOffset()) {
			while (!tokenList.containsPosition(startOffs)) {
				tokenList = (TokenImpl)tokenList.getNextToken();
			}
			tokenList.makeStartAt(startOffs);
		}

		TokenImpl temp = tokenList;
		// Be careful to check temp for null here.  It is possible that no
		// token contains endOffs, if endOffs is at the end of a line.
		while (temp!=null && !temp.containsPosition(endOffs)) {
			temp = (TokenImpl)temp.getNextToken();
		}
		if (temp!=null) {
			temp.textCount = endOffs - temp.getOffset();
			temp.setNextToken(null);
		}

		return tokenList;

	}
}
