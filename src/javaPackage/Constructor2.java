package javaPackage;

public class Constructor2 {
	
	Constructor2(){
		System.out.println("this is default constructor");
	}
	Constructor2(int a){
		System.out.println("this is parameterized");
	}
	Constructor2(String s){
		System.out.println("this is string");
	}

	public static void main(String[] args) {
		Constructor2 c1=new Constructor2();
		Constructor2 c2=new Constructor2(2);
		Constructor2 c3=new Constructor2("sonali");

	}

}
