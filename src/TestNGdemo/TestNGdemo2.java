package TestNGdemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGdemo2 {
	
	//@Beforeclass and @Afterclass is the best way to work with TestNG w/o having error
	@BeforeClass
	void login ()
	
	{
		 System.out.println("Login");	
	}
	
	@AfterClass
	void logout()
	{
		 System.out.println("Logout"); 	
	}
	
	@Test (priority = 3)
	void search()
	{
		 System.out.println("Search");	
	}

	@Test (priority = 2)
	void Advancedsearch()
	
	{
		 System.out.println("Advanced Search");
	}
	
	@Test (priority = 1)
	void searchtoys()
	{
		System.out.println("Search Toys");
	}
	
}


