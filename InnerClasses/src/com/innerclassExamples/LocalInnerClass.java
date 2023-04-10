package com.innerclassExamples;

class outer{
	private static int data=10;
	void display() {
		class LocalInner{
			private int value=20;
			static void show1() {
				System.out.println(data);
				//System.out.println(value);	
			}
		 void show() {
			 
			 System.out.println(data);
			 System.out.println(value);
		 }	
		}
		
		
	}
}


public class LocalInnerClass {
	
	

	public static void main(String[] args) {
		

	}

}
