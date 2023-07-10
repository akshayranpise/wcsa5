package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginpage {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("Webdriver.chrome.driver", "./drivers/chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("https://www.netflix.com/in/Login");
			 
			 //to identify web element we use locator
			driver.findElement(By.id("id_userLoginId")).sendKeys("akshay");//username identifyy
			//Thread.sleep(4000);
			driver.findElement(By.id("id_password")).sendKeys("ranpise");
			Thread.sleep(4000);
			driver.findElement(By.className("//button[@class='btn login-button btn-submit btn-small']")).click();
					
	}

}
