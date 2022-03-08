package hooksPackage;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src/test/java/hooksPackage/Sample.feature"},
		glue = {"hooksPackage","stepDefMobTv"},
		dryRun = false,
		monochrome = true,
		 plugin = {"pretty"}
		
		
		
		)

public class TestRunnerHook  extends AbstractTestNGCucumberTests{
	

}
