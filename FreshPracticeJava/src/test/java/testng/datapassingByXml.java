package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class datapassingByXml
{
	@Parameters({"username","password"})
  @Test
  public void swagDemo(String us,String pa)
  
  {
		WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("https://www.saucedemo.com/");
		  driver.findElement(By.id("user-name")).sendKeys("us");
			
			driver.findElement(By.name("password")).sendKeys("pa");
			
			driver.findElement(By.className("submit-button")).click();
  }
}
