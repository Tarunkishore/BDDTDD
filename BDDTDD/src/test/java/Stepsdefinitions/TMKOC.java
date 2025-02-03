package Stepsdefinitions;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TMKOC {
	
	
WebDriver driver;
	
	@Given("Launch Brave Browser")
	public void launch_brave_browser() throws InterruptedException, IOException {
		String browserPath = "/Applications/Brave Browser.app/Contents/MacOS/Brave Browser";
		ChromeOptions options = new ChromeOptions();
		options.setBinary(browserPath);
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		System.out.println("Browser launched Successfully");
//		screenshot(driver, System.currentTimeMillis());
		System.out.println("Looking for clearCacheCookes");
		driver.manage().deleteAllCookies();
		Thread.sleep(7000);
		System.out.println("Successfully clearCacheCookes");
	}
	
	@And("Search youtube and open sussessfully")
	public void search_youtube_and_open_sussessfully() throws IOException {
		FileReader reader=new FileReader("/Users/tarunkishore/git/repository/BDDTDD/src/test/resources/Pageobjects/pageobject.properties");
		Properties prop=new Properties();
        prop.load(reader);
//      driver.get("https://www.youtube.com/");
        driver.get(prop.getProperty("URL_Youtube"));
		Assert.assertEquals(driver.getTitle(), "YouTube");
//		screenshot(driver, System.currentTimeMillis());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		System.out.println("YouTube title verified successfully");
	}
	
	@Then("I click on {string}")
	public void i_click_on(String string) throws IOException {	
		FileReader reader=new FileReader("/Users/tarunkishore/git/repository/BDDTDD/src/test/resources/Pageobjects/pageobject.properties");
		Properties prop=new Properties();
        prop.load(reader);
		System.out.println("Looking for search button : "+string);
		String searchTerm = prop.getProperty(string);
		System.out.println("Found : "+string);
		driver.findElement(By.xpath(searchTerm)).click(); 
		System.out.println("Clicked "+string+" successfully");
	}
	
	@Then("I verify {string} available on present page")
	public void i_verify_available_on_present_page(String string) throws IOException {
		FileReader reader=new FileReader("/Users/tarunkishore/git/repository/BDDTDD/src/test/resources/Pageobjects/pageobject.properties");
		Properties prop=new Properties();
        prop.load(reader);
        String searchTerm = prop.getProperty(string);
//        System.out.println("Found : "+string);
        WebElement element = driver.findElement(By.xpath(searchTerm));
        
        System.out.println("Element found: " + element.getText());

	}
	
	@And("I scoll to view {string}")
	public void i_scoll_to_view(String string) throws InterruptedException, IOException {
//		Thread.sleep(5000);
		FileReader reader=new FileReader("/Users/tarunkishore/git/repository/BDDTDD/src/test/resources/Pageobjects/pageobject.properties");
		Properties prop=new Properties();
        prop.load(reader);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		String searchTerm = prop.getProperty(string);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		WebElement element = driver.findElement(By.xpath(searchTerm));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
//		WebElement element = driver.findElement(By.xpath("//h6[contains(text(),'Education')]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		System.out.println("scrolled successfully to : "+string);
		Thread.sleep(5000);
		System.out.println("Scrolled Successfully to : " + element.getText());
		
	}
//	@Then("I click on Search")
//	public void i_click_on_search() throws IOException {
//		System.out.println("Looking for search button");
//		driver.findElement(By.xpath("(//button[@title='Search'])[1]")).click();
//		System.out.println("Clicked Search button successfully");
//	}

	@When("Search {string}")
	public void search(String str) {
		driver.findElement(By.xpath("(//input[@name='search_query'])[1]")).sendKeys(str);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		System.out.println("TMKOC episode searched successfully");
	}

	@When("Search naukari and open sussessfully")
	public void search_naukari_and_open_sussessfully() {
		driver.get("https://www.naukri.com/mnjuser/homepage");
//		Assert.assertEquals(driver.getTitle(), "Home | Mynaukri");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		System.out.println("YouTube title verified successfully");
	}
	
	@Then("I enter {string} and {string}")
	public void i_enter_and(String string, String string2) {
		driver.findElement(By.xpath("//input[@id='usernameField']")).sendKeys(string);
		driver.findElement(By.xpath("//input[@id='passwordField']")).sendKeys(string2);
	}

//	@Then("i click on login button")
//	public void i_click_on_login_button() {
//		driver.findElement(By.xpath("//button[text()='Login']")).click();
//	}
	
//	@When("i click on View Profile")
//	public void i_click_on_view_profile() {
//		driver.findElement(By.xpath("//a[text()='View' and text()=' profile']")).click();
//	}

	@And("I wait Low")
	public void i_wait_low() throws InterruptedException {
		System.out.println("I wait for low");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	}
	
	@And("I wait High")
	public void i_wait_high() throws InterruptedException {
		System.out.println("I wait for high");
		Thread.sleep(15000);
	}
	
	@And("Close the Brave browser")
	public void close_the_brave_browser() {
		System.out.println("closed browser");
		driver.quit();
	}
	
	@When("Search Instahyre and open sussessfully")
	public void search_instahyre_and_open_sussessfully() {
		driver.get("https://www.instahyre.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		System.out.println("InstaHyre title verified successfully");
	}
	
	@Then("I enter {string} and {string} of instahyre")
	public void i_enter_and_of_instahyre(String string, String string2) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(string);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(string2);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	}
	
//	@Then("I click on Profile Tab in header")
//	public void i_click_on_profile_tab_in_header() {
//		driver.findElement(By.xpath("//a[text()='Profile']")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
//		System.out.println("Profile tab button clicked");
//	}
	
	@Then("I upload Resume on Naukari")
	public void i_upload_resume_on_naukari() throws InterruptedException {
//		String projectPath = System.getProperty("user.dir"); 
//		System.out.println("ProjectFilePath : "+projectPath);
//		WebElement updateResumeButton = driver.findElement(By.xpath("//input[@type='button' and @value='Update resume']"));
//		updateResumeButton.click();
		WebElement fileInput = driver.findElement(By.xpath("//input[@type='file']"));
		fileInput.sendKeys("/Users/tarunkishore/git/repository/BDDTDD/src/test/resources/Files/Tarunkishore_SQA.pdf");
	}
	
	@Then("I update resume for instahyre")
	public void i_update_resume_for_instahyre() throws InterruptedException {
//		String projectPath = System.getProperty("user.dir"); 
//		System.out.println("ProjectFilePath : "+projectPath);
//		Thread.sleep(10000);
//		WebElement element = driver.findElement(By.xpath("//h6[contains(text(),'Education')]"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView(true);", element);
//		Thread.sleep(10000);
		WebElement updateResumeButton = driver.findElement(By.xpath("(//label[@for='resume-input'])[2]"));
		updateResumeButton.click();
		Thread.sleep(10000);
		WebElement fileInput = driver.findElement(By.xpath("//input[@type='file']"));
		fileInput.sendKeys("/Users/tarunkishore/git/repository/BDDTDD/src/test/resources/Files/Tarunkishore_SQA.pdf");
		Thread.sleep(10000);	
	}
	
	@When("Search foundit and open sussessfully")
	public void search_foundit_and_open_sussessfully() {
		driver.get("https://www.foundit.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	}
	
	@Then("I click on foundit Login button")
	public void i_click_on_foundit_login_button() {
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	}
	
	@Then("click on Login Via Password")
	public void click_on_login_via_password() {
		driver.findElement(By.xpath("//div[contains(text(),'Login via Password')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	}
	
	@Then("I enter {string} and {string} of foundit")
	public void i_enter_and_of_foundit(String string, String string2) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.findElement(By.id("signInName")).sendKeys(string);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.findElement(By.id("password")).sendKeys(string2);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}
	
	@Then("I click on Profile Tab in foundit header")
	public void i_click_on_profile_tab_in_foundit_header() {
		driver.findElement(By.xpath("//img[@alt='TARUN KISHORE']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		driver.findElement(By.xpath("//a[contains(text(),'View Profile')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	}
	
	@Then("I click on replace resume")
	public void i_click_on_replace_resume() throws InterruptedException {
		String projectPath = System.getProperty("user.dir"); 
		System.out.println("ProjectFilePath : "+projectPath);
		Thread.sleep(10000);
		WebElement element = driver.findElement(By.xpath("(//h3[contains(text(),'Resume')])[1]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(10000);
		WebElement updateResumeButton = driver.findElement(By.xpath("(//input[@id='inline-resume'])[1]"));
		updateResumeButton.click();
		Thread.sleep(10000);
		WebElement fileInput = driver.findElement(By.xpath("//input[@type='file']"));
		fileInput.sendKeys("/Users/tarunkishore/git/repository/BDDTDD/src/test/resources/Files/Tarunkishore_SQA.pdf");
		Thread.sleep(10000);
		
	}
	
	@Given("I switch to frame")
	public void i_switch_to_frame() throws InterruptedException {
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
	}


}
