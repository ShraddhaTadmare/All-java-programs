package ExampleOfContaintment;

public class Department {
	private int id;
	private String deptName;
	private String location;
	
	public Department() {
	super();
	
	}
	public Department(int id, String deptName,String location) {
    super();
	this.id = id;
	this.deptName = deptName;
	this.location=location;
	}
	public int getId() {
	return id;
	}
	public void setId(int id) {
	this.id = id;
	}
	
	public String getDeptName() {
	return deptName;
	}
	public void setDeptName(String deptName) {
	this.deptName = deptName;
	}
	
	public String getlocation() {
	return deptName;
	}
	public void setlocation(String location) {
	this.setlocation(location);
	}
	
	
	@Override
	public String toString() {
	return "Department [id=" + id + ", deptName=" + deptName + " ,location=" + location + "]";
	
	}
	
}

	




