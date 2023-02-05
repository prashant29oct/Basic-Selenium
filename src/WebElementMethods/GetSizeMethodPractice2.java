package WebElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeMethodPractice2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement pagelogo = driver.findElement(By.xpath("//img[@alt='Facebook']"));
		Dimension size = pagelogo.getSize();
		int height = size.getHeight();
		int width = size.getWidth();
		System.out.println(height);
		System.out.println(width);
		driver.quit();

	}

}
