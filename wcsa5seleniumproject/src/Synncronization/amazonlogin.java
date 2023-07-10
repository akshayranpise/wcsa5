package Synncronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonlogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver", "/drivers/chromedrivers.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
     
        driver.get("https://www.amazon.in/");
        
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//span[@class='nav-cart-icon nav-sprite']")).click();
        
        driver.findElement(By.xpath("//span[@id='a-autoid-1']")).click();
         
        driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("akshay");
        
        driver.findElement(By.xpath("//input[@id='ap_phone_number']")).sendKeys("7447633163");
        
        driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("akshayranpise2002@gmail.com");
        
        driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("123456");
        
        driver.findElement(By.xpath("//input[@id='continue']")).click();
        
        
        
	}

}
