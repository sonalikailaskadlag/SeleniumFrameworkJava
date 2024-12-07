package javaPackage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openbrowser2 {

	public static void main(String[] args) {

		//settting path of crome driver 
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\91702\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91702\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		
		//launch chromr driver here syntax
		WebDriver driver = new ChromeDriver();
		
		//web driver method
		driver.get("http://www.flipkart.com/");
		
		//maximize window 
		driver.manage().window().maximize();
	//	driver.findElement(By.xpath("//button[@title=\"Search for Products, Brands and More\"]")).sendKeys("CMF by Nothing Phone 1 (Orange, 128 GB)  (8 GB RAM)");
		driver.findElement(By.xpath("//img [@alt=\"Mobiles\"]")).click();
		driver.findElement(By.xpath("//img [@alt=\"Grocery\"]")).click();
		//driver.findElement(By.xpath("//img [@alt=\"Mobiles\"]")).click();

		
		
	}
	
}

