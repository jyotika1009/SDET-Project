package FreshPracticeJava.FreshPracticeJava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class swagLabLocators {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jyoti\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//open the application
		driver.get("https://www.saucedemo.com/");
		
		//maximize the window
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//id="user-name"   username
		//name="password"   password
		//class="submit-button btn_action"  button
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.className("submit-button")).click();
		
		String currenthandle=driver.getWindowHandle();
		driver.switchTo().window(currenthandle);
		
		/*List<WebElement> list=driver.findElements(By.linkText("Sauce Labs Bolt T-Shirt"));
		System.out.println("ElementCount-" +list.size());*/
		
        driver.findElement(By.partialLinkText("Bolt T-Shirt")).click();
        
        //Add to cart
		
        driver.findElement(By.name("add-to-cart-sauce-labs-bolt-t-shirt")).click();
		
        //Remove
        driver.findElement(By.id("remove-sauce-labs-bolt-t-shirt")).click();
		
	}

}
