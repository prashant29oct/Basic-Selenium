package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("7054078138");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Prash9889@#");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		Thread.sleep(10000);
		
		driver.quit();
	}

}
