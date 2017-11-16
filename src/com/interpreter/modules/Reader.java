package com.interpreter.modules;

import javax.swing.JOptionPane;

public class Reader {
	
	public static int readIntegerInput() {
		String input = JOptionPane.showInputDialog("Enter integer value:");
		return Integer.parseInt(input);
	}
	
	public static float readFloatInput() {
		String input = JOptionPane.showInputDialog("Enter float value:");
		return Float.parseFloat(input);
	}
	
	public static double readDoubleInput() {
		String input = JOptionPane.showInputDialog("Enter double value:");
		return Double.parseDouble(input);
	}
	
	public static long readLongInput() {
		String input = JOptionPane.showInputDialog("Enter long value:");
		return Long.parseLong(input);
	}
	
	public static short readShortInput() {
		String input = JOptionPane.showInputDialog("Enter short value:");
		return Short.parseShort(input);
	}
	
	public static char readCharInput() {
		String input = JOptionPane.showInputDialog("Enter char value:");
		return input.charAt(0);
	}
	
	public static boolean readBoolInput() {
		String input = JOptionPane.showInputDialog("Enter true or false:");
		return Boolean.parseBoolean(input);
	}
	
	public static String readStringInput() {
		String input = JOptionPane.showInputDialog("Enter string:");
		return input;
	}
	
}
