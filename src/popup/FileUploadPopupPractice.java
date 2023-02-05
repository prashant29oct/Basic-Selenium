package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopupPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.foundit.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
        driver.findElement(By.xpath("//div[contains(text(),'Upload Resume')]")).click();
        driver.findElement(By.id("file-upload")).sendKeys("F:\\Test cases\\System Testing\\system test cases1.txt");
        Thread.sleep(5000);
        driver.quit();
	}

}
