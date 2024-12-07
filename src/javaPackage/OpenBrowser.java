package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) {

		
		//settting path of crome driver 
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91702\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		//launch chromr driver here syntax
		WebDriver driver = new ChromeDriver();
		
		//web driver method
		driver.get("http://www.facebook.com/");
		
		//maximize window 
		driver.manage().window().maximize();
		
		//find element codec
		driver.findElement(By.xpath("//input [@name=\"email\"]")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input [@name=\"pass\"]")).sendKeys("12345@Aa");
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
	}

}
