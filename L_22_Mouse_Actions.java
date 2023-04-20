package Ganesh_lec_march;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class L_22_Mouse_Actions {
	WebDriver driver;
	@Test
	public void MouseAllActions() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(null);
	    driver.manage().window().maximize();
	    
	  WebElement drag=  driver.findElement(null);
	    WebElement drop=driver.findElement(null);  ///that program is for the drag and drop method 
	    
	    Actions Act=new Actions(driver);
	    
	    Act.dragAndDrop(drag, drop); 
	    
	    
	    
	}


}
