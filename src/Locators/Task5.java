package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Forgot")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Return")).click();
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
