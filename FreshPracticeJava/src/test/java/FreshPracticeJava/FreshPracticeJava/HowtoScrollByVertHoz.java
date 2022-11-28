package FreshPracticeJava.FreshPracticeJava;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HowtoScrollByVertHoz {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//launch the appl
		//driver.get("https://www.calculator.net/");
		driver.get("http://www.album.alexflueras.ro/");
		
		//scroll down by vertically by pixel
		/*JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,2500)");*/
		
		//scroll by visibility by element
		/*
		WebElement ele=driver.findElement(By.linkText("BMI Calculator"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()",ele);*/
		
		//scroll by bottom of the webpage
		
		/*JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");*/
		
		//scroll by Horizontal id="a8"
		WebElement ele=driver.findElement(By.id("a8"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView()",ele);
		
	}

}
