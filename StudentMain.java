
package com.student;

public class StudentMain {

	public static void main(String[] args) {

		StudentData SData = new StudentData();
		double sum = SData.inputStudent(null);
		System.out.println("MEDIUM SCORE = " + sum);
		double sum = SData.continueStudent(null);
		System.out.println("MEDIUM SCORE = " + sum);
		
	}

}
