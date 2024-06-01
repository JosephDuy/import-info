
package com.student;

import java.util.Scanner;

public class StudentData {

	public double inputStudent(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name: ");
		String name = sc.next();
		System.out.print("Enter Class: ");
		String className = sc.next();
		System.out.print("Enter Math = ");
		double math = sc.nextDouble();
		System.out.print("Enter Literature = ");
		double literature = sc.nextDouble();
		System.out.print("Enter English = ");
		double english = sc.nextDouble();
		
		double sum = (math + literature + english) / 3;
		
		sc.close();
		return sum;
	}
	
	public double continueStudent(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String continueInput;
		
		System.out.print("Do you want to enter another number? (yes/no): ");
        continueInput = sc.next();
		do (continueInput.equalsIgnoreCase("yes")){
			System.out.print("Enter Name: ");
			String name = sc.next();
			System.out.print("Enter Class: ");
			String className = sc.next();
			System.out.print("Enter Math = ");
			double math = sc.nextDouble();
			System.out.print("Enter Literature = ");
			double literature = sc.nextDouble();
			System.out.print("Enter English = ");
			double english = sc.nextDouble();
			
			double sum = (math + literature + english) / 3;
		
		sc.close();
		return double sum;
	}
	
	public static void editStudent(String[] args) {
		
	}

}
