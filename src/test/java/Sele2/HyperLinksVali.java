package Sele2;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperLinksVali {


	@Test
	public void m1() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/Link.html#");

		WebElement goHPage = driver.findElement(By.linkText("Go to Home Page"));
		Thread.sleep(3000);
		goHPage.click();
		Thread.sleep(3000);
		driver.navigate().back();

		Thread.sleep(3000);
		WebElement pageRedir = driver.findElement(By.partialLinkText("Find where am supposed to"));
		System.out.println(pageRedir.getAttribute("href"));

		Thread.sleep(3000);
		driver.findElement(By.linkText("Verify am I broken?")).click();
		System.out.println(driver.getTitle());

		if(driver.getTitle().contains("404"))
			System.out.println("My Page iS broken");
		else
			System.out.println("Page is not broken");

		driver.navigate().back();

		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[text()='Go to Home Page'])[2]")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		
		Thread.sleep(3000);
		List<WebElement> noLinks =driver.findElements(By.tagName("a"));
		System.out.println(noLinks.size());
		
		
		for (WebElement webElement : noLinks) {
			System.out.println(webElement.getAttribute("href"));
			String img = webElement.getAttribute("href");
			URL url = new URL(img);
			HttpURLConnection ht = (HttpURLConnection) url.openConnection();
			ht.setConnectTimeout(3000);
			ht.connect();
			System.out.println(ht.getResponseCode());
			
		}
		


		Thread.sleep(10000);
		driver.quit();

	}

}
