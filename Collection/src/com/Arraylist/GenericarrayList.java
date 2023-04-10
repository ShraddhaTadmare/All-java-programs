package com.Arraylist;

import java.util.ArrayList;
import java.util.List;

public class GenericarrayList {

	public static void main(String[] args) {
		List<Integer> list1=new ArrayList<>();
		
		list1.add(12);
		list1.add(90);
		list1.add(70);
		list1.add(67);
		
		for(int i=0;i<list1.size();i++) {
			
			System.out.println(list1.get(i));
			int data = list1.get(i)+10;
		}
	}

}
