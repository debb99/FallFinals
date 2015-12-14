package com.debashish.student;

public class UnderGrad extends Student {
	/**
	 * This method will use the setGrade method to set the grade. First, use the
	 * getTestAverage method to find the average grade. Then set the grade.
	 */
	public void computeGrade() {
		if(getTestAverage() >= 70){
			grade = "pass";
		} else {
			grade = "fail";
		}
		// grade will be "pass" when the test average is 70 or above
		// grade will be "fail" when the test average is below 70

	}
}