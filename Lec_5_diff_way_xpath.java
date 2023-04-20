package Ganesh_lec_march;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lec_5_diff_way_xpath {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/account/login?ret=%2Faccount%2F%3Frd%3D0%26link%3Dhome_account");
		WebElement email = driver
				.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[1]/input"));
		email.sendKeys("prasadrohokale97@gmail.com");
		WebElement button = driver.findElementByClassName("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[3]/button");
		button.click();
		

	}
}
