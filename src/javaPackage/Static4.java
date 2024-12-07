package javaPackage;

public class Static4 {
	int roll;//global
	String name;//global
	static String college = "MIT PUNE";//static v
	
	
	//constructor
Static4(int r,String n){
	roll=r;
	name=n;
	
}
public void getResult() {
	System.out.println(roll+" " +name+ " " +college);
}
}
