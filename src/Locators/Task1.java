package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.name("email")).sendKeys("prashantsharma9889@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Prash9889@#");
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(4000);
		
		if(driver.getTitle().contains("Facebook"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
			
		
		}
		  driver.quit();
		
		

	}

}
