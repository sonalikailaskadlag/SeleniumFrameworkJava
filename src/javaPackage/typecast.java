package javaPackage;

public class typecast {

	public static void main(String[] args) {
		
		double b=5.2;
		int a=(int) b;
		System.out.println(a);
		System.out.println(b);
		
		// narrowing manualy str to int 
		String v="10";
		int k=Integer.parseInt(v);
		System.out.println(k);
		
		//strg to int 
		
		int aa=10;
		String s=String.valueOf(aa);
		System.out.println(s);
		//windining auto
		int a1=10;
		double b1=a1;
		System.out.println(b1);

		

	}

}
