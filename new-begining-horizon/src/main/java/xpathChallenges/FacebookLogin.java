package xpathChallenges;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FacebookLogin extends TestBase
{
   //@Test
	//public void TestFaceBookFindFriends() 
	public static void main(String args[])
	{
		
		//getDriver("Mozilla");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("singhshafaliraina@gmail.com");
		 driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("GGurudev@1234");
		 driver.findElement(By.xpath("//button[@name='login']")).sendKeys(Keys.ENTER);
		WebDriverWait wait = new WebDriverWait(driver,10);
		 
		  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Meenu Raina Singh']")));
		  driver.findElement(By.xpath("//span[text()='Meenu Raina Singh']")).click();
		  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Friends']")));
		  driver.findElement(By.xpath("//span[text()='Friends']")).click();
		  driver.findElement(By.xpath("//input[@placeholder='Search Facebook']")).sendKeys("Rajkumar Bohra");
	
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//ul[@role='listbox']"));  
			/*
			 * for( WebElement elm:ListOfelements ) { System.out.println(elm); }
			 */
		  //System.out.println("hi");
		  //System.out.println(ListOfelements);
		  //ListOfelements.get(1).click();   

	}

}
