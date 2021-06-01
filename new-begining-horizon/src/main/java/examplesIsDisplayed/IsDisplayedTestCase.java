package examplesIsDisplayed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class IsDisplayedTestCase

{
	WebDriver driver = null;
	@BeforeClass
	public void setUpBeforeClass()
	{
		driver = new FirefoxDriver();
	    driver.get("https://www.learning.npntraining.com/selenium-practice/webcontrols/IsDisplayed.html");
	}
    
	
	@Test(priority=1)
	public void textBoxVisibleonPageLoad()
	{
		WebElement txt = driver.findElement(By.id("t1"));
		Assert.assertEquals(true, txt.isDisplayed());
	}
	
	
	@Test(priority=2)
	public void textBoxInVisibleonButtonClick()
	{
		WebElement btn = driver.findElement(By.id("btn1"));
		btn.click();
		
		
		WebElement txt = driver.findElement(By.id("t1"));
		Assert.assertEquals(false, txt.isDisplayed());
	}
}
