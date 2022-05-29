package sampleprograms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.ExcelReader;
import io.github.bonigarcia.wdm.WebDriverManager;


public class FB {
	public static void main(String[] args) throws Exception {
		
		ExcelReader r = new ExcelReader();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get(r.ExcelData("OrangeHRM", "url"));
		driver.findElement(By.name("txtUsername")).sendKeys(r.ExcelData("OrangeHRM", "Username"));
		driver.findElement(By.name("txtPassword")).sendKeys(r.ExcelData("OrangeHRM", "Password"));
		
		
	}

}
