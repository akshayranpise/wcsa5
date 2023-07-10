package javaScriptexecuter;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ScroolDown {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","./driverschrome.exe");
		
	       RemoteWebDriver  driver =new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	       
	       driver.get("https://www.selenium.dev/");
	       
	     JavascriptExecutor  jse=(JavascriptExecutor)driver;
	     
	     jse.executeScript("window.scrollBy(0,1000)");                                                        
	     
	           
	
	}
	
	
}
