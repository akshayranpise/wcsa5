package javaScriptexecuter;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScriptRight {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "./drivers.chromedriver.exe");
	WebDriver	driver =new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    
    driver.get("https://www.selenium.dev/");
    
   JavascriptExecutor jse =(JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(1000,0)");
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
}
