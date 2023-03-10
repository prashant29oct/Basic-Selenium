package Actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseHoverPractice1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement coursenlink = driver.findElement(By.id("course"));
		
		Actions a = new Actions(driver);
		a.moveToElement(coursenlink).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='wrappers']/a[1]")).click();
		Thread.sleep(2000);
		
		driver.quit();
		
		
		

	}

}
