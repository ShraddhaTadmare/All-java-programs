package com.Arraylist;

import java.util.ArrayList;

public class SortIntvaluesUsingMethod {
	    public static void sortArray(ArrayList<Integer> list) {
	    	
	    	int temp;
	    	for(int i=0;i<list.size();i++) {
	    		for(int j=i+1;j<list.size();j++) {
	    			if(list.get(i)>list.get(j)) {
	    				temp= list.get(i);
	    				list.set(i, list.get(j));
	    				list.set(j, temp);
	    			}
	    		}
	    	
	    	}
	    	 System.out.println(list);
	    	
	    }
	  

	public static void main(String[] args) {
		ArrayList<Integer>list = new ArrayList<>();
		list.add(1);
        list.add(2);
        list.add(1);
        list.add(4);
        System.out.println(list);
        sortArray( list);

	}

}
