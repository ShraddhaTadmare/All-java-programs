package com.staticBlock;

public class StudentTest {

	public static void main(String[] args) {
		System.out.println("no of student:"+Student.sCounter);
		Student s1=new Student(1,"sss",69);
		System.out.println("no of student:"+Student.sCounter);

	}

}
