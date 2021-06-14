package Sele2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tooltipfunc {


	@Test
	public void m1() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/tooltip.html");
		
		String title =driver.findElement(By.xpath("//*[@id='age']")).getAttribute("title");
		System.out.println(title);

		System.out.println(driver.findElement(By.xpath("//*[@id='age']")).getAttribute("id"));
		Thread.sleep(10000);
		driver.quit();

	}

}
