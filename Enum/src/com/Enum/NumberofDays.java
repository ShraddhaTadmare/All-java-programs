package com.Enum;

public class NumberofDays {
	  
	public enum Days{MONDAY,TUESDAY,WENESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY};

	public static void main(String[] args) {
		
		Days d1 = Days.MONDAY;
		Days d2 = Days.SUNDAY;
		
		if(d1.equals(d2)) {
			System.out.println("equals");
		}
		
		if(d1==d2) {
			System.out.println("equals");
		}
		
		//for(Days d: )
		System.out.println(d1);

	}

}
