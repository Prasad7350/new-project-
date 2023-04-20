package Ganesh_lec_march;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lec_9_Dropdown_handle {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		WebElement acc=driver.findElement(By.xpath("//a[text()='Create new account']"));
		acc.click();
		Thread.sleep(4000);
		WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
		Select sel=new Select(day);

		sel.selectByValue("10"); 
		
		
		
		
		
		
	}

}
