package automation_tasks;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class Automation_task3 {
	WebDriver driver;
	Actions action;
	WebDriverWait wait;

	
  @Test
  public void f() {
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
  }

}
