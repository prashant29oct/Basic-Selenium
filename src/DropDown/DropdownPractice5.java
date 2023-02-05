package DropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownPractice5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    WebElement dropdown = driver.findElement(By.id("cars"));
	    
	    Select s = new Select(dropdown);
	    if(s.isMultiple())
	    {
	    	s.selectByIndex(0);
	    	s.selectByVisibleText("INR 50 - INR 99 ( 1 ) ");
	    	s.selectByValue("199");
	    	Thread.sleep(3000);
	    	List<WebElement> selectedOption = s.getAllSelectedOptions();
	    	for(WebElement e:selectedOption)
	    	{
	    		System.out.println(e.getText());
	    	}
	    	s.deselectAll();
	    }else
	    {
	    	System.out.println("single select dropdown");
	    }
	    Thread.sleep(3000);
	    driver.quit();

	}

}
