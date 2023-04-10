package com.LinkedList;

import java.util.LinkedList;

public class MethodsOfLinkedList {

	public static void main(String[] args) {
		
		LinkedList<String> list=new LinkedList<String>();  
		  list.add("Blue");  
		  list.add("Black");  
		  list.add("white");  
		  list.add("red");  
		  list.add("brown");
		  list.add("pink");
		  list.add("purple");
		  
		  System.out.println(list);
		  // add
		  list.addFirst("Rose pink");
		  list.add("Blue");
		  list.addLast("Blue");
		  System.out.println(list);
		  
		  //offer
		  list.offerFirst("Rose pink");
		  list.offer("light blue");
		  list.offerLast("light yellows");
		  System.out.println(list);
		  
		  //remove
		  list.remove("Rose pink");
		  System.out.println(list.poll());
		  System.out.println(list.remove(3));
		  System.out.println(list);
		  
 
		  // retrieve 
		  
		  list.get(2);
		  list.getFirst();
		  list.getLast();
		  System.out.println(list);
		  
		  // peek
		  System.out.println(list.peek());
		  System.out.println(list.peekFirst());
		  System.out.println(list.peekLast());
		  
		  
		    
		  
	}

}
