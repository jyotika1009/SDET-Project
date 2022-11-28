package FreshPracticeJava.FreshPracticeJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class howToGetimgScr {

	public static void main(String[] args) throws InterruptedException
{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jyoti\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//open the application
		driver.get("https://www.facebook.com/");
		
		//maximize the window
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement logo=driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
       System.out.println(logo.getAttribute("src"));
		
	}

}
