package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlemeetlogin {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "./drivers/chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S-1039597370%3A1684262513491048&continue=https%3A%2F%2Fone.google.com%2Fu%2F0%2Fpremium%2Fworkspace&followup=https%3A%2F%2Fone.google.com%2Fu%2F0%2Fpremium%2Fworkspace&ifkv=Af_xneF2uanZ9R0Gyi8aI3p8x4a3ysxLpG9VvaOXjaQX-y9lIl4MGg-naZL33-rMQifehlA4_KKX_w&passive=1209600&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
			 
			
			driver.findElement(By.id("identifierId")).sendKeys("akshay");
			
		
			
			driver.findElement(By.className("VfPpkd-RLmnJb")).click();
			
			
			driver.findElement(By.className("VfPpkd-StrnGf-rymPhb-b9t22c")).click();
			
			driver.findElement(By.id("firstName")).sendKeys("akshayr");
			
			
			driver.findElement(By.id("lastName")).sendKeys("aksh");
			
			
			driver.findElement(By.id("username")).sendKeys("yarr");
			
			
			driver.findElement(By.className("whsOnd zHQkBf")).sendKeys("qq");
			
			driver.findElement(By.className("whsOnd zHQkBf")).sendKeys("qq");
			
			
			driver.findElement(By.className("VfPpkd-vQzf8d")).click();
			
			
			
			
			

	}

}
