package testng;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class firsttestcasetestNG 
{
	@Test(priority=1,description="chrome related test cases",invocationCount = 3)
	public void edgetest1()
	{
	
		System.out.println("this is 1 method......");
	}
	@Test(priority=2)
	public void chrometest2()
	{
	
		System.out.println("this is 2 method......");
	}
	@Test(priority=3)
	public void fftest3()
	{
	
		System.out.println("this is 3 method......");
	}

}
