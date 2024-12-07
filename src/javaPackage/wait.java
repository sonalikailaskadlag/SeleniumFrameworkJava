package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wait {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\91702\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		//launch chromr driver here syntax
		WebDriver driver = new ChromeDriver();
		
		//web driver method
		driver.get("http://www.facebook.com/");
		
		//maximize window 
		driver.manage().window().maximize();
		//wait time
				Thread.sleep(2000);
		
		//find element
		driver.findElement(By.xpath("//input [@name=\"email\"]")).sendKeys("asa@gmail.com");
		//wait implicit 
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input [@name=\"pass\"]")).sendKeys("12345");
		//wait time
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
	 // Thread.sleep(2000);
	}

}
