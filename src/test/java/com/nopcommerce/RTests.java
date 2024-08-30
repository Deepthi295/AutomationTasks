package com.nopcommerce;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RTests {
	
	@Test(retryAnalyzer = Mylisterners.class)

	 public void test1() {
		 System.out.println("Hellow world");
		 Assert.assertTrue(false);
	 }
}
