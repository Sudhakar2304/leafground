package Sele2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToC {


	@Test
	public void m1() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/sorttable.html");

		List<WebElement> lis =driver.findElements(By.xpath("//tr/td[2]"));
		ArrayList<String> list = new ArrayList<String>();
		for (WebElement webElement : lis) {
			System.out.println(webElement.getText());
			list.add(webElement.getText());
		}
		System.out.println(list);

		//Collections.sort(list);
		System.out.println(list);

		driver.findElement(By.xpath("//th[2]")).click();
		List<WebElement> lis1 =driver.findElements(By.xpath("//tr/td[2]"));
		ArrayList<String> list1 = new ArrayList<String>();
		for (WebElement webElement : lis1) {
			System.out.println(webElement.getText());
			list1.add(webElement.getText());
		}
		System.out.println(list1);
		
		System.out.println(list.equals(list1));
		
		driver.get("http://www.leafground.com/pages/mouseOver.html");
		WebElement x =driver.findElement(By.className("btnMouse"));
		List<WebElement> noOf = driver.findElements(By.xpath("//li/ul/li/a"));
		
		Actions ac = new Actions(driver);
		ac.moveToElement(x).perform();
		for (WebElement webElement : noOf) {
			System.out.println(webElement.getAttribute("href"));
			ac.moveToElement(webElement).pause(5000).perform();
			
		}
		
		Thread.sleep(10000);
		driver.quit();
	}
}
