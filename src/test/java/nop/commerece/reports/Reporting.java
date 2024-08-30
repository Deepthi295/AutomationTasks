package nop.commerece.reports;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Reporting extends SetUp {

	@Test
	public void test1() {
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		Assert.assertTrue(true);
	}

	@Test

	public void test2() {
		driver.get("https://x.com/");
		System.out.println(driver.getTitle());
		Assert.assertTrue(true);

	}

	@Test

	public void test3() {
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		Assert.assertTrue(false);

	}

	@Test

	public void test4() {
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		Assert.assertTrue(false);

	}

}
