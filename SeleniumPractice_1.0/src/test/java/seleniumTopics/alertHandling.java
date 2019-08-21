package seleniumTopics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class alertHandling {
	
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
	  
	  
	  
	  driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();//support code	  
	  Alert alert=driver.switchTo().alert();//Focus or Switch on alert
	  alert.dismiss();//click on Cancel button
	  
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();//support code	  
	  alert.accept();//click on OK button
	  
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//button[text()='Click for Prompt Box']")).click();//support code	 
	  alert.sendKeys("Customer");//NA, To enter text in propmt alert
	  
	  Thread.sleep(2000);
	  
	  String Alert_Text=alert.getText();//to get alert text
	  System.out.println(Alert_Text); 
	  
	  
	 
	  
	  
  }
}
