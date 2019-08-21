package seleniumTopics;

import org.testng.Assert;
import org.testng.annotations.Test;


public class MavenDemo_1 {
  @Test
  public void MavenDemo1() {
	  
	  String Test="Automation";
	  Assert.assertEquals(Test, "Automation");
  }
}
