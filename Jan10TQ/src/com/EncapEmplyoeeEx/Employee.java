package com.EncapEmplyoeeEx;

public class Employee {
	 
	private  int id;
	private String name;
	private double salary;
	
	//getter and setter
	
	 public void setEmployeeId(int id) {
	    this.id = id;
	 }
	    
	 public int getId() {
        return this.id;
    }
	 
	 
	 public void setEmployeeName(String name) {
		    this.name = name;
		 }
		    
		 public String getEmployeeName() {
	        return this.name;
	    }
		 
	 
	 public void setEmployeeSalary(double salary) {
		    this.salary = salary;
		 }
		    
		 public double getEmployeeSalary() {
	        return this.salary;
	    }  

}
