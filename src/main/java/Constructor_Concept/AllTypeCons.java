package Constructor_Concept;

import Inheritance_Concepts.Basic;

public class AllTypeCons {
	
	String name;
	int age;
	
	AllTypeCons(){
		this.name="Sakshi Thakur";
	}
	
	AllTypeCons(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	void print() {
		System.out.println("Name:" +name+ " Age:"+age);
	}

	public static void main(String[] args) {
		AllTypeCons all1=new AllTypeCons();
		AllTypeCons all2=new AllTypeCons("Sakshi",20);
		ConstrChaining hn=new ConstrChaining();
		Basic bh=new Basic();
		bh.basicConcept();
		System.out.println(all1.name);
		all2.print();

	}

}
