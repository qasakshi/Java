package Program_Using_Control_Statements;

public class SwapTwoString {

	public static void main(String[] args) {
		String str1="Hello";
		String str2="World";
		
		System.out.println("Before swapping string is: "+str1);
		System.out.println("Before swapping string is: "+str2);
		
		str1=str1+str2;
		
		str2=str1.substring(0,str1.length()-str2.length());
		
		str1=str1.substring(str2.length());
		
		System.out.println("********************");
		
		System.out.println("After swapping string is: "+str1);
		System.out.println("After swapping string is: "+str2);

	}

}
