package com.Hashmap;

import java.util.Objects;

public class Emplyoee {
	private int id;
	private String name;
	private float salary;
	
	public Emplyoee() {
		
	}

	public Emplyoee(int id, String name, float salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	
	public int hashCode() {
		return id+name.hashCode();
	}
	
	@Override
	
	public boolean equals(Object obj)
	{
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(this.getClass()!=obj.getClass())
			return false;
		
		Emplyoee emp = (Emplyoee)obj;
		return (id==emp.id)&&(name.equals(emp.name));
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

	@Override
	public String toString() {
		return "Emplyoee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	

}
