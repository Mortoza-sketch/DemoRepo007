package TestNGdemo;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGdemo5 {

	@Test (priority=1)
	void openurl()
	
	{
		System.out.println("openurl");
		Assert.assertTrue(true);
	}
	
	@Test (priority=2, dependsOnMethods= {"openurl"})
	
	void login()
	{
		System.out.println("Login Test");
		Assert.assertTrue(true);
	}
	
	@Test (priority=3, dependsOnMethods= {"login"})
	void search ()
	
	{
		System.out.println("Search Test");
		Assert.assertTrue(false);
	}
	
	@Test (priority=4, dependsOnMethods= {"search"})
	void advancesearch()
	{
		System.out.println("Advance Search Test ");
		Assert.assertTrue(true);
	}
	
	
	
}
