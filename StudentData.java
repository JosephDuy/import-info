/**
 * 
 */
package com.main;

import java.util.Arrays;

public class StudentData {
	private String className;
	private String name;
	private float math;
	private float English;
	private float Phisical;
	private int count = 0;
	/**
	 * @return the className
	 */
	/**
	 * @return the className
	 */
	public String getClassName() {
		return className;
	}
	/**
	 * @param className the className to set
	 */
	public void setClassName(String className) {
		this.className = className;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the math
	 */
	public float getMath() {
		return math;
	}
	/**
	 * @param math the math to set
	 */
	public void setMath(float math) {
		this.math = math;
	}
	/**
	 * @return the english
	 */
	public float getEnglish() {
		return English;
	}
	/**
	 * @param english the english to set
	 */
	public void setEnglish(float english) {
		English = english;
	}
	/**
	 * @return the phisical
	 */
	public float getPhisical() {
		return Phisical;
	}
	/**
	 * @param phisical the phisical to set
	 */
	public void setPhisical(float phisical) {
		Phisical = phisical;
	}
	
	/**
	 * @param className
	 * @param name
	 * @param math
	 * @param english
	 * @param phisical
	 */
	public StudentData(String className, String name, float math, float english, float phisical) {
		super();
		this.className = className;
		this.name = name;
		this.math = math;
		English = english;
		Phisical = phisical;
	}
	@Override
	public String toString() {
		return "StudentData [className=" + className + ", name=" + name + ", math=" + math + ", English=" + English
				+ ", Phisical=" + Phisical + "]";
	}
	public boolean search(String name) {
		return this.name.contains(name);
	}
	
	public float sum() { 
		
		return count ;
	}

	
}
