package sampleprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	WebDriver driver;
	@BeforeClass
	public void initDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println("Before methd");
	}
	
	@Test(priority=1)
	public void Launchfacebook() {
		driver.get("https://www.facebook.com/");
		System.out.println("Launchfacebook");
	}
	
	@Test(priority=2)
	public void CreateNewAcct() {	
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-but']")).click();
		System.out.println("CreateNewAcct");
	}

	@Test(dependsOnMethods= {"CreateNewAcct"})
	public void Signup() {	
		driver.findElement(By.name("firstname")).sendKeys("Hello");
		System.out.println("Signup");
	}
	
	@AfterClass
	public void closebrowser() {
		driver.close();
		System.out.println("aftermethods");
	}
}
