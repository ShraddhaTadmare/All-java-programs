package com.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class StudentArrayList {

	public static void main(String[] args) {
		
		ArrayList <Student> list = new ArrayList<>();
		list.add(new Student(1,"priti",70f));
		list.add(new Student(3,"shraddha",50f));
		list.add(new Student(5,"pritam",90f));
		list.add(new Student(2,"sushma",55f));
		list.add(new Student(4,"kunal",65f));
		
		Iterator<Student>itr= list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		Collections.sort(list,new MarksComparator());
		
		for(Student s: list)
		{
			System.out.println(s);
		}
		System.out.println("---------------------");
Collections.sort(list,new IdComparator());
		
		for(Student s: list)
		{
			System.out.println(s);
		}
	}

}
