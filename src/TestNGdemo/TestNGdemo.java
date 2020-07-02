package TestNGdemo;

import org.testng.annotations.Test;

public class TestNGdemo {
	
	
	@Test (priority=3)
	
	void login ()
	
	{
		System.out.println("Hello");	
		
	}
	
	@Test (priority=1)
	void logout ()
	
	{
		System.out.println("Hello TestNG");
		
	}

	@Test (priority=2)
	void OpenURL()
	
	{
		System.out.println("Assalamualaikum brothers");
	}
	
}
