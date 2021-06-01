package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAllDropDown {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","G:\\Drivers\\chromedriver.exe");
		driver.get("https://www.learning.npntraining.com/selenium-practice/webcontrols/DropDown.html");
		WebElement drpDown = driver.findElement(By.id("userexp"));
		Select select = new Select(drpDown);
		List<WebElement> listOfDropDown= select.getOptions();
		
		
		  for(WebElement option:listOfDropDown) {
		  System.out.println(option.getText());
		  //System.out.println(option.getAttribute("value"));
		  /*two ways of selecting values*/
		  select.selectByVisibleText((option.getText()));
		  //select.selectByValue((option.getAttribute("value")));
		  
		  Thread.sleep(1000); }
		 
		 
		
			
		/*
		 * for(int i=0;i<listOfDropDown.size();i++) { WebElement option =
		 * listOfDropDown.get(i); //System.out.println(option.getText());
		 * System.out.println(option.getAttribute("value")+"\n");
		 * select.selectByValue((option.getAttribute("value")));
		 * 
		 * Thread.sleep(1000);
		 * 
		 * }
		 */
	}

}
