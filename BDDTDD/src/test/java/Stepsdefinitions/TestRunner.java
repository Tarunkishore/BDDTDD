package Stepsdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
			features="src/test/resources/Features",
//			features = {"${cucumber.features}"},
			glue= {"Stepsdefinitions"},
//			glue= {"StepsDefinitions","Hooks"},
			dryRun=false,
			tags = "@TMKOCEP",
			monochrome = true,
			plugin = {"pretty","html:target/htmlreport.html"}
//			plugin = {"pretty","junit:target/JUnitReports/report.xml","json:target/JSONReports/report.json","html:target/HtmlReports/report.html"}

			)

	public class TestRunner extends AbstractTestNGCucumberTests{

	}
