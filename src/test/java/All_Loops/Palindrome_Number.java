package All_Loops;

public class Palindrome_Number {
	
	public static void isPalindrome(int num) {
		int reverse=0;
		int sum=0;
		int temp;
		
		temp=num;
		
		while(num>0) {
			reverse=num%10;
			sum=(sum*10)+reverse;
			num=num/10;
		}
		if(temp==sum) {
			System.out.println("Palindrome Number");
		}else {
			System.out.println("Not a palindrome number");
		}
	}

	public static void main(String[] args) {
		isPalindrome(1512);
		isPalindrome(151);

	}

}
