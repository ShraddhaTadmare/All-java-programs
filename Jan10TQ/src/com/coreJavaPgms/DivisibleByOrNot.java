package com.coreJavaPgms;

import java.util.Scanner;

public class DivisibleByOrNot {
	
	public static void main(String[]args)
	{
      
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		n= s.nextInt();
		
		if(n%5==0&&n%11==0)
		{
			System.out.println(n+" Is Divisiable by 5 and 11");
		}
		else
		{
			System.out.println(n+" Is Not Divisiable by 5 and 11");
		}
		
 }
}