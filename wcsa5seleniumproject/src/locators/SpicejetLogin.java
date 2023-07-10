package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpicejetLogin
{

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("Webdriver.chrome.driver", "./drivers/chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("https://www.spicejet.com/");
			 
				Thread.sleep(2000);
			 
			 driver.findElement(By .xpath("//div[contains(@class,'css-1dbjc4n r-1loqt21 r-18u37iz r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr')]")).click();
			 
			//Thread.sleep(2000);
		
			 
			 driver.findElement(By .xpath("//input[contains(@type,'number')]")).sendKeys("7447633163");
			  
			// Thread.sleep(2000);
			 driver.findElement(By .xpath("//input[contains(@type,'password')]")).sendKeys("AKSHAY7447");
			 
			// Thread.sleep(2000);
			 driver.findElement(By .xpath("//div[contains(@class,'css-1dbjc4n r-19m6qjp r-z2wwpe r-1loqt21 r-1x0uki6 r-1e081e0 r-1f1sjgu r-ah5dr5 r-1otgn73')]")).click();
			 
			 
	}
}







