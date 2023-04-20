package Ganesh_lec_march;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class lec_10_element_enable_ordisable {
	
	public static void main(String[] args) throws Exception {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	WebElement path=driver.findElement(By.xpath("//input[@name='email']"));
	if(!path.isEnabled());{
		path.sendKeys("abc");
	}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
