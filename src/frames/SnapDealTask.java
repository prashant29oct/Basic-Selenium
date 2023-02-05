package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDealTask {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement signin = driver.findElement(By.xpath("//span[text()='Sign In']"));
        Actions a = new Actions(driver);
        a.moveToElement(signin).perform();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='login']")).click();
        
        driver.switchTo().frame(0);
        driver.findElement(By.id("userName")).sendKeys("9988776655");
        Thread.sleep(3000);
        driver.findElement(By.id("close-pop")).click();
        
        driver.switchTo().defaultContent();
        Thread.sleep(3000);
        driver.findElement(By.id("inputValEnter")).sendKeys("toys");
        driver.findElement(By.xpath("//span[text()='Search']")).click();
        
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,5000)");
        
        Thread.sleep(3000);
        driver.quit();
	}

}
