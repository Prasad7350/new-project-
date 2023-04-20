package Ganesh_lec_march;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class L_21_Assert_merhods {
	@Test
	public void TestAssert_Methods() throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement acttext = driver.findElement(
				By.xpath("//h2[text()='Facebook helps you connect+" + "and share with the people in your life.']"));
		String actltextformat = acttext.getText();
		String exptxt = "Facebook helps you connect and share with the people in your life.";

		if (exptxt.equals(actltextformat)) {
			System.out.println("test pass");

		}

		else {
			Assert.assertTrue(false);
		}
		driver.close();

	}

}
