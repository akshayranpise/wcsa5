package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class snapchat {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","/drivers/chromedriver.exe");
		          WebDriver driver=new ChromeDriver();
		         driver.manage().window().maximize();
		         driver.get("https://accounts.snapchat.com/accounts/v2/login");
		         
		         driver.findElement(By.xpath("//input[contains(@name,'accountIdentifier')]")).sendKeys("1234567890");
		         
		         driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
		         
		         //driver.findElement(By.xpath(""))

	}

}
