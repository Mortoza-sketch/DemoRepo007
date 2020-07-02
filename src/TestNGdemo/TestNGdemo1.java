package TestNGdemo;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestNGdemo1 {
	
/*	1) Login@BeforeMethod
	2) Search @Test
	3) Logout@AfterMethod

	4) Login@BeforeMethod
	5) Advanced Search  @Test
	6) Logout@AfterMethod

	7) Login@BeforeMethod
	8) Search Toys @Test
	9) Logout@AfterMethod */
	
	//@Beforeclass and @Afterclass is the best way to work with TestNG w/o having error
	
	@BeforeMethod
	void login ()
	
	{
		System.out.println("Assalamualaikum1 Login");
	}

	@AfterMethod
	void logout ()
	
	{
		System.out.println("Assalamualaikum2 Logout");
	}
	
	@Test (priority = 2)
	void search() 
	
	{
		System.out.println("Search an item");
	}
	
	@Test (priority = 3)
	void Advancedsearch()
	
	{
		System.out.println("Advance Search");
	}
	
	@Test (priority = 1)
	void searchtoys()
	
	{
		System.out.println("Search Toys");
	}
	
	
	
	
	
	

}
