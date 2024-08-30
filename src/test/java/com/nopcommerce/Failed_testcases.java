package com.nopcommerce;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MYListeners.class)

public class Failed_testcases extends SetUp {
MYListeners ml = new MYListeners();


	@Test
	public void test1() {
		driver.get("https://practice.expandtesting.com/");
		Assert.assertTrue(false);
		
	}

	@Test
	public void test2() {
		driver.get("https://www.amazon.in/");
		Assert.assertTrue(true);
	}

	@Test

	public void test3() {
		driver.get("https://demoqa.com/");
		Assert.assertTrue(true);

	}

	@Test
	public void test4() {
		driver.get("https://www.facebook.com/");
		Assert.assertTrue(true);
	}

	@AfterMethod
	public void close() {
		driver.close();
	}
}