package StepDefns;

import com.pages.FacebookHomePage;
import com.pages.FacebookLoginPage;
import com.pages.FacebookSignupPage;
import com.util.ConfigReader;
import com.util.ExcelReader;
import com.webdriverfactory.DriverFactory;

import io.cucumber.java.en.Then;

public class FacebookSignupPageSteps {
	
	private FacebookHomePage hPage = new FacebookHomePage(DriverFactory.getDriver());
	private FacebookLoginPage lPage = new FacebookLoginPage(DriverFactory.getDriver());
	private FacebookSignupPage sPage = new FacebookSignupPage(DriverFactory.getDriver());
	
	private ConfigReader cfgReader = new ConfigReader();
	private ExcelReader xlReader = new ExcelReader();

	@Then("the user enters {string} in firstname field")
	public void the_user_enters_in_firstname_field(String string) throws Exception {
		sPage.Enterfirstname(string);
	}


}
