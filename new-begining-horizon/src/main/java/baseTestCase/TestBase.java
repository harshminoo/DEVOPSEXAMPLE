package baseTestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class TestBase 
{
	public WebDriver driver;
	public WebDriver launchBrowser(String browserName)
	{

		
		if(browserName.equals("Chrome"))
		{


			//  System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "logs/chrome.logs");
			System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
			ChromeOptions option = new ChromeOptions();
			option.addArguments("---disable-notifications");
			option.addArguments("---start-maximized");
			driver = new ChromeDriver(option);
		}
		else if(browserName.equals("Mozilla"))

		{  


			System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "logs\\firefox.log");

			FirefoxOptions options = new FirefoxOptions();
			FirefoxProfile prof = new FirefoxProfile();
			prof.setPreference("dom.webnotifications.enabled", false);
			options.setProfile(prof);
			driver = new FirefoxDriver(options);

		}else if(browserName.equals("Edge"))
		{
			//System.setProperty(EdgeDriverService.EDGE_DRIVER_LOG_PROPERTY, "true");
			EdgeOptions options = new EdgeOptions();

			driver = new EdgeDriver(options);
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

}
