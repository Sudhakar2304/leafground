package leafground;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloadFilesFunc {

	@Test
	public void m1() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/download.html");
		driver.findElement(By.linkText("Download Excel")).click();
		Thread.sleep(5000);

		String excelFile = "/Users/Sudhakar/Downloads";
		File x = new File(excelFile);
		File[] nameOfFIle = x.listFiles();

		for(File file : nameOfFIle) {

			if(file.getName().contains("testleaf")) {
				System.out.println("We found the expected file");
				System.out.println(file.getAbsolutePath());
				break;
			} else 
				System.out.println("Expected file is not found");

		}

		Thread.sleep(10000);
		driver.quit();
	}

}
