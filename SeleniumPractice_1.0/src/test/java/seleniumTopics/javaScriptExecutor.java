package seleniumTopics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class javaScriptExecutor {
	WebDriver driver;
	
	  @Test
	  public void f() throws InterruptedException {
		  
		  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
		
		  
		  JavascriptExecutor jse =(JavascriptExecutor)driver;
		  jse.executeScript("scroll(0,2000)");//First method to use javascript executor
		  
		  Thread.sleep(2000);
		  
		  ((JavascriptExecutor)driver).executeScript("scroll(0,0)");//Second method to use javascript executor
		  
		 
  }
}
