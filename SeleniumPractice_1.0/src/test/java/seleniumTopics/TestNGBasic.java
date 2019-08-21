package seleniumTopics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasic {
	
	@BeforeSuite
	public void BeforeSuit(){
	
		System.out.println("Before Suit");
	}
	
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("Before Test");
	}
	
	@BeforeClass
	public void BeforeClass(){
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("Before Method");
	}
	
	@Test
	public void Test1()
	{
		System.out.println("Test1");
	}
	
	@Test
	public void Test2()
	{
		System.out.println("Test2");
	}
	
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("After Method");
	}
	
	
	@AfterClass
	public void AfterClass()
	{
		System.out.println("After Class");
	}
	
	@AfterTest
	public void AfterTest()
	{
		System.out.println("After Test");
	}
	
	@AfterSuite
	public void AfterSuit()
	{
		System.out.println("After Suit");
	}
 
}
