package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameters {
	
	WebDriver driver;
	
	@Test
  @Parameters({"Username","Password"})	
  public void Params(String Username,String Password) {
	  
	  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://freecrm.com/");
	  
	  
      driver.findElement(By.xpath("//a[contains(text(),'Log')]")).click();      
      driver.findElement(By.name("email")).sendKeys(Username);
      driver.findElement(By.name("password")).sendKeys(Password);
      driver.findElement(By.xpath("//div[contains(text(),'Log')]")).click();
      
	  
	  
	  
	
	  
  }
}
