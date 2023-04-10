package com.Demo;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Itrators {

	public static void main(String[] args) {
		  Vector<String> list=new Vector<String>(); 
          list.add("Ravi");
          list.add("Vijay");  
          list.add("Ravi");  
          list.add("Ajay");  

          System.out.println(list);
          
           
             Iterator<String> itr=list.iterator();  
             while(itr.hasNext())  
             {  
                 String str=itr.next();
                 if(str.equals("Ravi")) {
                 list.remove("Ravi");
                 
             }
             }
             System.out.println(list);
             
             
             System.out.println("using for loop");  
             for(int i=0;i<list.size();i++)  
             {  
              System.out.println(list.get(1));     
             }  
	}
	
	}
	
	


