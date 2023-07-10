package windowbase_popuphandeling;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class windowbase_popuphandaling_ActiTime {
	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://akshay/login.do");
		Thread.sleep(2000);
		WebElement b1 = driver.findElement(By.xpath("//input[@name='anyfile']"));
		     Actions act = new Actions(driver);
		     act.doubleClick(b1).build().perform();
		     Runtime.getRuntime().exec("./AutoIDProgram/sciTE123.au3");		
		     
		     Runtime.getRuntime().exec("./AutoIDProgram/file123.exe");

	}
}
