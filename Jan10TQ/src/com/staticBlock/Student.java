package com.staticBlock;

public class Student {
	private int sid;
	private String sname;
	private float smarks;
	static int sCounter=0;
	static String SchoolName="st joseph";
	
public Student()
{


}
{
	sCounter++;
}
 public Student(int sid,String sname,float smarks)
 {
	 this.sid=sid;
	 this.sname=sname;
	 this.smarks=smarks;
	 sCounter++;
 }
 
 

}