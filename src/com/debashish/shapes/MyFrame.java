package com.debashish.shapes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
	public MyFrame() {
		drawingPanel = new MyPanel();
		add(drawingPanel, BorderLayout.CENTER);
		createControlPanel();
		pack();
	}

	public void createControlPanel( )
	{
		JPanel panel = new JPanel( );
		panel.setBackground(Color.lightGray);
		JLabel label = new JLabel("Number:");
		numberFld = new JTextField(3);
		numberFld.setText("5");
		panel.add(label);
		panel.add(numberFld);
		
		// make a "Draw Circles" button by calling makeButton and add it to the panel
		JButton circleButton = makeButton("Draw Circles");
		panel.add(circleButton);
		
		// make a "Draw Squares" button by calling makeButton and add it to the panel
		JButton squareButton = makeButton("Draw Squares");
		panel.add(squareButton);
		
		add(panel, BorderLayout.NORTH);
	}

	/**
	 * Make a JButton.  This method has an inner class that will create
	 * a listener for the button.  The button will pass data using the
	 * drawingPanel instance field to MyPanel so that a number of circles
	 * or squares will be drawn.  The name of the button will determine
	 * if numberFld contains a number of squares or a number of circles.
	 * @param btnName - the name of the button
	 * @return the JButton created
	 */
	public JButton makeButton(final String btnName)
	{
		JButton button = new JButton(btnName);
		
		class ButtonListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				// get the number in the JTextField (numberFld instance field)
				int shapeNumber;
				try{
					shapeNumber = Integer.parseInt(numberFld.getText());					
				} catch (NumberFormatException e){
					shapeNumber = 0;
				}
				
				// convert this number to an int
				// lol already done
				
				// this number is either the number of squares or circles depending on btnName
				String buttonType = event.getActionCommand();
				
				// call the setData method of the MyPanel class by using the drawingPanel instance field
				if(buttonType == "Draw Circles"){
					drawingPanel.setData(shapeNumber, 0);
				} else if (buttonType == "Draw Squares"){
					drawingPanel.setData(0, shapeNumber);
				}
				
			}
		}
		
		// set the action listener and return the button
		button.addActionListener(new ButtonListener());
		return button;
	}

	private MyPanel drawingPanel;
	private JTextField numberFld;
}
