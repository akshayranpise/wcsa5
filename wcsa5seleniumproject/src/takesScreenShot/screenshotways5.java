package takesScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class screenshotways5 {

	
//By using EventFiring WebDriver 

	
	public static void main(String[] args) throws IOException {
	
		System.setProperty("WebDriver.chrome.driver","./Webdriver.ChromeDriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.instagram.com");
		
		      EventFiringWebDriver efw = new EventFiringWebDriver(driver);
			
		      File src=efw.getScreenshotAs(OutputType.FILE);
		      File dest=new File("./screenshots/ssway5.png");
		      
		      Files.copy(src, dest);


}
}
