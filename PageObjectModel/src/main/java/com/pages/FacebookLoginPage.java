package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage {
private WebDriver driver;
	private By username_webedit = By.xpath("//input[@name='email']");
	private By password_webedit = By.xpath("//input[@name='pass']");
	private By login_webbutton = By.xpath("//input[@name='login']");
	private By signup_webbutton = By.xpath("//a[@data-testid=\"open-registration-form-button\"]");
	
	@FindBy (xpath = "//input[@name='email']")
	WebElement username_Editbox;
	
	
	@FindBy (xpath = "//input[@name='pass']")
	WebElement password_Editbox;
	
	@FindBy (xpath = "//input[@name='log']")
	WebElement login_Button;
	
	
	public FacebookLoginPage(WebDriver driver) {
		this.driver = driver;//by method
		PageFactory.initElements(driver, this);//findBy
		
	}
	
	public void EnterUsername(String user) {
		username_Editbox.sendKeys(user);
	}
	
	public void EnterPasswordwithBy(String password) {
		driver.findElement(password_webedit).sendKeys(password);
		//login_Button.click();
	}
	
	public void signupclick() {
		driver.findElement(signup_webbutton).click();
	}
	
}
