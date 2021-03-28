package example;		

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
//import org.openqa.selenium.firefox.FirefoxDriver;		
import org.openqa.selenium.chrome.*;	
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class NewTest {		
	    private WebDriver driver;	
	  
		@Test				
		public void testEasy() {	
			driver.get("http://demo.guru99.com/test/guru99home/");  
			String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("Demo Guru99 Page")); 		
		}	
		@BeforeTest
		public void beforeTest() {	
		    
			//System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/Google/Chrome/Application/chrome.exe");
			//for chrome 
			System.setProperty("webdriver.chrome.driver", "C:\\Apps\\chromedriver.exe");
			driver = new ChromeDriver();  
		}		
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}		
}	
