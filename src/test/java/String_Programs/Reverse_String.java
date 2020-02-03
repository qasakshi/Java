package String_Programs;

public class Reverse_String {

	public static void main(String[] args) {
		String s="Java Selenium";
		
		/*Reverse a string using for loop*/
		int str=s.length();
		
		String reverse="";
		
		for(int i=str-1;i>=0;i--) {
			//s.charAt(i);
			reverse=reverse+s.charAt(i);
		}
		System.out.println(reverse);
		
		/*Reverse a string using string buffer*/
		
		StringBuffer str1=new StringBuffer(s);
		System.out.println(str1.reverse());

	}
}
