package testng;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class crossBrowserTesting 
{

	@Test
	  public void edgeTest()
	  {
		  WebDriverManager.edgedriver().setup();
		  WebDriver driver=new EdgeDriver();
		  driver.get("https://www.saucedemo.com/");
		  System.out.println(driver.getTitle());
	  }
	@Test
	  public void chromeTest()
	  {
		  WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.facebook.com/");
		  System.out.println(driver.getTitle());
	  }
}
