package com.treeMap;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class IteratorsOfhashmap {

	public static void main(String[] args) {
		TreeMap<Integer,String> tmap = new TreeMap<>();
		tmap.put(1, "HTML");
		tmap.put(3, "C++");
		tmap.put(4, "Java");
		tmap.put(8, "SQL");
		
		Set<Integer> keys = tmap.keySet();
		
		Iterator<Integer> itr = keys.iterator();
		while(itr.hasNext())
		{
			
		}
		
		
		

	}

}
