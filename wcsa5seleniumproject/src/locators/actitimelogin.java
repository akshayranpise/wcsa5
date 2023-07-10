package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitimelogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "./drivers/chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("http://laptop-hm6ai8l9/login.do");
			 
				driver.findElement(By.name("username")).sendKeys("admin");
				
				driver.findElement(By.name("pwd")).sendKeys("manager");
				Thread.sleep(2000);
				
				
				driver.findElement(By.id("loginButton")).click();
				Thread.sleep(2000);
				
				driver.findElement(By.className("logout")).click();
				
				
				
				
				
				
				
				
				
				

	}

}
