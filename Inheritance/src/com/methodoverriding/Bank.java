package com.methodoverriding;

public class Bank {
	
	    int getRateOfInterest()
	      {
	    	return 0;
	    	}
	}
	 
	class SBI extends Bank{
	    int getRateOfInterest()
	    {
	    	return 5;
	    }
	}
	 
	class CANARA extends Bank{
	    int getRateOfInterest()
	    {
	    	return 6;
	    }
	}
	 
	class AXIS extends Bank{
	    int getRateOfInterest()
	    {
	    	return 7;
	    }
	}
	 
	class BankTest
	
	   {
	    public static void main(String args[])
	    {
	    SBI s = new SBI();
	    CANARA c = new CANARA();
	    AXIS a = new AXIS();
	    System.out.println("Rate of Interest in SBI is "+s.getRateOfInterest()+"%");
	    System.out.println("Rate of Interest in CANARA is "+c.getRateOfInterest()+"%");
	    System.out.println("Rate of Interest in AXIS is "+a.getRateOfInterest()+"%");
	}
	}
	 


