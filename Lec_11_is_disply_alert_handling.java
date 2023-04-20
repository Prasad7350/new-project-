package Ganesh_lec_march;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lec_11_is_disply_alert_handling {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement button=driver.findElement(By.xpath("//button[ @name='login']"));
		
		
		WebElement input=driver.findElement(By.xpath("//input[ @type='text']"));
		if(button.isDisplayed());{
			input.sendKeys("prasad");
		}
		Thread.sleep(4000);
		driver.close(); 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
