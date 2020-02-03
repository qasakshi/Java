package Inheritance_Concepts;

public class PrivateEmployee extends PrivateCompany {

	/*This is the example of inheritance using encapsulation(getter and setter methods)*/
	public static void main(String args[]) {
		PrivateEmployee prvt=new PrivateEmployee();
		prvt.setsalary(40);
		prvt.setempCode(9098);
		prvt.setcompanyName("ABC");
		System.out.println(prvt.getsalary());
		System.out.println(prvt.getempCode());
		System.out.println(prvt.getcompanyName());
	}
}
