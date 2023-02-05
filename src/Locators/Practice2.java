package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
		
		if(driver.getTitle().contains("actTIME"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
			
			driver.quit();
		}
		
		
	}

}
