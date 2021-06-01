

package login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import baseTestCase.TestBase;


public class LoginTestLaunchBrowser extends TestBase
{
  @Test
  
  public void login()
  {
	  WebDriver driver = launchBrowser("Chrome");
	  driver.get("https://www.linkedin.com/checkpoint/rm/sign-in-another-account?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
	  WebElement username = driver.findElement(By.id("username"));
	  username.sendKeys("xyz");
	  System.out.println(username.getLocation().x);
	  System.out.println(username.getLocation().y);
	  
	  WebElement username1 =driver.findElement(By.name("session_password"));
	  username1.sendKeys("123");
	  
  }
  
}
