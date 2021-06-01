package xpathChallenges;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Contains {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","G:\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.americangolf.co.uk/");
		///driver.findElement((By.xpath("//button[text()='Accept']")));
		List<WebElement>  element = driver.findElements((By.xpath("//i[@class='icon icon-basket']")));
		element.get(1).click();
		

	}

}
