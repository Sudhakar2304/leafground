package Sele2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calender {




	@Test
	public void m1() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Calendar.html");
		driver.findElement(By.xpath("//*[@id='datepicker']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[text()='10']")).click();
		List<WebElement> el= driver.findElements(By.xpath("//*[@class='ui-state-default']"));

		for (WebElement webElement : el) {

			System.out.println(webElement.getText());

			if(webElement.getText().equalsIgnoreCase("30")) {
				webElement.click();
				Thread.sleep(2000);
			}
		}

		Thread.sleep(15000);
		driver.quit();

	}

}
