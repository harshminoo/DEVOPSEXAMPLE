package xpathChallenges;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TableXpath {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.learning.npntraining.com/selenium-practice/advance_locators/table.html");
		List<WebElement> tds = driver.findElements(By.xpath("//table/thead/tr/th"));
		for(WebElement td:tds)
		{
			System.out.println(td.getText());
		}
		

	}

}
