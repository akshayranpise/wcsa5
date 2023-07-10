package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class blunestoneRobot {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.bluestone.com/");
		
		driver.findElement(By.id("denyBtn")).click();
		
		Thread.sleep(2000);
		WebElement target = driver.findElement(By.xpath("//a[contains(text(),'Watch')]"));
              Actions act = new Actions(driver);
		      act.moveToElement(target).perform();
		      
		      
		     driver.findElement(By.xpath("//a[.='Band']")).click();		     

		     //double click 
		     
		       WebElement  target1 = driver.findElement(By.xpath("//div[.='Filter by']"));
		       Actions act1 =new Actions(driver);
		       act1.clickAndHold(target1).perform();
		       
		     Thread.sleep(2000);
		     
		    
		     
		   
	}

}
