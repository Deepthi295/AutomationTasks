package stepDefinationfile;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {
	WebDriver driver;
	Actions action;

	@Given("Open the Chrome browser")
	public void openthebrowser() {
		driver = new ChromeDriver();
	}

	@When("the user navigates to the URL {string}")
	public void the_user_navigates_to_the_url(String url) {
		driver.get("https://practice.expandtesting.com/login");
	}

	@Then("the user enters username as {string}")
	public void the_user_enters_username_as(String string) {
		driver.findElement(By.name("username")).sendKeys("practice");
	}

	@And("the user enters password as {string}")
	public void the_user_enters_password_as(String string) {
		driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");

	}

	@And("the user clicks on the login button")
	public void the_user_clicks_on_the_login_button() {
		action.sendKeys(Keys.PAGE_DOWN).build().perform();

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

	@Then("user is able to close the driver")
	public void the_user_should_be_redirected_to_the_home_page() {
		driver.quit();
	}

}
