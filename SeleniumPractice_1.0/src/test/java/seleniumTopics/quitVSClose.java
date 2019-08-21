package seleniumTopics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class quitVSClose {
	
	WebDriver driver;
	
	  @Test
	  public void f() throws InterruptedException {
		  
		  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.naukri.com");
		  
		  driver.close();
		  
		  Thread.sleep(5000);
		  
		  driver.quit();
  }
}
