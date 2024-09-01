package automation_tasks;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;

@Test(dataProvider="SubmitForm")
public class Automation_task_3 {
	WebDriver driver;

	public void FormSubmission(String Name, String SurName, String Email, String PhoneNumber, String Year, String Month, String Subject) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(Name);
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(SurName);
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys(Email);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='gender-radio-2']")).click();
		driver.findElement(By.xpath("//input[@id='userNumber']\n")).sendKeys(PhoneNumber);
		driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();
		new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")))
				.selectByVisibleText(Year);
		new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")))
				.selectByVisibleText(Month);		
		Thread.sleep(2000);
	   driver.findElement(By.xpath("//div[text()=\"15\"]")).click();
		driver.findElement(By.xpath("//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']")).sendKeys(Subject);
        driver.close();

	}

	@DataProvider
	public Object[][] SubmitForm() {
		Object[][] data = new Object[3][7];
		// 1st set of data
		data[0][0] = "Deepthi";
		data[0][1] = "Padigepati";
		data[0][2] = "deepthireddy@gmail.com";
		data[0][3] = "9849434489";
		data[0][4] ="1995";
		data[0][5] ="Aug";
		data[0][6]="maths";
		
		// 2nd set of data
		data[1][0] = "Sunitha";
		data[1][1] = "padigepati";
		data[1][2] = "SunithaRamesh@gmail.com";
		data[1][3] = "9701446092";
		data[1][4] ="1996";
		data[1][5] ="Aug";
		data[1][6]="english";

//3rd set of data 
		data[2][0] = "Nithya";
		data[2][1] = "Poreddy";
		data[2][2] = "Nithyaporeddy@gmail.com";
		data[2][3] = "7207738508";
		data[2][4] ="1997";
		data[2][5] ="Aug";
		data[2][6]="science";

		return data;
	};
}
