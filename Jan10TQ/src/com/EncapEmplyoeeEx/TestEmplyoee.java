package com.EncapEmplyoeeEx;

import java.util.Scanner;

public class TestEmplyoee {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		   Employee e1=new Employee();
		   System.out.println("Enter Id:");
	        e1.setEmployeeId(sc.nextInt());
	        
	        System.out.println("Enter name:");
	        e1.setEmployeeName(sc.next());
	        
	        System.out.println("Enter salary:");
	        e1.setEmployeeSalary(sc.nextDouble());
	        
	        Employee e2=new Employee();
			   System.out.println("Enter Id:");
		        e2.setEmployeeId(sc.nextInt());
		        
		        System.out.println("Enter name:");
		        e2.setEmployeeName(sc.next());
		        
		        System.out.println("Enter salary:");
		        e2.setEmployeeSalary(sc.nextDouble());
	        
	        
	   
	 
	        System.out.println("=============");
	        System.out.println("Employee Id: "+e1.getId());
	        System.out.println("Employee Name: "+e1.getEmployeeName());
	        System.out.println("Employee Department: "+e1.getEmployeeSalary());
	        
	        
	        System.out.println("=============");
	        System.out.println("Employee Id: "+e2.getId());
	        System.out.println("Employee Name: "+e2.getEmployeeName());
	        System.out.println("Employee Department: "+e2.getEmployeeSalary());

	}

}
