/**
 * 
 */
package com.main;

import java.util.Arrays;
import java.util.Scanner;

public class StudentMain {
	public static int count =0;
	public static void main(String[] args) {
		StudentData[] students = new StudentData[50];
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap thon tin sinh vien moi");
		int index = 0;
		String next = "";
		String className;
		String name;

		StudentData[] marks = new StudentData[3];
		float a,b,c;
		do {
			System.out.print("Name:");
			name = sc.next();
			System.out.print("Class Name:");
			className = sc.next();
			System.out.print("Math:");
			a = 9;
			 a = sc.nextFloat();
			System.out.print("English:");
			 b = sc.nextFloat();
			System.out.print("Phisical:");
			 c = sc.nextFloat();
			
			 marks[count]= new StudentData(className,name,a,b,c);
			 count++;
			 System.out.println("Them thanh cong");
			System.out.print("Nhap tiep (Y/N): " );
			next = sc.next().toLowerCase().toUpperCase();
		} while("Y".equals(next));
		for(int i =0;i<count;i++) {
			System.out.println(marks[i].toString());
		}
		System.out.println("Ket thuc nhap");
		System.out.println("diem can sua");
		float z = sc.nextFloat();
		for(int i =0;i<count;i++) {
			marks[i].setMath(z);
		}
		System.out.println("diem sau khi sua");
		for(int i =0;i<count;i++) {
			System.out.println(marks[i].toString());
		}
		
		
//		for(int i=0; i<students.length; i++) {
//			if(students[i].search(name)) {
//				System.out.println("Tong diem: " + students[i].sum());
//				boolean found = true;
//			}
//		}
//		
//		
//		System.out.print("Tim ten sinh vien:");
//		String searchName = sc.next();
//		boolean found = false;
//
//		if(!found) {
//			System.out.println("Khong tim thay sinh vien");
//		}
//		
		

	}
}
