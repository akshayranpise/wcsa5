package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class microsoftoutlookloginpage {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", "./drivers/chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("https://www.office.com/");
			 
			driver.findElement(By.id("hero-banner-sign-in-microsoft-365-link")).click();
			
			
			
			driver.findElement(By.id("i0116")).sendKeys("akshay");

			
	}

}
