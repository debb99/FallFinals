package com.debashish.shapes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

public class MyPanel extends JPanel {
	public MyPanel() {
		numC = 0;
		numS = 0;
		setPreferredSize(new Dimension(300, 300));
		setBackground(Color.WHITE);
	}

	/**
	 * Draw the circles or the squares. One of the instance fields should be
	 * zero and the other nonzero.
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2.setRenderingHints(rh);
		float count = numC != 0 ? numC : numS; // let count = the number of
												// objects to be drawn
		float size = Math.min(getWidth(), getHeight()); // let size = the
														// minimum of the width
														// and height of the
														// panel
		float gap = (float) (0.8 * size / count); // then let gap between one
													// circle or square and the
													// next one is: 0.4 * size /
													// count
		// the above line assumes that the drawing will take place on the center
		// 80% of the panel

		// determine the x and y coordinates of the center of the panel
		float x = getWidth() / 2;
		float y = getHeight() / 2;

		// within a loop: draw the required number of circles
		for (int c = 0; c < numC; c++) {
			float tempSize = gap + c * gap;
			Ellipse2D.Double cir = new Ellipse2D.Double(x - tempSize / 2, y - tempSize / 2, tempSize, tempSize);
			g2.draw(cir);
		}

		// within a loop: draw the required number of squares
		for (int s = 0; s < numS; s++) {
			float tempSize = gap + s * gap;
			Rectangle2D.Double squ = new Rectangle2D.Double(x - (tempSize / 2), y - (tempSize / 2), tempSize, tempSize);
			g2.draw(squ);
		}

		//g2.drawLine(0, getHeight() / 2, getWidth(), getHeight() / 2);
		//g2.drawLine(getWidth() / 2, 0, getWidth() / 2, getHeight());
	}

	/**
	 * This is the method called from the actionPerformed method of the
	 * ButtonListener class. One of the parameters should be zero and the other
	 * nonzero.
	 * 
	 * @param circles:
	 *            the number of circles to draw
	 * @param squares:
	 *            the number of squares to draw
	 */
	public void setData(int circles, int squares) {
		numC = circles;
		numS = squares;
		repaint();
	}

	/**
	 * The instance fields represent the number of circles and the number of
	 * squares to be drawn.
	 */
	private int numC;
	private int numS;
}
