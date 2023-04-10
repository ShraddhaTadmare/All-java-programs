package com.crudProject;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class Person {
	int regid;
	String name;
	Date birthDate;
	int age;
	Date vaccine[];
	SimpleDateFormat f1 = new SimpleDateFormat("dd/MM/yyyy");
	
	public Person() {
		vaccine = new Date[3];
		
	}
	public Person(int regid, String name, Date birthDate, int age) {
		this();
		this.regid = regid;
		this.name = name;
		this.birthDate = birthDate;
		this.age = age;
		
	}
	public int getRegid() {
		return regid;
	}
	public void setRegid(int regid) {
		this.regid = regid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date[] getVaccine() {
		return vaccine;
	}
	public void setVaccine(Date[] vaccine) {
		this.vaccine = vaccine;
	}
	@Override
	public String toString() {
		return "Person [regid=" + regid + ", name=" + name + ", age=" + age + ",vaccine="+Arrays.toString(vaccine)+"]";
	}
	

}
