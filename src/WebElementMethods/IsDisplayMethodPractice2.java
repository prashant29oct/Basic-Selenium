package WebElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayMethodPractice2 {

	public static void main(String[] args) {
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
       WebElement actitimelogo =  driver.findElement(By.className("atLogoImg"));
       boolean status = actitimelogo.isDisplayed();
       System.out.println(status);
       if(status)
       {
    	   System.out.println("pass");
       }
       else
       {
    	   System.out.println("fail");
       }
       driver.quit();
	}

}
