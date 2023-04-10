package com.arrayExample;

import java.util.Arrays;

public class HalfSorting {
	
	  
	static void printOrder(int[] arr)
	{
	    
	    Arrays.sort(arr);
	 
	   
	    for (int i = 0; i < arr.length / 2; i++)
	        System.out.print(arr[i]+" ");
	 
	   
	    for (int j = arr.length - 1; j >= arr.length/ 2; j--)
	    System.out.print(arr[j]+" ");
	     
	}
	 
	
	
	{
	    int[] arr = { 5, 4, 6, 2, 1, 3, 8, 9, 7 };
	    int n = arr.length;
	    printOrder(arr);
	 
	}

	public static void main(String[] args) {
		int arr[]= {7,0,1,4,6,8};
		
	

	}

}
