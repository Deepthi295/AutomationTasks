package com.nopcommerce;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Product_Test {

     static WebDriver driver;
	 Productpage pp;

	
	@Test
	public void ClickLogin() {
		Productpage pp = new Productpage(driver);
        pp.ClickLogin();
	}

	@Test
	public void ClickCategory() {
		Productpage pp = new Productpage(driver);
        pp.ClickCategory();
	}

	@Test
	public void ClickonProduct() {
		Productpage pp = new Productpage(driver);
        pp.ClickonProduct();
        }
	@Test
	public void ClickOnAddNew() {
		Productpage pp = new Productpage(driver);
          pp.ClickONAddNew();
          }
	@Test 
	
	
	
	
	@BeforeTest
	public void SetUp() {
		driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		}
	@AfterTest 
	
	public void afterMethod() {
		driver.quit();

	}

}
