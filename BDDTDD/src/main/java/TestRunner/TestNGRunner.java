package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		dryRun = false,
		monochrome = true,
//		features = {"${cucumber.features}"},
		features = {"src/main/resources/Features"}, // folder name
		glue = {"Stepsdefinitions"}, // package name for step def
		
//		tags = "${cucumber.filter.tags}",
		 
		tags = "@TMKOC",
		 
		plugin = { "pretty","html:target/cucumber.html" }// tags used in feature file
		)
public class TestNGRunner extends AbstractTestNGCucumberTests {
	

}