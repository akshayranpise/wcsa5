package takesScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class way2 {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("Webdriver.chrome.driver","./drivers.chrome.exe");
        ChromeDriver cdriver =new ChromeDriver();
		cdriver.manage().window().maximize();
		cdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		cdriver.get("https://www.google.com/maps");
		
		File src  =cdriver.getScreenshotAs(OutputType.FILE);
		
		File dest =new File("./screenshots/way3ss.png");
		
		Files.copy(src, dest);
		
		
		
		
		
		
		
	}
	
	
	
}
