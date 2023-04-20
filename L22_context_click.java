package Ganesh_lec_march;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class L22_context_click {
	WebDriver driver;
	@Test
	public void RightClick() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(null);
		driver.manage().window().maximize();
		
		WebElement login= driver.findElement(By.xpath(""));
		Actions Act=new Actions(driver);
		// mouse right click on any web element 
		Act.contextClick(login).build().perform(); 
		
		
		
	}

}
