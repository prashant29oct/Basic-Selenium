package WebElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethodPractice2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.linkText("Create New Account")).click();
		WebElement radio = driver.findElement(By.xpath("//input[@type='radio' and @value='2']"));
		radio.click();
		Thread.sleep(5000);
		if(radio.isSelected())
		{
			System.out.println("is selected");
		}
		else
		{
			System.out.println("is not selected");
		}
		driver.quit();

	}

}
