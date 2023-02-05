package crossbrowserparallel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FaceBookLoginTest {
	
	@Parameters("Browser")
	@Test
	public void loginpage(String browser) {
		WebDriver driver = null;
		switch(browser) {
		case "chrome":driver = new ChromeDriver();break;
		case "firefox":driver = new ChromeDriver();break;
		case "edge":driver = new EdgeDriver();break;
		default: System.out.println("invalid browser configration");
		}
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("email")).sendKeys("7054078138");
		driver.findElement(By.id("pass")).sendKeys("Prash9889@#");
		driver.findElement(By.name("login")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains("Facebook"));
		
		driver.quit();
	}

}
