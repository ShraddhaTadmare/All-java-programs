package com.EncapStudentEx;

public class Student {

	public int rollNo;
	protected long admissionNo;
	int age;
	private int courseId;
	
	
	//Public
	public void setRollNo(int rollNo)
	{
		this.rollNo=rollNo;
	}
	
	public int getRollNo()
	{
		return this.rollNo;
	}
	
	//Protected
	protected void setAdmissionNo(long admissionNo)
	{
		this.admissionNo=admissionNo;
	}
	
	protected long getAdmissionNo()
	{
		return this.admissionNo;
	}
	
	//Default
	 void setAge(int age)
	{
		this.age=age;
	}
	
	 int getAge()
	{
		return this.age;
	}
	 
	 //Private
	 public void setCourseId(int courseId)
		{
			this.courseId=courseId;
		}
		
		public int getCourseId()
		{
			return this.courseId;
		}
	 
	
}
