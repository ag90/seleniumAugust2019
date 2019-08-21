package seleniumTopics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowDimension {
	WebDriver driver;
	
	  @Test
	  public void f() {
		  
		  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://freecrm.com/");
		 
		  Dimension dim=new Dimension(1000, 1000);
		  
		  driver.manage().window().setSize(dim);
		  
		 Dimension CurrentWindowSize= driver.manage().window().getSize();
		 System.out.println(CurrentWindowSize);
		 
		 Point CurrentWindowPosition= driver.manage().window().getPosition();
		 System.out.println(CurrentWindowPosition);
		 
	  }
}
