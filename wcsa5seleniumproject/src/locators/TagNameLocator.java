package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "./drivers/chromedriver.exe");
			   WebDriver driver=new ChromeDriver();
				 driver.manage().window().maximize();
				 driver.get("file:///C:/Users/AKSHAY/OneDrive/Documents/usename.html");
				WebElement usn =driver.findElement(By.tagName("input}"));
				usn.sendKeys("qspiders");

	}

}
