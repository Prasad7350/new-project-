package Ganesh_lec_march;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lec_8_autosuggetion {
	public static void main(String[] args) throws Exception {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	Thread.sleep(4000);
	WebElement search=driver.findElement(By.xpath("//input[@type='text']"));
	search.sendKeys("testing");
	Thread.sleep(5000);
	WebElement desireOutput=driver.findElement(By.xpath("//*[@id=\"c7mM1c\"]/div[1]/span/b"));
	Thread.sleep(4000);
	desireOutput.click();  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
