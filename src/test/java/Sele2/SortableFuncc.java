package Sele2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SortableFuncc {
	
	@Test
	public void alertTest() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/sorttable.html");
		
		List<WebElement> names= driver.findElements(By.xpath("//tr/td[2]"));
		List<String> na = new ArrayList<String>();
		System.out.println("Before adding it in List: "+na);
		
		for (WebElement webElement : names) {
			//System.out.println(webElement.getText());
			na.add(webElement.getText());	
		}
		System.out.println("After adding it in List and before sorting: "+na);
		//Collections.sort(na);
		System.out.println("After adding it in List and after sorting: "+na);
		
		
		driver.findElement(By.xpath("//th[2]")).click();
		
		List<WebElement> names1= driver.findElements(By.xpath("//tr/td[2]"));
		
		List<String> na1 = new ArrayList<String>();
		System.out.println("Before adding it in List: "+na1);
		
		for (WebElement webElement : names1) {
			//System.out.println(webElement.getText());
			na1.add(webElement.getText());	
		}
		System.out.println("After adding it in List and before sorting: "+na1);
		
		boolean x =na.equals(na1);
		System.out.println(x);
		System.out.println(na.containsAll(na1));
		System.out.println(na.contains("Gopi"));
		System.out.println(na1.contains("Gopi"));
		
		Thread.sleep(10000);
		driver.quit();
		}

}
