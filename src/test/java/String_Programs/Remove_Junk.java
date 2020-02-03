package String_Programs;

public class Remove_Junk {

	public static void main(String[] args) {
		String str="!@#$%^&*()_+TestingSeleniumJava";
		
		/*Why we are storing new string into already stored variable because string is immutable*/
		str=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);

	}

}
