package com.interpreter.modules;

import javax.swing.JOptionPane;

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
			case "char": value = readCharInput(errorMsg + "Enter character input: "); break;
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
		String input = JOptionPane.showInputDialog(msg);
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
		String input = JOptionPane.showInputDialog(msg);
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
		String input = JOptionPane.showInputDialog(msg);
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
		String input = JOptionPane.showInputDialog(msg);
		if(input != null && input.length() > 0) {
			return input;
		} else {
			cancelled = true;
			return null;
		}
	}

	public static Boolean readBoolInput(String msg) {
		String input = JOptionPane.showInputDialog(msg);
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
