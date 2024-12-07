package javaPackage;

public class Static6 {
	static int z=10;
	
	public static void a() {
		z=20;
		System.out.println(z);
	}
	
	public void b() {
		z=30;
		System.out.println(z);
	}

	public static void main(String[] args) {
		
		
		//Static6 s=new Static6();
		//a();
		//s.b();
		System.out.println(z);//execution start from main method 
	}

}
