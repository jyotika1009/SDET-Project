package FreshPracticeJava.FreshPracticeJava;

import javax.swing.border.TitledBorder;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.WebDriverManagerException;

public class headlessBrowserTesting {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		
        opt.setHeadless(true);
        
        WebDriver driver=new ChromeDriver(opt);
        
        //launch the Google Application
		driver.get("https://www.google.co.in/");
		System.out.println("Before title:"+driver.getTitle());
		
		//name="q"
		WebElement searchbox=driver.findElement(By.name("q"));
		searchbox.sendKeys("India Gate");
		searchbox.sendKeys(Keys.ENTER);
		System.out.println("after search title:"+driver.getTitle());
		
		Thread.sleep(2000);
		
		driver.quit();
		
		

	}

}
