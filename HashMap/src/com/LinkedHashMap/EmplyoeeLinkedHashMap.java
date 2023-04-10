package com.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class EmplyoeeLinkedHashMap {

	public static void main(String[] args) {
		Department d1 = new Department(1,"Technical");
		Department d2 = new Department(2,"HR");
		Department d3 = new Department(3,"Sales");
		
		LinkedHashMap<Emplyoee,Department> lmap = new LinkedHashMap<>();
		lmap.put(new Emplyoee(101,"Shraddha",5600f), d3);
		lmap.put(new Emplyoee(102,"Sahili",6600f), d1);
		lmap.put(new Emplyoee(103,"Pratik",5800f), d2);
		lmap.put(new Emplyoee(104,"Snehal",8600f), d3);
		lmap.put(new Emplyoee(105,"Suraj",7900f), d1);
		
		for(Entry<Emplyoee, Department> en: lmap.entrySet())
		{
			
		}
		
		
		

	}

}
