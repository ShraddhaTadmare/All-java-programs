package com.programs;

import java.util.ArrayList;

public class RemoveDuplicates {
	
	public static void duplicateRemove(ArrayList<String>list1) 
	{
		ArrayList<String> list2 = new ArrayList<>();
		for(String s: list1)
		{
			if(!list2.contains(s))
			{
				list2.add(s);
			}
		}
	   System.out.println(list2);
	
	}
	

	public static void main(String[] args) {
		ArrayList <String> list = new ArrayList<>();
		list.add("black");
		list.add("red");
		list.add("blue");
		list.add("white");
		list.add("black");
		list.add("white");
		
		System.out.println(list);
		duplicateRemove(list);
	}

}
