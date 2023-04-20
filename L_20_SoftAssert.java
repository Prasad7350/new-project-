package Ganesh_lec_march;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class L_20_SoftAssert {
     @Test
     public void softAsserTest() {
    	 WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement forgotpass=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
	String expectedtext="Forgotten password";
	  String actualtext=forgotpass.getText();
	  //Soft Assert
	  
   SoftAssert varify=new SoftAssert();
   varify.assertEquals(actualtext, expectedtext);
	WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
    email.sendKeys("abcdef");
   
	WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
	pass.sendKeys("23455");
	varify.assertAll();
	System.out.println("test coplet");

     }}
