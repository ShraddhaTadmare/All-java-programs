package com.CustomMapLogic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class ArrayListhashMap {
	
	public static void countMap(ArrayList<Emplyoee> al)
	{
		HashMap<Department, Integer> dmap = new HashMap<>();
		for(Emplyoee emp: al) 
		{
			Department d = emp.getDepartment();
			if(dmap.containsKey(d))
			{
				dmap.put(d, dmap.get(d)+1);
			}
			else
				dmap.put(d, 1);
		}
	}
		public static void namesMap(ArrayList<Emplyoee> al)
		{
			HashMap<Department, ArrayList<String>> dmap = new HashMap<>();
			ArrayList<String>names;
			for(Emplyoee emp : al) 
			{	
				Department d = emp.getDept();
				names = dmap.get(d);
				
				
			}
			
		}
		
	    for(Entry<Department, Integer> en:dmap.entrySet())
	    {
	    	System.out.println(en.getKey().getName()+":"+en.getValue());
	    }
	
	

	public static void main(String[] args) {
		Department d1 = new Department(1,"Technical");
		Department d2 = new Department(2,"HR");
		Department d3 = new Department(3,"sales");
		
		ArrayList<Emplyoee> list = new ArrayList<>();
		
		list.add(new Emplyoee(101,"Sahili",8000f,d1));
		list.add(new Emplyoee(102,"Pratik",8500f,d2));
		list.add(new Emplyoee(103,"arpita",9000f,d3));
		list.add(new Emplyoee(104,"Shraddh",7000f,d1));
		list.add(new Emplyoee(105,"Supriya",9500f,d3));
		
		countMap(list);
		
		
		
	}

}
