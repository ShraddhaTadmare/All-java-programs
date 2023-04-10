package com.ArrayOfObject;

import java.util.Scanner;

public class BookTestConstructor {

	public static void main(String[] args) {
		Book book[]= new Book[3];
		Scanner sc= new Scanner(System.in);
		
		for(int i=0;i<book.length;i++)
		{
			book[i]= new Book();
			
			System.out.println("Enter the id:");
			book[i].setId(sc.nextInt());
			
			System.out.println("Enter the name:");
			book[i].setName(sc.next());
			
			System.out.println("Enter the marks:");
			book[i].setPrice(sc.nextFloat());
			
		}
		
		for(Book b:book)
		{
			System.out.println(b);
		}
		
	}

	}


