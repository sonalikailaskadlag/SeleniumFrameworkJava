package javaPackage;

final class Encapsulation1 {
	int b=10;
	final int c=40;
	
	public void a() {
		b=15;
		System.out.println(b);
		
	}

	final void d() {
		System.out.println("hi finsl method");
	}
	public static void main(String[] args) {
		Encapsulation1 e=new Encapsulation1();
		e.a();
		e.d();
		
	}
}

//we cant inherit class of final class encap
//we cant overrride the final method 
//final means not inherite or not chg that is final 

