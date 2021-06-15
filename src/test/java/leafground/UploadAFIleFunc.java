package leafground;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadAFIleFunc {


	@Test
	public void m1() throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/upload.html");
		WebElement x =driver.findElement(By.name("filename"));
		String xx ="/Users/Sudhakar/Downloads/testleaf.xlsx";
		Runtime.getRuntime().exec(xx);
		Thread.sleep(10000);
		driver.quit();
	}
}
