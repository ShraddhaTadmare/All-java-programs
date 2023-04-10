package com.treeMapCustom;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SortTreeMap {

	public static void main(String[] args) {
		TreeMap<Customer,Order> tmap = new TreeMap<>();
		tmap.put(new Customer(101,"Shraddha",98776644),new Order (1,"laptop",9877f));
		tmap.put(new Customer(104,"Shraddha",7896541),new Order (1,"headphones",7766f));
		tmap.put(new Customer(102,"Shraddha",3245671),new Order (1,"pendrive",8899f));
		tmap.put(new Customer(105,"Shraddha",6754321),new Order (1,"earphones",9877f));
		tmap.put(new Customer(103,"Shraddha",6543218),new Order (1,"mobile",3241f));
		
		for(Map.Entry<Customer, Order> en: tmap.entrySet())
		{
			System.out.println(en.getKey()+" "+en.getValue());
		}
		
		Set<Customer> keys = tmap.keySet();
		Iterator<Customer> itr = keys.iterator();
		while(itr.hasNext())
		{
			Customer key =itr.next();
			System.out.println(key+ " "+ tmap.get(key));
		}

	}

}
