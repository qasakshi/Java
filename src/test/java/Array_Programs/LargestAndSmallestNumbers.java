package Array_Programs;

import java.util.Arrays;

public class LargestAndSmallestNumbers {

	public static void main(String[] args) {
		
		int number[]= {0,1,23,45,-7865};
		
		int largest=number[0];
		int smallest=number[0];
		
		for(int i=1;i<number.length;i++) {
			if(number[i]>largest) {
				largest=number[i];
			}
			else if(number[i]<smallest){
				smallest=number[i];
			}
		}
		
		System.out.println(Arrays.toString(number));
		System.out.println(largest);
		System.out.println(smallest);

	}

}
