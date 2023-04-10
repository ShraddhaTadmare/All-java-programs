package com.EncapStudentEx;

import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		   Student s=new Student();
		   
		    System.out.println("Enter Roll No:");
	        s.setRollNo(sc.nextInt());
	        
	        System.out.println("Enter Admission No:");
	        s.setAdmissionNo(sc.nextLong());
	        
	        System.out.println("Enter age:");
	        s.setAge(sc.nextInt());
	        
	        System.out.println("Enter course id:");
	        s.setCourseId(sc.nextInt());
	        
	        
	        
	        System.out.println("Student RollNo: "+s.getRollNo());
	        System.out.println("Student AdmissionNo: "+s.getAdmissionNo());
	        System.out.println("Student Age: "+s.getAge());
	        System.out.println("Student CourseId: "+s.getCourseId());
	        
	        

	}

}
