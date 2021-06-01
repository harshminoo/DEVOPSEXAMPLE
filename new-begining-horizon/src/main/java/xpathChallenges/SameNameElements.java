package xpathChallenges;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SameNameElements {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.learning.npntraining.com/selenium-practice/advance_locators/1.html");
		driver.findElement(By.xpath("//div[@id='d1']/input[@id='a']")).click();
		driver.findElement(By.xpath("//div[@id='d2']/input[2]")).click();
		
		//driver.get("https://www.learning.npntraining.com/selenium-practice/BMI-Calculator.html");
		//driver.findElement(By.xpath("//input[@value='Reset']")).click();

	}

}
