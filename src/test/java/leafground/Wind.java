package leafground;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wind {
	
	@Test
	public void win1() throws InterruptedException {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		String parentWind = driver.getWindowHandle();
		driver.findElement(By.xpath("(//*[@class='large-6 small-12 columns'])[2]/button")).click();
		Set<String> childWind = driver.getWindowHandles();
		
		Iterator<String> win =childWind.iterator();
		
		String firstChildWin =win.next();
		String secondChildWin =win.next();
		String thirdChildWin =win.next();
		
		System.out.println(parentWind);
		Thread.sleep(3000);
		System.out.println(firstChildWin);
		Thread.sleep(3000);
		System.out.println(secondChildWin);	
		Thread.sleep(3000);
		System.out.println(thirdChildWin);	
		
		
		driver.switchTo().window(secondChildWin);
		Thread.sleep(5000);
		driver.close();
		
		driver.switchTo().window(parentWind);
		//driver.switchTo().window(thirdChildWin);
		Thread.sleep(5000);
		driver.quit();
		
		
	}

}
