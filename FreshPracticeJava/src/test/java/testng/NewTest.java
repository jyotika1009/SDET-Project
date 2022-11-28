package testng;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest {
	@Parameters({"un","pd"})
  @Test
  public void first(String name,String pwd) 
  {
		System.out.println("name:"+name);
		System.out.println("password:"+pwd);
  }
}
