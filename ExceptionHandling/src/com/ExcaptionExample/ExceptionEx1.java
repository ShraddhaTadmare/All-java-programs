package com.ExcaptionExample;

public class ExceptionEx1 {

	public static void main(String[] args) {
		int x=10;
		int y=10;
		
		try  
        {  
        int sum=(x+y)/(x-y); 
        System.out.println(sum);
        }  
             
        catch(ArithmeticException e)  
        {  
            System.out.println(e);  
        }  
        System.out.println("Exception occured");  
    }  
      
 

	}


