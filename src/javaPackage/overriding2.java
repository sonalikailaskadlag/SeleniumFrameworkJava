package javaPackage;

public class overriding2 extends overriding1 {
	
	
	public void eat() {
		System.out.println("eating again");
	}

	public static void main(String[] args) {
		
		overriding2 o2=new overriding2();
		o2.eat();
	}

}
