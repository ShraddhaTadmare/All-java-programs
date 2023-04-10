package com.method;

public class FactorialMethod {
	static long factorial(int n)
	{
	int i,fact=1;
	for(i=1; i<=n; i++){
	fact=fact*i;
	}
	
	return fact; 
	
	}
		public static void main(String args[]){ 
		
		//int num = 0;
		System.out.println(factorial(5));
		}
		
		}

