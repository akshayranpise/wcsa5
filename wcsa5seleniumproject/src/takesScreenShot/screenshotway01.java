package takesScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class screenshotway01 {

	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("Webdriver.chrome.driver", "./drivers.chrome.exe");
		
		 WebDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 
		 driver.get("https://gbapps.net/yowhatsapp-apk-2/");
		 
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src =ts.getScreenshotAs(OutputType.FILE);
          File dest= new File("./screenshots/way01.png");	
	     Files.copy(src, dest);
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
