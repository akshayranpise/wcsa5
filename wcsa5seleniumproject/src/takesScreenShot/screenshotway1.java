package takesScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class screenshotway1 {

	public static void main(String[] args) throws IOException {
		System.setProperty("WebDriver.Chrome.driver","./driver.Chrome.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.get("https://myaccount.google.com/email");
	
	               TakesScreenshot ts = (TakesScreenshot)driver;
	                       File  src  =ts.getScreenshotAs(OutputType.FILE);
		                  File dest =new File("./screenshots/way1ss.jpg");
	                        Files.copy(src, dest);
	                               
	}
	
}
