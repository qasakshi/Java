package Inheritance_Concepts;

public class Aggregation2 {
	
	String stdname;
	int rollnum;
	
	Aggregation2(int r,String s){
		this.rollnum=r;
		this.stdname=s;
	}

	public static void main(String[] args) {
		Aggregation1 ad=new Aggregation1(01234,"Delhi","UP");
		Aggregation2 std=new Aggregation2(123,"Sakshi");
		Aggregation2 std1=new Aggregation2(1234,"Sakshi Thakur");
		System.out.println(ad.city);
		System.out.println(ad.state);
		System.out.println(ad.zipcode);
		System.out.println(std.rollnum);
		System.out.println(std.stdname);
		System.out.println(std1.rollnum);
		System.out.println(std1.stdname);

	}

}
