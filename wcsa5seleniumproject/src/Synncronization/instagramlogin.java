package Synncronization;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagramlogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "/drivers/chromedrivers.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
      
      driver.get("https://www.instagram.com/");
      Thread.sleep(2000);
      
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("akshayranpise7447");
        
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("AKSHAY7447");
        
        driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();
	}

}
