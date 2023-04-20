package Ganesh_lec_march;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lec_13_frame_handling {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		//WebElement iframe = driver.findElement(By.xpath("//iframe[@name='globalSqa']"));
		//driver.switchTo().frame(iframe);
		
		//driver.switchTo().frame(3);                                       // by idex we try to find the frame 
		driver.switchTo().frame("globalSqa" );                              // by name we find the frame 
		WebElement search = driver.findElement(By.xpath("//input[@id='s']"));
		search.sendKeys("abc234");
		
		Thread.sleep(4000);
		  driver.switchTo().defaultContent();
		WebElement parframe=driver.findElement(By.xpath("//input[@id='s']"));
		parframe.sendKeys("root");
		
		
		

	}
}
