package com.debashish.checkerboard;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;

public class CheckerBoard extends JFrame {
	/**
	 * The constructor will initialize the instance field (cell).  It will
	 * also set the layout for the frame to an 8 by 8 grid layout.  Then
	 * use a for loop to call the makeButton method 64 times in order to fill
	 * the checkerboard with JButtons.  Use the loop counter as a parameter
	 * for the call to makeButton.
	 */
	public CheckerBoard( )
	{
		cell = new ArrayList<>();
		
		// set the layout for the frame to an 8 by 8 grid layout
		setLayout(new GridLayout(8, 8));
		
		// for loop to call makeButton 64 times
		for(int i = 1; i <= 64; i++){
			makeButton(i);
		}
	}

	/**
	 * This method creates a JButton, adds it to the grid and also adds it to the array
	 * list.  The method also contains an inner class that implements ActionListener.
	 * @param cellNum is the number of the button
	 */
	
	private boolean whiteAdd = true;
	public void makeButton(final int cellNum)
	{
		JButton button = new JButton("" + (cellNum - 1)); //teehee
		add(button);   // add the button to the next cell in the grid
		if(whiteAdd){
			button.setBackground(Color.WHITE);
			whiteAdd = false;
			if(cellNum % 8 == 0){
				whiteAdd = true;
			}
		} else {
			button.setBackground(Color.RED);
			whiteAdd = true;
			if(cellNum % 8 == 0){
				whiteAdd = false;
			}
		}
		
		cell.add(button);
		
		
		class CellListener implements ActionListener
		{
			/**
			 * The actionPerformed method will contain a loop (or two loops) that
			 * will visit each button in the array list and set its background color
			 * to white or red so that the button whose number is cellNum is set to
			 * red and the rest of the grid is appropriately colored so that the
			 * board looks like a checkerboard.
			 */
			public void actionPerformed(ActionEvent event)
			{
				cellNum 
			}
		}
		
		button.addActionListener(new CellListener());  // add a listener to the button
		
	}

	/**
	 * the array list will contain an array list of JButtons
	 */
	private ArrayList<JButton> cell;
}
