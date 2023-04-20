package Ganesh_lec_march;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class L_20_Waits_Assert {

	
	@Test
	public void AssertTest() {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement forgotpass=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		String expectedtext="Forgotten password? ";
		  String actualtext=forgotpass.getText();
		  //hard Assert
		  
	   Assert.assertEquals(expectedtext, actualtext);
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
	    email.sendKeys("abcdef");
	   
		WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys("23455");
		
		
		
	}
	

}
