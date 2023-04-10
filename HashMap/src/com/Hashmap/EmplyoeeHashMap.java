package com.Hashmap;

import java.util.HashMap;
import java.util.Map.Entry;

public class EmplyoeeHashMap {

	public static void main(String[] args) {
		
		HashMap<Emplyoee,String> e = new HashMap <>();
		e.put(new Book(101,"Ramayan",890f), "Religious");
		e.put(new Book(102,"HarryPotter",1090f),"Fiction");
	    e.put(new Book(102,"HarryPotter",1090f),"Fantasy");
		
		for(Entry<Emplyoee, String> en: e.entrySet())
		{
			System.out.println(en.getKey()+" ->"+en.getValue());
		}

	}

}
