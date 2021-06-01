package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown
{
	
	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.learning.npntraining.com/selenium-practice/webcontrols/DropDown.html");
		WebElement drpDown = driver.findElement(By.id("userexp"));
		Select select = new Select(drpDown);
		select.selectByIndex(1);
		select.selectByValue("internet");
		select.selectByVisibleText("Total Call Drops");

	}

}
