package Array_Programs;

public class Missing_Number {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,6};
		int arr1=arr.length;
		int sumofarr=0;
		int sumofarr1=0;
		
		for(int i=0;i<arr1;i++) {
			sumofarr=sumofarr+arr[i];
		}
		System.out.println(sumofarr);
		
		for(int i=1;i<=6;i++) {
			sumofarr1=sumofarr1+i;
		}
		System.out.println(sumofarr1);
		
		System.out.print("Missing number is: ");
		System.out.print(sumofarr1-sumofarr);

	}

}
