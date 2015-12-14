package com.debashish.student;

public class GradStudent extends Student {
	public GradStudent(int id)
	{
		this.gradID = id; // initialize the instance field using the parameter
	}

	/**
	 * This method will use the setGrade method to set the grade. First, use the
	 * getTestAverage method to find the average grade. Then set the grade.
	 */
	public void computeGrade() {
		int avg = getTestAverage();
		if(avg >= 90){
			grade = "pass with distinction";// grade will be "pass with distinction" when the test average is 90 or
		} else if(avg >= 75){
			grade = "pass";
		} else {
			grade = "fail";
		}
		// above
		// grade will be "pass" when the test average is 75 to 89
		// grade will be "fail" when the test average is below 75

	}

	/**
	 * This toString should return everything in the base class toString method
	 * plus the grad ID.
	 */
	public String toString() {
		String output = "ID: " + gradID + "\tScores:";
		for(int i = 0; i < tests.size(); i++){
			output += " " + tests.get(i);
		}
		output += "\n\tAverage: " + getTestAverage();
		output += "\n\tGrade: " + grade;
		return output;
	}

	private int gradID;
}