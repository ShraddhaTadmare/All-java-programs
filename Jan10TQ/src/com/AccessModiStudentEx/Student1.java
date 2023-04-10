package com.AccessModiStudentEx;

public class Student1 {
	
	public int rollNo;
	protected long admissionNo;
	int age;
	private String courseId;
	
	public void doPublic()
	{
		System.out.println("Roll no is public");
	}
	
	
	protected void doProtected()
	{
		System.out.println("Admission no is protected");	
	}
	
	void doDefault()
	{
		System.out.println("Age is default");
		
	}
	
	private void doPrivate()
	{
		System.out.println("Course Id is private");
	}
}
