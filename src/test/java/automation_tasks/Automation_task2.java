package automation_tasks;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_task2 {
	WebDriver driver;

	@Test
	public void Verify_exceldata() throws IOException, InterruptedException {
		String path = System.getProperty("user.dir");
		System.out.println(path);
		File file = new File(path + "\\src\\test\\resources\\ExcelSheet\\Book1.xlsx");
		System.out.println(file);
		FileInputStream fis = new FileInputStream(file);
		System.out.println(fis);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		System.out.println(wb);
		Sheet sheet = wb.getSheetAt(0);
		int rowscount = sheet.getPhysicalNumberOfRows();
		int columncount = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println(columncount);
		String message = sheet.getRow(7).getCell(1).getStringCellValue();
		for (int i = 0; i < rowscount; i++) {
			Row row = sheet.getRow(i + 1);
			String search = row.getCell(0).getStringCellValue();

			WebElement search1 = driver.findElement(By.xpath("//input[@placeholder='Search AJIO']"));
			search1.clear();
			Thread.sleep(1000);
			search1.sendKeys(search);
			Thread.sleep(1000);
			WebElement tap = driver.findElement(By.xpath("//span[@class='ic-search']"));
			tap.click();
			Thread.sleep(1000);

			try {
				WebElement product = driver.findElement(By.xpath("//div[@class=\"facet-arwup facet-typehead \"]"));

				boolean element = product.isDisplayed();
				assertTrue(element);
				System.out.println("successfully product is displayed");
			} catch (Exception e) {
				String error = driver.findElement(By.xpath("//div[@class='fnl-slpsearch-firstLine']")).getText();
				boolean msg = error.equalsIgnoreCase(message);
				assertTrue(msg);
				System.out.println("error message is displayed");

			}

		}
	}

	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

	}

	@AfterTest
	public void close() {
		driver.close();
	}

}
