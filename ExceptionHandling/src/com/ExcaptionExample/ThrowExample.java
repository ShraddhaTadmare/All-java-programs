package com.ExcaptionExample;

public class ThrowExample {

	
		 public static void validate(int age) {  
		        if(age<18) {  
		           
		            throw new ArithmeticException("Person is not eligible");    
		        }  
		        else {  
		            System.out.println("Person is eligible");  
		        }  
		    }  
		    
		    public static void main(String args[]){  
		       
		        validate(13);  
		        System.out.println("another code");    
		  }    
		   

	}


