package StepDefns;

import com.pages.FacebookHomePage;
import com.pages.FacebookLoginPage;
import com.util.ConfigReader;
import com.util.ExcelReader;
import com.webdriverfactory.DriverFactory;

import io.cucumber.java.en.Then;

public class LoginPageSteps {
	private FacebookHomePage hPage = new FacebookHomePage(DriverFactory.getDriver());
	private FacebookLoginPage lPage = new FacebookLoginPage(DriverFactory.getDriver());
	
	private ConfigReader cfgReader = new ConfigReader();
	private ExcelReader xlReader = new ExcelReader();


	@Then("the user enters {string} in username field")
	public void the_user_enters_in_username_field(String string) throws Exception {
		string = xlReader.ExcelData("Facebook", "Username");
		lPage.EnterUsername(string);
	}

	@Then("the user enters {string} in password field")
	public void the_user_enters_in_password_field(String string) throws Exception {
		lPage.EnterPasswordwithBy(xlReader.ExcelData("Facebook", "Password"));
	}


@Then("the user clicks on signup button")
public void the_user_clicks_on_signup_button() {
    // Write code here that turns the phrase above into concrete actions
	lPage.signupclick();
}



//	@Then("user clicks on signup button")
//	public void clicksignup() {
//		lPage.signupclick();
//	}
//

}
