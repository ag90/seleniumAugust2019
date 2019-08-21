package seleniumTopics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGExpectedException {
	
	
	
  @Test(expectedExceptions=AssertionError.class)
  public void f() {
	  
	  String Automation ="Selenium";
	  Assert.assertEquals(Automation, "QTP");
	  
	  
  }
}
