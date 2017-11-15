package com.utils;

import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

public class Utils {
	
	public static String removeFirstandLastChar(String arg) {
		return arg.substring(1).substring(0, arg.length()-2);
	}
	
	public static boolean isLastChild(RuleContext obj) {
		return obj.parent.getChild(obj.parent.getChildCount()-1) == obj;
	}
	
	public static ParseTree getNthChild(ParseTree node, int n) {
		ParseTree child = node;
		for(int i = 0; i < n; i++) {
			if(child.getChild(0) != null)
				child = child.getChild(0);
			else {
				child = null;
				break;
			}
		}
		
		return child;
	}
}
