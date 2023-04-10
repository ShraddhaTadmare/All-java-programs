package com.Loops;

public class NumberE {
	public static void main(String[] args)   
	{  
	int num = 123, reverse = 0;  
	while(num != 0)   
	{  
	int remainder = num % 10;  
	reverse = reverse * 10 + remainder;  
	num = num/10;  
	}  
	System.out.println("The reverse of the given number is: " + reverse);  
	}  
	}  


