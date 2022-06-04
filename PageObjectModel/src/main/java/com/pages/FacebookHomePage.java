package com.pages;

import org.openqa.selenium.WebDriver;

public class FacebookHomePage {

	private WebDriver driver;
	
	
	public FacebookHomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void launchURL(String URL) {
		driver.get(URL);
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
}
