package assignments;

import java.awt.Point;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Que4 {

	//Q-4 child  window closed 
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver","./drivers/ChromeDriver.exe");
	    
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://omayo.blogspot.com/");
		 
		Thread.sleep(2000);
		
		WebElement childWindow=driver.findElement(By.partialLinkText("Open a popup window"));
		
		 org.openqa.selenium.Point elementloc = childWindow.getLocation();
		int xaxis=elementloc.getX();
		int yaxis =elementloc.getY();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-80)+")");
		
		childWindow.click();
		
		Thread.sleep(3000);
		
	Set<String>allHandles = driver.getWindowHandles();
	
	
	for  (String wh : allHandles)
	{
		Thread.sleep(2000);
		driver.switchTo().window(wh).close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	
	}
	
	
	
}
