package com.crudProject;

import java.util.Scanner;

public class MyCenter {
	
	static int pCount=0;
	static Scanner sc =new Scanner(System.in);
	
	public static void addPerson(Person p) {
		
		System.out.println("Enter registration ID");
		p.setRegid(sc.nextInt());
		
		System.out.println("Enter name");
		p.setName(sc.next());
		
		
		
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		
		
		Person[] p = new Person[20];
		     
		          int choice=0;
		
		do {
			
			System.out.println("1.Add a person");
			System.out.println("2.Delete a person");
			System.out.println("3.Update a person");
			System.out.println("4.View person by ID");
			System.out.println("5.View all persons");
			System.out.println("6.Go for the vaccination dose");
			
			choice = sc.nextInt();
			
			switch(choice) 
			{
			
			case 1: if(pCount < 20) 
			{
				p[pCount]=new Person();
				addPerson(p[pCount]);
				pCount++;
			}
			else {
				
				System.out.println("no more registrations");
			}
			
			break;
			
			}
			}while(choice!=4);	
			
			}
	
}