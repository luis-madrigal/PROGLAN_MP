package com.utils;

import org.antlr.v4.runtime.RuleContext;

public class Utils {
	
	public static String removeFirstandLastChar(String arg) {
		return arg.substring(1).substring(0, arg.length()-2);
	}
	
	public static boolean isLastChild(RuleContext obj) {
		return obj.parent.getChild(obj.parent.getChildCount()-1) == obj;
	}
	
}
