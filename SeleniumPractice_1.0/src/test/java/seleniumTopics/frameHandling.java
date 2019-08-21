package seleniumTopics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class frameHandling {
	WebDriver driver;
	
	  @Test
	  public void f() throws InterruptedException {
		  
		  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://hugelearning.com/iframe-practice-page/");
		
		  List<WebElement> Frame=driver.findElements(By.tagName("iframe"));
		  int Total_Frames=Frame.size();
		  System.out.println(Total_Frames);
		  
		 for (WebElement webElement : Frame) {
			
			String FrameAttribute= webElement.getAttribute("name");
			System.out.println(FrameAttribute);
		}
		  
		  	  
		  driver.switchTo().frame(0);
		  driver.findElement(By.xpath("//a[contains(text(),'LINK TEST2')]")).click();
		  
		  driver.switchTo().defaultContent();
		  
          driver.switchTo().frame("iframe2");
          boolean Frame2=driver.findElement(By.xpath("//h2[contains(text(),'Frame2')]")).isDisplayed();
		  System.out.println(Frame2);
		  
		  driver.switchTo().parentFrame();
		  
		  driver.switchTo().frame(driver.findElement(By.id("IFrame1")));
		  boolean Java=driver.findElement(By.xpath("//h2[contains(text(),'What is Java')]")).isDisplayed();
		  System.out.println(Java);

}

}