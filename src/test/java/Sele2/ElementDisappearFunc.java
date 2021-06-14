package Sele2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementDisappearFunc {



	@Test
	public void m1() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/disapper.html");
		WebElement x=driver.findElement(By.xpath("//*[@class='disappear']/button/b"));
		System.out.println(x.isDisplayed());
		System.out.println(driver.findElement(By.xpath("//strong")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//strong")).getText());
		Wait s = new WebDriverWait(driver, 10);
		s.until(ExpectedConditions.invisibilityOf(x));
		
		System.out.println(x.isDisplayed());
		System.out.println(driver.findElement(By.xpath("//strong")).getText());
		
		Thread.sleep(10000);
		driver.quit();

	}
}
