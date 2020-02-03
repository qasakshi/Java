package Array_Programs;

import java.util.HashSet;
import java.util.Set;

public class Find_Duplicate_Array {

	public static void main(String[] args) {
		
		/*Find a duplicate string using for loop*/
		String str[]= {"Java","Java","Selenium","Ruby","Selenium"};
		int str1=str.length;
		
		for(int i=0;i<str1;i++) {
			for(int j=i+1;j<str1;j++) {
				if(str[i].equals(str[j])) {
					System.out.println(str[i]);
				}
			}
		}
		
		/*Find a duplicate string using set interface*/
		String str2[]= {"Sakshi","Sakshi","Surbhi","Suruchi","surbhi"};
		
		Set<String> store=new HashSet<String>();
		for(String string:str2) {
			if(store.add(string)==false) {
				System.out.println(string);
			}
		}
	}

}
