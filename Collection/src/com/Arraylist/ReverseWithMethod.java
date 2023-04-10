package com.Arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ReverseWithMethod {
	
	public static void Reverse(ArrayList<String>list) {
	    Iterator<String> it= list.iterator();
	    ListIterator<String> liIt= list.listIterator(list.size());
	    
	    String temp;
	    for(int i=0,j=list.size()-1;i<list.size()/2;i++,j++) {
	    	temp=list.get(i);
	    	list.set(i, list.get(j));
	    	list.set(j, temp);
	    	
	    }
	    
		System.out.println(list);
		
		
	}
	
	

	public static void main(String[] args) {
		
		ArrayList<String>list1 = new ArrayList<String>();

	    
        list1.add("a");
        list1.add("b");
        list1.add("c");
        list1.add("a");

        System.out.println(list1);
        Reverse(list1);
        
	}

}
