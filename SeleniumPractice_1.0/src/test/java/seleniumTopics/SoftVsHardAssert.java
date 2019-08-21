package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftVsHardAssert {
	WebDriver driver;
	
	SoftAssert asser =new SoftAssert();
	  @BeforeMethod
	  public void f() throws InterruptedException {
		  
		  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://freecrm.com/");
	
	  }
	  
	  
	  @Test
	  
         public void Test1() throws InterruptedException {
		  
		  WebElement Login=driver.findElement(By.xpath("//a[contains(text(),'Log')]"));
		  String Login_Text=Login.getText();
		  
		  asser.assertEquals(Login_Text, "Login1", "Text 'Login' is displayed wrong");
		  System.out.println("All");
		 // asser.assertAll();
		  
		//  Assert.assertEquals(Login_Text, "Login1", "Text 'Login' is displayed wrong");
	  }
	  
	  
	  
	  @Test
	  
         public void Test2() throws InterruptedException {
		  
		  WebElement Sign=driver.findElement(By.xpath("//a[contains(text(),'Sign')]"));
		  String Sign_Text=Sign.getText();
		  
		 // asser.assertEquals(Login_Text, "Sign Up1", "Text 'Sign Up' is displayed wrong");
		 // asser.assertAll();
		 
	  }
	  
	  
}
