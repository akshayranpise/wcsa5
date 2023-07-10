package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class zomatosign {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.zomato.com/mobile");
		 
		 //to click sign up link
		 
		driver.findElement(By.linkText("Sign up")).click();
		
		driver.findElement(By.className("sc-1yzxt5f-9 dFkpnp")).sendKeys("o");
		
		driver.findElement(By.className("sc-1yzxt5f-9 dFkpnp")).sendKeys("i");
		
		
		
	}

}
