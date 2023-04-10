package com.Hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapIterator {

	public static void main(String[] args) {
		HashMap<String,Double> map = new HashMap<>();
		map.put("Rani", 70.9);
		map.put("Raju", 80.9);
		map.put("Rahul", 90.9);
		map.put("Rohit", 85.9);
		map.put("Ramesh", 95.9);
		
		System.out.println(map);
		System.out.println("========== All keys ==============");
		
		Set<String>keyset =map.keySet();
		for(String s: keyset) {
			System.out.println(s);
		}
		
		System.out.println("========== All Values ==============");
		
		Collection<Double> marks=map.values();
		for(Double m: marks) {
			System.out.println(m);	
		}
		
		
		
		
		
		
		
		
		

	}

}
