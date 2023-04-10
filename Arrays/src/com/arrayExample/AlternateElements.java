package com.arrayExample;

import java.util.Scanner;

public class AlternateElements {
	
	 static Scanner sc =new Scanner(System.in);
	 
	 public static void array(int arr[])
	 {
		 for(int i=0;i<arr.length;i++)
		 {
			 arr[i]=sc.nextInt();
		 }
	 }
	 
	 public static void Alternatearray(int arr[])
	 {
		 for(int i=0;i<arr.length;i++)
		 {
			 if(i%2==0)
			 {
				 System.out.println(arr[i]+"");
			 }
		 }
	 }
	 
	 

	public static void main(String[] args) {
		System.out.println("Enter size:");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		array(arr);
		
		System.out.println("After");
		Alternatearray(arr);
		
		

	}

}
