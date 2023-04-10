package com.ExcaptionExample;

import java.util.Scanner;

public class ThrowExample2 {
	
	
	   private int id;
	   private String name;
	   private int age;
	   
	   

	public ThrowExample2() {
		
	}
    
	public ThrowExample2(int id, String name, int age) {
		
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public class AgeException{
	
	public static void main(String[] args) {
		
		ThrowExample2 t = new ThrowExample2();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter id");
		  sc.setId(sc.nextInt());
		
         
	}

}
}