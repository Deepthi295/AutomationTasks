package com.nopcommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productpage {

	WebDriver driver;

	public Productpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[text()='Log in']")
	WebElement Login;
	@FindBy(xpath = "//p[normalize-space()='Catalog']")
	WebElement Category;
	@FindBy(xpath = "//p[normalize-space()='Products']\r\n")
	WebElement Products;
     @FindBy(xpath = "//a[@class='btn btn-primary']")
     WebElement AddNewProduct;
     
	public void ClickLogin() {
		Login.click();
	}

	public void ClickCategory() {
		Category.click();
	}

	public void ClickonProduct() {
		Products.click();
	}
	public void ClickONAddNew() {
		AddNewProduct.click();
		
	}
}
