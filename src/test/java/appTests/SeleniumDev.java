package appTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDev {
	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}
	@AfterTest
	public void afterTest() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}
	@Test
	public void titleTest() {
		driver.get("https://www.selenium.dev/");
		Assert.assertEquals(driver.getTitle(), "Selenium");
	}
}