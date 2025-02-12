package Stepsdefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;

public class Common {
	public static WebDriver driver;
	
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");


	@Before
	public void launchBrowser() throws InterruptedException {
		String browserPath = "/Applications/Brave Browser.app/Contents/MacOS/Brave Browser";
		ChromeOptions options = new ChromeOptions();
		options.setBinary(browserPath);
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		System.out.println("Browser launched Successfully");
		System.out.println("Looking for clearCacheCookes");
		driver.manage().deleteAllCookies();
		Thread.sleep(7000);
		System.out.println("Successfully clearCacheCookes");
	}

	@BeforeTest
	public void reportTheme() {
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("MyReport");
		extent.attachReporter(spark);

	}

	@AfterStep
	public void afterStep() throws IOException {
		File srcfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destfile = new File("screenshots/" + System.currentTimeMillis() + ".png");
		FileUtils.copyFile(srcfile, destfile);
		System.out.println("Screenshot afterStep() captured : ");
	}

	@After
	public void tearDown() {
		
		driver.quit();
	}

}
