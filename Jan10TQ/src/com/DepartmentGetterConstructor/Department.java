package com.DepartmentGetterConstructor;

public class Department {
	
	private int deptId;
	private String deptName;
	private String deptLocation;
	private String deptHead;
	
	
	
	public void setRollNo(int deptId)
	{
		this.deptId=deptId;
	}
	
	public int getdeptId()
	{
		return this.deptId;
	}
	
	
	public void setAdmissionNo(String deptName)
	{
		this.deptName=deptName;
	}
	
	protected String getdeptName()
	{
		return this.deptName;
	}
	
	
	public void setdeptLocation(String deptLocation)
	{
		this.deptLocation=deptLocation;
	}
	
	 public String getdeptLocation()
	{
		return this.deptLocation;
	}
	 
	 
	 public void setCourseId(String deptHead)
		{
			this.deptHead=deptHead;
		}
		
		public String getCourseId()
		{
			return this.deptHead;
		}
	 
	
}



