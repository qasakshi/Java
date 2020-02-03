package Inheritance_Concepts;

public class InheritanceUsingConstrChild extends InheritanceUsingConstrParent{
	
	InheritanceUsingConstrChild(){
		System.out.println("This is child class constructor");
	}
	
	void display() {
		super.display();
		System.out.println("Child class method is displaying");
		
	}
	
	/*Cover the concept of Inheritance using constructor and Inheritance using Method Overriding */
	public static void main(String args[]) {
		InheritanceUsingConstrChild child=new InheritanceUsingConstrChild();
		child.display();
	}
}
