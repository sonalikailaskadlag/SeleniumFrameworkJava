package javaPackage;

public class logicaloperater2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10 , b=5, c=20;
System.out.println(a<b  && ++a<c);//1st condition false control not chk 2nd condition 
System.out.println(a);//not incrementing any valuse 


System.out.println(a>b  && ++a<c);//1st condition true control go and  chk 2nd condition 
System.out.println(a);// increment valu 


System.out.println(a<b  & ++a<c);
System.out.println(a);
	}

}
