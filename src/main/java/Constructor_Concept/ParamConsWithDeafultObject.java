package Constructor_Concept;

public class ParamConsWithDeafultObject {
	
	int var;
	
//	ParamConsWithDeafultObject(int num){
//		var=num;
//	}

	public int getvalue() {
		return var;
	}
	public static void main(String[] args) {
		ParamConsWithDeafultObject a1=new ParamConsWithDeafultObject();
		System.out.println("Value of var is: " + a1.getvalue());

	}

}
