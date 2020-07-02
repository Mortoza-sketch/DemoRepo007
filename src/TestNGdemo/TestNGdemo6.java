package TestNGdemo;
import org.testng.Assert;
import org.testng.annotations.Test;
public class TestNGdemo6 {
	
	@Test (priority=1)
	void openURL()
	{
		System.out.println("URL Opened");
		Assert.assertTrue(true);
	}
	
	
	@Test (priority=2)
	void login()
	
	{
	System.out.println("Login Test");	
	}
	
	@Test (priority=3, enabled=false)
	void search()
	
	{
	 System.out.println("Still in Progress .....");	
	}
	
	@Test (priority=4, enabled=false)
	void advancesearch()
	{
		System.out.println("Still in Progress .....");
	}
     	
	@Test (priority=5)
	void logout()
	{
		System.out.println("Logout Test");
		Assert.assertTrue(true);
	}

}
