package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginpagelocator {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "./drivers/chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%2F%3F_encoding%3DUTF8%26adgrpid%3D1318316047092805%26hvadid%3D82395012131090%26hvbmt%3Dbe%26hvdev%3Dc%26hvlocint%3D%26hvlocphy%3D148728%26hvnetw%3Ds%26hvqmt%3De%26hvtargid%3Dkwd-82395629776314%253Aloc-90%26hydadcr%3D16194_1970236%26ie%3DUTF8%26index%3Daps%26keywords%3Damazon%2520login%26ref%3Dpd_sl_8hn2y1tqzx_e%26tag%3Dmsndeskstdin-21%26ref_%3Dnav_em_hd_re_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&&ref_%3Dnav_em_hd_clc_signin");
			 
			driver.findElement(By.id("ap_email")).sendKeys("akshay");
			
		     driver.findElement(By.id("continue")).click();
					
	}

}
