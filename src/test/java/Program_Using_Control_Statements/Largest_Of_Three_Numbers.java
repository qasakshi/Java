package Program_Using_Control_Statements;

public class Largest_Of_Three_Numbers {
	
	public static void main(String args[]) {
	
	int a[]= {1200,430,930};
	
//	for(int i:a) {
//		System.out.println(i);
//	}
	
	if(a[0]>a[1] && a[0]>a[2]) {
		System.out.println(a[0]);
	}
	else if(a[1]>a[0] && a[1]>a[2] ) {
		System.out.println(a[1]);
	}
	else {
		System.out.println(a[2]);
	}

}}
