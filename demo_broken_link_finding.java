package Ganesh_lec_march;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo_broken_link_finding {
	
	@Test
	public void demoBrokenLink() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("facebook.com");
		Thread.sleep(5000);
	List<WebElement> alllinks = (List<WebElement>) driver.findElement(By.xpath("//a"));   // lec is pending still ..day25 broken links 
		
		URL url=new URL("url which we want to check ");
		HttpURLConnection httpurl=(HttpURLConnection)url.openConnection();
		httpurl.setConnectTimeout(4000);
		httpurl.connect();
		
		
		
		
	     
		
	}

}
