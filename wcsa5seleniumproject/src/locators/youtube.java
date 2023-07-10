package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "./drivers/chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("https://www.google.com/search?q=instagram&rlz=1C1RXQR_enIN1032IN1032&oq=instagram&aqs=chrome..69i57j69i64j35i39i650j0i67i131i433i650j0i131i433i512j0i20i131i263i433i512j0i131i433i512j0i67i650.3374j0j15&sourceid=chrome&ie=UTF-8");
			 
			 driver.findElement(By.linkText("Instagram")).click();
			 
			 driver.findElement(By.className("username")).sendKeys("akshuranpise7447");
			 
			 driver.findElement(By.className("password")).sendKeys("qwertyuiop1234");
			 
			 driver.findElement(By.className("x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1xmf6yo x1e56ztr x540dpk x1m39q7l x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1")).click();
			 
			
			 
			 
	}

}
