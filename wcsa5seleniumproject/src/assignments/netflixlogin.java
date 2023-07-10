package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class netflixlogin {

	public static void main(String[] args) {
		 System.setProperty("WebDriver.chrome.driver", "/drivers/chromedrivers.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        
	        driver.get("https://www.netflix.com/in/login");
	        
	        
	       // driver.findElement(By.xpath("//a[@class='gb_ma gb_id gb_Md gb_1d']")).click();
	        
	        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("12334567");
	        
	        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("akshay123");
	        
	        driver.findElement(By.xpath("//button[@type='submit']")).click();
	        
	        

	}

}
