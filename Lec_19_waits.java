package Ganesh_lec_march;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lec_19_waits {
	WebDriver driver;
	@Test
	public void testWaits() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize(); 
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);   //explicit wait 
	WebElement login= driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
	 login.click();
	WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
	email.sendKeys("prasadrohokale97@gmail.com");
		WebDriverWait expwait=new WebDriverWait(driver,10);        //implicit waits                                
		expwait.until(ExpectedConditions.visibilityOf(email));
		
		
		
		
		
		
		
		
	}

}
