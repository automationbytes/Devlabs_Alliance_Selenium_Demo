package StepDefns;

import com.pages.*;
import com.util.ConfigReader;
import com.util.ExcelReader;
import com.webdriverfactory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;

public class Facebook {

	private FacebookHomePage hPage = new FacebookHomePage(DriverFactory.getDriver());
	private FacebookLoginPage lPage = new FacebookLoginPage(DriverFactory.getDriver());
	
	private ConfigReader cfgReader = new ConfigReader();
	private ExcelReader xlReader = new ExcelReader();
	@Given("the user launches facebook")
	public void the_user_launches_facebook() {

		hPage.launchURL(cfgReader.get_prop("url"));
	}

	@Given("the user verifies facebook title")
	public void the_user_verifies_facebook_title() {

		try {
			Assert.assertEquals(xlReader.ExcelData("Facebook", "Title"), hPage.getTitle());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertTrue(hPage.getTitle().contains("Facebook"));
	}


}
