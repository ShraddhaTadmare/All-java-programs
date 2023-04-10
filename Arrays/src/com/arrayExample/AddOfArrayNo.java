package com.arrayExample;

import java.util.Arrays;

public class AddOfArrayNo {
	
	public static void AddArrayNo(int arr[]) {
		
		 int sum = 0,num,total = 0;  
	     
	       for (int i = 0; i < arr.length; i++) {  
	           sum = sum + arr[i];  
		
	       }
	       System.out.println(sum);  
	
	 while(sum>0) {
		num=sum%10;
		total=total+num;
		sum=sum/10;
		
	 }
	   
	 System.out.println(total);  
	 }
	public static void main(String[] args) {
		 int arr[]= {33,56,50,78,50};
		 System.out.println(Arrays.toString(arr));
		 AddArrayNo(arr);

	}

}
