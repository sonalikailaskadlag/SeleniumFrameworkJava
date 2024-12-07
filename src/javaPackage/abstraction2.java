package javaPackage;

public class abstraction2 extends abstraction1 {
	void eat() {
		System.out.println("abstract method run here");
	}

	public static void main(String[] args) {

		abstraction2 a2=new abstraction2();
		a2.eat();
		a2.a();
		
	}

}
