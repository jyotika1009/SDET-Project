package testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class swagDemoPropertiesFile {
  @Test
  public void f() throws IOException
  
  {
	  File f1=new File("C:\\Users\\jyoti\\eclipse-workspace\\FreshPracticeJava\\src\\test\\java\\testng\\swag.properties");
	  FileInputStream fs=new FileInputStream(f1);
	
	  Properties p1=new Properties();
	  p1.load(fs);
	  
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get(p1.getProperty("url"));
	  
	 System.out.println(driver.getTitle());
			  
		driver.findElement(By.id("user-name")).sendKeys(p1.getProperty("username"));
		
		driver.findElement(By.name("password")).sendKeys(p1.getProperty("password"));
		
		driver.findElement(By.className("submit-button")).click();
	  
	 
	  
	  
  }
  
}
