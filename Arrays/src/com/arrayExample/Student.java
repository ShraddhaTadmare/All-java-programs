package com.arrayExample;

import java.util.Arrays;

public class Student {
	 private int id;
	 private String name;
	 private Integer[] marks;
	 private float percentage;
	 
	 
	public Student() {
		
	}


	public Student(int id, String name, Integer[] marks) {
		
		this.id = id;
		this.name = name;
		this.marks = marks;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer[] getMarks() {
		return marks;
	}


	public void setMarks(Integer[] marks) {
		this.marks = marks;
	}


	public float getPercentage() {
		return percentage;
	}


	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
    
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + Arrays.toString(marks) + ", percentage="
				+ percentage + "]";
	}


	public void CalPercentage() {
		Student s = new Student();
		int sum=0;
		for(int i=0;i<marks.length;i++) {
			sum=sum+marks[i];
		}
		
		float avg=sum/
		
	}
	

	
	
	
	
	
	 
	 

}
