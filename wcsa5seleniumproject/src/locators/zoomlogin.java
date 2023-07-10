package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class zoomlogin {

		public static void main(String[] args) {
			System.setProperty("Webdriver.chrome.driver", "./drivers/chromedriver.exe");
			   WebDriver driver=new ChromeDriver();
				 driver.manage().window().maximize();
				 driver.get("https://zoom.us/signin#/login");
				 
				
				driver.findElement(By.id("email")).sendKeys("akshay");
				
			
				driver.findElement(By.id("password")).sendKeys("ar12");
				
				driver.findElement(By.className("zm-button__slot")).click();
				
				
				driver.findElement(By.id("year")).sendKeys("21");
				
				
				driver.findElement(By.className("zm-button__slot")).click();
				
				
	}

}
