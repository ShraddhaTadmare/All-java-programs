package com.coreJavaPgms;

import java.util.Scanner;

public class ComputeElectricityBill {
	 public static void main(String args[]) 
     {   
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the unit:");
		int unit = in.nextInt();
	

	double billpay=0;

     	if(unit<100)
	 {
	      billpay=unit*1.20;
	  }
	else if(unit<300)
	 {
	   billpay=100*1.20+(unit-100)*2;
	 }
	else if(unit>300)
	{
	    billpay=100*1.20+200*2+(unit-300)*3;
	}
    
	System.out.println("Bill to pay : " + billpay); 
   } 

}
