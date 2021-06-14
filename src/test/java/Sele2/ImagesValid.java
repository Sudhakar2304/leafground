package Sele2;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImagesValid {


	@Test
	public void m1() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Image.html");
		Thread.sleep(3000);
		WebElement img1=driver.findElement(By.xpath("//*[@src='../images/home.png']"));
		System.out.println(img1.getAttribute("naturalWidth"));

		Thread.sleep(3000);
		//driver.navigate().back();
		WebElement image = driver.findElement(By.xpath("(//*[@class='large-6 small-12 columns'])[position()=2]/img"));
		String img =image.getAttribute("src");
		System.out.println(img);
		System.out.println(image.getAttribute("naturalWidth"));

		if(image.getAttribute("naturalWidth").equals("0"))
			System.out.println("Image is Broken");
		else
			System.out.println("Image is not broken");


		URL url = new URL(img);
		HttpURLConnection ht = (HttpURLConnection) url.openConnection();
		ht.setConnectTimeout(3000);
		ht.connect();

		System.out.println(ht.getResponseCode());
		if(ht.getResponseCode()==404)
			System.out.println("Page is breaking");
		else
			System.out.println("page is not breaking");



		Thread.sleep(10000);
		driver.quit();

	}

}
