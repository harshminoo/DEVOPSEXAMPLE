package examplesIsDisplayed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SimpleFBTest {

	
		private WebDriver driver;
		@BeforeClass
		public void setUpBeforeClass()
		{
			//System.setProperty("webdriver.chrome.driver", "G:/Drivers/chromedriver.exe");
			driver =new FirefoxDriver();
			driver.get("http://www.facebook.com");
			
		}
		
		
		
		  @Test 
		  public void loadFacebookPage() {
		  
		  Assert.assertEquals(driver.getTitle(), "Facebook - Log In or Sign Up"); }
		  
		  @Test
		  
		  public void redirecttoHTTPs()
		  {
		  Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/");
		  }

	}

