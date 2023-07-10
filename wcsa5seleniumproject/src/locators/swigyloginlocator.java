package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class swigyloginlocator {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "./drivers/chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("https://www.swiggy.com/restaurants/login-besant-nagar-adyar-chennai-8308");
			 
			
			
		
			driver.findElement(By.className("_2CgXb")).click();
			
			driver.findElement(By.id("mobile")).sendKeys("akshay");
			
			driver.findElement(By.className("a-ayg")).click();
			
			driver.findElement(By.className("_3p4qh")).click();
			
			
			
			
			
			driver.findElement(By.id("Sign In")).sendKeys("akshay");
			
			
			driver.findElement(By.id("mobile")).sendKeys("ak");
			
			
			
			driver.findElement(By.className("a-ayg")).click();
			
			
			

	}

}
