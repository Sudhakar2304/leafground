package leafground;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectab {



	@Test
	public void dragAndDropfu() throws Exception {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

		driver.get("http://www.leafground.com/pages/selectable.html");
		
		List<WebElement> se = driver.findElements(By.xpath("//*[@id='selectable']/li"));
		System.out.println(se.size());
		
		Actions ac = new Actions(driver);
	/*	ac.click(se.get(1)).pause(3000);
		ac.click(se.get(3)).pause(5000);
		ac.click(se.get(5)).pause(Duration.ofSeconds(5));
		ac.click(se.get(0)).pause(3000);
		ac.click(se.get(2)).pause(5000);
		ac.click(se.get(4)).pause(Duration.ofSeconds(5));
		ac.click(se.get(6)).pause(Duration.ofSeconds(5));
	*/
		
		ac.keyDown(Keys.COMMAND);
		ac.click(se.get(1)).pause(5000);
		ac.click(se.get(3)).pause(5000);
		ac.click(se.get(5)).pause(5000);
		
		ac.build().perform();
		
		Thread.sleep(10000);
		driver.quit();

	}
}
