package com.ExcaptionExample;

public class NestedTry {
	
	public static void nestedTry() {
		
		int i= Integer.parseInt("PQR");
	}
	

	public static void main(String[] args) {
		
		try
		{
			nestedTry();
		}
		
		catch(Exception e) {
			System.out.println("Main:"+e);
		}
	}

}
