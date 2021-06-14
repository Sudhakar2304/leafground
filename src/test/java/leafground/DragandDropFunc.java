package leafground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDropFunc {



	@Test
	public void dragAndDropfu() throws Exception {
			WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver();
			driver.get("https://demoqa.com/");
			
			driver.findElement(By.xpath("(//*[@class='avatar mx-auto white'])[1]")).click();

	/*		WebElement drag = driver.findElement(By.id("draggable"));
			
			Actions action = new Actions(driver);
		//	action.dragAndDropBy(drag, 200, 150);
		//	action.build();
		//	action.perform();
					
			action.clickAndHold(drag).moveToElement(drag, 200, 200);
		//	action.perform();
			
			action.clickAndHold(drag).moveByOffset(300, 0).perform();
			
		*/	
		
			Thread.sleep(10000);
			driver.quit();

		}
	}
