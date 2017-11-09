package com.ide;
/**
 * Uses RSyntaxTextArea
 * https://github.com/bobbylight/RSyntaxTextArea
 * 
 * Requires Gradle to build
 * Installation Guide: https://gradle.org/releases/
 * 
 * 
 * Requires jdk1.8.0_65
 * Check your <C:/Program Files/Java> or <C:/Program Files (x86)/Java> if you have it
 * Download: http://www.oracle.com/technetwork/pt/java/javase/downloads/jdk8-downloads-2133151.html
 * 
 * Then add the bin <C:\Program Files\Java\jdk1.8.0_65> to your environment variables under PATH
 * 
 * 
 * Import Gradle > RSyntaxTextArea-master
 * Configure Build Path > Projects
 * @author Candy
 *
 */
public class Driver {
	public static void main(String[] args) {
		Panel pnlScanner = new Panel();
		Frame frameScanner = new Frame();
		frameScanner.showGUI(pnlScanner.getUI());
	}
	
}
