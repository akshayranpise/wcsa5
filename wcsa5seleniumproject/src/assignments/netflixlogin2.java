package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class netflixlogin2 {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", "/drivers/chromedrivers.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.netflix.com/in/Login");
        
        
        driver.findElement(By.xpath("//input[contains(@id,'id_userLoginId')]")).sendKeys("12334567");
        
        driver.findElement(By.xpath("//input[contains(@id,'id_password')]")).sendKeys("akshay123");
        
        driver.findElement(By.xpath("//button[contains(@class,'btn login-button btn-submit btn-small')]")).click();
	}

}
