package com.interpreter.modules;

import com.utils.Console;

public class Writer {
	
	public static void printText(int output) {
		Console.instance().logln(String.valueOf(output));
	}
	
	public static void printText(float output) {
		Console.instance().logln(String.valueOf(output));
	}
	
	public static void printText(double output) {
		Console.instance().logln(String.valueOf(output));
	}
	
	public static void printText(short output) {
		Console.instance().logln(String.valueOf(output));
	}
	
	public static void printText(long output) {
		Console.instance().logln(String.valueOf(output));
	}
	
	public static void printText(boolean output) {
		Console.instance().logln(String.valueOf(output));
	}
	
	public static void printText(char output) {
		Console.instance().logln(output+" ");
	}
	
	public static void printText(String output) {
		Console.instance().logln(output);
	}
	
}
