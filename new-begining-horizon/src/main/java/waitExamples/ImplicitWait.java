package waitExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import baseTestCase.TestBase;

public class ImplicitWait extends TestBase {

	@Test
	
	public void linkdin()
	{
		WebDriver driver = launchBrowser("Mozilla");
		driver.get("https://www.linkedin.com/checkpoint/rm/sign-in-another-account?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		  //driver.findElement(By.id("username")).sendKeys("abd");
		  driver.findElement(By.xpath("//input[@id='username']")).sendKeys("abd");
	}
}
