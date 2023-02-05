package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWaitPractice {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement usernameTF = driver.findElement(By.id("username"));
		wait.until(ExpectedConditions.visibilityOf(usernameTF)).sendKeys("admin");
		
		WebElement passwordTF = driver.findElement(By.name("pwd"));
		wait.until(ExpectedConditions.visibilityOf(passwordTF)).sendKeys("manager");
		
		WebElement loginbutton = driver.findElement(By.id("loginButton"));
		wait.until(ExpectedConditions.elementToBeClickable(loginbutton)).click();
		
		boolean status = wait.until(ExpectedConditions.titleContains("actiTIME"));
		
		if(status)
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}

}
