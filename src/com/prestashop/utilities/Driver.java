package com.prestashop.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Driver {
	public static WebDriver getDriver(String browserType) {
		
		WebDriver driver=null;
		
		switch(browserType) {
		
		case "chrome" :
			System.setProperty("webdriver.chrome.driver", 
					"/Users/muratdinc/Documents/Libraries/drivers/chromedriver");
			driver=new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver",
					"/Users/muratdinc/Documents/Libraries/drivers/geckodriver");
			driver=new FirefoxDriver();
			break;
		case "safari":
			driver=new SafariDriver();
			break;
			
		}
		return driver;
	}

}
