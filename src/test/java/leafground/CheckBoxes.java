package leafground;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxes {



	@Test
	public void checkBoxes() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/checkbox.html");
		System.out.println(driver.getTitle());
		WebElement checkJava = driver.findElement(By.xpath("(//*[@type=\"checkbox\"])[1]"));
		Thread.sleep(3000);
		System.out.println("Java is Checked?: "+checkJava.isSelected());
		Thread.sleep(3000);
		checkJava.click();
		Thread.sleep(3000);
		System.out.println("Java is Checked?: "+checkJava.isSelected());
		Thread.sleep(3000);

		WebElement checkSelenium = driver.findElement(By.xpath("(//*[@type=\"checkbox\"])[6]"));
		Thread.sleep(3000);
		System.out.println("checkSelenium is Checked?: "+checkSelenium.isSelected());
		Thread.sleep(3000);

		WebElement DeSelect = driver.findElement(By.xpath("(//*[@type=\"checkbox\"])[8]"));
		Thread.sleep(3000);
		System.out.println("DeSelect is Checked?: "+DeSelect.isSelected());
		Thread.sleep(3000);
		DeSelect.click();
		Thread.sleep(3000);
		System.out.println("DeSelect is Checked?: "+DeSelect.isSelected());
		

		List<WebElement> count = driver.findElements(By.xpath("(//*[@class=\"example\"])[4]/div/input"));
		int si = count.size();

		for (WebElement webElement : count) {
			webElement.click();
			Thread.sleep(3000);
		}

		for(int i=0 ; i<si ; i++){
			Thread.sleep(3000);
			count.get(i).click();
		}
	}

}
