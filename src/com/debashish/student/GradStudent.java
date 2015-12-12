package com.debashish.student;

public class GradStudent extends Student {
	public GradStudent(int id)
	{
		... // initialize the instance field using the parameter
	}

	/**
	 * This method will use the setGrade method to set the grade. First, use the
	 * getTestAverage method to find the average grade. Then set the grade.
	 */
	public void computeGrade() {
		// grade will be "pass with distinction" when the test average is 90 or
		// above
		// grade will be "pass" when the test average is 75 to 89
		// grade will be "fail" when the test average is below 75

	}

	/**
	 * This toString should return everything in the base class toString method
	 * plus the grad ID.
	 */
	public String toString() {
		// override the toString method of the base class so that the grad ID is
		// also printed
	}

	private int gradID;
}