package loopAssignment;

import java.util.Scanner;

public class SquareofNumber {
		
		public static void main(String[] args) 
		{
			int number, square;
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter Number : ");
			number = sc.nextInt();		
			
			square = number * number;
			
			System.out.println("The Square of a Given Number:"+ square);
		}
	}

