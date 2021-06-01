package examplesIsDisplayed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaunchingFirefoxBrowser {
	static WebDriver driver;

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","G:/Drivers/geckodriver.exe");
		/*
		 * FirefoxProfile profile = new FirefoxProfile();
		 * profile.setPreference("intl.accept_languages", "en-GB"); FirefoxOptions
		 * options = new FirefoxOptions(); options.setProfile(profile); driver = new
		 * FirefoxDriver(options); driver.get("http://www.facebook.com");
		 * System.out.println(driver.getTitle());
		 */
		
String language ="en-us"; 
		FirefoxOptions firefoxOptions = new FirefoxOptions();
		FirefoxProfile firefoxProfile = new FirefoxProfile();
		firefoxProfile.setPreference("intl.accept_languages", language);
		firefoxOptions.setProfile(firefoxProfile);
		driver = new FirefoxDriver(firefoxOptions);
		driver.get("https://facebook.com");
	}
	
	@Test public void loadFacebookPage() {
		  
		  Assert.assertEquals(driver.getTitle(), "Facebook - Log In or Sign Up"); }

}
