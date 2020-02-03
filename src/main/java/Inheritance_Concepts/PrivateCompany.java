package Inheritance_Concepts;

public class PrivateCompany {
	private int salary;
	private int empCode;
	private String companyName;
	
	public int getsalary() {
		return salary;
	}
	
	protected int getempCode() {
		return empCode;
	}
	
	public String getcompanyName() {
		return companyName;
	}
	
	public void setsalary(int salary) {
		this.salary=salary;
	}
	
	protected void setempCode(int empCode) {
		this.empCode=empCode;
	}
	protected void setcompanyName(String companyName) {
		this.companyName=companyName;
	}

}
