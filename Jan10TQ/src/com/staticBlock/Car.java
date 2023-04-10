package com.staticBlock;

public class Car {
	private int cno;
	private String brand;
	private String model;
	
	public Car(){
		
	}
	
public Car(int cno,String brand,String model){
	  this.cno=cno;
	  this.brand=brand;
	  this.model=model;
		
	}

public void setcno(int cno )
{	
   this.cno=cno;
}
public int getcno()
{
	return cno;
}

public void setbrand(String brand )
{	
   this.brand=brand;
}
public String getbrand()
{
	return brand;
}

public void setmodel(String model )
{	
   this.model=model;
}
public String getmodel()
{
	return brand;
}
	
	
public String toString()
{
   return "Car:"+cno+""+brand+""+model;
}
	
}
