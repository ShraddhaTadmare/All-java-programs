package com.Loops;

import java.util.Scanner;

public class MultiplyOfDigit {

	public static void main(String[] args) {
		 int  n, num, product = 1;
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number=");
	        n = sc.nextInt();
	        num = n;
	        while (num!=0)
	        {
	            product = product*(num%10);
	            num=num/10;
	        }
	        System.out.println(product);
	}

}
