package Synncronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class shopperstackimplicitlogin {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver","./drivers/chromedriver.exe");
		
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	WebDriverWait explicitWait= new WebDriverWait(driver, Duration.ofSeconds(15));
	
	  driver.get("https://www.shoppersstack.com/");
	  
	  
	  
	  driver.findElement(By.xpath("//a[.='Electronic']")).click();
	  driver.findElement(By.xpath("//a[.='Headphones']")).click();
	 driver.findElement(By.xpath("//button[@type='button'][1]")).click();
		

	}

}
