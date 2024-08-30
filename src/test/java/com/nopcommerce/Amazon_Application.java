package com.nopcommerce;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazon_Application {
	WebDriver driver;

	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		

	}

	@Test
	public void searchproducts() {
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Women HandBags");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		List<WebElement> hblists = driver
				.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
		List<WebElement> hbprices = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		for (int i = 0; i < hblists.size(); i++) {
			System.out.println(hblists.get(i).getText());
			System.out.println(hbprices.get(i).getText());

		}

	}

	@AfterTest
	public void close() {
	 driver.quit();

	}
}
