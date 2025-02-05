package Demo.TestNGProj;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoClass {

	@Test
	public static void sampleAutomation() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//driver.findElement(By.xpath("//input[@id='alert1']")).click();		
		
		String txtget = driver.findElement(By.xpath("//a[text()='Page One']")).getText();
		
		Assert.assertEquals(txtget, "Page One");
		
	}

}

