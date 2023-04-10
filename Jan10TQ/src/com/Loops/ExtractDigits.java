package com.Loops;

public class ExtractDigits {

	public static void main(String[] args) {
		 int number = 110102;
		 
	        while (number > 0) {
	            int remainder = number % 10;
	            number = number / 10;
	            System.out.println(remainder);
	        }
	}
	

}
