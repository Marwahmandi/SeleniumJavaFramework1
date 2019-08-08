package Reports;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class ExtendReportsBasicDemo {
	ExtentHtmlReporter htmlReporter ;
	ExtentReports extent;
	ExtentTest test ;
	private static WebDriver driver = null;


	@Before
	public void Setup() {
		
		// start reporters
		htmlReporter =new ExtentHtmlReporter("extent.html");
		// create ExtentReports and attach reporter(s)
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		System.out.println("i'm in the setup method");
		
	}

	@Test
	public void test() throws InterruptedException {
		

		// creates a toggle for the given test, adds all log events under it    
		test = extent.createTest("Login", "Login functionnality");
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver/chromedriver.exe");
		driver=new ChromeDriver();
		// log(Status, details)
		test.log(Status.INFO, "Starting Test case");
		driver.get("https://google.com");
		test.pass("Navigated to google.com");
		driver.findElement(By.name("q")).sendKeys("Automation");
		test.fail("Enter text in the searchbox");
		Thread.sleep(1000);
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test.pass("Pressed eyboard enter key");
		System.out.println("i'm in the test method");

	}

	@After
	public void tearDown() {
	
		driver.close();
		test.pass("Closed the browser");
		driver.quit();
		test.pass("Quit the browser");
		// calling flush writes everything to the log file
		extent.flush();
		System.out.println("i'm in the tearDown method");

	}


}
