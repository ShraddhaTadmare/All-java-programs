package com.Loops;

import java.util.Scanner;

public class AlternateEvenNo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		int n= sc.nextInt();
		int count=1;
		int num=1;
		boolean tr=false;
		while(count>=n)
		{
           boolean flag=true;
		
           for (int i = 1; i <= n; i++)//for(int i=2;i<=num/2;i++)
			   {
        	   if (i % 2 != 0)
				{
        		   System.out.print(i + " ");
					flag=false;
					break; // to come out of for loop
				}
			  }
     		// number is prime
	    	if(flag) // flag==true
		  {
	        tr=!tr;		
	    	if(tr)// tr==true	
			{
	    	System.out.println(num);
			count++;
		
			}
		  }
	    	
		num++;
		}	

	 }

 }
