package com.Arraylist;

import java.util.ArrayList;

public class Commonelements {

	public static void main(String[] args) {
		ArrayList<String>list1 = new ArrayList<String>();

    
        list1.add("a");
        list1.add("b");
        list1.add("c");
        list1.add("a");

        System.out.println(list1);
        
        
        ArrayList<String>list2 = new ArrayList<String>();

   
       list2.add("p");
       list2.add("a");
       list2.add("r");
       
       System.out.println(list2);
        
      list1.retainAll(list2);
        
        
        System.out.println("Common elements: "+ list1);

	}

}
