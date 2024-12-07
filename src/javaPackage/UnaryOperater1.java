package javaPackage;

public class UnaryOperater1 {

	public static void main(String[] args) {
int a=1;
System.out.println(a++);//1  in ram 2 
System.out.println(a);//2    in ram 3 
System.out.println(a++);//2 ram 3 


System.out.println(++a);//4 pre increment 
System.out.println(a);//4
System.out.println(++a);//5

System.out.println(a++);//5  6
System.out.println(a);//6
System.out.println(++a);//7   
System.out.println(a);//7

System.out.println(--a);//6 

	}

}
