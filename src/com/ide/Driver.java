package com.ide;

public class Driver {
	public static void main(String[] args) {
		Panel pnlScanner = new Panel();
		Frame frameScanner = new Frame();
		frameScanner.showGUI(pnlScanner.getUI());
	}
	
}
