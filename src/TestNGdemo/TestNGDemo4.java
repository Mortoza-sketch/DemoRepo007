package TestNGdemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDemo4 {
	
//Dependency Method
	
  @Test (priority=1)	
  void openURL ()
  
  {
	  System.out.println("URL opened");
	  Assert.assertTrue(true);
  }
  
  @Test (priority=2)
  void login ()
  {
	  System.out.println("Login Test");
	  Assert.assertTrue(true);
  }

  @Test (priority=3) 
  void search ()
  {
	  System.out.println("Search Test");
	  Assert.assertTrue(false);
  }
  
  @Test (priority=4)	
  void advancedsearch()
  
  {
	  System.out.println("Advanced Search Test");
	  Assert.assertTrue(false);
  }

  @Test (priority=5)
  void logout()
  
  {
	  System.out.println("Logout");
	  Assert.assertTrue(true);
  }
  
}
