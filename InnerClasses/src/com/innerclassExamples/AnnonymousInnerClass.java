package com.innerclassExamples;

interface Doable{
	public void doIt();
}

class Car{
	public void drive() {
		System.out.println("Im driving");
	}
}

abstract class cake{
	public void doBaking() {
		System.out.println("I am baking");
	}
}

public class AnnonymousInnerClass {

	public static void main(String[] args) {
		
		Doable d1 = new Doable()
		{

			@Override
			public void doIt() {
			
			   System.out.println("I am doing nothing");
			}
				
			
		};
	
	   d1.doIt();
	   
	   Car c1 = new Car();
	   
	   public void drive() {
		   System.out.println("I am driving car")
	   }
	};
	ck.void doBaking(){
		System.out.println("I am baking");
	}
};

   ck.doBaking();
	}
	
}
		
	
		
		

	


