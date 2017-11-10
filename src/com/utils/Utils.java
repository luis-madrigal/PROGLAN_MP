package com.utils;

public class Utils {
	
	public static String removeFirstandLastChar(String arg) {
		return arg.substring(1).substring(0, arg.length()-2);
	}
	
}
