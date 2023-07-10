package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jiocinema {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "./drivers/chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("https://www.jiocinema.com/");
			 
			 driver.findElement(By.xpath("//div[contains(@class,'MuiAvatar-root MuiAvatar-circular mui-style-1yi5p2t-profileIcon')]")).click();
			 
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//div[contains(@class,'MuiListItemIcon-root mui-style-1v0hoqp')]")).click();
			 
			 Thread.sleep(2000);
			 
			 driver.findElement(By.xpath("//input[contains(@type,'tel')]")).sendKeys("7447633163");
			 
			 Thread.sleep(2000);
			 
			 driver.findElement(By.xpath("//div[contains(@class,'mui-style-1ja1tam-submit')]")).click();
			 
			// driver.findElement(By.xpath("//input[contains(@id,'otp-id-0')]")).sendKeys("940750");
			 
			 //driver.findElement(By.xpath("//div[contains(@class,'mui-style-1ja1tam-submit')]")).click();
			 
	}

}
