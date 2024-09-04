package automation_tasks;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;

@Test(dataProvider = "SubmitForm")
public class Automation_task_3 {
	WebDriver driver;
	Actions action;

	public void FormSubmission(String Name, String SurName, String Email, String PhoneNumber, String DT)
			throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		action = new Actions(driver);

		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(Name);
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(SurName);
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys(Email);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='gender-radio-2']")).click();
		driver.findElement(By.xpath("//input[@id='userNumber']\n")).sendKeys(PhoneNumber);

//		==============================================================================================================

		WebElement date = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		date.click();
		String month = DT.split(" ")[1]; // 9 //---> 2023 9 13

		System.out.println(Integer.valueOf(month));

		WebElement dd_month = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		Thread.sleep(2000);

		Select select = new Select(dd_month);
		select.selectByIndex(Integer.valueOf(month));
		Thread.sleep(2000);

		String year = DT.split(" ")[0];
		System.out.println((year));

		WebElement dd_year = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		Thread.sleep(2000);

		Select select1 = new Select(dd_year);
		select1.selectByVisibleText(year);
		Thread.sleep(2000);

		String day1 = DT.split(" ")[2]; // 13SUBJECT
		WebElement dt = driver.findElement(By.xpath("(//div[@class='react-datepicker__week'])[3]"));// div[contains(@class,'"+date+"')];
		dt.click();
		Thread.sleep(2000);
		// ===================================================================================
		//driver.findElement(By.xpath("//button[@id='submit']")).click();

		driver.close();

	}

	@DataProvider
	public Object[][] SubmitForm() {
		Object[][] data = new Object[3][5];
		// 1st set of data
		data[0][0] = "Deepthi";
		data[0][1] = "Padigepati";
		data[0][2] = "deepthireddy@gmail.com";
		data[0][3] = "9849434489";
		data[0][4] = "1995 2 29";

		// 2nd set of data
		data[1][0] = "Sunitha";
		data[1][1] = "padigepati";
		data[1][2] = "SunithaRamesh@gmail.com";
		data[1][3] = "9701446092";
		data[1][4] = "1996 6 23";

//3rd set of data 
		data[2][0] = "Nithya";
		data[2][1] = "Poreddy";
		data[2][2] = "Nithyaporeddy@gmail.com";
		data[2][3] = "7207738508";
		data[2][4] = "1997 01 27";

		return data;
	};
}
