package com.Hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapIteratorDemo {

	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<>();
		map.put("Rani", 70);
		map.put("Raju", 80);
		map.put("Rahul", 90);
		map.put("Rohit", 85);
		map.put("Ramesh", 95);
		
		System.out.println(map);
		
		Set<String>keyset =map.keySet();
		for(String s: keyset) {
			System.out.println(s);
		}
		
		Collection<Integer> marks=map.values();
		for(Integer m: marks) {
			System.out.println(m);	
		}

	}

}
