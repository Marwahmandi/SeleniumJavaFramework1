package StepDefinition;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import PageFactory.Frais;
import PageFactory.Login;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

	public static ChromeDriver driver = new ChromeDriver();
	static WebElement Client;
//	ExtentHtmlReporter htmlReporter =new ExtentHtmlReporter("Result.html");
//	ExtentReports extent=new ExtentReports();
//	extent.attachReporter(htmlReporter);
//	ExtentTest test ;


	@Given("^Open the Chrome and launch the application$")
	public void open_the_Chrome_and_launch_the_application() throws Throwable {

		Login login = new Login(driver);
		login.open_the_Chrome_and_launch_the_application();
	//	test = extent.createTest("open_the_Chrome_and_launch_the_application", "open_the_Chrome_and_launch_the_application");

	}

	@When("^Enter the Username and Password$")
	public void enter_the_Username_and_Password() throws Throwable {
		Login login = new Login(driver);
		login.enter_the_Username_and_Password();
	//	test = extent.createTest("enter_the_Username_and_Password", "enter_the_Username_and_Password");
	}

	@When("^Click on Connexion button$")
	public void click_on_Connexion_button() throws Throwable {
		Login login = new Login(driver);
		login.click_on_Connexion_button();
	//	test = extent.createTest("click_on_Connexion_button", "click_on_Connexion_button");


	}

	@Then("^the Accueil page is opened$")
	public void the_Accueil_page_is_opened() throws Throwable {
		Login login = new Login(driver);
		login.the_Accueil_page_is_opened();
	//	test = extent.createTest("the_Accueil_page_is_opened", "the_Accueil_page_is_opened");


	}

	@Given("^I click on declarer mes frais and I click on the plus button$")
	public void i_click_on_declarer_mes_frais_and_I_click_on_the_button() throws Throwable {
		Frais frais=new Frais(driver);
		frais.i_click_on_declarer_mes_frais_and_I_click_on_the_button();
	//	test = extent.createTest("i_click_on_declarer_mes_frais_and_I_click_on_the_button", "i_click_on_declarer_mes_frais_and_I_click_on_the_button");
	}

	@When("^I consult mes frais$")
	public void i_consult_mes_frais() throws Throwable {
		Frais frais=new Frais(driver);
		frais.i_consult_mes_frais();
	//	test = extent.createTest("i_consult_mes_frais", "i_consult_mes_frais");

	}

	@Then("^the new frais is added$")
	public void the_new_frais_is_added() throws Throwable {
		Frais frais=new Frais(driver);
		frais.the_new_frais_is_added();
	//	test = extent.createTest("the_new_frais_is_added", "the_new_frais_is_added");

	}

	
	//	extent.flush();


	



}
