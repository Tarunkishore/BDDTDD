package TestRunner;
	
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
	 
	@CucumberOptions(
			  features = "src/main/resources/Features",//folder name
			  glue = {"Stepsdefinitions"}, //package name for step def
			  monochrome = true,
			  dryRun = false,
			  plugin = {"pretty", 												//report generator
					 // "html:target/cucumber-Report.html","json:target/report.json"}, //two different format report
					  //plugin = {"pretty", 												//report generator
							  "html:target/cucumber-reports/cucumber.html","json:target/report.json"},
			  tags = "@TMKOCEPS"									//tags used in feature file
			)
	 
	public class TestNGRunner extends AbstractTestNGCucumberTests{
	 
	}
	 
	//public class hooks extends AbstractTestNGCucumberTests{
	//}

