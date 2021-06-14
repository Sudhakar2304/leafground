package Sele2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SortableEx {
	
	
	@Test
	public void m1() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
	/*	driver.get("http://www.leafground.com/pages/sortable.html");
		List<WebElement> nos =driver.findElements(By.xpath("//*[@id='mydiv']/ul/li"));
		int count = nos.size();
		System.out.println(count);
		
		Thread.sleep(5000);
		
		//Point //Dimension //Actions -- Class
		//Alert //WebELement -- Interface
		
		WebElement from = nos.get(4);
		WebElement to = nos.get(2);
		
		Actions action = new Actions(driver);
		action.clickAndHold(from).pause(3000).moveToElement(to).pause(5000);
		action.release(to).build().perform();
		//action.dragAndDrop(no.get(1), no.get(5)).build().perform();
		
	*/	
		driver.get("https://demoqa.com/sortable");
		
		List<WebElement> el =driver.findElements(By.xpath("//*[@class='vertical-list-container mt-4']/div"));
		Actions action = new Actions(driver);
		action.dragAndDrop(el.get(1), el.get(4)).build().perform();
		//action.clickAndHold(el.get(5)).pause(4000).moveToElement(el.get(2)).pause(4000).release().build().perform();
		
		Thread.sleep(15000);
		driver.quit();
		
	}

}
