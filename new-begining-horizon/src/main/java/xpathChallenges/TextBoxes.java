package xpathChallenges;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextBoxes {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","G:\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.learning.npntraining.com/selenium-practice/TextBoxes.html");
		WebElement txtparam1 = driver.findElement(By.id("param1"));
		txtparam1.clear();
		txtparam1.sendKeys("Hello");
		WebElement txtparam2 = driver.findElement(By.name("param2"));
		txtparam2.sendKeys("Minoo");
		WebElement txtparam3 = driver.findElement(By.className("param3"));
		txtparam3.sendKeys("harsh");
		List<WebElement> txtparam4 =  driver.findElements(By.tagName("input"));
		txtparam4.get(3).sendKeys("hello");
		List<WebElement> txtparam5 = driver.findElements(By.id("param1"));
		txtparam5.get(1).sendKeys("gol para");
		//txtparam5.clear();
		
		
		/*
		 * WebElement pm= txtparam5.get(1); pm.clear(); pm.sendKeys("gol para");
		 */

		/*
		 * for(int i=0;i<txtparam5.size();i++) { System.out.println(txtparam5.get(i));
		 * 
		 * }
		 */

		WebElement txtparam6 = driver.findElement(By.id("Namebox"));
		txtparam6.sendKeys("we are happy");
		
		WebElement txtparam7 = driver.findElement(By.id("Emailbox"));
		txtparam7.sendKeys("karma");
		
		WebElement txtparam8 = driver.findElement(By.id("Phonebox"));
		txtparam8.sendKeys("pre destined");
		
		WebElement txtparam9 = driver.findElement(By.id("areabox"));
		txtparam9.sendKeys("reverse");
		
		WebElement txtparam10 = driver.findElement(By.id("commentArea"));
		txtparam10.sendKeys("be happy");
		

	}

}
