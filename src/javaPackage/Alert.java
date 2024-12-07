package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String[] args) throws InterruptedException {
		//settting path of crome driver 
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\91702\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
			//launch chromr driver here syntax
			WebDriver driver = new ChromeDriver();
			
			//web driver method
			driver.get("https://demoqa.com/alerts");
			
			//maximize window 
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			//scroll down 
			js.executeScript("window.scrollBy(0,450)");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//button [@id=\"timerAlertButton\"]")).click();
			
			//alert
			driver.switchTo().alert().accept();
			System.out.println("alert is accepted");
			
//dismiss alert
			driver.findElement(By.xpath("//button [@id=\"timerAlertButton\"]")).click();

			driver.switchTo().alert().dismiss();
			System.out.println("dismiss alert");
}
}



