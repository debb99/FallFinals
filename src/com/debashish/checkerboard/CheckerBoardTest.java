package com.debashish.checkerboard;

import javax.swing.JFrame;

public class CheckerBoardTest {
	public static void main(String[] args) {
		JFrame frame = new CheckerBoard();
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setTitle("Checker Board");
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}