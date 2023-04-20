package Ganesh_lec_march;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lec_23_Keybord_actions {
	WebDriver driver;

	@Test
	public void keybordActionTest() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("fb.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement pass = driver.findElement(By.xpath(""));

		Actions Act = new Actions(driver);
		Act.keyDown(email, Keys.SHIFT).sendKeys("prasad").keyUp(Keys.SHIFT).build().perform();
	//	Act.sendKeys(email, "youare awsome").build().perform();
		Thread.sleep(4000);
		//keys selection 
		Act.keyDown( Keys.CONTROL).sendKeys("a").keyUp( Keys.CONTROL).build().perform();
		//text copy 
		Act.keyDown( Keys.CONTROL).sendKeys( "c").keyUp( Keys.CONTROL).build().perform();
		Thread.sleep(3000);
        // paste text in to pssword field 
		Act.keyDown(pass, Keys.CONTROL).sendKeys(pass, "v").keyUp(pass, Keys.CONTROL).build().perform();

	}

}
