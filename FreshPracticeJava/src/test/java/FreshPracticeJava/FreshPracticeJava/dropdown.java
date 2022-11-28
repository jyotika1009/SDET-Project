package FreshPracticeJava.FreshPracticeJava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jyoti\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		
		WebElement ele=driver.findElement(By.id("input-country"));
		
		Select dd=new Select(ele);
		//dd.selectByVisibleText("American Samoa");
		//dd.selectByIndex(4);
		dd.selectByValue("6");
		
		if(dd.isMultiple())
				{
			System.out.println("is multiple............");
				}else
				{
					System.out.println("not multiple...........");
				}
		
		List<WebElement> alloptions=dd.getOptions();
		for(WebElement el:alloptions)
		{
			System.out.println(el.getText());
		}

driver.close();
	}

}
