package javaPackage;

public class globalcall {
	int c=33;
	static int b=45;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		System.out.println(b);
		System.out.println(a);
		
		globalcall g = new globalcall();
		System.out.println(g.c);
		
		

	}

}
