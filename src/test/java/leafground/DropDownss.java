package leafground;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownss {


	@Test
	public void dropDowns() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Dropdown.html");
		WebElement select1 = driver.findElement(By.id("dropdown1"));
		Select se = new Select(select1);
		se.selectByVisibleText("Selenium");
		Thread.sleep(3000);
		se.selectByIndex(3);
		Thread.sleep(3000);
		se.selectByValue("2");

		Thread.sleep(3000);
		List<WebElement> opt = driver.findElements(By.xpath("//*[@class=\"dropdown\"]/option"));
		System.out.println(opt.size());

		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class=\"example\"])[5]/select")).sendKeys("Appium");

		Thread.sleep(3000);
		/*	driver.findElement(By.xpath("(//*[@class=\"example\"])[6]/select/option[2]")).click();
		driver.findElement(By.xpath("(//*[@class=\"example\"])[6]/select/option[3]")).click();
		driver.findElement(By.xpath("(//*[@class=\"example\"])[6]/select/option[4]")).click();
		driver.findElement(By.xpath("(//*[@class=\"example\"])[6]/select/option[3]")).click();
		 */	
		List<WebElement> d = driver.findElements(By.xpath("(//*[@class=\"example\"])[6]/select/option"));
		int size = d.size();

		
		
		
		for (WebElement webElement : d) {
			Thread.sleep(3000);
			webElement.click();
		}

		for(int i=0 ; i<size ;i++) {
			Thread.sleep(3000);
			d.get(i).click();
		}









	}

}
