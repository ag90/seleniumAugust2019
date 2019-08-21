package seleniumTopics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class screenShot {
	WebDriver driver;
	
	  @Test
	  public void Test() throws InterruptedException, IOException {
		  
		  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		  
		 File file= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(file, new File(".//SeleniumPractiseScreenshot//"+"2ndScreenshot"+".png"));
		 
   }

}