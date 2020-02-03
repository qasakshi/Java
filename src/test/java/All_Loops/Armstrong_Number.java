package All_Loops;

public class Armstrong_Number {
	
	public static void isArmstrongNumber(int num) {
		int cube=0;
		int reverse;
		int temp;
		
		temp=num;
		
		while(num>0) {
			reverse=num%10;
			num=num/10;
			cube=cube+(reverse*reverse*reverse);
		}
		if(temp==cube) {
			System.out.println("Armstrong Number");
		}else {
			System.out.println("Not an Armstrong Number");
		}
	}

	public static void main(String[] args) {
		isArmstrongNumber(153);
		isArmstrongNumber(0);
		isArmstrongNumber(6754321);
		isArmstrongNumber(-121);

	}

}
