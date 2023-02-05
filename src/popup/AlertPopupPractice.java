package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertPopupPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement coursetab = driver.findElement(By.xpath("//a[text()='COURSE']"));
		Actions a = new Actions(driver);
		a.moveToElement(coursetab).perform();
		
		driver.findElement(By.xpath("//span[@class='wrappers']/a[text()='Selenium Training']")).click();
		driver.findElement(By.xpath("//button[text()=' Add to Cart']")).click();
		
		//Thread.sleep(3000);
		Alert alertpopup = driver.switchTo().alert();
		System.out.println(alertpopup.getText());
		alertpopup.accept();
		
		Thread.sleep(3000);
		driver.quit();
		
		

	}

}
