package Sele2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertWaitFunc {
	
	
	@Test
	public void m1() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/alertappear.html");
		
		driver.findElement(By.xpath("//*[@id='alert']")).click();
		
		//Thread.sleep(5000);
		
		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		
		
		
		Thread.sleep(10000);
		driver.quit();

	}

}
