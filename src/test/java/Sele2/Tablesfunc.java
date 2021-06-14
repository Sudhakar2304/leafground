package Sele2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tablesfunc {



	@Test
	public void m1() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/table.html");
		List<WebElement> si=driver.findElements(By.tagName("th"));
		System.out.println("No of columns: "+si.size());

		int count = driver.findElements(By.tagName("th")).size();
		System.out.println("No of columns: "+count);

		System.out.println("No of columns: "+driver.findElements(By.tagName("th")).size());

		int rows =	driver.findElements(By.xpath("//tr")).size();
		System.out.println("No of rows: "+ rows);
		
		String valueOfString =driver.findElement(By.xpath("//tr[3]/td[2]")).getText();
		System.out.println("valueOfString "+valueOfString);
		
		driver.findElement(By.xpath("//tr[4]/td[3]/input")).click();

		Thread.sleep(10000);
		driver.quit();

	}

}
