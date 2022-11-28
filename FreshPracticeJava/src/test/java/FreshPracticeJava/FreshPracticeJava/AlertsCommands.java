package FreshPracticeJava.FreshPracticeJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsCommands {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jyoti\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();

		 //open application
		 driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		 
		 //maximize the window
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//input[@name='prompt']")).click();
	
		 driver.switchTo().alert().sendKeys("jyoti");
		 driver.switchTo().alert().accept();
		
	}

}
