package nop.commerece.reports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class SetUp {

	WebDriver driver;

	@BeforeMethod
	public void Setup() {
		driver = new ChromeDriver();

	}
	@AfterTest
	public void Close() {
		driver.quit();
	}

}
