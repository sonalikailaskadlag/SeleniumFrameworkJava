package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClickSimulation {
	public static void main(String[] args) throws InterruptedException {
		//settting path of crome driver 
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\91702\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
			//launch chromr driver here syntax
			WebDriver driver = new ChromeDriver();
			
			//web driver method
			driver.get("http://demoqa.com/buttons");
			
			//maximize window 
			driver.manage().window().maximize();
			//syntax to scroll up 
			JavascriptExecutor js =(JavascriptExecutor) driver ;
			

			//way to scroll by pixel 
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,250)");
			
			//right click
			WebElement button1=driver.findElement(By.xpath("//button[@id=\"doubleClickBtn\"]"));
			Actions act =new Actions(driver);
			act.contextClick(button1).perform();
			 Thread.sleep(3000);
			 //double click
			 WebElement button2=driver.findElement(By.xpath("//button[@id=\"rightClickBtn\"]"));
				Actions act1 =new Actions(driver);
				act.contextClick(button2).perform();
			 
			 
			
	}
}
