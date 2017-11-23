package com.interpreter.modules;

import javax.swing.JOptionPane;

public class Reader {

	public static String readInput(){
		String input = JOptionPane.showInputDialog("Enter Input: ");
		return input;
	}

	public static int readIntegerInput(String msg) {
		String input = JOptionPane.showInputDialog(msg);
		return Integer.parseInt(input);
	}

	public static float readFloatInput(String msg) {
		String input = JOptionPane.showInputDialog(msg);
		return Float.parseFloat(input);
	}

	public static double readDoubleInput(String msg) {
		String input = JOptionPane.showInputDialog(msg);
		return Double.parseDouble(input);
	}

	public static long readLongInput(String msg) {
		String input = JOptionPane.showInputDialog(msg);
		return Long.parseLong(input);
	}

	public static short readShortInput(String msg) {
		String input = JOptionPane.showInputDialog(msg);
		return Short.parseShort(input);
	}

	public static char readCharInput(String msg) {
		String input = JOptionPane.showInputDialog(msg);
		return input.charAt(0);
	}

	public static boolean readBoolInput(String msg) {
		String input = JOptionPane.showInputDialog(msg);
		return Boolean.parseBoolean(input);
	}

}
