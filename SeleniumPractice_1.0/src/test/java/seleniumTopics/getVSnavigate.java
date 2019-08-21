package seleniumTopics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class getVSnavigate {
	
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  
	  driver.get("https://www.google.com");
	  
	  Thread.sleep(2000);
	  
	  driver.navigate().to("https://www.google.com//maps");//URL
	  
	  Thread.sleep(2000);
	  
	  driver.navigate().to("https://www.google.com//news");//String
	  
	  Thread.sleep(2000);
	  
	  driver.navigate().back();
	  
	  Thread.sleep(2000);
	  
	  driver.navigate().forward();
	  
	  Thread.sleep(2000);
	  
	  driver.navigate().refresh();
	  
	  Thread.sleep(2000);
	  
	  String CurrentURL=driver.getCurrentUrl();//it will return one string  or get the current URL.
	  System.out.println(CurrentURL);
	  
  }
}
