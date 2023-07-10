package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class youtube1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver","./Webdriver.ChromeDriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.youtube.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Home']")).click();
		
		
             
	}
	
	
	
}
