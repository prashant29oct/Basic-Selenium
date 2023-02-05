package pomPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement searchTF = driver.findElement(By.name("q"));
		Thread.sleep(4000);
		driver.navigate().refresh();
		if(searchTF.isDisplayed())
		{
			System.out.println("pass");
		}else
		{
			System.out.println("fail");
		}
		

	}

}
