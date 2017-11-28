package com.interpreter.modules;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

import com.ide.OptionPane;


public class Reader {
	
	private static boolean cancelled = false;
	
	
	
	public static Object readInput(String type){
		Object value = null;
		String errorMsg = "";
		
		do {
			switch (type) {
			case "int": value = readIntegerInput(errorMsg + "Enter integer input: "); break;
			case "string": value = readStringInput(errorMsg + "Enter string input: "); break;
			case "float": value = readFloatInput(errorMsg + "Enter float input: "); break;
			case "char": value = readCharInput(errorMsg + "Enter character: "); break;
			case "boolean": value = readBoolInput(errorMsg + "Enter boolean input: "); break;
			default:
				break;
			}
			
			if(value == null) 
				errorMsg = "Invalid input. ";
		} while(value == null && !cancelled);
		
		cancelled = false;
		return value;
	}
	
	public static Integer readIntegerInput(String msg) {
		String[] options = {"   Enter   "};
		JPanel panel = new JPanel();
		JLabel lbl = new JLabel(msg);
		lbl.setPreferredSize(new Dimension(100, 20));
		JTextField txt = new JTextField(10);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(lbl);
		panel.add(txt);
		int selectedOption = JOptionPane.showOptionDialog(null, panel, "", JOptionPane.NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);


		String input = txt.getText(); //OptionPane.showInputDialog(msg); //JOptionPane.showInputDialog(msg);
//		System.out.println("LEN "+input.trim().length());
		if(input != null && input.length() > 0) {
			try {
				return Integer.parseInt(input);
			}catch(Exception e) {
				return null;
			}
		} else {
			cancelled = true;
			return null;
		}
		
	}

	public static Float readFloatInput(String msg) {
//		String input = JOptionPane.showInputDialog(msg);
		String[] options = {"   Enter   "};
		JPanel panel = new JPanel();
		JLabel lbl = new JLabel(msg);
		lbl.setPreferredSize(new Dimension(100, 20));
		JTextField txt = new JTextField(10);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(lbl);
		panel.add(txt);
		int selectedOption = JOptionPane.showOptionDialog(null, panel, "", JOptionPane.NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);


		String input = txt.getText(); //OptionPane.showInputDialog(msg); //JOptionPane.showInputDialog(msg);
		
		if(input != null && input.length() > 0) {
			try {
				return Float.parseFloat(input);
			}catch(Exception e) {
				return null;
			}
		} else {
			cancelled = true;
			return null;
		}
		
	}

	public static Character readCharInput(String msg) {
//		String input = JOptionPane.showInputDialog(msg);
		String[] options = {"   Enter   "};
		JPanel panel = new JPanel();
		JLabel lbl = new JLabel(msg);
		lbl.setPreferredSize(new Dimension(100, 20));
		JTextField txt = new JTextField(10);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(lbl);
		panel.add(txt);
		int selectedOption = JOptionPane.showOptionDialog(null, panel, "", JOptionPane.NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);


		String input = txt.getText(); //OptionPane.showInputDialog(msg); //JOptionPane.showInputDialog(msg);
		
		if(input != null && input.length() > 0) {
			try {
				if(input.length() > 1)
					return null;
				
				return input.charAt(0);
			}catch(Exception e) {
				return null;
			}
		} else {
			cancelled = true;
			return null;
		}
	}
	
	public static String readStringInput(String msg) {
//		String input = JOptionPane.showInputDialog(msg);
		String[] options = {"   Enter   "};
		JPanel panel = new JPanel();
		JLabel lbl = new JLabel(msg);
		lbl.setPreferredSize(new Dimension(100, 20));
		JTextField txt = new JTextField(10);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(lbl);
		panel.add(txt);
		int selectedOption = JOptionPane.showOptionDialog(null, panel, "", JOptionPane.NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);


		String input = txt.getText(); //OptionPane.showInputDialog(msg); //JOptionPane.showInputDialog(msg);
		
		if(input != null && input.length() > 0) {
			return input;
		} else {
			cancelled = true;
			return null;
		}
	}

	public static Boolean readBoolInput(String msg) {
//		String input = JOptionPane.showInputDialog(msg);
		String[] options = {"   Enter   "};
		JPanel panel = new JPanel();
		JLabel lbl = new JLabel(msg);
		lbl.setPreferredSize(new Dimension(100, 20));
		JTextField txt = new JTextField(10);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add(lbl);
		panel.add(txt);
		int selectedOption = JOptionPane.showOptionDialog(null, panel, "", JOptionPane.NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);


		String input = txt.getText(); //OptionPane.showInputDialog(msg); //JOptionPane.showInputDialog(msg);
		
		if(input != null && input.length() > 0) {
			try {
				return Boolean.parseBoolean(input);
			}catch(Exception e) {
				return null;
			}
		} else {
			cancelled = true;
			return null;
		}
		
	}

}
