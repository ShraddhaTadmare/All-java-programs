package com.HashmapPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class OccurancesArraylistHashmap {
	
	public static void Maplist(ArrayList<String>l)
	{
		HashMap<String,Integer> map = new HashMap<>();
		for(String s: l)
		{
			if(map.containsKey(s))
			map.put(s, map.get(s)+1);
	        
			else
				map.put(s, 1);
			
		}
		
		for(Entry<String, Integer> en : map.entrySet())
		{
			System.out.println(en.getKey()+" :" +en.getValue());
		}
	}

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		System.out.println(list);
		

	}

}
