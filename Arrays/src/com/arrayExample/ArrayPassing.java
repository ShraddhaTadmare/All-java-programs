package com.arrayExample;

import java.util.Scanner;

public class ArrayPassing {
	
	public static int Sum(int arr[]){
		int sumEven = 0;
		for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] % 2 == 0)
            {
                 sumEven+=arr[i];
            }
        }
		return sumEven;
            
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 int arr[]=new int [5];
		 
		 System.out.println("Enter array elements");
		 
		 for(int i = 0; i < arr.length; i++)
		 {
			 arr[i]=sc.nextInt();
		 }
		
     int sumEven=Sum(arr);
	}


	}

