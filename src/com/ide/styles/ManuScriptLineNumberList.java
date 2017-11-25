package com.ide.styles;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;

import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.View;

import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.folding.Fold;
import org.fife.ui.rsyntaxtextarea.folding.FoldManager;
import org.fife.ui.rtextarea.LineNumberList;
import org.fife.ui.rtextarea.RTextArea;
import org.fife.ui.rtextarea.RTextAreaUI;


public class ManuScriptLineNumberList extends LineNumberList {
	private static final long serialVersionUID = 1L;

	public ManuScriptLineNumberList(RTextArea textArea) {
		super(textArea);
	}


	/**
	 * Paints this component.
	 *
	 * @param g The graphics context.
	 */
	@Override
	protected void paintComponent(Graphics g) {

		if (textArea==null) {
			return;
		}

		visibleRect = g.getClipBounds(visibleRect);
		if (visibleRect==null) { // ???
			visibleRect = getVisibleRect();
		}
		//System.out.println("LineNumberList repainting: " + visibleRect);
		if (visibleRect==null) {
			return;
		}

		Color bg = Color.RED;
		if (getGutter()!=null) { // Should always be true
			bg = getGutter().getBackground();
		}
		g.setColor(bg);
		g.fillRect(0,visibleRect.y, cellWidth,visibleRect.height);
		g.setFont(getFont());
		if (aaHints!=null) {
			((Graphics2D)g).addRenderingHints(aaHints);
		}

		if (textArea.getLineWrap()) {
			paintWrappedLineNumbers(g, visibleRect);
			return;
		}

		// Get where to start painting (top of the row), and where to paint
		// the line number (drawString expects y==baseline).
		// We need to be "scrolled up" just enough for the missing part of
		// the first line.
		textAreaInsets = textArea.getInsets(textAreaInsets);
		if (visibleRect.y<textAreaInsets.top) {
			visibleRect.height -= (textAreaInsets.top - visibleRect.y);
			visibleRect.y = textAreaInsets.top;
		}
		int topLine = (visibleRect.y-textAreaInsets.top)/cellHeight;
		int actualTopY = topLine*cellHeight + textAreaInsets.top;
		int y = actualTopY + ascent;

		// Get the actual first line to paint, taking into account folding.
		FoldManager fm = null;
		if (textArea instanceof RSyntaxTextArea) {
			fm = ((RSyntaxTextArea)textArea).getFoldManager();
			topLine += fm.getHiddenLineCountAbove(topLine, true);
		}
		final int rhsBorderWidth = getRhsBorderWidth();

/*
		// Highlight the current line's line number, if desired.
		if (textArea.getHighlightCurrentLine() && currentLine>=topLine &&
				currentLine<=bottomLine) {
			g.setColor(textArea.getCurrentLineHighlightColor());
			g.fillRect(0,actualTopY+(currentLine-topLine)*cellHeight,
						cellWidth,cellHeight);
		}
*/
		// Paint line numbers
		g.setColor(getForeground());
		boolean ltr = getComponentOrientation().isLeftToRight();
		if (ltr) {
			FontMetrics metrics = g.getFontMetrics();
			int rhs = getWidth() - rhsBorderWidth;
			int line = topLine + 1;
			while (y<visibleRect.y+visibleRect.height+ascent && line<=textArea.getLineCount()) {
				String number = Integer.toString(line + getLineNumberingStartIndex() - 1);
				int width = metrics.stringWidth(number);
				g.drawString(number+20, rhs-width,y);
				y += cellHeight;
				if (fm!=null) {
					Fold fold = fm.getFoldForLine(line-1);
					// Skip to next line to paint, taking extra care for lines with
					// block ends and begins together, e.g. "} else {"
					while (fold!=null && fold.isCollapsed()) {
						int hiddenLineCount = fold.getLineCount();
						if (hiddenLineCount==0) {
							// Fold parser identified a 0-line fold region... This
							// is really a bug, but we'll handle it gracefully.
							break;
						}
						line += hiddenLineCount;
						fold = fm.getFoldForLine(line-1);
					}
				}
				line++;
			}
		}
		else { // rtl
			int line = topLine + 1;
			while (y<visibleRect.y+visibleRect.height && line<textArea.getLineCount()) {
				String number = Integer.toString(line + getLineNumberingStartIndex() - 1);
				g.drawString(number+"a", rhsBorderWidth, y);
				y += cellHeight;
				if (fm!=null) {
					Fold fold = fm.getFoldForLine(line-1);
					// Skip to next line to paint, taking extra care for lines with
					// block ends and begins together, e.g. "} else {"
					while (fold!=null && fold.isCollapsed()) {
						line += fold.getLineCount();
						fold = fm.getFoldForLine(line);
					}
				}
				line++;
			}
		}

	}
	
	/**
	 * Paints line numbers for text areas with line wrap enabled.
	 *
	 * @param g The graphics context.
	 * @param visibleRect The visible rectangle of these line numbers.
	 */
	protected void paintWrappedLineNumbers(Graphics g, Rectangle visibleRect) {

		// The variables we use are as follows:
		// - visibleRect is the "visible" area of the text area; e.g.
		// [0,100, 300,100+(lineCount*cellHeight)-1].
		// actualTop.y is the topmost-pixel in the first logical line we
		// paint.  Note that we may well not paint this part of the logical
		// line, as it may be broken into many physical lines, with the first
		// few physical lines scrolled past.  Note also that this is NOT the
		// visible rect of this line number list; this line number list has
		// visible rect == [0,0, insets.left-1,visibleRect.height-1].
		// - offset (<=0) is the y-coordinate at which we begin painting when
		// we begin painting with the first logical line.  This can be
		// negative, signifying that we've scrolled past the actual topmost
		// part of this line.

		// The algorithm is as follows:
		// - Get the starting y-coordinate at which to paint.  This may be
		//   above the first visible y-coordinate as we're in line-wrapping
		//   mode, but we always paint entire logical lines.
		// - Paint that line's line number and highlight, if appropriate.
		//   Increment y to be just below the are we just painted (i.e., the
		//   beginning of the next logical line's view area).
		// - Get the ending visual position for that line.  We can now loop
		//   back, paint this line, and continue until our y-coordinate is
		//   past the last visible y-value.

		// We avoid using modelToView/viewToModel where possible, as these
		// methods trigger a parsing of the line into syntax tokens, which is
		// costly.  It's cheaper to just grab the child views' bounds.

		// Some variables we'll be using.
		int width = getWidth();

		RTextAreaUI ui = (RTextAreaUI)textArea.getUI();
		View v = ui.getRootView(textArea).getView(0);
		//boolean currentLineHighlighted = textArea.getHighlightCurrentLine();
		Document doc = textArea.getDocument();
		Element root = doc.getDefaultRootElement();
		int lineCount = root.getElementCount();
		int topPosition = textArea.viewToModel(
								new Point(visibleRect.x,visibleRect.y));
		int topLine = root.getElementIndex(topPosition);
		FoldManager fm = null;
		if (textArea instanceof RSyntaxTextArea) {
			fm = ((RSyntaxTextArea)textArea).getFoldManager();
		}

		// Compute the y at which to begin painting text, taking into account
		// that 1 logical line => at least 1 physical line, so it may be that
		// y<0.  The computed y-value is the y-value of the top of the first
		// (possibly) partially-visible view.
		Rectangle visibleEditorRect = ui.getVisibleEditorRect();
		Rectangle r = LineNumberList.getChildViewBounds(v, topLine,
												visibleEditorRect);
		int y = r.y;
		final int rhsBorderWidth = getRhsBorderWidth();
		int rhs;
		boolean ltr = getComponentOrientation().isLeftToRight();
		if (ltr) {
			rhs = width - rhsBorderWidth;
		}
		else { // rtl
			rhs = rhsBorderWidth;
		}
		int visibleBottom = visibleRect.y + visibleRect.height;
		FontMetrics metrics = g.getFontMetrics();

		// Keep painting lines until our y-coordinate is past the visible
		// end of the text area.
		g.setColor(getForeground());

		while (y < visibleBottom) {

			r = LineNumberList.getChildViewBounds(v, topLine, visibleEditorRect);
			
			/*
			// Highlight the current line's line number, if desired.
			if (currentLineHighlighted && topLine==currentLine) {
				g.setColor(textArea.getCurrentLineHighlightColor());
				g.fillRect(0,y, width,(r.y+r.height)-y);
				g.setColor(getForeground());
			}
			*/

			// Paint the line number.
			int index = (topLine+1) + getLineNumberingStartIndex() - 1;
			String number = Integer.toString(index);
			if (ltr) {
				int strWidth = metrics.stringWidth(number);
				g.drawString(number, rhs-strWidth,y+ascent);
			}
			else {
				int x = rhsBorderWidth;
				g.drawString(number, x, y+ascent);
			}
		

			// The next possible y-coordinate is just after the last line
			// painted.
			y += r.height;

			// Update topLine (we're actually using it for our "current line"
			// variable now).
			if (fm!=null) {
				Fold fold = fm.getFoldForLine(topLine);
				if (fold!=null && fold.isCollapsed()) {
					topLine += fold.getCollapsedLineCount();
				}
			}
			topLine++;
			if (topLine>=lineCount) {
				break;
			}

		}

	}


}
