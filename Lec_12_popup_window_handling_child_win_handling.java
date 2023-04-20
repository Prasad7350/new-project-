package Ganesh_lec_march;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lec_12_popup_window_handling_child_win_handling {
    
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	
		 WebElement newwindow=driver.findElement(By.xpath("//button[@id='button1']"));
		 newwindow.click();
		 
		      Set<String> AllPareAdd=driver.getWindowHandles();  // program for  the to get the all parent addresess .
		      System.out.println(AllPareAdd);
		      
		      java.util.Iterator<String> it=AllPareAdd.iterator();
		      while(it.hasNext());
		      {
		    	  String childAdd=it.next();
		    	  System.out.println(childAdd);
		    	  
		      }
		      
		     
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		      
		   
		
	}

}
