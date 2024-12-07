package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	public static void main(String[] args) throws InterruptedException {
		//settting path of crome driver 
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\91702\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
			//launch chromr driver here syntax
			WebDriver driver = new ChromeDriver();
			
			//web driver method
			driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");
			
			//maximize window 
			driver.manage().window().maximize();
			//syntax to scroll up 
			JavascriptExecutor js =(JavascriptExecutor) driver ;
			

			//way to scroll by pixel 
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,250)");
			
			//find source and target elements while using drag drop 
			WebElement SourceElement =driver.findElement(By.id("box6"));
			WebElement TargetElement=driver.findElement(By.id("box106"));
			
			
			Actions act =new Actions(driver);
			act.dragAndDrop(SourceElement, TargetElement).perform();
			
			

			//find source and target elements while using drag drop 
			WebElement SourceElement1 =driver.findElement(By.id("box1"));
			WebElement TargetElement1=driver.findElement(By.id("box101"));
				

			Actions act1 =new Actions(driver);
			act.dragAndDrop(SourceElement1, TargetElement1).perform();
			

			//find source and target elements while using drag drop 
			WebElement SourceElement2 =driver.findElement(By.id("box5"));
			WebElement TargetElement2=driver.findElement(By.id("box105"));
				

			Actions act2 =new Actions(driver);
			act.dragAndDrop(SourceElement2, TargetElement2).perform();
			

			//find source and target elements while using drag drop 
			WebElement SourceElement3 =driver.findElement(By.id("box7"));
			WebElement TargetElement3=driver.findElement(By.id("box107"));
				

			Actions act3 =new Actions(driver);
			act.dragAndDrop(SourceElement3, TargetElement3).perform();
			
			
			
			

			//find source and target elements while using drag drop 
			WebElement SourceElement4 =driver.findElement(By.id("box3"));
			WebElement TargetElement4=driver.findElement(By.id("box103"));
				

			Actions act4 =new Actions(driver);
			act.dragAndDrop(SourceElement4, TargetElement4).perform();
			

			//find source and target elements while using drag drop 
			WebElement SourceElement5 =driver.findElement(By.id("box4"));
			WebElement TargetElement5=driver.findElement(By.id("box104"));
				

			Actions act5 =new Actions(driver);
			act.dragAndDrop(SourceElement5, TargetElement5).perform();
			

			//find source and target elements while using drag drop 
			WebElement SourceElement6 =driver.findElement(By.id("box2"));
			WebElement TargetElement6=driver.findElement(By.id("box102"));
				

			Actions act6 =new Actions(driver);
			act.dragAndDrop(SourceElement6, TargetElement6).perform();
			
			
			
	}
}
