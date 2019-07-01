package com.prestashop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInWithGooglePage {
	public void SignInWithGoogle(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//*[@id=\"index\"]/div[2]/div/div/div/div/div/div/div[1]/div/div")
	public WebElement googleSignIn;

}
