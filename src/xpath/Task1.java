package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("7054078138");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Prash9889@#");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(10000);
		driver.quit();

	}

}
