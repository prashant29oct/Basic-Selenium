package ActionMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement SearchTextField = driver.findElement(By.name("q"));
		SearchTextField.sendKeys("java");
		Thread.sleep(2000);
		SearchTextField.clear();
		Thread.sleep(2000);
		driver.quit();
		
		

	}

}
