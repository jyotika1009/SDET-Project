package FreshPracticeJava.FreshPracticeJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jyoti\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		driver.navigate().to("https://www.facebook.com/");

		driver.navigate().back();
		
		String title=driver.getTitle();
		System.out.println(title);
		
		if(title.equals(title))
		{
			System.out.println("title matched..........");
		}else
		{
			System.out.println("title not matched...........");
		}

		//String pagesource=driver.getPageSource();
		//System.out.println(pagesource);
		
		driver.quit();
		

	}

}
