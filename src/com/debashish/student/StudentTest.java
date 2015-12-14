package com.debashish.student;

import java.util.Random;

public class StudentTest {
	public static void main(String[ ] args)
	{
		gen = new Random( );
		
		System.out.println("Undergraduate Students");
		for (int i = 1; i <= 9; i++)
		{
			UnderGrad underGrad = new UnderGrad(); // create a new UnderGrad student
			addTests(underGrad); // add some tests by calling the addTests method below
			System.out.println(underGrad.toString()); // print the student
		}
		System.out.println( );
		
		System.out.println("Graduate Students");
		for (int i = 1; i <= 9; i++)
		{
			int rand = 100 + gen.nextInt(899); // make a random number in the range of 100 to 999
			GradStudent gradStudent = new GradStudent(rand); // create a GradStudent whose id is a 3-digit random number
			addTests(gradStudent); // add some tests by calling the addTests method below
			System.out.println(gradStudent.toString()); // print the student
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
		int testCount = gen.nextInt(4) + 1;// the number of tests to be added is a random number in the range of 1 to 5
		
		// make a for-loop below
		for(int i = 0; i < testCount; i++){
			s.addTest(gen.nextInt(40) + 60);
		}
		// each test is a random number in the range of 60 to 100
		
		// after the tests are added, use s to call the computeGrade method
		s.computeGrade();
		
	}

	public static Random gen;
}