package testRunner;

import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src/test/java/features/mobileTv.feature"},
		glue = {"stepDefMobTv", "hooksPackage"},
		dryRun = false,
		monochrome = true,
		plugin = {"pretty"}
		)

public class MobileTVTestRunner extends AbstractTestNGCucumberTests {
		

}
