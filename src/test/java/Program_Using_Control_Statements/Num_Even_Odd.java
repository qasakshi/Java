package Program_Using_Control_Statements;

import java.util.Scanner;

public class Num_Even_Odd {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int s=scan.nextInt();
		System.out.println(s);
		
		if(s%2==0) {
			System.out.println("Number is even");
		}else {
			System.out.println("Number is odd");
		}

	}

}
