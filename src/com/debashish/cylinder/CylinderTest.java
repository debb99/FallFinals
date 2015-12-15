package com.debashish.cylinder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class CylinderTest {
	public static void main(String[ ] args) throws FileNotFoundException
	{
		FileReader reader = new FileReader("res/Cylinder.txt");
		Scanner file = new Scanner(reader);
		
		ArrayList<Cylinder> Cylinders = new ArrayList<>(); // make an array list of cylinders called cylinderList
		while(file.hasNext( ))
		{
			// read the file
			int radius = file.nextInt( );
			int height = file.nextInt( );
			Cylinder temp = new Cylinder(radius, height); // make a new cylinder
			if(!isInList(Cylinders, temp)){  // call isInList to determine if the cylinder is in the list
				  Cylinders.add(temp); // if it wasn't, add it so that the volumes are in
				      // ascending order
			}
		}
		printList("Cylinder List: ", Cylinders); // call printList to print the array list
	}

	/**
	 * Insert c into the array list so that volumes are in increasing order
	 */
	public static void insert(ArrayList<Cylinder> list, Cylinder c)
	{
		
	}

	/**
	 * Determines if c is already in the array list by calling the equals method
	 * @return true if c is already in the array list
	 *         and false if it is not in the list
	 */
	public static boolean isInList(ArrayList<Cylinder> list, Cylinder c)
	{
		boolean contains = false;
		for(Cylinder i : list){
			if(c.equals(i)){
				contains = true;
			}
		}
		return contains;
		
	}

	/**
	 * Print the header followed by the contents of the array list
	 */
	public static void printList(String header, ArrayList<Cylinder> list) {
		System.out.println(header);
		for (int i = 0; i < list.size(); i++)
			System.out.println("  " + list.get(i));
		System.out.println();
	}
}