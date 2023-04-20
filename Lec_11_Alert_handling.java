package Ganesh_lec_march;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lec_11_Alert_handling {
	 public static void main(String[] args) throws Exception {
		
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.get("");
		 driver.manage().window().maximize();
		 Thread.sleep(4000);
		 WebElement userid=driver.findElement(By.xpath(""));
		 WebElement pass=driver.findElement(By.xpath(""));
		 WebElement login=driver.findElement(By.xpath(""));
		 
		 userid.sendKeys("1234");
		 pass.sendKeys("prasad");
		 login.click();
		Alert Accept= driver.switchTo().alert();
		 Accept.accept();
		 
		 Accept.getText();       // we can add a condition with the use of if and else if text is matched then accpt otherwise 
		                                 //ismiss 
		 driver.close();
		 
		  
	}

}
