package javaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91702\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		//launch chromr driver here syntax
		WebDriver driver = new ChromeDriver();
		
		//web driver method
		driver.get("http://www.facebook.com/");
		
		//maximize window 
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//create
		driver.findElement(By.xpath("//a [@data-testid=\"open-registration-form-button\"]")).click();
		Thread.sleep(2000);
		List<WebElement>birthdate=driver.findElements(By.xpath("//select[@title=\"Day\"]/option"));
		System.out.println(birthdate.size());
		birthdate.get(23).click();
		Thread.sleep(2000);

		
		List<WebElement>birthmonth = driver.findElements(By.xpath("//select[@id=\"month\"]/option"));
		System.out.println(birthmonth.size());
		birthmonth.get(4).click();
		Thread.sleep(2000);

		List<WebElement>birthyr = driver.findElements(By.xpath("//select[@title=\"Year\"]/option"));
		System.out.println(birthyr.size());
		 int yearIndex = 2023 - 1989;  // Assuming 2023 is the latest year in the dropdown, subtract to get index
	     birthyr.get(yearIndex).click();  // Correct index for the year 1990
		//birthyr.get(1989).click();
		Thread.sleep(2000);
		
		//driver.quit();
	}

}
