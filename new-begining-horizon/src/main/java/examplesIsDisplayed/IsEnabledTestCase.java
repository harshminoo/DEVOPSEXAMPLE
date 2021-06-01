package examplesIsDisplayed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class IsEnabledTestCase
{
	WebDriver driver = null;
	@BeforeClass
	public void setUpBeforeClass()
	{
		driver = new FirefoxDriver();
	    driver.get("https://www.learning.npntraining.com/selenium-practice/webcontrols/IsEnabled.html");
	}
	
	@Test(priority=1)
	public void testNextButtonDisabled()
	{
		WebElement button = driver.findElement(By.id("btn"));
		Assert.assertEquals(button.isEnabled(), false);
	}
	
	
	@Test(priority=2)
	public void checkBoxButtonDisabled()
	{
		WebElement checkbox = driver.findElement(By.id("agree"));
		checkbox.click();
		WebElement button = driver.findElement(By.id("btn"));
		Assert.assertEquals(button.isEnabled(), true);
	}
	
	@Test(priority=3)
	public void UncheckBoxButtonDisabled()
	{
		WebElement checkbox = driver.findElement(By.id("agree"));
		checkbox.click();
		WebElement button = driver.findElement(By.id("btn"));
		Assert.assertEquals(button.isEnabled(), false);
	}
}
