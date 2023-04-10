package com.Enum;

import java.util.Scanner;

public class BookMovieTickets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose ticket type:");
		System.out.println("1.STANDARD");
		System.out.println("2.PREMIUM");
		System.out.println("3.RECLINER");
		
		int seatType = sc.nextInt();
		System.out.println("Enter total seats");
		int noOfSeats = sc.nextInt();
		
		MovieSeats ms = null;
		
		Switch(seatType){
			case1:ms.MovieSeats.STANDARD();
			
		}
		
		

	}

	private static void Switch(int seatType) {
		// TODO Auto-generated method stub
		
	}

}
