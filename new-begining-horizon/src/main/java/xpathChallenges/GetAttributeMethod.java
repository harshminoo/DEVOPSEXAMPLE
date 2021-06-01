package xpathChallenges;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GetAttributeMethod 
{
   
public static void main(String args[])
{
	
	WebDriver driver = new FirefoxDriver();
	driver.get("file:////C:/Users/Lenovo/Desktop/htmls/WebElement/GetCssvalue.html");
	WebElement e = driver.findElement(By.id("btn"));
	System.out.println(e.getAttribute("value"));
	System.out.println(e.getAttribute("type"));
	System.out.println(e.getCssValue("width"));
	System.out.println(e.getCssValue("backgrou-color"));
	
}
}