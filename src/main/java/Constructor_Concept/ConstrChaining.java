package Constructor_Concept;

public class ConstrChaining {
	
	String empname;
	int salary;
	String address;
	
	ConstrChaining(){
		this("Ram");
	}

	ConstrChaining(String name){
		this(name,100000);
	}
	
	ConstrChaining(String name, int sal){
		this(name, sal, "Mumbai");
	}
	
	ConstrChaining(String name, int sal, String addr) {
		this.empname=name;
		this.salary=sal;
		this.address=addr;
	}
	
	void disp() {
		System.out.println("Employee Name:" +empname);
		System.out.println("Employee Salary:" +salary);
		System.out.println("Employee Address:" +address);
	}
	
	public static void main(String args[]) {
		ConstrChaining d=new ConstrChaining();
		d.disp();
	}
}
