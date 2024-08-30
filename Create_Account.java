package stepdefinationfail;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pom_package.Register_page;


public class Create_Account {
	 static WebDriver driver;
	 Register_page rp;

	
	@Test
	public void ClickOnCreate() {
		Register_page rp = new Register_page(driver);
        rp.ClickOnCreate();
	}

}
