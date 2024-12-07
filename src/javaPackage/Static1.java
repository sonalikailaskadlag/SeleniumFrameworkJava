package javaPackage;

public class Static1 {
	
	static int a=10;
	static int b=1000;
	int c=111;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(a);
		System.out.println(Static1.a);
		Static1 ss=new Static1(); //global v call non static variable 
		System.out.println(ss.c);

	}

}
