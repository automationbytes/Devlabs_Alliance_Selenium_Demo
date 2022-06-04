package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FacebookSignupPage {
	private WebDriver driver;
	private By firstname_webedit = By.xpath("//input[@name='firstname']");
	
	public FacebookSignupPage(WebDriver driver) {
		this.driver = driver;//by method
		
	}
	
	public void Enterfirstname(String user) {
		driver.findElement(firstname_webedit).sendKeys(user);
	}
	
	
}
