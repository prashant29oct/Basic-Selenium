package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
	      WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://skillrary.com/");
	      
	      Thread.sleep(2000);
	      
          driver.findElement(By.linkText("GEARS")).click();
          
          Thread.sleep(10000);
          
          driver.quit();
	}

}
