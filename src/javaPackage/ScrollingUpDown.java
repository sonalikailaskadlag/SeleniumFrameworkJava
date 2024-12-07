package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingUpDown {
	
	public static void main(String[] args) throws InterruptedException {
		//settting path of crome driver 
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\91702\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
			//launch chromr driver here syntax
			WebDriver driver = new ChromeDriver();
			
			//web driver method
			driver.get("https://demoqa.com/alerts");
			
			//maximize window 
			driver.manage().window().maximize();
			//syntax to scroll up 
			JavascriptExecutor js =(JavascriptExecutor) driver ;
			
			//1st way to scroll by pixel 
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,450)");
			
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,-250)");
			
			//2nd way to scroll to find web elemrent directly
			
			Thread.sleep(3000);
			WebElement demo = driver.findElement(By.xpath("//button[@id=\"confirmButton\"]"));
			js.executeScript("arguments[0].scrollIntoView()", demo);
			
			//3rd way to scroll to bottom 
			Thread.sleep(3000);
            js.executeScript("window.scrollTo(document.body.scrollHeight)");
            
            //delete cookies 
            
            driver.manage().deleteAllCookies();
            
            
            
			

			
			

}
}