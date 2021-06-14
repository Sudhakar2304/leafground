package leafground;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {


	@Test
	public void radioButton() throws Exception {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.leafground.com/pages/radio.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class='myradio'])[2]")).click();
		Thread.sleep(3000);
		WebElement ch1 =driver.findElement(By.xpath("(//*[@name='news'])[1]"));
		System.out.println(ch1.isSelected());
		System.out.println(ch1.isEnabled());
		ch1.click();
		System.out.println(ch1.isSelected());
		
		Thread.sleep(3000);
		int a=25;
		while(a<21 ) {
			System.out.println("My age is 19");
		driver.findElement(By.xpath("(//*[@class='large-6 small-12 columns'])[3]/input[1]")).click();
		break;
		}
		while(a>40) {
			System.out.println("My age is 41");
			driver.findElement(By.xpath("(//*[@class='large-6 small-12 columns'])[3]/input[3]")).click();
			break;
			}
			
		
	}

}
