package com.ide;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.UIManager;

import javafx.geometry.Insets;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	public MainFrame(String name) {
		super(name);
		
		// Icon
		String dirImageOn = "img_ui/ico_frame.png";
	    ImageIcon iiOn = new ImageIcon(getClass().getClassLoader().getResource(dirImageOn));

		this.setIconImage(iiOn.getImage());
				
		UIManager.getDefaults().put("TabbedPane.contentBorderInsets", new Insets(0,0,0,0));
		UIManager.getDefaults().put("TabbedPane.tabsOverlapBorder", true);
		
	}
}
