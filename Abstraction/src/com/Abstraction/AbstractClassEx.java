package com.Abstraction;

public abstract class AbstractClassEx {
	
	String brand;
	int speed;
	
	abstract void ChangeSpeed();
	
	void display()
	{
		System.out.println(brand+""+speed);
	}
	
	

	public static void main(String[] args) {
		

	}

}
