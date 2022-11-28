package FreshPracticeJava.FreshPracticeJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jyoti\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		/* tagname with single attribute   //input[@id='user-name']
		 * <input class="input_error form_input" placeholder="Username" type="text" data-test="username" id="user-name" 
		 * name="user-name" autocorrect="off" autocapitalize="none" value="">
		 * 
		 * 
		 * tagname with multiple attribute   //input[@id='password'][@name='password']
		 * <input class="input_error form_input" placeholder="Password" type="password" data-test="password" id="password"
		 *  name="password" autocorrect="off" autocapitalize="none" value="">
		 *  
		 *  
		 *  //input[@id='login-button']
		 *  <input type="submit" class="submit-button btn_action" data-test="login-button" 
		 *  id="login-button" name="login-button" value="Login">
		 */
		
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password'][@name='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();

	}

}
