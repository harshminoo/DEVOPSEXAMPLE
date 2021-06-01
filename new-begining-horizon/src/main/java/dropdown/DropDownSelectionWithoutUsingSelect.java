package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//*another way to display values other than select class*//
public class DropDownSelectionWithoutUsingSelect {

	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","G:\\Drivers\\chromedriver.exe");
		driver.get("https://www.learning.npntraining.com/selenium-practice/webcontrols/DropDown.html");
		WebElement element = driver.findElement(By.id("userexp"));
		List<WebElement> options =element.findElements(By.tagName("option"));
		for(WebElement element1 : options)
		{
			System.out.println(element1.getText());
			element1.click();
		}
		
		
		

	}
	//may 2022 to oct 2022
}
