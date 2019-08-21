package seleniumTopics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class authenticationPopupHandling {
	
	WebDriver driver;
	
	  @Test
	  public void f() throws InterruptedException {
		  
		  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  
		//Handle_Basic_Authentication_PopUp: we have to write username and password as well with URL 
			//Format: "http://username:password@URL"
		  
		  driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		  
		  
		  
		  
	  }
}
