package com.ide;

public class MainThread extends Thread {

	@Override
	public void run() {
		super.run();
		Panel pnlScanner = new Panel();
		Frame frameScanner = new Frame();
		frameScanner.showGUI(pnlScanner.getUI());
	}
}
