package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebooklogin {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.Chrome.driver","./drivers.chromedriver.exe");
	WebDriver	driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.id("email")).sendKeys("7447633163");
	
	driver.findElement(By.id("pass")).sendKeys("AKSHAY7447");
	
	Thread.sleep(2000);
	
	driver.findElement(By.name("login")).click();
		
	}
	
	
	
	
}
