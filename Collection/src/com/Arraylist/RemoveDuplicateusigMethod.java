package com.Arraylist;

import java.util.ArrayList;

public class RemoveDuplicateusigMethod {
	
	public static void RemoveDupli(ArrayList<String>list) {
		ArrayList<String> list1 = new ArrayList<>();
		
		for(String s : list) {
			if(!list1.contains(s)) {
				list1.add(s);
			}
			
		}
		
		System.out.println(list1);
	}

	public static void main(String[] args) {
ArrayList<String>list1 = new ArrayList<String>();

	    
        list1.add("a");
        list1.add("b");
        list1.add("c");
        list1.add("a");

        System.out.println(list1);
       
		RemoveDupli(list1);
        
	}

}
