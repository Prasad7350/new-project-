package Ganesh_lec_march;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class L22_mouse_whore {
	
	ChromeDriver driver;
	@Test
	public void MouseHore() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("naukari.com");
		driver.manage().window().maximize();
		
		WebElement jobs=driver.findElement(By.xpath("whore on the jobs "));
		WebElement ItJobs=driver.findElement(By.xpath("click on the it jobs"));
		Actions Act=new Actions(driver);                                   // mouse whore and wheb option see then click on it
		Act.moveToElement(jobs).build().perform();
		Thread.sleep(5000);
		Act.click(ItJobs);
	}

}
