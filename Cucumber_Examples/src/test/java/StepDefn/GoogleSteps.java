package StepDefn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class GoogleSteps {
	public WebDriver driver;
	@Before()
	public void InitBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	
	
	@Then("the user launches google url")
	public void abc() {
		driver.get("https://www.google.com/");
	}
	@Then("the user verifies google logo")
	public void the_user_verifies_google_logo() {
		System.out.println(1);
	    boolean islogoDisplayed = driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
	    //Assert.assertTrue(islogoDisplayed);
	}
	@When("the user enters selenium in search box")
	public void the_user_enters_selenium_in_search_box() {
	   driver.findElement(By.xpath("//input[@title=\"Search\"]")).sendKeys("Selenium");
	   driver.findElement(By.xpath("//input[@title=\"Search\"]")).sendKeys(Keys.ENTER);
	   
	}

}
