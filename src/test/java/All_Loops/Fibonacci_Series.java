package All_Loops;

import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {
		int count, num=0,num1=1;
		Scanner sc=new Scanner(System.in);
	    count=sc.nextInt();
		
		for(int i=1;i<=count;++i) {
			System.out.println(num+" ");
			
			int sum=num+num1;
			num=num1;
			num1=sum;
		}

	}

}
