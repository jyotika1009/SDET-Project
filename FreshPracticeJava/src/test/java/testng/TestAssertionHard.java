package testng;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestAssertionHard 
{
  @Test
  public void HardAssertion()
  {
	  /*Hard Assertion
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://testautomationpractice.blogspot.com/");
	   String er= "Automation Testing Practice11";
	   String ar=driver.getTitle();
	   
	   Assert.assertEquals(er, ar, "verify title");
	   
	   System.out.println("verifying response of wikipedia.................");
	   
	   WebElement icon=driver.findElement(By.className("wikipedia-icon"));
	   Assert.assertTrue(icon.isDisplayed());
	   
	   WebElement sr=driver.findElement(By.className("wikipedia-search-button"));
	   Assert.assertTrue(sr.isDisplayed());
	  
	  driver.close(); */
	  
	  //Soft Assertion
	  
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  
	  SoftAssert sa=new SoftAssert();
	  driver.get("https://testautomationpractice.blogspot.com/");
	   String er= "Automation Testing Practice11";
	   String ar=driver.getTitle();
	   
	   sa.assertEquals(er, ar, "verify title");
	   
	   System.out.println("verifying response of wikipedia.................");
	   
	   WebElement icon=driver.findElement(By.className("wikipedia-icon"));
	  sa.assertTrue(icon.isDisplayed());
	   
	   WebElement sr=driver.findElement(By.className("wikipedia-search-button"));
	   sa.assertTrue(sr.isDisplayed());
	  
	  driver.close();
	  sa.assertAll();
	  
  }
	
}
