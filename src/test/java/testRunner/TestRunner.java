package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



	@CucumberOptions(
			features = {"src/test/java/features/Login.feature"},
			glue = {"stepDefinations"},
			dryRun = false,
			monochrome = true,
			plugin = {"pretty"}
			)

public class TestRunner extends AbstractTestNGCucumberTests {

}
