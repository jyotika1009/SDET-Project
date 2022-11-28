package FreshPracticeJava.FreshPracticeJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectorSwagDemo {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jyoti\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		
		//username  tagname with id    input#user-name
		/*<input class="input_error form_input" placeholder="Username" type="text" data-test="username" 
		id="user-name" name="user-name" autocorrect="off" autocapitalize="none" value="">
		
		//password   tagname with attribute    input[name=password]
		*<input class="input_error form_input" placeholder="Password" type="password" data-test="password" 
		*id="password" name="password" 
		*autocorrect="off" autocapitalize="none" value="">
		*
		//Submit     tagname with class    input.submit-button
		 * <input type="submit" class="submit-button btn_action" data-test="login-button" 
		 * id="login-button" name="login-button" value="Login">
		*
		*button[class$=btn btn_primary]
		*<button class="btn btn_primary btn_small btn_inventory" data-test="add-to-cart-sauce-labs-backpack" 
		*id="add-to-cart-sauce-labs-backpack" 
		*name="add-to-cart-sauce-labs-backpack">Add to cart</button>
		*
		*/
		
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		
		driver.findElement(By.cssSelector("input[name=password]")).sendKeys("secret_sauce");
		
		driver.findElement(By.cssSelector("input.submit-button")).click();
		
		
		
		
		

	}

}
