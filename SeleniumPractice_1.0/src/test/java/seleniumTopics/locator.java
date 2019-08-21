package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class locator {
	WebDriver driver;
	
	  @Test
	  public void f() throws InterruptedException {
		  
		  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://demo.guru99.com/test/facebook.html");
		  
		  
		  driver.findElement(By.id("loginbutton")).isDisplayed();//id
		  
		  driver.findElement(By.xpath("//a[contains(text(),'New Tours')]")).click();//support code
		  
		  
		  driver.findElement(By.name("submit")).isDisplayed();//name
		  
		  driver.findElement(By.linkText("REGISTER")).isDisplayed();//linkText
		  
		 // driver.findElement(By.cssSelector("font:contains("Password:")")).isDisplayed();
		  //css by inner text or contains, htmltag:contains('')
		  
		  
		  driver.get("http://demo.guru99.com/test/facebook.html");
		  
		  
		  driver.findElement(By.cssSelector("input.inputtext")).isDisplayed();
		  //css by class, htmltag.classname
		  
		  
		  driver.get("https://www.gmail.com");
		  
		 // driver.findElement(By.partialLinkText("Create account")).isDisplayed();
		  
		  driver.findElement(By.className("g4jUVc")).isDisplayed();
		  
		  driver.findElement(By.tagName("input")).isDisplayed();
		  
	  }
}
