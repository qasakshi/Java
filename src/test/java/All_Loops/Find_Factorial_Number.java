package All_Loops;

import java.util.Scanner;

public class Find_Factorial_Number {

	public static void main(String[] args) {
		int fact=1;
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println(fact);

	}

}
