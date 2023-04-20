package Ganesh_lec_march;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class L__21_Waits_Assertion {
	@Test
	public void WiatassertionDemo() {
	 WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("abc@123");
		WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys("23455");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}}
