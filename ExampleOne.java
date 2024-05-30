
package com.example;

import java.util.Scanner;

public class ExampleOne {
	private String name;
	private String classname;
	private float[] mark =  new float[3];
	
	
	public void input(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Name: ");
		name = sc.next();
		System.out.println("Class Name:");
		classname = sc.next();
		System.out.println("MATHS: ");
		mark[0] = sc.nextFloat();
		System.out.println("LITERATURE :");
		mark[1] = sc.nextFloat();
		System.out.println("ENGLISH :");
		mark[2] = sc.nextFloat();
		
		char ch;
		do{
			System.out.println("Name: ");
			ch = sc.next().charAt(0);
			System.out.println("Class Name:");
			ch = sc.next().charAt(0);
			System.out.println("MATHS: ");
			mark[0] = sc.nextFloat();
			System.out.println("LITERATURE :");
			mark[1] = sc.nextFloat();
			System.out.println("ENGLISH :");
			mark[2] = sc.nextFloat();
		}while(ch != 'x');
		sc.close();

	}
	public float calculate() {
		return (mark [0] + mark [1] + mark [2] / 3);
	}
	public void loop(String[] args) {

	}
}
