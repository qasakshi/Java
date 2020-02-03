package String_Programs;

public class Reverse_Integer {

	public static void main(String[] args) {
		
		/*Using proper algo*/
		long num=1223344589;
		long reverse=0;
		
		while(num!=0) {
			reverse=reverse*10+num%10;
			num=num/10;
		}
		
		System.out.println(reverse);
		
		/*Using String buffer*/
		int num1=89765;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());

	}

}
