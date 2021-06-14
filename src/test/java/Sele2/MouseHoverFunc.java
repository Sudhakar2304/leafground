package Sele2;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHoverFunc {
	
	@Test
	public void alertTest() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/mouseOver.html#");
		
		WebElement testCou = driver.findElement(By.className("btnMouse"));
		
		java.util.List<WebElement> linkss=driver.findElements(By.xpath("//li/ul/li/a"));
		
		Actions ac = new Actions(driver);
		//ac.moveToElement(testCou).perform();
		
		for (WebElement webElement : linkss) {
			ac.moveToElement(testCou).moveToElement(webElement).perform();
			System.out.println(webElement.getAttribute("href"));
			Thread.sleep(3000);
			if(webElement.getText().equalsIgnoreCase("WebServices")) {
				Thread.sleep(3000);
				webElement.click();
				Thread.sleep(3000);
				driver.switchTo().alert().accept();
				break;
			}
			
		}
		
		
		
		
		
		
		
	Thread.sleep(10000);
	driver.quit();
	}
}
