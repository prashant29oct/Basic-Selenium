package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocatorPractice2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.className("nav-input nav-progressive-attribute")).sendKeys("iphone");
		driver.findElement(By.className("nav-input nav-progressive-attribute")).click();
		Thread.sleep(4000);
		driver.quit();
	}

}
