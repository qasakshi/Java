package Inheritance_Concepts;

public class Basic extends Basic1 {

	int value1=110;
	
	public static void main(String[] args) {
		
		/*This is the concept of how to access child class data members, when calling child class object using parent class refrence*/
		/*Instance of operator*/
		
	     Basic1 b=new Basic();
	  //   Basic1 b1=new Basic();
	   //  if(b instanceof Basic) {
	    	 System.out.println("This is new method to access child class data members " + ((Basic)b).value1);
	     //}
	     b.basicConcept();
	     System.out.println(b.value);
		}
	
	public void basicConcept1() {
		System.out.println("This is basic class of inheritance");
	}

}
