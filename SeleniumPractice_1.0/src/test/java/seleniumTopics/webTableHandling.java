package seleniumTopics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class webTableHandling {
	
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  
	  
	  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com/");
	  
	  driver.findElement(By.name("q")).sendKeys("Selenium Tutorials");
	  
	  Thread.sleep(1000);
	  
	  List<WebElement>GoogleSearch=driver.findElements(By.xpath("//ul[@role='listbox']//li[@class='sbct']"));
	  int GoogleSearch_Size=GoogleSearch.size();
	  System.out.println(GoogleSearch_Size);
	  
	  
	  
	  for (WebElement GoogleSuggestedValue : GoogleSearch) {
				  
		  String SuggestedOptions=GoogleSuggestedValue.getText();
		  System.out.println(SuggestedOptions);
		  
		  if (SuggestedOptions.contentEquals("selenium tutorials by mukesh otwani")) 
		  {

			  GoogleSuggestedValue.click();
			  break;
		}
	}
	  
	  
	  
	  
  }
}
