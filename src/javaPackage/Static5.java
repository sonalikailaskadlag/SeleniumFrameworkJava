package javaPackage;

public class Static5 {

	public static void main(String[] args) {
		Static4 s4=new Static4(1,"Ram");
		Static4 s5=new Static4(2,"Sham");
		Static4 s6=new Static4(3,"Sita");
		Static4 s7=new Static4(4,"Sonali");
		Static4.college="IIT MUMBAI";
		s4.getResult();
		s5.getResult();
		s6.getResult();
		s7.getResult();
	}

}
