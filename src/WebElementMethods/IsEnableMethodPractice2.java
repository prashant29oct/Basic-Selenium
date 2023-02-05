package WebElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnableMethodPractice2 {

	public static void main(String[] args) {
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
       WebElement loginbutton =  driver.findElement(By.xpath("//div[text()='Log in']"));
       boolean enablestatus = loginbutton.isEnabled();
      
       
       if(enablestatus)
       {
    	   System.out.println("enable");
       }
       else
       {
    	   System.out.println("disable");
       }
       driver.quit();
	}

}
