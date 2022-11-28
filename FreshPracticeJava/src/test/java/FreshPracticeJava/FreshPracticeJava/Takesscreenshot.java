package FreshPracticeJava.FreshPracticeJava;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Takesscreenshot {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jyoti\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//open the application
		driver.get("https://www.facebook.com/");
		
TakesScreenshot as=((TakesScreenshot)driver);

File srcfile=as.getScreenshotAs(OutputType.FILE);

File dest=new File("C:\\Users\\jyoti\\eclipse-workspace\\FreshPracticeJava\\Screenshot\\1.png");
		
FileUtils.copyFile(srcfile, dest);
	
	}

}
