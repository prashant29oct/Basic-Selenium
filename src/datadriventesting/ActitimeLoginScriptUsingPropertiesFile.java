package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActitimeLoginScriptUsingPropertiesFile {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fis = new FileInputStream("./datadriven/data.properties");
		Properties property = new Properties();
		property.load(fis);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(property.getProperty("url"));
		
		long time = Long.parseLong(property.getProperty("time"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		
		driver.findElement(By.id("username")).sendKeys(property.getProperty("username"));
		driver.findElement(By.name("pwd")).sendKeys(property.getProperty("password"));
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(10000); 
		driver.quit();

	}

}
