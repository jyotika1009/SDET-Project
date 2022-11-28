package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class googleTestClass {
	@Parameters({"keywords"})
  @Test
  public void first(String Searchdata)
  
  {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.co.in/");
	  WebElement searchbox=driver.findElement(By.name("q"));
	  searchbox.sendKeys(Searchdata);
	  Assert.assertEquals(Searchdata, searchbox.getAttribute("value"));
	  driver.quit();
	  
	  
	  
	  
  }
}
