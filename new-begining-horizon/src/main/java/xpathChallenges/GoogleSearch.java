package xpathChallenges;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class GoogleSearch extends TestBase
{
  
	@Test
	
	public void googleSearch()
	
	{
		getDriver("Mozilla");		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("hinustan times");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	
	
}

}