package com.debashish.checkerboard;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;

public class CheckerBoard extends JFrame {
	private Color currentColor = Color.RED; //opposite of first button color
	private boolean skipColorSwitch = false;
	
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
		for(int i = 0; i < 64; i++){
			makeButton(i);
		}
		setCheckerboard(Color.WHITE);
	}
	
	public void setCheckerboard(Color initColor){
		currentColor = initColor;
		skipColorSwitch = false;
		for(JButton i : cell){
			int cellNum = Integer.parseInt(i.getText());
			if((cellNum + 1) % 8 == 0){
				skipColorSwitch = true;
			}
			if(!skipColorSwitch){
				i.setBackground(currentColor);
				if(currentColor == Color.WHITE){
					currentColor = Color.RED;
				} else if(currentColor == Color.RED){
					currentColor = Color.WHITE;
				}
			} else {
				i.setBackground(currentColor);
				skipColorSwitch = false;
				System.out.println(cellNum);
			}
		}
	}

	/**
	 * This method creates a JButton, adds it to the grid and also adds it to the array
	 * list.  The method also contains an inner class that implements ActionListener.
	 * @param cellNum is the number of the button
	 */
	public void makeButton(final int cellNum)
	{
		JButton button = new JButton("" + (cellNum)); //teehee
		
		add(button);   // add the button to the next cell in the grid
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
				int index = Integer.parseInt(event.getActionCommand());
				JButton tempButton = cell.get(index);
				if(tempButton.getBackground() != Color.RED){
					if(cell.get(0).getBackground() == Color.WHITE){
						setCheckerboard(Color.RED);
					} else if (cell.get(0).getBackground() == Color.RED){
						setCheckerboard(Color.WHITE);
					}
					
				}
			}
		}
		
		button.addActionListener(new CellListener());  // add a listener to the button
		
	}

	/**
	 * the array list will contain an array list of JButtons
	 */
	private ArrayList<JButton> cell;
}
