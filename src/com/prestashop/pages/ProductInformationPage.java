package com.prestashop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductInformationPage {
	public ProductInformationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(css = "h1")
	public WebElement productName;
	
	@FindBy(id="quantity_wanted")
	public WebElement qty;
	
	@FindBy(css= "#uniform-group_1>span")
	public WebElement selectedSize;

}
