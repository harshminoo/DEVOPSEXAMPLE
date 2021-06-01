package jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleHomePageTest

{
	WebDriver driver;
	   
	   @BeforeClass 
	   public void setUpBeforeClass()
	   {
		   //System.setProperty("webdriver.gecko.driver","G:\\Drivers\\geckodriver.exe");
		  driver=new FirefoxDriver();
	   }
	   
	   @Test 
	   public void testHomePage()
	   {
		   
		  driver.get("https://www.google.com/");
		  Assert.assertEquals(driver.getTitle(), "Google");
		  
	   }
	   
	   
	   @AfterClass
	   public void setUpAfterClass()
	   {
		   
		  driver.quit();
	   }
}
