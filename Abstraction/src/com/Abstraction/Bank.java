package com.Abstraction;

public abstract class Bank {
	int id;
	String name;
	
	static float rateofinterest;
	
	public Bank()
	{
		System.out.println("default");
		id=1;
		name="SBI";
	}

	public Bank(int id, String name) {
		System.out.println("parametrised");
		this.id = id;
		this.name = name;
	}
	
	
	
	

}
