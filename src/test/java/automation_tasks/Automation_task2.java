package automation_tasks;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Automation_task2 {
	WebDriver driver;
	Actions action;
	WebDriverWait wait;
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
		for (int i = 0; i < rowscount; i++) {
			Row row = sheet.getRow(i);
			String search = row.getCell(0).getStringCellValue();
			WebElement search1 = driver.findElement(By.xpath("//input[@placeholder='Search AJIO']"));
			search1.clear();
			Thread.sleep(1000);
          search1.sendKeys(search);
          Thread.sleep(1000);
          WebElement tap = driver.findElement(By.xpath("//span[@class='ic-search']"));
			tap.click();
          Thread.sleep(1000);
  String  message = driver.findElement(By.xpath("//div[@class='fnl-slpsearch-firstLine']")).getText();
   if(((String) message).contains("Sorry! We couldn't find any matching items for")) {
        	 System.out.println("Product not found");
        	 
         }else {
        	 System.out.println("Product is available ");
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

