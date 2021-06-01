package dynamicBrowesr;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicBrowsers
{
  public static void main(String ars[])
  {
	  String browser ="Mozilla";
	  WebDriver driver = null;
	  if(browser.equals("Chrome"))
	  {
	     driver = new ChromeDriver();
	  }
	  else if(browser.equals("Mozilla"))
		  
	  {  
		  driver = new FirefoxDriver();
	  
	  }else if(browser.equals("Edge"))
	  {
		  driver = new EdgeDriver();
	  }
  }
}
