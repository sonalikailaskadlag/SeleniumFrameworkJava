package javaPackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNG1 {
	
	@Test  //consider as a test case 
	public void test1() {
		System.out.println("test 1 ");
	}
	
	//@Test
	//public void test2() {
		//System.out.println("test 2 ");
	//}
	
	@BeforeSuite
	public void test3() {
		System.out.println("test 3 ");
	}
	
	@AfterMethod
	
	public void test4() {
		System.out.println("test 4 ");
	}
	
	

}
