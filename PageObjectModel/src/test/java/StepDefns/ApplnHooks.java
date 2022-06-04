package StepDefns;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.util.ConfigReader;
import com.webdriverfactory.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
public class ApplnHooks {
	private WebDriver driver;
	private DriverFactory driverFactory;
	public static ConfigReader configReader;
	public static Properties prop;
	
	
	@Before()
	public void getBrowser() {
		configReader = new ConfigReader();
		String browsername = configReader.get_prop("browser");
		driverFactory = new DriverFactory();
		driver = driverFactory.init_Driver(browsername);
	}
	
	@After(order = 0)
	public void tearDown() {
		//driver.quit();
	}
	
	//screenshots
	
	@After(order = 1)
	public void screenshot(Scenario scenario) {
		if(scenario.isFailed ()) {
			String screenshotname = scenario.getName().replaceAll(" ", "_");
			byte[] source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(source, "image/png", screenshotname);
		}
	}
}
