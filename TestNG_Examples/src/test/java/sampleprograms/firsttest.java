package sampleprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class firsttest {
	WebDriver driver;
	@BeforeMethod
	public void initDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("Before methd");
	}
	@Test
	public void google() {	
		driver.get("https://www.google.com/");
		System.out.println("Google");
	}
	
	@Test
	public void facebook() {
		driver.get("https://www.facebook.com/");
		System.out.println("facebook");
	}
	
	@AfterMethod
	public void closebrowser() {
		driver.close();
		System.out.println("aftermethods");
	}
}
