package com.SortingOfKeyValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SortKey {
	
	public static void keySort(HashMap<String,Double> map) {
		ArrayList<String> list = new ArrayList<>(map.keySet());
		Collections.sort(list);
		
		LinkedHashMap<String,Double> lmap = new LinkedHashMap<>();
		for(String s: list) {
			lmap.put(s, map.get(s));
		}
		
		for(Map.Entry<String, Double> en : lmap.entrySet()) 
		{
			System.out.println(en.getKey() + " "+en.getValue());
		}
				
		
	}

	public static void main(String[] args) {
		HashMap<String,Double> map = new HashMap<>();
		map.put("Rani", 70.9);
		map.put("Raju", 80.9);
		map.put("Rahul", 90.9);
		map.put("Rohit", 85.9);
		map.put("Ramesh", 95.9);
		
		keySort(map);
		

	}

}
