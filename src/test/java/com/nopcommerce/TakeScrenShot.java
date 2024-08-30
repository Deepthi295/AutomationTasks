package com.nopcommerce;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TakeScrenShot {

	WebDriver driver;

	@Test
	public void Test1() throws IOException {
		driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/");
		takeScrenS();

		driver.findElement(By.xpath("//a[text()='Automation Training']")).click();
		takeScrenS();

	}

	public void takeScrenS() throws IOException {
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss");
//		String now = LocalDateTime.now().format(dtf);

		Date d1 = new Date();
		long l = d1.getTime();

		// interface to take a take screenshot
		TakesScreenshot tk = (TakesScreenshot) driver;
		// int a;
		// float b = 10.5;
		// int a = (int)b;
		File file = tk.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("./Screenshots/" + l + "myscrenshot.png"));

	}

}
