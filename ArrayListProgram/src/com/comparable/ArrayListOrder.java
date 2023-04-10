package com.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListOrder {

	public static void main(String[] args) {
		 ArrayList<Order> olist= new ArrayList<>();
	       olist.add(new Order(101,"Hamlet",780f));
	       olist.add(new Order(107,"Ramayan",800f));
	       olist.add(new Order(107,"Geeta",760f));
	       olist.add(new Order(108,"HarryPotter",1050f));
	       olist.add(new Order(105,"The Secret",960f));
	       
	       Iterator<Order> itr = olist.iterator();
	      while(itr.hasNext())
	      {
	    	  System.out.println(itr.next());
	      
	      }
	      Collections.sort(olist);
	       
	       System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
	       
	       for( Order o :olist)
	       {
	    	   System.out.println(o);
	       }

		}
	}


