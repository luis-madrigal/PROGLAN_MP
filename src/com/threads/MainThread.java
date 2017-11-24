package com.threads;

import com.ide.Frame;
import com.ide.Panel;

public class MainThread extends Thread {

	@Override
	public void run() {
		super.run();
		Panel pnlScanner = new Panel();
		Frame frameScanner = new Frame();
		frameScanner.showGUI(frameScanner, pnlScanner);
	}
}
