package com.Arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IterateArraylist {

	public static void main(String[] args) {
		
		ArrayList<String> al= new ArrayList<>();
		al.add("java");
		al.add("Python");
		al.add("Angular");
		al.add("Spring");
		al.add("html");
		System.out.println(al);
		
		System.out.println("===============================");
		
		//1st way
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println("==========================");
		
		// 2nd way
		for(String s:al) {
			System.out.println(s);
		}
		
		System.out.println("=====================");

		// 3rd way
		Iterator<String> itr = al.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// 4th way
		ListIterator<String> litr1= al.listIterator(al.size());
		while(litr1.hasPrevious()) {
			System.out.println(litr1.previous());
		}
		}

}
