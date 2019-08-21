package seleniumTopics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class mouseANDKeyboardHandling {
	
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate");
	  
	  Actions act=new Actions(driver);
	  
      
	  act.clickAndHold(driver.findElement(By.xpath("//span[contains(text(),'Interview Q & A')]"))).build().perform();
	  
	  act.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Test Framework')]"))).build().perform();
	  
	  act.click(driver.findElement(By.xpath("//span[contains(text(),'Test Framework')]"))).build().perform();
	  
	  act.contextClick(driver.findElement(By.xpath("//span[contains(text(),'Blog')]"))).build().perform();
	  
	  
	  act.sendKeys(driver.findElement(By.xpath("//input[@id='searchform-1']")), Keys.NUMPAD5).build().perform();
	  Thread.sleep(3000);
	  act.sendKeys(driver.findElement(By.xpath("//input[@id='searchform-1']")), Keys.SPACE).build().perform();
	  Thread.sleep(3000);
	  act.sendKeys(driver.findElement(By.xpath("//input[@id='searchform-1']")), Keys.MULTIPLY).build().perform();
	  Thread.sleep(3000);
	  act.sendKeys(driver.findElement(By.xpath("//input[@id='searchform-1']")), Keys.TAB).build().perform();
	  act.sendKeys(driver.findElement(By.xpath("//input[@id='searchform-1']")), Keys.TAB).build().perform();
	  Thread.sleep(3000);
	  act.sendKeys(driver.findElement(By.xpath("//input[@id='searchform-1']")), Keys.PAGE_DOWN).build().perform();
	  
	  
	  driver.get("http://demo.guru99.com/test/simple_context_menu.html");
	  
	  act.doubleClick(driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"))).build().perform();
		  
	  Alert alert=driver.switchTo().alert();//support code
	  alert.accept();//support code
		  

	  driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
	
	  act.dragAndDrop(driver.findElement(By.id("draggable")),driver.findElement(By.id("droppable"))).build().perform();	  
  }
}
