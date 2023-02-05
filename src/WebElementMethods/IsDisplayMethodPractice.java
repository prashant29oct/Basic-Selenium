package WebElementMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayMethodPractice {

	public static void main(String[] args) {
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vtiger.com/crm-demo/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
       WebElement vtigerlogo =  driver.findElement(By.xpath("//img[@alt='vtiger crm']"));
       boolean status = vtigerlogo.isDisplayed();
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
