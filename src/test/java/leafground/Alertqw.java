package leafground;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alertqw {



	@Test
	public void alertTest() throws InterruptedException {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();


		driver.get("http://www.leafground.com/pages/Alert.html");
		WebElement e1 =driver.findElement(By.xpath("//*[text()='Alert Box']"));
		System.out.println(e1.isDisplayed());
		System.out.println(e1.isEnabled());
		e1.click();

		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
			alert.accept();

		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button)[2]")).click();
		Thread.sleep(3000);
		//alert.accept();
		alert.dismiss();

		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button)[3]")).click();

		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(3000);
		System.out.println(alert.getText());
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("Sri Kumaren");
		Thread.sleep(3000);
		alert.accept();
		//alert.dismiss();

		
		driver.findElement(By.xpath("(//button)[4]")).click();
		Thread.sleep(3000);
		System.out.println(alert.getText());
		Thread.sleep(3000);
		String x = alert.getText();
		if(x.contains("today"))
			System.out.println("The text are present in new line");
		else
			System.out.println("The text doen;t contain the new lione");
		alert.accept();

		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button)[5]")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("swal-button")).click();



	}





}
