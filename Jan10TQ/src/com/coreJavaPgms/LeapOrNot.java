package com.coreJavaPgms;

import java.util.Scanner;

public class LeapOrNot {

	public static void main(String[] args) {
		int year;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the year");
		year = sc.nextInt();

		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))

			System.out.println(year + " is a leap year");
		else
			System.out.println(year + " is not a leap year");

	}
}