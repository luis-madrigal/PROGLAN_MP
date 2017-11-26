package com.ide;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

import com.ide.styles.RSyntaxTextAreaManuscript;

public class DocumentPanel extends JPanel implements MouseListener {
	private static final long serialVersionUID = 1L;
	private ArrayList<DocumentEntry> listEntries;
	private RSyntaxTextAreaManuscript codeInput; 
	
	private Panel pnlParent;
	
	public DocumentPanel(Panel pnlParent, RSyntaxTextAreaManuscript codeInput) {
		this.pnlParent = pnlParent;
		this.listEntries = new ArrayList<DocumentEntry>();
		this.codeInput= codeInput;
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
	}
	
	public void generate(String strCode) {
		this.reset();
		
		String strFunction;
		String regexStart = "ACT";
		String regexEnd = "starring";
		String[] listCode = strCode.split("\n");
		ArrayList<Integer> listLineNumbers = new ArrayList<Integer>();
		ArrayList<Integer> listLinePositions = extractLinePositions(listCode, listLineNumbers);
		
		
		System.out.println("SIZE "+listLinePositions.size());
		
		while(strCode.contains(regexStart)
			&& strCode.contains(regexEnd)
			&& strCode.indexOf(regexEnd) > strCode.indexOf(regexStart)) {
			
			System.out.println(strCode.substring(strCode.indexOf(regexStart), strCode.indexOf(regexEnd)));
			
			strCode = strCode.substring(strCode.indexOf(regexStart)+regexStart.length());
			strFunction = strCode.substring(0, strCode.indexOf(regexEnd)).trim();
			
			this.addEntry(strFunction, listLineNumbers.get(0), listLinePositions.get(0));
			listLineNumbers.remove(0);
			listLinePositions.remove(0);
			
			System.out.println(listLinePositions.size());
			
			
//			System.out.println(strCode.indexOf(regexStart+strFunction));

			System.out.println("| "+strFunction+" ");
			System.out.println();
			strCode =  strCode.substring(strCode.indexOf(regexEnd)+regexEnd.length());
			
		}
		
		
		
	}
	
	public void addEntry(String title, int lineNumber, int linePosition) {
		DocumentEntry entry = new DocumentEntry(title, lineNumber, linePosition, this.getWidth());
		entry.addMouseListener(this);
		entry.setAlignmentX(Component.LEFT_ALIGNMENT);
		this.add(entry);
	}
	
	
	public ArrayList<Integer> extractLinePositions(String[] listCode, ArrayList<Integer> listLineNumbers) {
		ArrayList<Integer> listLinePositions = new ArrayList<Integer>();
		int length = listCode.length;
		int occurrence;
		String strCode;
		
		String regexStart = "ACT";
		String originalCode = this.codeInput.getText();
		for(int i = 0; i < length; i++) {
			strCode = listCode[i];
			if(strCode.contains(regexStart)) {
				
				// Count the occurrence of ACT in the string
				occurrence = countOccurrence(strCode, regexStart);
				
				// Append the line number as many times as the occurrence of ACT
				this.countedIntegerAppend(listLinePositions, originalCode.indexOf(strCode), occurrence);
				this.countedIntegerAppend(listLineNumbers, i, occurrence);
			}
		}
		
		return listLinePositions;
	}
	
	public void countedIntegerAppend(ArrayList<Integer> listInteger, int value, int times) {
		for(int i = 0; i < times; i++) {
			listInteger.add(value);
		}
	}
	
	public int countOccurrence(String strFrom, String strOf) {

		int occurrence = 0;
		Pattern pattern;
		Matcher matcher;
		

		pattern = Pattern.compile(strOf+"\\b");
		matcher = pattern.matcher(strFrom);
		
		while (matcher.find()) {
			occurrence++;
		}
		
		return occurrence;
	}
	
	
	public void reset() {
		this.removeAll();
		this.listEntries = new ArrayList<DocumentEntry>();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getSource() instanceof DocumentEntry) {
			pnlParent.unfoldDoument();
			DocumentEntry entry = (DocumentEntry) e.getSource();
			int linePosition = entry.getLinePosition();
			System.out.println("Entered " + linePosition);
			this.codeInput.setCaretPosition(linePosition);
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}

}
