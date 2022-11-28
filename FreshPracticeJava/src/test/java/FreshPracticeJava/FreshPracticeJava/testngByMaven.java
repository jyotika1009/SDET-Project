package FreshPracticeJava.FreshPracticeJava;


import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testngByMaven {
@Test
public void login() {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	//open the application
	driver.get("https://www.saucedemo.com/");
}

}
