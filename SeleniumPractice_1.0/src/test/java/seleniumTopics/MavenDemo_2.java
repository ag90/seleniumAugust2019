package seleniumTopics;

import org.testng.Assert;
import org.testng.annotations.Test;


public class MavenDemo_2 {
	@Test
	  public void MavenDemo2() {
		  
		  String Test="Automation";
		  Assert.assertEquals(Test, "Automation");
		  
	}
}
