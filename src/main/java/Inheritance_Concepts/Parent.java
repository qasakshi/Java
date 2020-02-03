package Inheritance_Concepts;

public class Parent {
	
	/*These members are accessed when we create child class object inside child class*/
	String lastName="Thakur";
	String businessProperties="Medical";
	void language() {
		System.out.println("Hindi");
	}
	
	/*These members are accessed when we call child class object using parent class reference inside child class*/
	String homeTown="Dindori";
	String familyType="jointFamily";
	
	/*This is the example of HAS-A Relationship*/
	public static void main(String args[]) {
		//Parent parent=new Parent();
		Child child=new Child();
		child.learning();
		System.out.println(child.childName);
		
	}

}
