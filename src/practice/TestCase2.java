package practice;


import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestCase2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		driver.findElement(By.xpath("(//a[text()=' SkillRary Demo APP'])[2]")).click();
		
		Set<String> childId = driver.getWindowHandles();
		for(String id:childId) {
			driver.switchTo().window(id);
		}
		WebElement dropDown = driver.findElement(By.name("addresstype"));
		
		Select s = new Select(dropDown);
		s.selectByVisibleText("Testing");
		
		WebElement element = driver.findElement(By.id("Selenium Training"));
		WebElement element2 = driver.findElement(By.id("cartArea"));
	
		
		Actions action = new Actions(driver);
		action.dragAndDrop(element, element2).perform();
		Thread.sleep(3000);
		
		WebElement dropElement = driver.findElement(By.xpath("//h5[text()='Useful Links']"));
		Point point = dropDown.getLocation();
		int x = point.getX();
		int y = point.getY();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		
		Thread.sleep(3000);
		driver.quit();
		
		
		

	}

}
