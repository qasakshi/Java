package Program_Using_Control_Statements;

import java.util.Scanner;

public class Add_Two_Number {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int s=scan.nextInt();
		System.out.println(s);
		
		int s1=scan.nextInt();
		System.out.println(s1);
		
		scan.close();
		
		int sum=s+s1;
		System.out.println(sum);
		

	}

}
