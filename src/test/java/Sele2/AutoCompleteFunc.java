package Sele2;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoCompleteFunc {



	@Test
	public void alertTest() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		Thread.sleep(1500);
		//WebElement x =driver.findElement(By.className("ui-autocomplete-input"));
		//driver.findElement(By.cssSelector("input[class='ui-autocomplete-input']")).sendKeys("a");
		//driver.findElement(By.cssSelector(".ui-autocomplete-input")).sendKeys("A");
		//driver.findElement(By.cssSelector("[class='ui-autocomplete-input']")).sendKeys("a");
		//driver.findElement(By.cssSelector("#tags")).sendKeys("e");
		//driver.findElement(By.cssSelector("[id='tags']")).sendKeys("e");
		//driver.findElement(By.cssSelector("[id='tags'][class='ui-autocomplete-input']")).sendKeys("e");
		//driver.findElement(By.xpath("//*[@id='tags' and @class='ui-autocomplete-input']")).sendKeys("o");
		driver.findElement(By.xpath("//*[@id='tags' and @class='ui-autocomplete-input']")).sendKeys("o");
	
		
		//x.sendKeys("S");
		List<WebElement> el =driver.findElements(By.xpath("//*[@class='ui-menu-item']/div"));
		System.out.println(el.size());
		Actions a = new Actions(driver);
		for (WebElement webElement : el) {
			Thread.sleep(3000);
			a.moveToElement(webElement).perform();
			System.out.println(webElement.getText());
			if(webElement.getText().equalsIgnoreCase("soap")) {
				//webElement.click();
				//break;				
			}
		}
		Thread.sleep(7000);
		driver.quit();
	}
	
	
	/*
	 *  xpath   -  //tagName[@AttributeName='Att Vale']
	 *    
	 *   Css Selectore -  tagName[attBName='attvalue']
	 *   
	 *   className -  .AttributeValue
	 *   id   -       #ATtributeValue 
	 *   
	 *   
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
