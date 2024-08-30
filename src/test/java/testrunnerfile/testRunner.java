package testrunnerfile;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

	
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features= {"./src/test/resources/FeatureFiles"},
			glue= {"stepDefinationfile"},
			tags = "mytag",
			plugin = {"json:target/cucumber.json"}
			
			)
	
	
	public class testRunner {

}
