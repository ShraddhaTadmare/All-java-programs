package com.CustomMapLogic;

public class Emplyoee {
	private int id;
	private String name;
	private float salary;
	private Department department;
	
	public Emplyoee() {
		
	}
	public Emplyoee(int id, String name, float salary, Department department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Emplyoee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}
	
	

}
