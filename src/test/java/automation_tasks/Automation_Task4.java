package automation_tasks;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class Automation_Task4 {
	WebDriver driver;

	@Test(priority = 1)
	public void Verifythecheckout() throws InterruptedException {
		driver.findElement(By.xpath("//button[@name='add-to-cart-sauce-labs-backpack']")).click();
		driver.findElement(By.xpath("//button[@name='add-to-cart-sauce-labs-fleece-jacket']")).click();
		driver.findElement(By.xpath("//button[@name='add-to-cart-sauce-labs-bike-light']")).click();
		driver.findElement(By.xpath("//button[@name='add-to-cart-test.allthethings()-t-shirt-(red)']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		driver.findElement(By.id("remove-sauce-labs-backpack")).click();

		driver.findElement(By.id("checkout")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("first-name")).sendKeys("deepthi");
		driver.findElement(By.id("last-name")).sendKeys("padigepati");
		driver.findElement(By.id("postal-code")).sendKeys("400040");
		Thread.sleep(2000);

		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("finish")).click();
		

	}

	@Test(priority = 2)
	public void VerifyEmptyCheckout() throws InterruptedException {
		driver.findElement(By.xpath("//button[@name='add-to-cart-sauce-labs-backpack']")).click();
		driver.findElement(By.xpath("//button[@name='add-to-cart-sauce-labs-fleece-jacket']")).click();
		driver.findElement(By.xpath("//button[@name='add-to-cart-sauce-labs-bike-light']")).click();
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();

		driver.findElement(By.id("remove-sauce-labs-backpack")).click();
		driver.findElement(By.id("remove-sauce-labs-fleece-jacket")).click();
		driver.findElement(By.id("remove-sauce-labs-bike-light")).click();

		driver.findElement(By.id("checkout")).click();

		driver.findElement(By.id("first-name")).sendKeys("deepthi");
		driver.findElement(By.id("last-name")).sendKeys("padigepati");
		driver.findElement(By.id("postal-code")).sendKeys("400040");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("finish")).click();


	}

	@BeforeMethod
	public void SetUp() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/inventory.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(2000);

	}

	@AfterMethod
	public void quit() {
		 driver.close();

	}

}
