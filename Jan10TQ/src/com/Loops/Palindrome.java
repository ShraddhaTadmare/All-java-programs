package com.Loops;

import java.util.Scanner;

public class Palindrome {
	public static void main(String args[])  
	   {  
		int  reverNum = 0, rem;
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter number: ");       
		  
		int num=sc.nextInt();  
	    int originalNum = num;
	    
	   
	    while (num != 0) {
	      rem = num % 10;
	      reverNum = reverNum * 10 + rem;
	      num /= 10;
	    }
	    
	    
	    if (originalNum == reverNum) {
	      System.out.println(originalNum + " is Palindrome.");
	    }
	    else {
	      System.out.println(originalNum + " is not Palindrome.");
	    }
	  }

}

