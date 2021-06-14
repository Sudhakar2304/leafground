package leafground;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Buttons {


	@Test
	public void buttons() throws Exception {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();


		driver.get("http://www.leafground.com/pages/Button.html");
		Thread.sleep(3000);
		driver.findElement(By.id("home")).click();
		driver.navigate().back();
		WebElement post = driver.findElement(By.xpath("//*[@id='position']"));
		System.out.println(post.getLocation().getX());
		System.out.println(post.getLocation().getY());
		Point getXY =post.getLocation();
		System.out.println(getXY.x + " "+getXY.y);
		WebElement  colour = driver.findElement(By.xpath("//*[@id='color']"));
		String co = colour.getCssValue("background-color");
		System.out.println(Color.fromString(co).asHex());
		System.out.println(co);
		WebElement si = driver.findElement(By.xpath("//*[@id='size']"));
		System.out.println(si.getSize().getHeight());
		System.out.println(si.getSize().getWidth());

		Dimension d =si.getSize();
		System.out.println(d.getHeight() + " "+ d.getWidth());
	}

}
