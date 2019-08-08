package TestRunner;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;




import StepDefinition.Steps;
import cucumber.api.CucumberOptions;		
import cucumber.api.junit.Cucumber;		

@RunWith(Cucumber.class)				
@CucumberOptions(features="C:\\Users\\mhmandi\\eclipse-workspace\\CucumberWithS\\src\\main\\java\\Features",tags="@login,@Frais", glue={"StepDefinition"},format = {"pretty", "html:target/html/"})	

public class Runner {
	
	
	@BeforeClass
	public static void before_class()
	{
		//Steps.driver= new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver/chromedriver.exe");

		Steps.driver.get("https://byblos-recette.talan.com");
		Steps.driver.manage().window().maximize();

	}

	@AfterClass
	public static void close_browser()
	{
		
		
		//Steps.driver.close();
		
	}
}


