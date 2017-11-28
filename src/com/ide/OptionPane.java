package com.ide;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JOptionPane;

public class OptionPane extends JOptionPane {
	private static final long serialVersionUID = 1L;
	
	public OptionPane() {
		Component[] m = this.getComponents();
		for(int i = 0; i < m.length; i++){

	        if(m[i].getClass().getName() == "javax.swing.JPanel")
	            m[i].setBackground(Color.WHITE);

//	        if(c.getClass().isInstance(m[i]));
//	            getComponents((Container)m[i]);
	    }
	
	}
//	public static void createDialog(Container c) {
////		private void getComponents(Container c){
//
//		    Component[] m = c.getComponents();
//
//		    for(int i = 0; i < m.length; i++){
//
//		        if(m[i].getClass().getName() == "javax.swing.JPanel")
//		            m[i].setBackground(Color.WHITE);
//
////		        if(c.getClass().isInstance(m[i]));
////		            getComponents((Container)m[i]);
//		    }
//		}
//	
//		@Override

}
