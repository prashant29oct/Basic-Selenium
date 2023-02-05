package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//navigate to facebook
		
		driver.get("https://www.facebook .com/");
		
	  //fetch the title of page
		
		String title = driver.getTitle();
		System.out.println(title);
		
       //fetch current url
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//fetch page source
		
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
		
		//close the browser
		//driver.close();
		driver.quit();
	}

}
