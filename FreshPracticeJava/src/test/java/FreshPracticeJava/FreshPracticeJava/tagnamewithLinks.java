package FreshPracticeJava.FreshPracticeJava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagnamewithLinks {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jyoti\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.calculator.net/");
		driver.manage().window().maximize();
		
		List<WebElement> list=driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		
		for(WebElement i:list)
		{
			System.out.println(i.getText());
		
		}
		
		driver.quit();
	}

}
