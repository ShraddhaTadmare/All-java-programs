package com.arrayExample;

import java.util.Scanner;

public class MinAndMaxArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	       int arr[]=new int[10];
	       
	       System.out.println("Enter elements in array");
	       int min=Integer.MAX_VALUE;
	       int max=Integer.MIN_VALUE;
	       int n = 10;
		     for(int i=0;i<=arr.length;i++)
	       {
	         arr[i]=sc.nextInt();
	         if(arr[i]<min)
	           {
	           min=arr[i];
	           }
	         if(arr[i]>max)
	         {
	           max=arr[i];
	         }
	       }
	       System.out.println("Maximum element is "+max);
	       System.out.println("Minimum element is "+min);

	}

}
