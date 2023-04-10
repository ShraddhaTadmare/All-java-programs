package com.ArrayOfObject;

import java.util.Scanner;

public class BookTestGetterSetter {
		static Scanner sc = new Scanner(System.in);
		
		public static void enterBookDetails(Book b)
		{
			System.out.println("Enter the id:");
			b.setId(sc.nextInt());
			
			System.out.println("Enter the name:");
			b.setName(sc.next());
			
			System.out.println("Enter the price:");
			b.setPrice(sc.nextFloat());
			
					
		}
			
		public static void printDetails(Book bk[])
		{
			for(Book b:bk)
			{
				System.out.println(b);
			}
		}
		
		public static void priceSorting(Book bk[])
		{
			Book b=new Book();
			
		}
			
			public static void main(String args[])
			{
				
				Book book[]= new Book[5];
				
				for(int i=0;i<book.length;i++)
				{
					book[i]= new Book();
					
					enterBookDetails(book[i]);
					
				}
				
				printDetails(book);
			
			}
			
			
		}


	


