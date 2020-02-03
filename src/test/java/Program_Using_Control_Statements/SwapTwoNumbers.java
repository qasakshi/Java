package Program_Using_Control_Statements;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		System.out.println("Before Swapping value of a is:"+ a);
		System.out.println("Before Swapping value of b is:"+ b);
		
//		System.out.println("Swapping using addition **************:");
//		 int c=a+b;
//		 b=c-b;
//		 a=c-a;
//		 
//		System.out.println("After swapping value of a is: "+a);
//		System.out.println("After swapping value of b is: "+b);
		
//		System.out.println("Swapping using multiplication ************");
//		int d=a*b;
//		b=d/b;
//		a=d/a;
//		System.out.println("After swapping value of a is: "+a);
//		System.out.println("After swapping value of b is: "+b);

		System.out.println("Swapping using third variable *******");
		
		int t=a;
		a=b;
		b=t;
		System.out.println("After swapping value of a is: "+a);
		System.out.println("After swapping value of b is: "+b);
	}

}
