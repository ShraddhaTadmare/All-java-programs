package com.coreJavaPgms;

import java.util.Scanner;

public class LargestNumber {
	
	public static void main(String[]args) {
		
		int n1,n2,n3;
		System.out.println("Enter three numbers");
		Scanner sc = new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
		
		if (n1 > n2 && n1 > n3)  
			System.out.println("The largest number is: "+n1);
		
		else if(n2 > n1 && n2 > n3)
			System.out.println("The largest number is: "+n2);
		
		else if(n3 > n1 && n3 > n2)
			System.out.println("The largest number is: "+n3);
		
		else  
			System.out.println("The numbers are same.");  
		
		
	}

}
