package com.ExcaptionExample;

import java.util.Scanner;

public class BinaryException {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter binary number");
		
		int num= sc.nextInt();
		while(num>0) 
		  {
			if((num % 10!=1)&&(num%10!=0)){
				throw new ArithmeticException("Not a binary number");
			}
		    num/=10;
		
		}
		
		System.out.println("Binary number is valid");
		
		sc.close();

	}

}
