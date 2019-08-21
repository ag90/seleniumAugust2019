package seleniumTopics;

import org.testng.annotations.Test;

public class TestNGPriorty {
	
	
	
	@Test(priority=2)
	public void TestCase1()
	{
		System.out.println("TestCase1");
	}
	
	@Test(priority=3)
	public void TestCase2()
	{
		System.out.println("TestCase2");
	}
	
	
	@Test(priority=1)
	public void TestCase3()
	{
		System.out.println("TestCase3");
	}
	
	@Test(priority=0)
	public void TestCase4()
	{
		System.out.println("TestCase4");
	}
	
	@Test(priority=-1)
	public void TestCase5()
	{
		System.out.println("TestCase5");
	}
	
	@Test(priority=-2)
	public void TestCase6()
	{
		System.out.println("TestCase6");
	}

}
