package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContain2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bollymoviereviewz.com/2013/04/bollywood-box-office-collection-2013.html");
		driver.findElement(By.xpath("//b[contains(text(),'Drishyam 2')]")).click();
		Thread.sleep(3000);
		driver.quit();

	}

}
