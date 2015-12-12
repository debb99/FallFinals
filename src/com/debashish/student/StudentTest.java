package com.debashish.student;

import java.util.Random;

public class StudentTest {
	public static void main(String[ ] args)
	{
		gen = new Random( );
		
		System.out.println("Undergraduate Students");
		for (int i = 1; i <= 9; i++)
		{
			... // create a new UnderGrad student
			... // add some tests by calling the addTests method below
			... // print the student
		}
		System.out.println( );
		
		System.out.println("Graduate Students");
		for (int i = 1; i <= 9; i++)
		{
			... // make a random number in the range of 100 to 999
			... // create a GradStudent whose id is a 3-digit random number
			... // add some tests by calling the addTests method below
			... // print the student
		}
	}

	/**
	 * This method will generate a random number of test scores with each score
	 * being added to the array list of tests (see Student class).  After the
	 * tests are added, the computerGrade method is called which will set the
	 * grade.
	 * @param s: the student
	 */
	public static void addTests(Student s)
	{
		... // the number of tests to be added is a random number in the range of 1 to 5
		
		// make a for-loop below
		... 
		// each test is a random number in the range of 60 to 100
		
		// after the tests are added, use s to call the computeGrade method
		
	}

	public static Random gen;
}