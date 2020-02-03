package Static_Keyword;

public class Static_Variable {
	
	public static int num;
	
	public static void main(String[] args) {
		Static_Variable ob1=new Static_Variable();
		Static_Variable ob2=new Static_Variable();
		
		/*Whenever we shared the single copy of static variable among multiple objects then it will overWrite the value of 
		 * static variable */
		
		ob1.num=12;
		ob2.num=90;
		
		System.out.println(ob1.num);
		System.out.println(ob2.num);

	}

}
