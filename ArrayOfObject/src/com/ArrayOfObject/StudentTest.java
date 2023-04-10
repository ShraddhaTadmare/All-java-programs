package com.ArrayOfObject;

public class StudentTest {

	public static void main(String[] args) {
		Student st[] = new Student[5];
		st[0]= new Student(1,"Shraddha",90);
		st[1]= new Student(2,"Shri",80);
		st[2]= new Student(3,"pooja",50);
		st[3]= new Student(4,"prasad",70);
		st[4]= new Student(5,"hari",90);
		
		for (Student s:st)
		{
			System.out.println(s);
		}	

	}

}
