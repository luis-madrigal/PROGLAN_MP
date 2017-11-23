package com.ide;

import java.awt.Color;
import java.awt.Graphics2D;

import javax.swing.JComponent;
import javax.swing.Painter;

public class BackgroundPainter implements Painter<JComponent> {

	private Color color;

	BackgroundPainter(Color c) {
		color = c;
	}

	@Override
	public void paint(Graphics2D arg0, JComponent arg1, int arg2, int arg3) {
		
	}
	

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
}