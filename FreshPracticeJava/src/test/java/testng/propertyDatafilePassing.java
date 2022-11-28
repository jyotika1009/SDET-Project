package testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class propertyDatafilePassing 
{
  @Test
  public void filepassing() throws IOException 
  {
	  File f1=new File("C:\\Users\\jyoti\\eclipse-workspace\\FreshPracticeJava\\src\\test\\java\\testng\\data.properties");
      FileInputStream fs=new FileInputStream(f1);
      Properties p1=new Properties();
      p1.load(fs);
      
      System.out.println("browser name is:"+(p1.getProperty("bname")));
      System.out.println("version is:"+(p1.getProperty("bversion")));
      
 
      
    
  }
}
