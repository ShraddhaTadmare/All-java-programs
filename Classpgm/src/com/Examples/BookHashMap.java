package com.Examples;

import java.util.HashMap;
import java.util.Map.Entry;

public class BookHashMap {

	public static void main(String[] args) {
		HashMap<Book,Author> bmap= new HashMap<>();
		Book b1=new Book(101,"Shyamchi aai",890f);
		Book b2= new Book(103,"mrutunjay",670f);
		Book b3= new Book(104,"yugandhar",680f);
		
		bmap.put(b1,new Author(1,"sane guruji"));
		bmap.put(b2,new Author(2,"shivaji sawant"));
		bmap.put(b1,new Author(3,"sane guruji"));
		bmap.put(b3,new Author(4,"shivaji sawant"));
		
		
		bmap.put(null, new Author(0, null));
		for(Entry<Book, Author> en: bmap.entrySet())
		{
			System.out.println(en.getKey()+" ->"+en.getValue());
		}
		
       System.out.println(bmap.get(null));
       
       System.out.println(bmap.get(b1));
		
       System.out.println(bmap.get(b2));			

	}

	}


