package leafground;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesHandling {



	@Test
	public void framesh() throws Exception {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");


		//driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='default.html']")));
		Thread.sleep(3000);
		driver.findElement(By.id("Click")).click();


		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@src='page.html']"))).switchTo().frame("frame2");;
		//driver.switchTo().frame("frame2");
		driver.findElement(By.xpath("//*[@id='Click1']")).click();
		
		driver.switchTo().defaultContent();
		System.out.println(driver.findElements(By.xpath("//iframe")).size());
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		

		Thread.sleep(8000);
		driver.quit();

	}

}
