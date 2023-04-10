package com.Loops;

import java.util.Scanner;

public class SumOrOdd {
	 public static void main(String[] args) 
	    {
	        int n, sumEven = 0, sumOdd = 0;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter the number");
	        n = s.nextInt();
	       
	        for(int i = 0; i <=n; i++)
	        {
	           if(i%2==0)
	           {
	        	   sumEven=sumEven+i;
	           }
	           else
	           {
	        	   sumOdd=sumOdd+i;
	           }
	           
	           
	        }
	          System.out.println("Sum of even no:"+sumEven);
	           System.out.println("Sum of odd no:"+sumOdd);
}
}
