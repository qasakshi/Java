package Program_Using_Control_Statements;

import java.util.Scanner;

public class Array_Of_Scanner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] a=new int[4];
		
		for(int i:a) {
			System.out.println("Enter Number");
			a[i]=sc.nextInt();
			//System.out.println(a[i]);
		}

	}

}
