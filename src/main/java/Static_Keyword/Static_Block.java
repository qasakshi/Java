package Static_Keyword;

public class Static_Block {
	
	static int age;
	static String name;
	
	static{
		System.out.println("Block 1");
		age=12;
		name="Ram";
		
	}
	
	/*When declare multiple static block then it will execute in the sequence that it written and override the value by the next block*/
	
	static {
		System.out.println("Block 2");
		age=13;
		name="Shyam";
	}

	public static void main(String[] args) {
		System.out.println(age);
		System.out.println(name);
		

	}

}
