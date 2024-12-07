package javaPackage;

public class UnaryOperater2 {

	public static void main(String[] args) {
int a=10;
int b=10;

System.out.println(a++);//10 ram 11
System.out.println(a++   +  ++a ); //11 r12 13 r13  11+13=24

System.out.println(a  + ++a);//13 r14 14 14r  13+14=27

System.out.println(b++  +  b--);//10 r11 11 10r  10+11=21
System.out.println(b);
	}

}
