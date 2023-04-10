package com.project;

import java.util.Scanner;

public class TestConstructor {
	
static Scanner sc = new Scanner(System.in);
	
	public static void enterDetails(Book b)
	{
		System.out.println("Enter the id:");
		b.setId(sc.nextInt());
		
		System.out.println("Enter the name:");
		b.setName(sc.next());
		
		System.out.println("Enter the marks:");
		b.setPrice(sc.nextFloat());
		
				
	}

	public static void main(String[] args) {
	   
		

	}

}
