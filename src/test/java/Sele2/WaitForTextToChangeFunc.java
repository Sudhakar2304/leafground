package Sele2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForTextToChangeFunc {


	@Test
	public void m1() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/TextChange.html");

		By textApp = By.xpath("//button[contains(text(),'Click ME!')]");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(text(),'Click ME!')]")));

		driver.findElement(textApp).click();
		Thread.sleep(3000);
		if(driver.switchTo().alert().getText().equalsIgnoreCase("Clicyk ME!")) {
			driver.switchTo().alert().accept();
		}else
			System.out.println("Method failed");

		//	String x =textApp.getText();
		////*[contains(text(),'going to c')]
		// I'm going to change !!


		/*	driver.get("http://www.leafground.com/pages/appear.html");
		List<WebElement> x =driver.findElements(By.xpath("//*[@class='flex']/button/b"));

		Wait w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.visibilityOfAllElements(x));

		for (WebElement webElement : x) {
			System.out.println(webElement.getText());
		}
		 */
		Thread.sleep(10000);
		driver.quit();

	}
}
