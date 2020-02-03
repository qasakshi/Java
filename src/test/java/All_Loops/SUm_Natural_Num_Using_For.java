package All_Loops;

import java.util.Scanner;

public class SUm_Natural_Num_Using_For {

	public static void main(String[] args) {
//		int num=100, count, total=0;
//		
//		for(count=1;count<=num;count++) {
//			total=total+count;
//		}
//		System.out.println("Sum of natural numbers are: " +total);
		
		int total=0;
		Scanner sc=new Scanner(System.in);
		int a[]=new int[4];
		
		for(int i:a) {
			System.out.println("array of integers: ");
			a[i]=sc.nextInt();
			total=total+a[i];
		}
		System.out.println(total);
		

	}

}
