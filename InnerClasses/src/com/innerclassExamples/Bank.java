package com.innerclassExamples;

public class Bank {
	private static String bankname="SBI";
	String bankloc;
	int regNo;
	{
		bankloc="Pune";
		regNo=1234;
		
	}


  void displayBank() {
	  System.out.println(bankname+" "+bankloc+" "+regNo);
  }
  
  class Locker{
	  
	  int lockerId;
	  String custName;
	  static int lockerRent=2000;
	  
	  void enterDetails(int lockerId,String custName) {
		  this.lockerId=lockerId;
		  this.custName=custName;
		  
		  System.out.println("this locker belongs to"+custName+"with id"+lockerId+"in"+bankname);
	  }
  }
}
