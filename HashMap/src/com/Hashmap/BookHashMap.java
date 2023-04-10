package com.Hashmap;

import java.util.HashMap;
import java.util.Map.Entry;

public class BookHashMap {

	public static void main(String[] args) {
		
		HashMap<Book,String> bmap = new HashMap <>();
		bmap.put(new Book(101,"Ramayan",890f), "Religious");
		bmap.put(new Book(102,"HarryPotter",1090f),"Fiction");
	    bmap.put(new Book(102,"HarryPotter",1090f),"Fantasy");
		
		for(Entry<Book, String> en: bmap.entrySet())
		{
			System.out.println(en.getKey()+" ->"+en.getValue());
		}
		
	}

}
