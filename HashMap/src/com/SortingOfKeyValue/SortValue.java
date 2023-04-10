package com.SortingOfKeyValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class SortValue {
	
	public static void keySort(HashMap<String,Double> map) {
		ArrayList<Double> list = new ArrayList<>(map.values());
		Collections.sort(list);
		
		LinkedHashMap<String,Double> lmap = new LinkedHashMap<>();
		
		for(Double m : list)
		{
			
			
		}
		}

	public static void main(String[] args) {
		HashMap<String,Double> map = new HashMap<>();
		map.put("Rani", 70.9);
		map.put("Raju", 80.9);
		map.put("Rahul", 90.9);
		map.put("Rohit", 85.9);
		map.put("Ramesh", 95.9);

	}

}
