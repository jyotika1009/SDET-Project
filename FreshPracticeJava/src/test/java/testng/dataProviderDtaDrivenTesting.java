package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dataProviderDtaDrivenTesting 
{
	
	 @DataProvider(name="searchDataSet")
	  public Object[][] searchData()
	  {
		  Object[][] sr=new Object[3][2];
		  sr[0][0]="India";
		  sr[0][1]="Qutub Minar";
		  sr[1][0]="Agra";
		  sr[1][1]="Taj Mahal";
		  sr[2][0]="Hyderabad";
		  sr[2][1]="charminar";
		  
		return sr;
		  
	  }
	  
  @Test(dataProvider="searchDataSet")
  public void TestCasesearchGoogle(String country,String mono) 
  {
	 
	  
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.co.in/");
	  WebElement searchbox=driver.findElement(By.name("q"));
	  searchbox.sendKeys(country+" "+mono);
	  //name="btnK"
      driver.findElement(By.name("btnK"));
	  
	  
  }
}
