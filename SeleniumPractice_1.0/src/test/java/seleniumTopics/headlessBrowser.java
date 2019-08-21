package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class headlessBrowser {
	
	WebDriver driver;
	
	 @Test
	  public void f() throws InterruptedException {
		  
		  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		  driver=new HtmlUnitDriver();
		  driver.manage().window().maximize();
		  driver.get("http://demo.guru99.com/v1/index.php#");
		  
		  
		  boolean LoginButton=driver.findElement(By.name("btnLogin")).isDisplayed();
		  System.out.println(LoginButton);
  }
}
