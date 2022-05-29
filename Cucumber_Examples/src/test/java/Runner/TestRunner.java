package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/FeatureFiles/Google.feature",
		glue = {"StepDefn"},
		plugin = {"pretty","html:Reports/cucumberreports.html"},
		publish = true
		
		)


public class TestRunner {

}
