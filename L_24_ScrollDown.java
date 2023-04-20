package Ganesh_lec_march;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class L_24_ScrollDown {
	WebDriver Driver;

	@Test
	public void ScrollOperation() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("facebook.com");
		Thread.sleep(5000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		jse.executeScript("Window.scrollBy(0,1500)", "");  //( before rub comment one option )That is for the simple page scrolling 
		 // we can with from the web element ....jya elemnt patyny aplyala find karaych aahe .
		
		WebElement sitemap=driver.findElement(By.xpath("//a[text()='Sitemap"));
		jse.executeScript("arguments[0].scrollIntoView();", "sitemap");  // it will scroll the page where you give the xpath 
		
		
		
		
	}

}
