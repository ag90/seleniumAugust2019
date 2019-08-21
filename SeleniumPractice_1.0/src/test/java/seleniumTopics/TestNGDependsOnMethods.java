package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDependsOnMethods {
	
	WebDriver driver;
	
	@BeforeTest
	public void BeforeTest()
	{
		
		  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://freecrm.com/");
		  
	}
	
	@Test
	public void TestCase1()
	{
		driver.findElement(By.xpath("//a[contains(text(),'Login1')]"));
	}
	
	@Test(dependsOnMethods="TestCase1")
	public void TestCase2()
	{
		System.out.println("TestCase2");
	}
	
	
	@Test(dependsOnMethods="TestCase2")
	public void TestCase3()
	{
		System.out.println("TestCase3");
	}
	
	@Test(dependsOnMethods="TestCase3")
	public void TestCase4()
	{
		System.out.println("TestCase4");
	}
	
	@Test(dependsOnMethods="TestCase4")
	public void TestCase5()
	{
		System.out.println("TestCase5");
	}
	
	@Test
	public void TestCase6()
	{
		System.out.println("TestCase6");
	}
}
