package Switch_Case_Statements;

import java.util.Scanner;

public class Vowel_Consonant_Scanner {

	public static void main(String[] args) {
		
		boolean ivowel=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Character: ");
		char ch=sc.next().charAt(0);
		System.out.println("Char is:" + ch);
		sc.close();
		
		switch(ch) {
		case 'a':
//		ivowel=true;
//		break;
		
		case 'e':
//		ivowel=true;
//		break;
			
		case 'i':
//		ivowel=true;
//		break;
			
		case 'o':
//		ivowel=true;
//		break;
			
		case 'u':
//		ivowel=true;
//		break;
		
		case 'A':
//		ivowel=true;
//		break;
			
		case 'E':
//		ivowel=true;
//		break;
				
		case 'I':
//		ivowel=true;
//		break;
				
		case 'O':
//		ivowel=true;
//		break;
				
		case 'U':
		ivowel=true;
		//break;
				
		}
		
		if(ivowel==true) {
			System.out.println("Character is a vowel");
		}
		else {
			if((ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z'))
			System.out.println("Character is consonant");
		
		else 
			System.out.println("Input is not alphabet");
		
		}

	}

}
