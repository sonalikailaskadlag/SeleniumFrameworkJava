package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBInvalidCRED {

	public static void main(String[] args) throws InterruptedException {
	//settting path of crome driver 
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91702\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		//launch chromr driver here syntax
		WebDriver driver = new ChromeDriver();
		
		//web driver method
		driver.get("http://www.facebook.com/");
		
		//maximize window 
		driver.manage().window().maximize();
		
		//find element
		driver.findElement(By.xpath("//input [@name=\"email\"]")).sendKeys("asa@gmail.com");
		//wait time
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input [@name=\"pass\"]")).sendKeys("12345");
		//wait time
				Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
	 // Thread.sleep(2000);
	  driver.findElement(By.xpath("//a [@data-testid=\"open-registration-form-button\"]")).click();
	  Thread.sleep(2000);
	  //handle radio button
	  
	  

		
		
		
	}

}
