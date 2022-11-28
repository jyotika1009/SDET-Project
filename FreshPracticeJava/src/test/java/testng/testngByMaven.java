package testng;


import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testngByMaven {
@Test
public void login() {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	//open the application
	driver.get("https://www.google.co.in/");
	String er="Google";
	String ac=driver.getTitle();
	
AssertJUnit.assertEquals(er, ac);

	/*if(er.equals(ac))
	{
		System.out.println("title matched");
	}else
	{
		System.out.println("title not matched...");
	}*/
	
driver.quit();
 }

}
