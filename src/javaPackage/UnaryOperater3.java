package javaPackage;

public class UnaryOperater3 {

	public static void main(String[] args) {
		
		int x=15;
		int y=25;
		System.out.println(x++   + --y);//15 16r  + 24 24r  39
		System.out.println(y++ + y); // 24 25r + 25   49
		System.out.println(--x + --y); //15 + 24= 39
		System.out.println(x);//15
		System.out.println(y);//24

	}

}
