package com.arrayExample;

import java.util.Scanner;

public class PrimeNoArray {

		public static void main (String[] args){
		    int[] arr = new int [5];
		    Scanner sc = new Scanner (System.in);
		    
		    System.out.println("Enter the elements of the array: ");
		    for(int i=0; i<5; i++)
		    {
		        arr[i] = sc.nextInt();
		    }
		   
		    for(int i=0; i<arr.length; i++){
		        boolean isPrime = true;
		        
		        
		        for (int j=2; j<arr[i]; j++){
		            
		            if(arr[i]%j==0){
		                isPrime = false;
		                break;
		            }
		        }
		        
		        if(isPrime)

		            System.out.println(arr[i] + " are the prime numbers in the array ");
		    }
		}
		}
	


