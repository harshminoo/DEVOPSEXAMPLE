package autocomplete;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoComplete {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.learning.npntraining.com/selenium-practice/webcontrols/AutoComplete.html");
        driver.findElement(By.id("tags")).sendKeys("jav");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        
        //WebElement element = driver.findElement(By.tagName("ul"));       
        //List<WebElement> lis= element.findElements((By.tagName("li")));
       // lis.get(1).click();
        
        List<WebElement> lis =driver.findElements(By.xpath("//ul/li"));
       // System.out.println(lis);
        lis.get(1).click();
	}

}
