package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestNGDataProviders {
	
	WebDriver driver;
	
	@BeforeMethod
	public void BrowserLaunch()
	{
		 System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://freecrm.com/");
		  
	}
	
  @Test(dataProvider="TestDataSupply",dataProviderClass=TestDataSupply.class)
  public void f(String UserName,String Password) throws InterruptedException {
	 
	  Thread.sleep(2000);
      driver.findElement(By.xpath("//a[contains(text(),'Log')]")).click();      
      driver.findElement(By.name("email")).sendKeys(UserName);
      driver.findElement(By.name("password")).sendKeys(Password);
      driver.findElement(By.xpath("//div[contains(text(),'Log')]")).click();
      
  }
  
  
  
  
  
}
