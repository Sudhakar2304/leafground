package leafground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditBoxex {

	@Test
	public void editBox() throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/");
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("//*[@alt=\"Edit / Text Fields\"]"));
		System.out.println(ele.isEnabled());
		ele.click();
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("s@s.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@value=\"Append \"]")).sendKeys("Testinf");
		Thread.sleep(3000);
		String textvalue = driver.findElement(By.xpath("//*[@value='TestLeaf']")).getAttribute("value");
		System.out.println(textvalue);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@name='username'])[2]")).clear();
		Thread.sleep(2000);
		boolean isDis = driver.findElement(By.xpath("(//*[@type='text'])[5]")).isEnabled();
		System.out.println(isDis);

	}

}
