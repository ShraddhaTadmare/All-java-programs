package com.Switch;

import java.util.Scanner;

public class CheckOddEvenswitch {
	public static void main(String args[]){
	    Scanner sc=new Scanner(System.in); 
	System.out.print("Enter the number: ");
	int num=sc.nextInt();
	switch(num%2)
	{
	case 0:
	    System.out.println(num+" is a Even number");
	    break;
	case 1:
	    System.out.println(num+" is a Odd number");
	    sc.close();
	}
	   
	}
}

