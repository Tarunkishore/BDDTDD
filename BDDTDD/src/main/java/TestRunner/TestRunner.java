package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
			features={"src/main/resources/Features"},
//			features = {"${cucumber.features}"},
			glue= {"Stepsdefinitions"},
//			glue= {"StepsDefinitions","Hooks"},
//			dryRun=false,
			tags = "@TMKOCEP",
			monochrome = true,
//			publish = true,
			plugin = {"pretty","html:target/htmlreport.html"}
//			plugin = {"pretty","junit:target/JUnitReports/report.xml","json:target/JSONReports/report.json","html:target/HtmlReports/report.html"}

			)

	public class TestRunner extends AbstractTestNGCucumberTests{
//	 	@BeforeClass
//	    public void setup() {
//	 		System.out.println("@BeforeClass");
//	    }
//
//	    @AfterClass
//	    public void tearDown() {
//	    	System.out.println("@AfterClass");
//	    }

	    

	}
