package Ganesh_lec_march;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class List_of_Web_Elements {
	
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		List<WebElement> anchore=driver.findElements(By.xpath("//a"));
		System.out.println(anchore.size());
		Thread.sleep(5000);
		Iterator<WebElement> it=anchore.iterator();
		
		while (it.hasNext());
		{
			WebElement singl=it.next();          // to find the elements prests on the web page . and then click on it 
		  String get= singl.getText();
		  System.out.println(singl);
		                                                                                                                   // while  loop problem ouccures thats why it cant be coplete 
		}
		
		
		
		
		
		
		
		
		
		
		
	}}
