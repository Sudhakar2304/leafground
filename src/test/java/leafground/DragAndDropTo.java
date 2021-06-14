package leafground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropTo {



	@Test
	public void dragAndDropfu() throws Exception {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

		driver.get("http://www.leafground.com/pages/drop.html");

		WebElement from = driver.findElement(By.id("draggable"));
		WebElement to = driver.findElement(By.id("droppable"));

		Actions ac = new Actions(driver);
		//ac.dragAndDrop(from, to).build().perform();
		//ac.clickAndHold(from).moveToElement(to).release(to).build().perform();
		//ac.clickAndHold(from).moveByOffset(200, 200).perform();
		System.out.println(to.getLocation().getX() +" "+ to.getLocation().getY());
		ac.clickAndHold(from).moveByOffset(to.getLocation().getX(), to.getLocation().getY()).perform();
		
		
		Thread.sleep(10000);
		driver.quit();
	}
}
