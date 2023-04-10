package com.Loops;

import java.util.Scanner;

public class BillTotal {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		float totalBill, totalCost, discount;
	
	       System.out.println("Enter a customor name:");
		   String name = sc.nextLine();
		 
		 
		    System.out.println(" Enter the Item Name :");
	        String itmName = sc.next();
	        System.out.println("Please Enter the Item rate :");
	        int amt1 =  sc.nextInt();
	        System.out.println("Please Enter the Item Quantity :");
	        int quant1 = sc.nextInt();
	        
	        int Total1= amt1*quant1;
	        
	        System.out.println("Enter the Item Name :");
	        String itmName2 = sc.next();
	        System.out.println("Please Enter the Item rate :");
	        int amt2 =  sc.nextInt();
	        System.out.println("Please Enter the Item Quantity :");
	        int quant2 = sc.nextInt();
	        
	        int Total2= amt2*quant2;
	        
	        System.out.println("Enter the Item Name :");
	        String itmName3 = sc.next();
	        System.out.println("Please Enter the Item rate :");
	        int amt3 =  sc.nextInt();
	        System.out.println("Please Enter the Item Quantity :");
	        int quant3 = sc.nextInt();
	        
	        int Total3= amt3*quant3;
	       
	       
		  
	        totalBill= Total1+Total2+Total3;
	        		
		 if (totalBill >= 3000)
		 {
			 discount = (totalBill *20 )/ 100;
			 totalCost = totalBill - discount;
		 } 
		 
	        else if (totalBill >= 2000) 
	        {
	        	discount = (totalBill *15 )/ 100;
	        	totalCost = totalBill - discount;
	        }
		    
	        else if (totalBill >=1000) 
	        {
	        	discount = (totalBill *10 )/ 100;
	        	totalCost = totalBill - discount;
	        }
	        else
	        {
	        	discount = (totalBill*5)/100;
	        	totalCost = totalBill - discount;
	        }
	        

	         
		     totalCost = (totalBill - discount);
	         
	         
	         System.out.println("Name: " + name);
	         System.out.println("Total bill: " + totalBill); 
	         System.out.println("Discount Bill: " + discount); 
	         System.out.println("Payable Amount: " +totalCost );
	        			 

	}

}

