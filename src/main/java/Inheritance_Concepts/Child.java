package Inheritance_Concepts;

public class Child extends Parent {
      String childName="Sakshi";	
      String education="Graduation";
      
	public static void main(String args[]) {
		
		/* This is the concept of inheritance where we access parent class members by creating child class object only */
		Child child=new Child();
		System.out.println(child.childName);
		System.out.println(child.lastName);
		System.out.println(child.businessProperties);
		child.language();
		child.occupation();
		//((Child) child).occupation();
		
		/* This is the concept of inheritance where we access parent class members by calling the child class object using parents class
		 * Reference */
		Parent child1=new Child();
		System.out.println(child1.homeTown);
		System.out.println(child1.familyType);
		//child1.education;//Child class variables can not be called
		((Child) child1).learning();
		
		
	String testing = ((Child)child1).education;
		
		//((Child)child1).education;
		
		//((Child) child1).education();//We can access child claa data members in this case only using instanceof operator
	}
	
	void occupation() {
		System.out.println("My Occupation is " + "IT Engineer");
	}
	
	public void learning() {
  	  System.out.println("I'm learning inheritance");
    }
}
