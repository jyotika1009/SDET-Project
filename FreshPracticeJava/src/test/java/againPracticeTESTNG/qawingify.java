package againPracticeTESTNG;

import org.testng.annotations.Test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class qawingify{

@Test
public void firstTestCase() 
{

	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  
	  /****************Login the Application***********************************/
	  //open the application launch the url
	  driver.get("https://sakshingp.github.io/assignment/login.html");
	
	  driver.findElement(By.id("username")).sendKeys("jyoti");
	  driver.findElement(By.id("password")).sendKeys("12345");
	  
	  driver.findElement(By.className("btn")).click();
	  
	  driver.manage().window().maximize();
	  
	  /********************Sorted the Element amount Transaction****************/
	  
	  WebElement amount=driver.findElement(By.id("amount"));
	  amount.click();
	  
	  List<WebElement> priceamt=driver.findElements(By.className("text-success"));
	  
	  for(int i=0;i<priceamt.size();i++)
	  {
		  System.out.println(priceamt.get(i).getText());
	  }
	  
}
}
