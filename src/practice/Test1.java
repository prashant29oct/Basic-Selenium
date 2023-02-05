package practice;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		driver.findElement(By.xpath("(//a[text()=' SkillRary Demo APP'])[2]")).click();
		
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		for(String id:child) {
			driver.switchTo().window(id);
		}
		WebElement element = driver.findElement(By.xpath("//a[text()='-ECommerce']"));
		if (element.isDisplayed()) {
			System.out.println("Demo page dispayed");
		}else {
			System.out.println("demo page is not dislayed");
		}
		WebElement element2 = driver.findElement(By.id("course"));
		Actions action = new Actions(driver);
		action.moveToElement(element2).perform();
		
		driver.findElement(By.xpath("(//a[text()='Selenium Training'])[1]")).click();
		Thread.sleep(3000);
		WebElement element3 = driver.findElement(By.id("add"));
		action.doubleClick(element3).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()=' Add to Cart']")).click();
		
		Alert alertPopup = driver.switchTo().alert();
		alertPopup.accept();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
		driver.findElement(By.xpath("//a[text()='Go to Cart']")).click();
		Thread.sleep(2000);
		WebElement element4 = driver.findElement(By.xpath("//b[text()='Total']"));
		
		if(element4.isDisplayed()) {
			System.out.println("item successfully added to cart");
		}else {
			System.out.println("item is not added to cart");
		}
		driver.quit();
	}

}
