package seleniumTopics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class dropdownHandling {
	WebDriver driver;
	
	  @Test
	  public void f() throws InterruptedException {
		  
		  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://demo.guru99.com/test/newtours/register.php");
		  
	  Select select= new Select(driver.findElement(By.xpath("//select[@name='country']")));
	  
	  select.selectByIndex(12);
	  
	  Thread.sleep(3000);
	  
	  select.selectByVisibleText("INDIA");
	  
	  Thread.sleep(3000);
	  
	  select.selectByValue("ISRAEL");
	  
	  WebElement GetFirstSelectOption=select.getFirstSelectedOption();
	  String GFSO=GetFirstSelectOption.getText();
	  System.out.println(GFSO);
	  
	 List<WebElement> GetOptions= select.getOptions();
	 int GetOptions_Size=GetOptions.size();
	 System.out.println(GetOptions_Size);
	 
	 for(WebElement AllValues:GetOptions)
	 {
		 
		 String Values=AllValues.getText();
		 System.out.println(Values);
		 
	 }
	 
	 driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate");
	 
	 Select select_Soft=new Select(driver.findElement(By.name("multipleselect[]")));
	 
	 select_Soft.selectByIndex(0);
	 select_Soft.selectByIndex(1);
	 select_Soft.selectByIndex(2);
	 select_Soft.selectByIndex(3);
	 
	 List<WebElement> GetAllSelectedOptions= select_Soft.getAllSelectedOptions();
	 int GetAllSelectedOptions_Size=GetAllSelectedOptions.size();
	 System.out.println(GetAllSelectedOptions_Size);
	 
	 for(WebElement GetAllValues:GetAllSelectedOptions)
	 {
		 
		 String Values=GetAllValues.getText();
		 System.out.println(Values);
		 
	 }
	 
	 select_Soft.deselectAll();
	 
	
	 
	 
	  
  }
}
