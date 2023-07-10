package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class zomatologin {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "./drivers/chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("https://www.zomato.com/mobile");
			driver.findElement(By.className("sc-3o0n99-5 sc-iBmynh iOtbzg")).click();
			
		     driver.findElement(By.className("sc-1yzxt5f-9 dFkpnp")).sendKeys("akshay");
			
		     driver.findElement(By.className("sc-1yzxt5f-9 dFkpnp")).sendKeys("t");
					

	}

}
