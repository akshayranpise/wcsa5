package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dream11loginpage {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "./drivers/chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("https://www.dream11.com/login");
			 
			driver.findElement(By.id("regEmail")).sendKeys("123654789");
			
		
			driver.findElement(By.id("regUser")).click();
				
	}

}
