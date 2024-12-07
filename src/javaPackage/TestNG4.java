package javaPackage;

import org.testng.annotations.Test;

public class TestNG4 {
	@Test (priority=-5)
	public void a() {
		System.out.println("a");
	} 
	

	@Test (enabled=false)
	public void b() {
		System.out.println("b");
	} 
	

	@Test (priority=0)
	public void c() {
		System.out.println("c");
	} 
	

	@Test (priority=-3)
	public void d() {
		System.out.println("d");
	} 

}
