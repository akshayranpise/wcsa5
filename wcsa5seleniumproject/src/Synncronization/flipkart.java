package Synncronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "/drivers/chromedrivers.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.flipkart.com/");
        
        driver.findElement(By.xpath("//button[.='✕']")).click();
        
      
        driver.findElement(By.xpath("//span[text()='Cart']")).click();
        
        Thread.sleep(2000);
        
              
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _1sbqEe _3AWRsL']")).click();
        
       
        
	}

}
