package com.debashish.student;

import java.util.ArrayList;

public abstract class Student {
	public Student( )
	{
		... // initialize the instance field grade to "none"
		... // initialize the instance field tests (otherwise it will be null)
	}

	/**
	 * Create a string according to the comments and return it. Look at the
	 * output for help.
	 */
	public String toString() {
		// returns a string with the individual test scores from the array list
		// hint: use a for loop to look at each element of the array list
		// followed by the test average (call getTestAverage)
		// followed by the grade (the instance field grade)

	}

	public void setGrade(String newGrade) {
		grade = newGrade;
	}

	/**
	 * Add a new test score to the array list
	 * @param score: the score to be added
	 */
	public void addTest(int score)
	{
		... // add the score to the array list
	}

	/**
	 * Find and return the average score by adding the test scores
	 * in the array list (an int value) and then dividing by the
	 * number of tests (an int value).
	 * @return: the test average
	 */
	public int getTestAverage( )
	{
		// return the sum of all tests (ints) in the array list divided by the number of tests
		// hint: use a for-loop
		... 
	}

	public abstract void computeGrade(); // abstract method

	private ArrayList<Integer> tests;
	private String grade;
}